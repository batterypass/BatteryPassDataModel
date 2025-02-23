CREATE TABLE IF NOT EXISTS labeling (
  declaration_of_conformity STRING NOT NULL COMMENT 'A battery passport must include the EU declaration of conformity.

The regulation specifies the following requirements regarding the EU declaration of conformity (see BattReg Annex XIII (1r) and BattReg Article 18 (2)):

- The EU declaration of conformity has the model structure set out in Annex IX.
- The EU declaration of conformity must contain the elements specified in the relevant modules set out in Annex VIII.
- The EU declaration of conformity must be kept up to date.
- It is translated into the language or languages required by the Member State in which the battery is placed or made available on the market or put into service.
- It must be drawn up in electronic format and, where requested, it must be provided in paper format.

DIN DKE Spec chapter reference: 6.2.7',
  result_of_test_report STRING NOT NULL COMMENT 'URL to a document that includes results of tests reports proving compliance in the market conformity assessment procedure with the requirements as per the technical documentation (Art. 7-10, Art. 12-14 and due diligence policies ).

DIN DKE Spec chapter reference 6.2.8',
  labels ARRAY<STRUCT<labeling_symbol: STRING NOT NULL, labeling_meaning: STRING NOT NULL COMMENT 'Explanation of the meaning of all symbols and labels (including separate collection; cadmium and lead; and carbon footprint and carbon footprint performance class symbols; and symbols and labels printed on batteries or their accompanying documents but not accessible via the battery passport).', labeling_subject: STRING NOT NULL COMMENT 'Short name of required labeling subjects'>> NOT NULL COMMENT '\'Separate collection\' or \'WEEE label\' indicating that a product should not be discarded as unsorted waste but must be sent to separate collection facilities for recovery and recycling. To be printed on the physical label and displayed via the battery passport, suggested to be translated also to text to ensure machine readability.

DIN DKE Spec chapter reference: 

6.2.2 Separate collection
6.2.3 Material symbol for Cadmium and Lead
6.2.4 Carbon Footprint perfromance class
6.2.5 Extinguishing agent'
)
COMMENT 'Data model for battery labels and conformity

Copyright 2024 Circulor (for and on behalf of the Battery Pass Consortium). This work is li-censed under a Creative Commons License Attribution-NonCommercial 4.0 International (CC BY-NC 4.0). Readers may reproduce material for their own publications, as long as it is not sold com-mercially and is given appropriate attribution.'
TBLPROPERTIES ('x-samm-aspect-model-urn'='urn:samm:io.BatteryPass.Labels:1.2.0#Labeling');
