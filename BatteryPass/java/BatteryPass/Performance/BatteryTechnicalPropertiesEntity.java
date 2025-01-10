
package io.BatteryPass.Performance;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import org.eclipse.esmf.aspectmodel.java.customconstraint.DoubleMax;
import org.eclipse.esmf.aspectmodel.java.customconstraint.DoubleMin;
import org.eclipse.esmf.metamodel.BoundDefinition;

/**
 * Generated class for BatteryTechnicalPropertiesEntity. Covers all Capability
 * related data attributes
 */

public class BatteryTechnicalPropertiesEntity {

	@NotNull
	private List<PowerCapabilityAtEntity> originalPowerCapability;

	@NotNull
	private Double ratedMaximumPower;

	@NotNull
	private Float powerCapabilityRatio;

	@NotNull
	private Float ratedEnergy;

	@NotNull
	private Long expectedNumberOfCycles;

	@NotNull
	private Double initialSelfDischarge;

	@NotNull
	private Float roundtripEfficiency;

	@NotNull
	private Float ratedCapacity;

	@NotNull
	private List<InternalResistanceEntity> initialInternalResistance;

	@NotNull
	private Short expectedLifetime;
	private Optional<Float> cRate;

	@NotNull
	private Float nominalVoltage;

	@NotNull
	private Float minimumVoltage;

	@NotNull
	private Float maximumVoltage;

	@NotNull
	private Double capacityThresholdForExhaustion;

	@NotNull
	private URI lifetimeReferenceTest;

	@NotNull
	private Float cRateLifeCycleTest;

	@NotNull
	@DoubleMin(value = "-20.0", boundDefinition = BoundDefinition.AT_LEAST)
	@DoubleMax(value = "60.0", boundDefinition = BoundDefinition.AT_MOST)

	private Double temperatureRangeIdleState;

	@JsonCreator
	public BatteryTechnicalPropertiesEntity(
			@JsonProperty(value = "originalPowerCapability") List<PowerCapabilityAtEntity> originalPowerCapability,
			@JsonProperty(value = "ratedMaximumPower") Double ratedMaximumPower,
			@JsonProperty(value = "powerCapabilityRatio") Float powerCapabilityRatio,
			@JsonProperty(value = "ratedEnergy") Float ratedEnergy,
			@JsonProperty(value = "expectedNumberOfCycles") Long expectedNumberOfCycles,
			@JsonProperty(value = "initialSelfDischarge") Double initialSelfDischarge,
			@JsonProperty(value = "roundtripEfficiency") Float roundtripEfficiency,
			@JsonProperty(value = "ratedCapacity") Float ratedCapacity,
			@JsonProperty(value = "initialInternalResistance") List<InternalResistanceEntity> initialInternalResistance,
			@JsonProperty(value = "expectedLifetime") Short expectedLifetime,
			@JsonProperty(value = "cRate") Optional<Float> cRate,
			@JsonProperty(value = "nominalVoltage") Float nominalVoltage,
			@JsonProperty(value = "minimumVoltage") Float minimumVoltage,
			@JsonProperty(value = "maximumVoltage") Float maximumVoltage,
			@JsonProperty(value = "capacityThresholdForExhaustion") Double capacityThresholdForExhaustion,
			@JsonProperty(value = "lifetimeReferenceTest") URI lifetimeReferenceTest,
			@JsonProperty(value = "cRateLifeCycleTest") Float cRateLifeCycleTest,
			@JsonProperty(value = "temperatureRangeIdleState") Double temperatureRangeIdleState) {
		super(

		);
		this.originalPowerCapability = originalPowerCapability;
		this.ratedMaximumPower = ratedMaximumPower;
		this.powerCapabilityRatio = powerCapabilityRatio;
		this.ratedEnergy = ratedEnergy;
		this.expectedNumberOfCycles = expectedNumberOfCycles;
		this.initialSelfDischarge = initialSelfDischarge;
		this.roundtripEfficiency = roundtripEfficiency;
		this.ratedCapacity = ratedCapacity;
		this.initialInternalResistance = initialInternalResistance;
		this.expectedLifetime = expectedLifetime;
		this.cRate = cRate == null ? Optional.empty() : cRate;
		this.nominalVoltage = nominalVoltage;
		this.minimumVoltage = minimumVoltage;
		this.maximumVoltage = maximumVoltage;
		this.capacityThresholdForExhaustion = capacityThresholdForExhaustion;
		this.lifetimeReferenceTest = lifetimeReferenceTest;
		this.cRateLifeCycleTest = cRateLifeCycleTest;
		this.temperatureRangeIdleState = temperatureRangeIdleState;
	}

	/**
	 * Returns originalPowerCapability
	 *
	 * @return {@link #originalPowerCapability}
	 */
	public List<PowerCapabilityAtEntity> getOriginalPowerCapability() {
		return this.originalPowerCapability;
	}

	/**
	 * Returns ratedMaximumPower
	 *
	 * @return {@link #ratedMaximumPower}
	 */
	public Double getRatedMaximumPower() {
		return this.ratedMaximumPower;
	}

	/**
	 * Returns PowerCapabilityRatio
	 *
	 * @return {@link #powerCapabilityRatio}
	 */
	public Float getPowerCapabilityRatio() {
		return this.powerCapabilityRatio;
	}

