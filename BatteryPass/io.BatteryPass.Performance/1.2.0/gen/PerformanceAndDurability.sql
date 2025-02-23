CREATE TABLE IF NOT EXISTS performance_and_durability (
  battery_techical_properties__original_power_capability ARRAY<STRUCT<at_so_c: FLOAT NOT NULL, power_capability_at: FLOAT NOT NULL>> NOT NULL COMMENT 'Pre-use power capability: Definition of power capability as given in Battery Regulation. 
Annex IV Part B, point 4 --> measurement at 80 % and 20 % SoC required. This requirement may not be implementable for remaining power capability and power fade(see below). It, thus, should be reviewed together with SoC definition.

DIN DKE Spec 99100 chapter reference: 6.7.3.2

',
  battery_techical_properties__rated_maximum_power DOUBLE NOT NULL COMMENT 'This data point describes the value of maximum permitted power the battery is rated for and reflects the data relevant for power limits.

DIN DKE Spec 99100 chapter reference: 6.7.3.2',
  battery_techical_properties__power_capability_ratio FLOAT NOT NULL COMMENT 'Provides information on nominal/recommended charge rate (C-rate); equal to regulation definition.',
  battery_techical_properties__rated_energy FLOAT NOT NULL COMMENT 'The certified usable battery energy is the usable battery energy according to the procedure in the UN GTR No 22 as determined during the certification of the vehicle.

DIN DKE Spec 99100 chapter reference: 6.7.2.5',
  battery_techical_properties__expected_number_of_cycles BIGINT NOT NULL COMMENT 'Expected battery lifetime expressed in cycles.
The exception for non-cycle applications in Article 10 appears sensible, but is not included in the Annex XIII provision.
The data attribute is defined by measurement conditions of the cycle-life test such as the C-Rate (see below) and the depth of discharge in the cycle-life test

DIN DKE Spec 99100 chapter reference: 6.7.6.3',
  battery_techical_properties__initial_self_discharge DOUBLE NOT NULL COMMENT 'Initial self-discharge in % of capacity per unit of time in defined conditions (temperature range etc) as pre-use metric. 

DIN DKE Spec 99100 chapter reference: 6.7.4.6',
  battery_techical_properties__roundtrip_efficiency FLOAT NOT NULL COMMENT 'Energy round trip efficiency is the ratio of the net energy delivered by a battery during a discharge test to the total energy required to restore the initial state of charge by a standard charge (see BattReg Annex IV (6)).

DIN DKE Spec 99100 chapter reference: 6.7.4.2',
  battery_techical_properties__rated_capacity FLOAT NOT NULL COMMENT '?Rated capacity? is the total number of ampere-hours (Ah) that can be withdrawn from a fully charged battery under reference conditions (see BattReg Annex IV (1)).

DIN DKE Spec 99100 chapter reference: 6.7.2.2',
  battery_techical_properties__initial_internal_resistance ARRAY<STRUCT<ohmic_resistance: DOUBLE NOT NULL COMMENT 'Initial (Pre-Use) internal resistance on battery pack level. 

Definition of internal resistance should differ from regulation definition, as "opposition" is not an electrotechnical term and may be based on IEV 131-12-04: "internal resistance means the absolute value of the quotient of the voltage drop between the terminals by the electric current increase in the battery circuit during a current pulse"', battery_component: STRING NOT NULL>> NOT NULL COMMENT 'The battery passport can include additional information about the initial internal resistance on battery module level, if available. It should be defined and calculated analogously as the requirements on battery pack level above.

DIN DKE Spec 99100 chapter reference: 6.7.5.2',
  battery_techical_properties__expected_lifetime SMALLINT NOT NULL COMMENT 'The battery passport must include information about the expected battery lifetime in calendar years.

The update interval must be upon placement on the market and upon change of the battery status.

DIN DKE Spec 99100 chapter reference: 6.7.6.2',
  battery_techical_properties__c_rate FLOAT COMMENT 'As a non-mandatory data point the battery passport should include the ratio between nominal battery power in W and battery energy in Wh. It aims to provide an indication of the applicable discharge and charge rate in terms of rated capacity (C-rate) (see BattReg Annex IV Part B(2)).

The update interval should be upon placement on the market and upon change of the battery status.

DIN DKE Spec 99100 chapter reference: 6.7.3.6',
  battery_techical_properties__nominal_voltage FLOAT NOT NULL COMMENT 'Nominal voltage the battery is rated for.

DIN DKE Spec 99100 chapter reference: 6.7.2.11',
  battery_techical_properties__minimum_voltage FLOAT NOT NULL COMMENT 'Minimum voltage the battery is rated for.

DIN DKE Spec 99100 chapter reference: 6.7.2.9',
  battery_techical_properties__maximum_voltage FLOAT NOT NULL COMMENT 'Maximum voltage the battery is rated for.

DIN DKE Spec 99100 chapter reference: 6.7.2.10',
  battery_techical_properties__capacity_threshold_for_exhaustion DOUBLE NOT NULL COMMENT 'The percentage of SOCE, above which the battery is still considered operational as EV battery in its current life, as provided by the economic operator.

DIN DKE Spec 99100 chapter reference: 6.7.6.9',
  battery_techical_properties__lifetime_reference_test STRING NOT NULL COMMENT 'The exception for non-cycle applications as mentioned in "Expected lifetime: Number of charge-discharge cycles" should apply to this data attribute as well.

DIN DKE Spec 99100 chapter reference: 6.7.6.5',
  battery_techical_properties__c_rate_life_cycle_test FLOAT NOT NULL COMMENT 'The C-rate should be provided separately for both the charge and discharge of the battery, if applicable.

The exception for non-cycle applications as mentioned in "Expected lifetime: Number of charge-discharge cycles" should apply to this data attribute as well.

DIN DKE Spec 99100 chapter reference: 6.7.6.6',
  battery_techical_properties__temperature_range_idle_state DOUBLE NOT NULL COMMENT 'Upper an lower boundary of the surrounding temperature range, which the battery can safely withstand. 

DIN DKE Spec 99100 chapter reference: 6.7.6.3-4',
  battery_condition__energy_throughput DOUBLE NOT NULL COMMENT 'The data attribute should be reported as measured for further potential processing. In addition, the normalisation by capacity may add a further useful value that ensures comparability among battery sizes.

DIN DKE Spec 99100 chapter reference: 6.7.6.7',
  battery_condition__capacity_throughput__capacity_throughput_value FLOAT NOT NULL,
  battery_condition__capacity_throughput__last_update TIMESTAMP NOT NULL COMMENT 'Timestamp for dynamic data attributes show the last update time.',
  battery_condition__number_of_full_cycles__number_of_full_cycles_value DECIMAL NOT NULL,
  battery_condition__number_of_full_cycles__last_update TIMESTAMP NOT NULL COMMENT 'Timestamp for dynamic data attributes show the last update time.',
  battery_condition__state_of_certified_energy__state_of_certified_energy_value FLOAT NOT NULL,
  battery_condition__state_of_certified_energy__last_update TIMESTAMP NOT NULL COMMENT 'Timestamp for dynamic data attributes show the last update time.',
  battery_condition__capacity_fade__capacity_fade_value FLOAT NOT NULL,
  battery_condition__capacity_fade__last_update TIMESTAMP NOT NULL COMMENT 'Timestamp for dynamic data attributes show the last update time.',
  battery_condition__remaining_energy__remaining_energyalue FLOAT NOT NULL,
  battery_condition__remaining_energy__last_update TIMESTAMP NOT NULL COMMENT 'Timestamp for dynamic data attributes show the last update time.',
  battery_condition__remaining_capacity__remaining_capacity_value FLOAT NOT NULL,
  battery_condition__remaining_capacity__last_update TIMESTAMP NOT NULL COMMENT 'Timestamp for dynamic data attributes show the last update time.',
  battery_condition__negative_events ARRAY<STRUCT<negative_event: STRING NOT NULL, last_update: TIMESTAMP NOT NULL COMMENT 'Timestamp for dynamic data attributes show the last update time.'>> NOT NULL,
  battery_condition__temperature_information__time_extreme_high_temp DOUBLE NOT NULL COMMENT 'Cumulated time spent above the given upper boundary of temperature.',
  battery_condition__temperature_information__time_extreme_low_temp DOUBLE NOT NULL COMMENT 'Cumulated time spent below the given lower boundary of temperature.',
  battery_condition__temperature_information__time_extreme_high_temp_charging DOUBLE NOT NULL COMMENT 'Cumulated time spent above the given upper boundary of temperature during Charging.',
  battery_condition__temperature_information__time_extreme_low_temp_charging DOUBLE NOT NULL COMMENT 'Cumulated time spent below the given lower boundary of temperature during charging.',
  battery_condition__temperature_information__last_update TIMESTAMP NOT NULL COMMENT 'Timestamp for dynamic data attributes show the last update time.',
  battery_condition__remaining_power_capability ARRAY<STRUCT<remaining_power_capability_value: STRUCT<r_p_c_last_updated: TIMESTAMP, at_so_c: FLOAT, power_capability_at: FLOAT> NOT NULL, last_update: TIMESTAMP NOT NULL COMMENT 'Timestamp for dynamic data attributes show the last update time.'>> NOT NULL COMMENT '\'- Original power capability (in Watts) and limits, with temperature range when relevant.
- The amount of energy that a battery is capable to provide over a given period of time under reference conditions.
- Power capability at 80% and 20% state of charge.

DIN DKE Spec 99100 chapter reference: 6.7.3.3',
  battery_condition__power_fade FLOAT NOT NULL COMMENT '?Power fade (in %) means the decrease over time and upon usage in the amount of power that a battery can deliver at the rated voltage.? (see BattReg Annex IV (4)).

Power fade should be calculated using original and remaining power capability following the formula below:
Pfade(x) = (1-P(x)) / PBOL" ?100" %" 
where
x 	is the aging parameter (e.g. storage time, number of cycles, etc.);
P(x) 	is the power capability at aging parameter x;
PBOL 	is the power capability at begin of life.

DIN DKE Spec 99100 chapter reference: 6.7.3.4',
  battery_condition__round_trip_efficiency_fade FLOAT NOT NULL COMMENT 'Energy round trip efficiency fade should be calculated using the initial round trip energy efficiency and remaining round trip energy efficiency following the formula below:

RTEfade (x) = (1-RTE(x)) / RTEBOL  ?100" %" 
where
x 	is the aging parameter (e.g. storage time, number of cycles, etc.);
RTE(x) 	is the round trip energy efficiency at aging parameter x;
RTEBOL 	is the round trip energy efficiency at begin of life.

DIN DKE Spec 99100 chapter reference: 6.7.4.5',
  battery_condition__evolution_of_self_discharge__evolution_of_self_discharge_entity_value FLOAT NOT NULL,
  battery_condition__current_self_discharging_rate__current_self_discharging_rate_entity FLOAT NOT NULL,
  battery_condition__current_self_discharging_rate__last_update TIMESTAMP NOT NULL COMMENT 'Timestamp for dynamic data attributes show the last update time.',
  battery_condition__internal_resistance_increase ARRAY<STRUCT<internal_resistance_increase_value: FLOAT NOT NULL, last_update: TIMESTAMP NOT NULL COMMENT 'Timestamp for dynamic data attributes show the last update time.', battery_component: STRING NOT NULL>> NOT NULL COMMENT 'The internal resistance increase over time and upon usage should be defined based on the ratio of current and initial values as follows:
Rincrease(x) = (R(x)  - RBOL) / RBOL ? 100 %
where
x 	is the aging parameter (e.g. storage time, number of cycles, etc.;);
R(x)	is the internal resistance at the aging parameter x; and
RBOL	is the internal resistance at begin of life.

The battery passport can include additional information about the internal resistance increase on battery cell and battery module level, if available. It should be defined and calculated analogously to the requirements on battery pack level above.

DIN DKE Spec 99100 chapter reference: 6.7.5.3',
  battery_condition__round_trip_efficiencyat50_per_cent_cycle_life FLOAT NOT NULL COMMENT 'Initial round trip energy efficiency shall be measured at reference conditions that include the specification of ?50 % of cycle-life?.

Test methods and reference conditions should separately consider non-cycle applications and batteries with very long cycle-life.

DIN DKE Spec 99100 chapter reference: 6.7.4.3
',
  battery_condition__remaining_round_trip_energy_efficiency__remaining_round_trip_energy_efficiency_value FLOAT NOT NULL,
  battery_condition__remaining_round_trip_energy_efficiency__last_update TIMESTAMP NOT NULL COMMENT 'Timestamp for dynamic data attributes show the last update time.',
  battery_condition__state_of_charge__state_of_charge_value FLOAT NOT NULL,
  battery_condition__state_of_charge__last_update TIMESTAMP NOT NULL COMMENT 'Timestamp for dynamic data attributes show the last update time.'
)
COMMENT 'Battery performance and durability data model

Copyright ? 2024 Circulor (for and on behalf of the Battery Pass Consortium). This work is li-censed under a Creative Commons License Attribution-NonCommercial 4.0 International (CC BY-NC 4.0). Readers may reproduce material for their own publications, as long as it is not sold com-mercially and is given appropriate attribution.'
TBLPROPERTIES ('x-samm-aspect-model-urn'='urn:samm:io.BatteryPass.Performance:1.2.0#PerformanceAndDurability');
