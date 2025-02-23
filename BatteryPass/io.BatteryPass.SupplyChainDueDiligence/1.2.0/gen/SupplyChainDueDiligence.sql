CREATE TABLE IF NOT EXISTS supply_chain_due_diligence (
  supply_chain_due_diligence_report STRING NOT NULL COMMENT 'The battery passport must include the ?information on responsible sourcing as indicated in the report on its due diligence policy referred to in BattReg Article 52(3)?.

The due diligence report must be accessible free of charge to the public via the battery passport and also on the internet.

The report and hence also the information in the battery passport must provide data and information on four aspects:
- Supply chain due diligence policy: steps taken by the economic operator to comply with the requirements of Article 49.
- Risk management plan: steps taken by the economic operator to comply with the requirements of Article 50, including findings of significant adverse impacts.
- Summary report of the third-party verification carried out (Article 51).
- An elaboration on access to information, public participation in decision-making and access to justice.

DIN DKE Spec 99100 chapter reference: 6.4.2',
  third_party_aussurances STRING COMMENT 'As a non-mandatory data attribute the battery passport should contain information on third-party supply chain assurances such as certifications, of recognised supply chain schemes. Based on the provided guidance, explore which and how to best make third-party assurances available via the battery passport

DIN DKE Spec 99100 chapter reference: 6.4.3',
  supply_chain_indicies FLOAT COMMENT 'As a non-mandatory data attribute the battery passport should contain supply chain indices to allow easy assessment for consumers on level of responsible sourcing. ESGE+ indices under development by the GBA (Global Battery Alliance), scoring and benchmarking sustainability performance. Once developed, explore how to best make the indices available via the battery passport.

DIN DKE Spec 99100 chapter reference: 6.4.4'
)
COMMENT 'Data model for Battery due diligence

Copyright ? 2024 Circulor (for and on behalf of the Battery Pass Consortium). This work is li-censed under a Creative Commons License Attribution-NonCommercial 4.0 International (CC BY-NC 4.0). Readers may reproduce material for their own publications, as long as it is not sold com-mercially and is given appropriate attribution.'
TBLPROPERTIES ('x-samm-aspect-model-urn'='urn:samm:io.BatteryPass.SupplyChainDueDiligence:1.2.0#SupplyChainDueDiligence');
