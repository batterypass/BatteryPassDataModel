# Check if the required arguments are provided
if ($args.Count -lt 2) {
    Write-Host "Usage: .\Convert-TtlFiles.ps1 <InputDirectory> <OutputDirectory>"
    exit 1
}

# Assign input and output directories from arguments
$InputDirectory = $args[0]
$OutputDirectory = $args[1]

# Validate the input directory
if (-Not (Test-Path $InputDirectory)) {
    Write-Host "Error: Input directory '$InputDirectory' does not exist." -ForegroundColor Red
    exit 1
}

# Create the output directory if it doesn't exist
if (-Not (Test-Path $OutputDirectory)) {
    New-Item -ItemType Directory -Path $OutputDirectory | Out-Null
}

# Get all .ttl files in the input directory
$TtlFiles = Get-ChildItem -Path $InputDirectory -Filter *.ttl

if ($TtlFiles.Count -eq 0) {
    Write-Host "No .ttl files found in the input directory." -ForegroundColor Yellow
    exit 0
}

# Loop through each .ttl file and convert it to all available formats
foreach ($TtlFile in $TtlFiles) {
    Write-Host "Processing file: $($TtlFile.FullName)"

    # Get the file name without extension
    $FileNameWithoutExtension = [System.IO.Path]::GetFileNameWithoutExtension($TtlFile.FullName)

    # Get the list of available formats from SAMM
    $AvailableFormats = "html", "java", "json", "jsonld", "png", "schema", "svg", "aas", "sql" | ForEach-Object { $_.Trim() }

    # Loop through each available format
    foreach ($Format in $AvailableFormats) {
        # Define the output file path
        $OutputFile = Join-Path -Path $OutputDirectory -ChildPath "$FileNameWithoutExtension.$Format"

        # Convert the file to the current format
        & samm.exe aspect -v $TtlFile.FullName to $Format > $OutputFile

        if ($LASTEXITCODE -eq 0) {
            Write-Host "Successfully converted $($TtlFile.Name) to $Format format."
        } else {
            Write-Host "Failed to convert $($TtlFile.Name) to $Format format." -ForegroundColor Red
        }
    }
    $Format ="openapi"
    $OutputFile = Join-Path -Path $OutputDirectory -ChildPath "$FileNameWithoutExtension.$Format"
    & samm.exe aspect -v $TtlFile.FullName to $Format -b="https:\\thebatterypass.io" > $OutputFile 
    if ($LASTEXITCODE -eq 0) {
        Write-Host "Successfully converted $($TtlFile.Name) to $Format format."
    } else {
        Write-Host "Failed to convert $($TtlFile.Name) to $Format format." -ForegroundColor Red
    }
}

Write-Host "All files processed."

