
![alt text](logo_BatteryPass_Primary.png)

# Battery Pass Data Model

Welcome to the Battery Pass Data Model repository! This project provides a comprehensive data model based on the Battery Pass Content Guidance, aimed at standardizing and streamlining the exchange of battery-related information across the value chain.

## Table of Contents
- [Battery Pass Data Model](#battery-pass-data-model)
  - [Table of Contents](#table-of-contents)
  - [Overview](#overview)
  - [Features](#features)
  - [Installation](#installation)
  - [Usage](#usage)
  - [Data Model Structure](#data-model-structure)
  - [Contributing](#contributing)
  - [Disclaimer](#disclaimer)
  - [License](#license)
  - [Contact](#contact)

## Overview
The Battery Pass Data Model is designed to facilitate the digital representation of battery-related data, ensuring compliance with industry standards and regulatory requirements. This model supports the efficient exchange of data between various stakeholders in the battery lifecycle, including manufacturers, suppliers, recyclers, and regulators. The content of the data model is derived from the [Battery Pass Project Data Point List](https://view.officeapps.live.com/op/view.aspx?src=https%3A%2F%2Fthebatterypass.eu%2Fassets%2Fimages%2Fcontent-guidance%2Fpdf%2F2023_Battery_Passport_Data_Attributes.xlsx&wdOrigin=BROWSELINK)

## Features
- **Standardized Data Representation:** Ensures uniformity in the way battery data is recorded and shared.
- **Comprehensive Coverage:** Includes all critical aspects of battery data as specified in the Battery Pass Content Guidance.
- **Scalability:** Suitable for use in projects of varying scales, from small businesses to large enterprises.
- **Interoperability:** Facilitates seamless data exchange between different systems and platforms.

## Installation
To use the Battery Pass Data Model, you can clone the repository and integrate it into your project. Ensure you have [Git](https://git-scm.com/) installed.

```bash
git clone https://github.com/batterypass/BatteryPassDataModel.git
cd BatteryPassDataModel
```

## Usage
To incorporate the data model into your application, follow these steps:

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/batterypass/BatteryPassDataModel.git
   ```

2. **Import the Data Model:**
   Integrate the provided data model definitions into your database or application schema. Refer to the documentation in the `/docs` directory for detailed description of the battery pass data attributes.

3. **Customize as Needed:**
   Adapt the data model to fit your specific requirements. Ensure any modifications remain compliant with the Battery Pass Content Guidance.

## Data Model Structure
The data model is organized into several parameter categories, each representing a different dedicated aspect of battery data, that can be composed to a complete battery pass data model. Below is a high-level overview. You'll find a detailed list with descriptions of the individual data points in the `/doc` folder. Follow the links for the different data attribute categories for further information on the individual sub-models. 

- [**General Product Information:**](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.GeneralProductInformation/1.0.0/gen/GeneralProductInformation-documentation.html) ([Sub Model Schema](https://github.com/batterypass/BatteryPassDataModel/tree/main/BatteryPass/io.BatteryPass.GeneralProductInformation/1.0.0)) 
  - Battery ID
  - Manufacturer
  - Battery status
  - Production Date

- [**Carbon Footprint:**](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.CarbonFootprint/1.0.0/gen/CarbonFootprint-documentation.html) ([Sub Model Schema](https://github.com/batterypass/BatteryPassDataModel/tree/main/BatteryPass/io.BatteryPass.CarbonFootprint/1.0.0)) 
  - Battery Carbon footprint
  - Carbon footprint of different lifecycle stages of the battery
  - Carbon footprint study and perfromance class

- [**Circularity:**](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.Circularity/1.0.0/gen/Circularity-documentation.html)([Sub Model Schema](https://github.com/batterypass/BatteryPassDataModel/tree/main/BatteryPass/io.BatteryPass.Circularity/1.0.0)) 
  - End of live management
  - Safety requirements
  - Recycled and renewable content

- [**Material Composition:**](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.MaterialComposition/1.0.0/gen/MaterialComposition-documentation.html) ([Sub Model Schema](https://github.com/batterypass/BatteryPassDataModel/tree/main/BatteryPass/io.BatteryPass.MaterialComposition/1.0.0)) 
  - Battery chemistry
  - Critical raw materials
  - Hazardous substances

- [**Performance & Durability:**](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.Performance/1.0.0/gen/PerformanceAndDurability-documentation.html) ([Sub Model Schema](https://github.com/batterypass/BatteryPassDataModel/tree/main/BatteryPass/io.BatteryPass.Performance/1.0.0)) 
  - Static performance KPIs (Capacity, power capibility, etc. )
  - Dynamic performance KPI (SoH, full charge cycles, )
  - Negative events

- [**Labels and Certification:**](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.Labels/1.0.0/gen/Labels-documentation.html) ([Sub Model Schema](https://github.com/batterypass/BatteryPassDataModel/tree/main/BatteryPass/io.BatteryPass.Labels/1.0.0)) 
  - Declaration of conformity
  - Labels (Separate collection, materials)
  - Test reports

- [**Due Diligence :**](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.DueDiligence/1.0.0/gen/SupplyChainDueDiligence-documentation.html) ([Sub Model Schema](https://github.com/batterypass/BatteryPassDataModel/tree/main/BatteryPass/io.BatteryPass.DueDilligence/1.0.0))  
  - Due diligence report
  - Third party verifications
  - Sustainability report
  
Detailed schema definitions and relationships between entities are provided in the `/BatteryPass` directory. 
For the compilation of the data model schema, the [Eclipse Semantic Modeling Framework](https://eclipse-esmf.github.io/esmf-documentation/index.html) was used, that provides a meta model for data modelling for data exchange purpose that build upon the [Resource Description Framework](https://www.w3.org/TR/rdf11-concepts/) (RDF) and its compact textual syntax called [Turtle](https://www.w3.org/TR/turtle/) (*.ttl). In each sub model schema folder you'll find the corresponding Turtle file and a ./gen folder that includes several derivations of the data model in differnet formats:
  - JSON-Schema (*-schema.json)
  - JSON-Payload(*-sample.json)
  - OpenAPI Specification (*-open-api.json)
  - Asset Administration Shell XML (*.aasx.xml)
  - Documentation (*-documentation.html)

An example of the concrete implementation of a battery passport system based on that data model could be found here: https://thebatterypass.io/

The architectural structure of the software demonstrator and the implementation concepts behind the implementation are published in the [Battery Passport Technical Guidance](https://thebatterypass.eu/assets/images/technical-guidance/pdf/2024_BatteryPassport_Technical_Guidance.pdf). The rationale for the usage of RDF and the Semantic Modelling Framework can be found in chalter 4.9 of this document.

## Contributing
We welcome contributions to the Battery Pass Data Model. To contribute:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -m 'Add new feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Create a pull request.

Please ensure that your contributions adhere to the project's coding standards and guidelines.

## Disclaimer
The battery pass data model is still in draft mode and not finished yet. The purpose of this publication is to initiate further technical alignment with other relevant stakeholders. The data model schemas are for demonstration purposes only. Therefore, none of the project partners can be held liable for any errors or omissions in the data model schemas provided, and no representation or warranty, express or implied, is made as to the accuracy, adequacy, completeness, legality, reliability or usefulness of the data model. The data model is subject to change without notice.

## License
This work is made available under Creative Commons Attribution 4.0 International (CC-BY-4.0) license. See the [LICENSE](https://creativecommons.org/licenses/by/4.0/legalcode) file for more details.

## Contact
For questions, feedback, or support, please contact:
- **Project website:** [Battery Passport Project website](https://thebatterypass.eu/)
- **Project work package maintainer:** [Niko D'Agostino, Circulor GmbH, WP4 lead Battery Pass project software demonstrator](mailto:nd@circulor.com)
- **GitHub Issues:** [Submit an Issue](https://github.com/batterypass/BatteryPassDataModel/issues)
- **Follow us on** [LinkedIn](https://www.linkedin.com/company/batterypass/)

Thank you for using the Battery Pass Data Model! We look forward to your contributions and feedback.

This Battery Pass project receives funding from the German Federal Ministry for Economic Affairs and Climate Action by resolution of the German Bundestag under grant agreement No BZF335.

![alt text](logo_BMWK_en.png)
