CREATE TABLE IF NOT EXISTS material_composition (
  battery_chemistry__short_name STRING NOT NULL,
  battery_chemistry__clear_name STRING NOT NULL,
  battery_materials ARRAY<STRUCT<battery_material_location: STRUCT<component_name: STRING, component_id: STRING> NOT NULL COMMENT 'Battery component that relates to the material', battery_material_identifier: STRING NOT NULL COMMENT 'CAS Number ', battery_material_name: STRING NOT NULL COMMENT 'Clear name of Material', battery_material_mass: FLOAT NOT NULL COMMENT 'Weight of component material', is_critical_raw_material: BOOLEAN NOT NULL COMMENT 'The battery passport must contain information on the critical raw materials present in the battery.

The information on the critical raw materials must also be provided on the battery label.
Per Annex VI, Part A(10), critical raw materials must be reported if present in the battery in a concentration of more than 0,1 % weight by weight. '>> NOT NULL COMMENT '"Component materials used" (No. 17.a-c): Naming the materials (as a composition of substances) in cathode, anode, electrolyte according to public standards, including specification of the corresponding component (i.e., cathode, anode, or electrolyte). We suggest a reporting threshold of 0.1 % weight by weight.

DIN DKE Spec 99100 chapter reference: 6.5.3-6.5.4',
  hazardous_substances ARRAY<STRUCT<hazardous_substance_class: STRING NOT NULL COMMENT 'Battery Regulation narrows reporting to substances falling under defined hazard classes and categories of the CLP regulation.', hazardous_substance_name: STRING NOT NULL COMMENT 'Clear name of hazardous substance', hazardous_substance_concentration: DOUBLE NOT NULL COMMENT 'Concentration of hazardous substance', hazardous_substance_impact: STRING NOT NULL COMMENT 'Impact statements based on, e.g., REACH or GHS for all hazard classes applicable to substances in the battery.', hazardous_substance_location: STRUCT<component_name: STRING, component_id: STRING> NOT NULL COMMENT 'Hazardous substances (No. 19-23): Location on a (sub-)component-level of all hazardous substances (as ?any substance that poses a threat to human health and the environment?). Suggested via a unique identifier or nomenclature.', hazardous_substance_identifier: STRING NOT NULL COMMENT 'CAS identifier of hazardous substance'>> NOT NULL COMMENT '"Hazardous substances" (No 20.a-e): Name (agreed substance nomenclature, e.g. IUPAC or chemical name) all hazardous substance (as ?any substance that poses a threat to human health and the environment?). Suggested above 0.1 % weight by weight within each (sub-)component.

DIN DKE Spec 99100 chapter reference: 6.5.4 - 6.5.6'
)
COMMENT 'Mandatory data: Battery chemistry; critical raw materials; materials used in the cathode, anode, and 
electrolyte; hazardous substances; impact of substances on the environment and on human health or 
safety

Copyright ? 2024 Circulor (for and on behalf of the Battery Pass Consortium). This work is li-censed under a Creative Commons License Attribution-NonCommercial 4.0 International (CC BY-NC 4.0). Readers may reproduce material for their own publications, as long as it is not sold com-mercially and is given appropriate attribution.'
TBLPROPERTIES ('x-samm-aspect-model-urn'='urn:samm:io.BatteryPass.MaterialComposition:1.2.0#MaterialComposition');
