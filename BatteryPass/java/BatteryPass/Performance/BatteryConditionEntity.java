
package io.BatteryPass.Performance;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated class for BatteryConditionEntity. Covers all battery lifetime
 * relevant properties
 */

public class BatteryConditionEntity {

	@NotNull
	private Double energyThroughput;

	@NotNull
	private CapacityThroughputEntity capacityThroughput;

	@NotNull
	private NumberOfFullCyclesEntity numberOfFullCycles;

	@NotNull
	private StateOfCertifiedEnergyEntity stateOfCertifiedEnergy;

	@NotNull
	private CapacityFadeEntity capacityFade;

	@NotNull
	private RemainingEnergyEntity remainingEnergy;

	@NotNull
	private RemainingCapacityEntity remainingCapacity;

	@NotNull
	private List<NegativeEventEntity> negativeEvents;

	@NotNull
	private TemperatureConditionsEntity temperatureInformation;

	@NotNull
	private List<RemainingPowerCapabilityEntity> remainingPowerCapability;

	@NotNull
	private Float powerFade;

	@NotNull
	private Float roundTripEfficiencyFade;

	@NotNull
	private EvolutionOfSelfDischargeEntity evolutionOfSelfDischarge;

	@NotNull
	private CurrentSelfDischargingRateEntity currentSelfDischargingRate;

	@NotNull
	private List<InternalResistanceIncreaseEntity> internalResistanceIncrease;

	@NotNull
	private Float roundTripEfficiencyat50PerCentCycleLife;

	@NotNull
	private RemainingRoundTripEnergyEfficiencyEntity remainingRoundTripEnergyEfficiency;

	@NotNull
	private StateOfChargeEntity stateOfCharge;

	@JsonCreator
	public BatteryConditionEntity(@JsonProperty(value = "energyThroughput") Double energyThroughput,
			@JsonProperty(value = "capacityThroughput") CapacityThroughputEntity capacityThroughput,
			@JsonProperty(value = "numberOfFullCycles") NumberOfFullCyclesEntity numberOfFullCycles,
			@JsonProperty(value = "stateOfCertifiedEnergy") StateOfCertifiedEnergyEntity stateOfCertifiedEnergy,
			@JsonProperty(value = "capacityFade") CapacityFadeEntity capacityFade,
			@JsonProperty(value = "remainingEnergy") RemainingEnergyEntity remainingEnergy,
			@JsonProperty(value = "remainingCapacity") RemainingCapacityEntity remainingCapacity,
			@JsonProperty(value = "negativeEvents") List<NegativeEventEntity> negativeEvents,
			@JsonProperty(value = "temperatureInformation") TemperatureConditionsEntity temperatureInformation,
			@JsonProperty(value = "remainingPowerCapability") List<RemainingPowerCapabilityEntity> remainingPowerCapability,
			@JsonProperty(value = "powerFade") Float powerFade,
			@JsonProperty(value = "roundTripEfficiencyFade") Float roundTripEfficiencyFade,
			@JsonProperty(value = "evolutionOfSelfDischarge") EvolutionOfSelfDischargeEntity evolutionOfSelfDischarge,
			@JsonProperty(value = "currentSelfDischargingRate") CurrentSelfDischargingRateEntity currentSelfDischargingRate,
			@JsonProperty(value = "internalResistanceIncrease") List<InternalResistanceIncreaseEntity> internalResistanceIncrease,
			@JsonProperty(value = "roundTripEfficiencyat50PerCentCycleLife") Float roundTripEfficiencyat50PerCentCycleLife,
			@JsonProperty(value = "remainingRoundTripEnergyEfficiency") RemainingRoundTripEnergyEfficiencyEntity remainingRoundTripEnergyEfficiency,
			@JsonProperty(value = "stateOfCharge") StateOfChargeEntity stateOfCharge) {
		super(

		);
		this.energyThroughput = energyThroughput;
		this.capacityThroughput = capacityThroughput;
		this.numberOfFullCycles = numberOfFullCycles;
		this.stateOfCertifiedEnergy = stateOfCertifiedEnergy;
		this.capacityFade = capacityFade;
		this.remainingEnergy = remainingEnergy;
		this.remainingCapacity = remainingCapacity;
		this.negativeEvents = negativeEvents;
		this.temperatureInformation = temperatureInformation;
		this.remainingPowerCapability = remainingPowerCapability;
		this.powerFade = powerFade;
		this.roundTripEfficiencyFade = roundTripEfficiencyFade;
		this.evolutionOfSelfDischarge = evolutionOfSelfDischarge;
		this.currentSelfDischargingRate = currentSelfDischargingRate;
		this.internalResistanceIncrease = internalResistanceIncrease;
		this.roundTripEfficiencyat50PerCentCycleLife = roundTripEfficiencyat50PerCentCycleLife;
		this.remainingRoundTripEnergyEfficiency = remainingRoundTripEnergyEfficiency;
		this.stateOfCharge = stateOfCharge;
	}

	/**
	 * Returns energyThroughput
	 *
	 * @return {@link #energyThroughput}
	 */
	public Double getEnergyThroughput() {
		return this.energyThroughput;
	}

	/**
	 * Returns capacityThroughput
	 *
	 * @return {@link #capacityThroughput}
	 */
	public CapacityThroughputEntity getCapacityThroughput() {
		return this.capacityThroughput;
	}

	/**
	 * Returns numberOfFullCycles
	 *
	 * @return {@link #numberOfFullCycles}
	 */
	public NumberOfFullCyclesEntity getNumberOfFullCycles() {
		return this.numberOfFullCycles;
	}

