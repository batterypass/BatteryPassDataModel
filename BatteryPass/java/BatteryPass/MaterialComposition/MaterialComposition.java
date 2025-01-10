
package io.BatteryPass.MaterialComposition;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated class for MaterialComposition. Mandatory data: Battery chemistry;
 * critical raw materials; materials used in the cathode, anode, and
 * electrolyte; hazardous substances; impact of substances on the environment
 * and on human health or safety
 * 
 * Copyright ? 2024 Circulor (for and on behalf of the Battery Pass Consortium).
 * This work is li-censed under a Creative Commons License
 * Attribution-NonCommercial 4.0 International (CC BY-NC 4.0). Readers may
 * reproduce material for their own publications, as long as it is not sold
 * com-mercially and is given appropriate attribution.
 */
public class MaterialComposition {

	@NotNull
	private BatteryChemistryEntity batteryChemistry;

	@NotNull
	private List<BatteryMaterialEntity> batteryMaterials;

	@NotNull
	private List<HazardousSubstanceEntity> hazardousSubstances;

	@JsonCreator
	public MaterialComposition(@JsonProperty(value = "batteryChemistry") BatteryChemistryEntity batteryChemistry,
			@JsonProperty(value = "batteryMaterials") List<BatteryMaterialEntity> batteryMaterials,
			@JsonProperty(value = "hazardousSubstances") List<HazardousSubstanceEntity> hazardousSubstances) {
		super(

		);
		this.batteryChemistry = batteryChemistry;
		this.batteryMaterials = batteryMaterials;
		this.hazardousSubstances = hazardousSubstances;
	}

	/**
	 * Returns ProductChemistry
	 *
	 * @return {@link #batteryChemistry}
	 */
	public BatteryChemistryEntity getBatteryChemistry() {
		return this.batteryChemistry;
	}

	/**
	 * Returns BatteryMaterials
	 *
	 * @return {@link #batteryMaterials}
	 */
	public List<BatteryMaterialEntity> getBatteryMaterials() {
		return this.batteryMaterials;
	}

	/**
	 * Returns HazardousSubstances
	 *
	 * @return {@link #hazardousSubstances}
	 */
	public List<HazardousSubstanceEntity> getHazardousSubstances() {
		return this.hazardousSubstances;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final MaterialComposition that = (MaterialComposition) o;
		return Objects.equals(batteryChemistry, that.batteryChemistry)
				&& Objects.equals(batteryMaterials, that.batteryMaterials)
				&& Objects.equals(hazardousSubstances, that.hazardousSubstances);
	}

	@Override
	public int hashCode() {
		return Objects.hash(batteryChemistry, batteryMaterials, hazardousSubstances);
	}
}