	/**
	 * Returns ratedEnergy
	 *
	 * @return {@link #ratedEnergy}
	 */
	public Float getRatedEnergy() {
		return this.ratedEnergy;
	}

	/**
	 * Returns ExpectedNumberOfCycles
	 *
	 * @return {@link #expectedNumberOfCycles}
	 */
	public Long getExpectedNumberOfCycles() {
		return this.expectedNumberOfCycles;
	}

	/**
	 * Returns initialSelfDischarge
	 *
	 * @return {@link #initialSelfDischarge}
	 */
	public Double getInitialSelfDischarge() {
		return this.initialSelfDischarge;
	}

	/**
	 * Returns roundtripEfficiency
	 *
	 * @return {@link #roundtripEfficiency}
	 */
	public Float getRoundtripEfficiency() {
		return this.roundtripEfficiency;
	}

	/**
	 * Returns ratedCapacity
	 *
	 * @return {@link #ratedCapacity}
	 */
	public Float getRatedCapacity() {
		return this.ratedCapacity;
	}

	/**
	 * Returns initialInternalResistance
	 *
	 * @return {@link #initialInternalResistance}
	 */
	public List<InternalResistanceEntity> getInitialInternalResistance() {
		return this.initialInternalResistance;
	}

	/**
	 * Returns expectedLifetime
	 *
	 * @return {@link #expectedLifetime}
	 */
	public Short getExpectedLifetime() {
		return this.expectedLifetime;
	}

	/**
	 * Returns cRate
	 *
	 * @return {@link #cRate}
	 */
	public Optional<Float> getCRate() {
		return this.cRate;
	}

	/**
	 * Returns nominalVoltage
	 *
	 * @return {@link #nominalVoltage}
	 */
	public Float getNominalVoltage() {
		return this.nominalVoltage;
	}

	/**
	 * Returns minimumVoltage
	 *
	 * @return {@link #minimumVoltage}
	 */
	public Float getMinimumVoltage() {
		return this.minimumVoltage;
	}

	/**
	 * Returns maximumVoltage
	 *
	 * @return {@link #maximumVoltage}
	 */
	public Float getMaximumVoltage() {
		return this.maximumVoltage;
	}

	/**
	 * Returns capacityThresholdForExhaustion
	 *
	 * @return {@link #capacityThresholdForExhaustion}
	 */
	public Double getCapacityThresholdForExhaustion() {
		return this.capacityThresholdForExhaustion;
	}

	/**
	 * Returns lifetimeReferenceTest
	 *
	 * @return {@link #lifetimeReferenceTest}
	 */
	public URI getLifetimeReferenceTest() {
		return this.lifetimeReferenceTest;
	}

	/**
	 * Returns cRateLifeCycleTest
	 *
	 * @return {@link #cRateLifeCycleTest}
	 */
	public Float getCRateLifeCycleTest() {
		return this.cRateLifeCycleTest;
	}

	/**
	 * Returns temperatureRangeIdleState
	 *
	 * @return {@link #temperatureRangeIdleState}
	 */
	public Double getTemperatureRangeIdleState() {
		return this.temperatureRangeIdleState;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final BatteryTechnicalPropertiesEntity that = (BatteryTechnicalPropertiesEntity) o;
		return Objects.equals(originalPowerCapability, that.originalPowerCapability)
				&& Objects.equals(ratedMaximumPower, that.ratedMaximumPower)
				&& Objects.equals(powerCapabilityRatio, that.powerCapabilityRatio)
				&& Objects.equals(ratedEnergy, that.ratedEnergy)
				&& Objects.equals(expectedNumberOfCycles, that.expectedNumberOfCycles)
				&& Objects.equals(initialSelfDischarge, that.initialSelfDischarge)
				&& Objects.equals(roundtripEfficiency, that.roundtripEfficiency)
				&& Objects.equals(ratedCapacity, that.ratedCapacity)
				&& Objects.equals(initialInternalResistance, that.initialInternalResistance)
				&& Objects.equals(expectedLifetime, that.expectedLifetime) && Objects.equals(cRate, that.cRate)
				&& Objects.equals(nominalVoltage, that.nominalVoltage)
				&& Objects.equals(minimumVoltage, that.minimumVoltage)
				&& Objects.equals(maximumVoltage, that.maximumVoltage)
				&& Objects.equals(capacityThresholdForExhaustion, that.capacityThresholdForExhaustion)
				&& Objects.equals(lifetimeReferenceTest, that.lifetimeReferenceTest)
				&& Objects.equals(cRateLifeCycleTest, that.cRateLifeCycleTest)
				&& Objects.equals(temperatureRangeIdleState, that.temperatureRangeIdleState);
	}

	@Override
	public int hashCode() {
		return Objects.hash(originalPowerCapability, ratedMaximumPower, powerCapabilityRatio, ratedEnergy,
				expectedNumberOfCycles, initialSelfDischarge, roundtripEfficiency, ratedCapacity,
				initialInternalResistance, expectedLifetime, cRate, nominalVoltage, minimumVoltage, maximumVoltage,
				capacityThresholdForExhaustion, lifetimeReferenceTest, cRateLifeCycleTest, temperatureRangeIdleState);
	}
}
