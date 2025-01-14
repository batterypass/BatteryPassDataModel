<div align="center">
  <img src="./logo_BatteryPass_Primary.png" alt="alt text" height="100px " align="center"/>
</div>

# Battery Pass Data Model v1.2.0

Welcome to the Battery Pass Data Model repository! This project provides a comprehensive data model based on the [DIN DKE SPEC 99100:2025-02](https://www.dinmedia.de/en/technical-rule/din-dke-spec-99100/385692321), aimed at standardizing and streamlining the exchange of battery-related information across the value chain to allow informed stakeholder decisions for sustainable circular economy. The defined data requirements are fully aligned with the [EU Battery Regulation](https://eur-lex.europa.eu/eli/reg/2023/1542/oj) and the [Eco-Design Directive for Sustainable Products (ESPR)](https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32024R1781&qid=1719580391746). 

The provided data modelling approach is a proposal for a sector specific DPP (Battery Passport). 

## Table of Contents

<details>
<summary><strong>Details</strong></summary>
  
- [Battery Pass Data Model v1.2.0](#battery-pass-data-model-v120)
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

</details>

## Overview
The Battery Pass Data Model is designed to facilitate the digital representation of battery-related data, ensuring compliance with industry standards and regulatory requirements. This model supports the efficient exchange of data between various stakeholders in the battery lifecycle, including manufacturers, suppliers, recyclers, and regulators. The content of the data model is derived from the [Battery Pass Project Data Point List](https://view.officeapps.live.com/op/view.aspx?src=https%3A%2F%2Fthebatterypass.eu%2Fassets%2Fimages%2Fcontent-guidance%2Fpdf%2F2023_Battery_Passport_Data_Attributes.xlsx&wdOrigin=BROWSELINK).

Meanwhile the Battery Pass Consortium contributed to the DIN DKE Spec 99100:25-02 "Requirements for data attributes of the battery passport". This necessitates some updates of the data points, which are reflected in corresponding changes in the data models for the different parameter categories in this new version v1.2.0. In each description of a data point a reference to the corresponding chapter in the DIN DKE Spec 99100 is provided.  

## Features
- **Standardized Data Representation:** Ensures uniformity in the way battery data is recorded and shared.
- **Comprehensive Coverage:** Includes all critical aspects of battery data as specified in the [DIN DKE SPEC 99100:2025-02](https://www.dinmedia.de/en/technical-rule/din-dke-spec-99100/385692321).
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
   Adapt the data model to fit your specific requirements. Ensure any modifications remain compliant with the [DIN DKE SPEC 99100:2025-02](https://www.dinmedia.de/en/technical-rule/din-dke-spec-99100/385692321).

## Data Model Structure
The data modelling approach follows the idea to provide a common formal plattform independent description of the semantic data model by means of the W3C Resource Description Framework (RDF) from which platform specific data model formats can be derived from. The common plattform independent formal data model description shall ensure interopreability between the plattform specifc data models that can be used in diffewrent technical implementations of a battery passport solution.  

The data model is organized into several parameter categories, each representing a different dedicated aspect of battery data, that can be composed to a complete battery pass data model. Below is a high-level overview. You'll find a detailed list with descriptions of the individual data points in the `/doc` folder. Follow the links for the different data attribute categories for further information on the individual sub-models.


- [**General Product Information:**](./BatteryPass/io.BatteryPass.GeneralProductInformation/1.2.0/gen)
  - Battery ID
  - Manufacturer
  - Battery status
  - Production Date
  - etc.

| <img border="0" height="32px" width="32px" src="http://www.w3.org/RDF/icons/rdf_w3c_icon.48" align="center"/><br/> [Class<br/>Diagram](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.GeneralProductInformation/1.2.0/gen/GeneralProductInformation.html) | <img src="https://www.json.org/img/json160.gif" alt="json logo" align="center" border="0" height="32px" width="32px" /><br/> [Sample<br/>JSON](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.GeneralProductInformation/1.2.0/gen/GeneralProductInformation-payload.json) | <img src="https://avatars.githubusercontent.com/u/13019229" align="center" border="0" height="32px" width="32px" /><br/>[JSON<br/>Schema](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.GeneralProductInformation/1.2.0/gen/GeneralProductInformation-schema.json) | <img src="https://static1.smartbear.co/swagger/media/assets/images/sw_ov_intro_band1_icon1.svg" align="center" border="0" height="48px" width="48px"/><br/>[OpenAPI<br/>Spec](https://editor-next.swagger.io/?url=https://batterypass.github.io/BatteryPassDataModel/BatteryPass/io.BatteryPass.GeneralProductInformation/1.2.0/gen/GeneralProductInformation_openapi3_0.json) |<img src="https://avatars.githubusercontent.com/u/65010131?s=200&v=4" alt="json logo" align="center" border="0" height="32px" width="32px" /><br/> [AAS<br/>XML](https://github.com/batterypass/BatteryPassDataModel/blob/main/BatteryPass/io.BatteryPass.GeneralProductInformation/1.2.0/gen/GeneralProductInformation.aas) 
| --- | --- | --- | --- | --- | 

- [**Carbon Footprint:**](./BatteryPass/io.BatteryPass.CarbonFootprint/1.2.0/gen)
  - Battery Carbon footprint
  - Carbon footprint of different lifecycle stages of the battery
  - Carbon footprint study and perfromance class
  - etc.
 
| <img border="0" height="32px" width="32px" src="http://www.w3.org/RDF/icons/rdf_w3c_icon.48" align="center"/><br/> [Class<br/>Diagram](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.CarbonFootprint/1.2.0/gen/CarbonFootprintForBatteries-documentation.html) |<img src="https://www.json.org/img/json160.gif" align="center" border="0" height="32px" width="32px" /><br/> [Sample<br/>JSON](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.CarbonFootprint/1.2.0/gen/CarbonFootprintForBatteries-payload.json) | <img src="https://avatars.githubusercontent.com/u/13019229" align="center" border="0" height="32px" width="32px" /><br/>[JSON<br/>Schema](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.CarbonFootprint/1.2.0/gen/CarbonFootprintForBatteries-schema.json) | <img src="https://static1.smartbear.co/swagger/media/assets/images/sw_ov_intro_band1_icon1.svg" align="center" border="0" height="48px" width="48px"/><br/>[OpenAPI<br/>Spec](https://editor-next.swagger.io/?url=https://batterypass.github.io/BatteryPassDataModel/BatteryPass/io.BatteryPass.CarbonFootprint/1.2.0/gen/CarbonFootprintForBatteries_openapi3_0.json) |<img src="https://avatars.githubusercontent.com/u/65010131?s=200&v=4" alt="json logo" align="center" border="0" height="32px" width="32px" /><br/> [AAS<br/>XML](https://github.com/batterypass/BatteryPassDataModel/blob/main/BatteryPass/io.BatteryPass.CarbonFootprint/1.2.0/gen/CarbonFootprintForBatteries.aas)
| --- | --- | --- | --- | --- | 

- [**Circularity:**](./BatteryPass/io.BatteryPass.Circularity/1.2.0/gen)
  - End of live management
  - Safety requirements
  - Recycled and renewable content
  - etc.
 
| <img border="0" height="32px" width="32px" src="http://www.w3.org/RDF/icons/rdf_w3c_icon.48" align="center"/><br/> [Class<br/>Diagram](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.Circularity/1.2.0/gen/Circularity-documentation.html) |<img src="https://www.json.org/img/json160.gif" alt="json logo" align="center" border="0" height="32px" width="32px" /><br/> [Sample<br/>JSON](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.Circularity/1.2.0/gen/Circularity-payload.json) | <img src="https://avatars.githubusercontent.com/u/13019229" align="center" border="0" height="32px" width="32px" /><br/>[JSON<br/>Schema](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.Circularity/1.2.0/gen/Circularity-schema.json) | <img src="https://static1.smartbear.co/swagger/media/assets/images/sw_ov_intro_band1_icon1.svg" align="center" border="0" height="48px" width="48px"/><br/>[OpenAPI<br/>Spec](https://editor.swagger.io/?url=https://batterypass.github.io/BatteryPassDataModel/BatteryPass/io.BatteryPass.Circularity/1.2.0/gen/Circularity_openapi3_0.json) | <img src="https://avatars.githubusercontent.com/u/65010131?s=200&v=4" alt="json logo" align="center" border="0" height="32px" width="32px" /><br/> [AAS<br/>XML](https://github.com/batterypass/BatteryPassDataModel/blob/main/BatteryPass/io.BatteryPass.Circularity/1.2.0/gen/Circularity.aas)
| --- | --- | --- | --- | --- | 

- [**Material Composition:**](./BatteryPass/io.BatteryPass.MaterialComposition/1.2.0/gen)
  - Battery chemistry
  - Critical raw materials
  - Hazardous substances
  - etc.
 
| <img border="0" height="32px" width="32px" src="http://www.w3.org/RDF/icons/rdf_w3c_icon.48" align="center"/><br/> [Class<br/>Diagram](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.MaterialComposition/1.2.0/gen/MaterialComposition-documentation.html) |<img src="https://www.json.org/img/json160.gif" alt="json logo" align="center" border="0" height="32px" width="32px" /><br/> [Sample<br/>JSON](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.MaterialComposition/1.2.0/gen/MaterialComposition-payload.json) | <img src="https://avatars.githubusercontent.com/u/13019229" align="center" border="0" height="32px" width="32px" /><br/>[JSON<br/>Schema](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.MaterialComposition/1.2.0/gen/MaterialComposition-schema.json) | <img src="https://static1.smartbear.co/swagger/media/assets/images/sw_ov_intro_band1_icon1.svg" align="center" border="0" height="48px" width="48px"/><br/>[OpenAPI<br/>Spec](https://editor-next.swagger.io/?url=https://batterypass.github.io/BatteryPassDataModel/BatteryPass/io.BatteryPass.MaterialComposition/1.2.0/gen/MaterialComposition_openapi3_0.json) | <img src="https://avatars.githubusercontent.com/u/65010131?s=200&v=4" alt="json logo" align="center" border="0" height="32px" width="32px" /><br/> [AAS<br/>XML](https://github.com/batterypass/BatteryPassDataModel/blob/main/BatteryPass/io.BatteryPass.MaterialComposition/1.2.0/gen/MaterialComposition.aas)
| --- | --- | --- | --- | --- | 

- [**Performance & Durability:**](./BatteryPass/io.BatteryPass.Performance/1.2.0/gen)
  - Static performance KPIs and technical specification parameters (Capacity, power capibility, etc. )
  - Dynamic performance KPI representing the current condition of the battery (SoH, full charge cycles, etc.)
  - Negative events
  - etc.

| <img border="0" height="32px" width="32px" src="http://www.w3.org/RDF/icons/rdf_w3c_icon.48" align="center"/><br/> [Class<br/>Diagram](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.Performance/1.2.0/gen/PerformanceAndDurability-documentation.html) |<img src="https://www.json.org/img/json160.gif" alt="json logo" align="center" border="0" height="32px" width="32px" /><br/> [Sample<br/>JSON](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.Performance/1.2.0/gen/PerformanceAndDurability.json) | <img src="https://avatars.githubusercontent.com/u/13019229" align="center" border="0" height="32px" width="32px" /><br/>[JSON<br/>Schema](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.Performance/1.2.0/gen/PerformanceAndDurability-schema.json) | <img src="https://static1.smartbear.co/swagger/media/assets/images/sw_ov_intro_band1_icon1.svg" align="center" border="0" height="48px" width="48px"/><br/>[OpenAPI<br/>Spec](https://editor-next.swagger.io/?url=https://batterypass.github.io/BatteryPassDataModel/BatteryPass/io.BatteryPass.Performance/1.2.0/gen/PerformanceAndDurability_openapi3_0.json) | <img src="https://avatars.githubusercontent.com/u/65010131?s=200&v=4" alt="json logo" align="center" border="0" height="32px" width="32px" /><br/> [AAS<br/>XML](https://github.com/batterypass/BatteryPassDataModel/blob/main/BatteryPass/io.BatteryPass.Performance/1.2.0/gen/PerformanceAndDurability.aas)
| --- | --- | --- | --- | --- | 

- [**Labels and Certification:**](./BatteryPass/io.BatteryPass.Labels/1.2.0/gen)
  - Declaration of conformity
  - Labels (Separate collection, materials)
  - Test reports
  - etc.
 
| <img border="0" height="32px" width="32px" src="http://www.w3.org/RDF/icons/rdf_w3c_icon.48" align="center"/><br/> [Class<br/>Diagram](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.Labels/1.2.0/gen/Labeling-documentation.html) |<img src="https://www.json.org/img/json160.gif" alt="json logo" align="center" border="0" height="32px" width="32px" /><br/> [Sample<br/>JSON](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.Labels/1.2.0/gen/Labeling-payload.json) | <img src="https://avatars.githubusercontent.com/u/13019229" align="center" border="0" height="32px" width="32px" /><br/>[JSON<br/>Schema](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.Labels/1.2.0/gen/Labeling-schema.json) | <img src="https://static1.smartbear.co/swagger/media/assets/images/sw_ov_intro_band1_icon1.svg" align="center" border="0" height="48px" width="48px"/><br/>[OpenAPI<br/>Spec](https://editor.swagger.io/?url=https://batterypass.github.io/BatteryPassDataModel/BatteryPass/io.BatteryPass.Labels/1.2.0/gen/Labeling_openapi3_0.json) | <img src="https://avatars.githubusercontent.com/u/65010131?s=200&v=4" alt="json logo" align="center" border="0" height="32px" width="32px" /><br/> [AAS<br/>XML](https://github.com/batterypass/BatteryPassDataModel/blob/main/BatteryPass/io.BatteryPass.Labels/1.2.0/gen/Labeling.aas)
| --- | --- | --- | --- | --- | 

- [Due Diligence](./BatteryPass/io.BatteryPass.DueDiligence/1.2.0/gen)
  - Third party verifications
  - Sustainability report
  - etc.
 
| <img border="0" height="32px" width="32px" src="http://www.w3.org/RDF/icons/rdf_w3c_icon.48" align="center"/><br/> [Class<br/>Diagram](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.SupplyChainDueDiligence/1.2.0/gen/SupplyChainDueDiligence-documentation.html) |<img src="https://www.json.org/img/json160.gif" alt="json logo" align="center" border="0" height="32px" width="32px" /><br/> [Sample<br/>JSON](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.SupplyChainDueDiligence/1.2.0/gen/SupplyChainDueDiligence-payload.json) | <img src="https://avatars.githubusercontent.com/u/13019229" align="center" border="0" height="32px" width="32px" /><br/>[JSON<br/>Schema](https://batterypass.github.io/BatteryPassDataModel//BatteryPass/io.BatteryPass.SupplyChainDueDiligence/1.2.0/gen/SupplyChainDueDiligence-schema.json) | <img src="https://static1.smartbear.co/swagger/media/assets/images/sw_ov_intro_band1_icon1.svg" align="center" border="0" height="48px" width="48px"/><br/>[OpenAPI<br/>Spec](https://editor-next.swagger.io/?url=https://batterypass.github.io/BatteryPassDataModel/BatteryPass/io.BatteryPass.SupplyChainDueDiligence/1.2.0/gen/SupplyChainDueDiligence_openapi3_0.json) | <img src="https://avatars.githubusercontent.com/u/65010131?s=200&v=4" alt="json logo" align="center" border="0" height="32px" width="32px" /><br/> [AAS<br/>XML](https://github.com/batterypass/BatteryPassDataModel/blob/main/BatteryPass/io.BatteryPass.SupplyChainDueDiligence/1.2.0/gen/SupplyChainDueDiligence.aas)
| --- | --- | --- | --- | --- | 
  
Detailed schema definitions and relationships between entities are provided in the `/BatteryPass` directory. 
For the compilation of the data model schema, the [Eclipse Semantic Modeling Framework](https://eclipse-esmf.github.io/esmf-documentation/index.html) was used, that provides a meta model for data modelling for data exchange purpose that build upon the [Resource Description Framework](https://www.w3.org/TR/rdf11-concepts/) (RDF) and its compact textual syntax called [Turtle](https://www.w3.org/TR/turtle/) (`*.ttl`). In each sub model schema folder you'll find the corresponding Turtle file and a `./gen` folder that includes several derivations of the data model in differnet formats:
  - JSON-Schema (`*-schema.json`)
  - JSON-Payload(`*-payload.json`)
  - OpenAPI Specification (`*_openapi3_0.json`)
  - Asset Administration Shell XML (`*.xml`)
  - Documentation (`*-documentation.html`)
  - etc.

An example of the concrete implementation of a battery passport system based on that data model could be found here: https://thebatterypass.io/

The architectural structure of the software demonstrator and the implementation concepts behind the implementation are published in the [Battery Passport Technical Guidance](https://thebatterypass.eu/assets/images/technical-guidance/pdf/2024_BatteryPassport_Technical_Guidance.pdf). The rationale for the usage of RDF and the Semantic Modelling Framework can be found in chapter 4.9 of this document.

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

<img src="./logo_BMWK_EN.png" alt="alt text" height="200px "/>