	/**
	 * Returns SOCE
	 *
	 * @return {@link #stateOfCertifiedEnergy}
	 */
	public StateOfCertifiedEnergyEntity getStateOfCertifiedEnergy() {
		return this.stateOfCertifiedEnergy;
	}

	/**
	 * Returns capacityFade
	 *
	 * @return {@link #capacityFade}
	 */
	public CapacityFadeEntity getCapacityFade() {
		return this.capacityFade;
	}

	/**
	 * Returns remainingEnergy
	 *
	 * @return {@link #remainingEnergy}
	 */
	public RemainingEnergyEntity getRemainingEnergy() {
		return this.remainingEnergy;
	}

	/**
	 * Returns remainingCapacity
	 *
	 * @return {@link #remainingCapacity}
	 */
	public RemainingCapacityEntity getRemainingCapacity() {
		return this.remainingCapacity;
	}

	/**
	 * Returns negativeEvents
	 *
	 * @return {@link #negativeEvents}
	 */
	public List<NegativeEventEntity> getNegativeEvents() {
		return this.negativeEvents;
	}

	/**
	 * Returns temperatureInformation
	 *
	 * @return {@link #temperatureInformation}
	 */
	public TemperatureConditionsEntity getTemperatureInformation() {
		return this.temperatureInformation;
	}

	/**
	 * Returns remainingPowerCapability
	 *
	 * @return {@link #remainingPowerCapability}
	 */
	public List<RemainingPowerCapabilityEntity> getRemainingPowerCapability() {
		return this.remainingPowerCapability;
	}

	/**
	 * Returns powerFade
	 *
	 * @return {@link #powerFade}
	 */
	public Float getPowerFade() {
		return this.powerFade;
	}

	/**
	 * Returns roundTripEfficiencyFade
	 *
	 * @return {@link #roundTripEfficiencyFade}
	 */
	public Float getRoundTripEfficiencyFade() {
		return this.roundTripEfficiencyFade;
	}

	/**
	 * Returns evolutionOfSelfDischarge
	 *
	 * @return {@link #evolutionOfSelfDischarge}
	 */
	public EvolutionOfSelfDischargeEntity getEvolutionOfSelfDischarge() {
		return this.evolutionOfSelfDischarge;
	}

	/**
	 * Returns currentSelfDischargingRate
	 *
	 * @return {@link #currentSelfDischargingRate}
	 */
	public CurrentSelfDischargingRateEntity getCurrentSelfDischargingRate() {
		return this.currentSelfDischargingRate;
	}

	/**
	 * Returns internalResistanceIncrease
	 *
	 * @return {@link #internalResistanceIncrease}
	 */
	public List<InternalResistanceIncreaseEntity> getInternalResistanceIncrease() {
		return this.internalResistanceIncrease;
	}

	/**
	 * Returns roundTripEfficiencyat50PerCentCycleLife
	 *
	 * @return {@link #roundTripEfficiencyat50PerCentCycleLife}
	 */
	public Float getRoundTripEfficiencyat50PerCentCycleLife() {
		return this.roundTripEfficiencyat50PerCentCycleLife;
	}

	/**
	 * Returns remainingRoundTripEnergyEfficiency
	 *
	 * @return {@link #remainingRoundTripEnergyEfficiency}
	 */
	public RemainingRoundTripEnergyEfficiencyEntity getRemainingRoundTripEnergyEfficiency() {
		return this.remainingRoundTripEnergyEfficiency;
	}

	/**
	 * Returns SoC
	 *
	 * @return {@link #stateOfCharge}
	 */
	public StateOfChargeEntity getStateOfCharge() {
		return this.stateOfCharge;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final BatteryConditionEntity that = (BatteryConditionEntity) o;
		return Objects.equals(energyThroughput, that.energyThroughput)
				&& Objects.equals(capacityThroughput, that.capacityThroughput)
				&& Objects.equals(numberOfFullCycles, that.numberOfFullCycles)
				&& Objects.equals(stateOfCertifiedEnergy, that.stateOfCertifiedEnergy)
				&& Objects.equals(capacityFade, that.capacityFade)
				&& Objects.equals(remainingEnergy, that.remainingEnergy)
				&& Objects.equals(remainingCapacity, that.remainingCapacity)
				&& Objects.equals(negativeEvents, that.negativeEvents)
				&& Objects.equals(temperatureInformation, that.temperatureInformation)
				&& Objects.equals(remainingPowerCapability, that.remainingPowerCapability)
				&& Objects.equals(powerFade, that.powerFade)
				&& Objects.equals(roundTripEfficiencyFade, that.roundTripEfficiencyFade)
				&& Objects.equals(evolutionOfSelfDischarge, that.evolutionOfSelfDischarge)
				&& Objects.equals(currentSelfDischargingRate, that.currentSelfDischargingRate)
				&& Objects.equals(internalResistanceIncrease, that.internalResistanceIncrease)
				&& Objects.equals(roundTripEfficiencyat50PerCentCycleLife, that.roundTripEfficiencyat50PerCentCycleLife)
				&& Objects.equals(remainingRoundTripEnergyEfficiency, that.remainingRoundTripEnergyEfficiency)
				&& Objects.equals(stateOfCharge, that.stateOfCharge);
	}

	@Override
	public int hashCode() {
		return Objects.hash(energyThroughput, capacityThroughput, numberOfFullCycles, stateOfCertifiedEnergy,
				capacityFade, remainingEnergy, remainingCapacity, negativeEvents, temperatureInformation,
				remainingPowerCapability, powerFade, roundTripEfficiencyFade, evolutionOfSelfDischarge,
				currentSelfDischargingRate, internalResistanceIncrease, roundTripEfficiencyat50PerCentCycleLife,
				remainingRoundTripEnergyEfficiency, stateOfCharge);
	}
}
