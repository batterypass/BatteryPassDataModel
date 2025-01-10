
package io.BatteryPass.Performance;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated class for PerformanceAndDurability. Battery performance and
 * durability data model
 * 
 * Copyright ? 2024 Circulor (for and on behalf of the Battery Pass Consortium).
 * This work is li-censed under a Creative Commons License
 * Attribution-NonCommercial 4.0 International (CC BY-NC 4.0). Readers may
 * reproduce material for their own publications, as long as it is not sold
 * com-mercially and is given appropriate attribution.
 */
public class PerformanceAndDurability {

	@NotNull
	private BatteryTechnicalPropertiesEntity batteryTechicalProperties;

	@NotNull
	private BatteryConditionEntity batteryCondition;

	@JsonCreator
	public PerformanceAndDurability(
			@JsonProperty(value = "batteryTechicalProperties") BatteryTechnicalPropertiesEntity batteryTechicalProperties,
			@JsonProperty(value = "batteryCondition") BatteryConditionEntity batteryCondition) {
		super(

		);
		this.batteryTechicalProperties = batteryTechicalProperties;
		this.batteryCondition = batteryCondition;
	}

	/**
	 * Returns batteryTechicalProperties
	 *
	 * @return {@link #batteryTechicalProperties}
	 */
	public BatteryTechnicalPropertiesEntity getBatteryTechicalProperties() {
		return this.batteryTechicalProperties;
	}

	/**
	 * Returns batteryCondition
	 *
	 * @return {@link #batteryCondition}
	 */
	public BatteryConditionEntity getBatteryCondition() {
		return this.batteryCondition;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final PerformanceAndDurability that = (PerformanceAndDurability) o;
		return Objects.equals(batteryTechicalProperties, that.batteryTechicalProperties)
				&& Objects.equals(batteryCondition, that.batteryCondition);
	}

	@Override
	public int hashCode() {
		return Objects.hash(batteryTechicalProperties, batteryCondition);
	}
}
