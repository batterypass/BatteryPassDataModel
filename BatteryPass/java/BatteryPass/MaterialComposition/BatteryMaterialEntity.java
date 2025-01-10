
package io.BatteryPass.MaterialComposition;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated class for Material.
 *
 */

public class BatteryMaterialEntity {

	@NotNull
	private BatteryLocationEntity batteryMaterialLocation;

	@NotNull
	@Pattern(regexp = "^\\d{2,7}-\\d{2}-\\d{1}$")

	private String batteryMaterialIdentifier;

	@NotNull
	private String batteryMaterialName;

	@NotNull
	private Float batteryMaterialMass;

	@NotNull
	private Boolean isCriticalRawMaterial;

	@JsonCreator
	public BatteryMaterialEntity(
			@JsonProperty(value = "batteryMaterialLocation") BatteryLocationEntity batteryMaterialLocation,
			@JsonProperty(value = "batteryMaterialIdentifier") String batteryMaterialIdentifier,
			@JsonProperty(value = "batteryMaterialName") String batteryMaterialName,
			@JsonProperty(value = "batteryMaterialMass") Float batteryMaterialMass,
			@JsonProperty(value = "isCriticalRawMaterial") Boolean isCriticalRawMaterial) {
		super(

		);
		this.batteryMaterialLocation = batteryMaterialLocation;
		this.batteryMaterialIdentifier = batteryMaterialIdentifier;
		this.batteryMaterialName = batteryMaterialName;
		this.batteryMaterialMass = batteryMaterialMass;
		this.isCriticalRawMaterial = isCriticalRawMaterial;
	}

	/**
	 * Returns Location
	 *
	 * @return {@link #batteryMaterialLocation}
	 */
	public BatteryLocationEntity getBatteryMaterialLocation() {
		return this.batteryMaterialLocation;
	}

	/**
	 * Returns Identifier
	 *
	 * @return {@link #batteryMaterialIdentifier}
	 */
	public String getBatteryMaterialIdentifier() {
		return this.batteryMaterialIdentifier;
	}

	/**
	 * Returns Name
	 *
	 * @return {@link #batteryMaterialName}
	 */
	public String getBatteryMaterialName() {
		return this.batteryMaterialName;
	}

	/**
	 * Returns Weight
	 *
	 * @return {@link #batteryMaterialMass}
	 */
	public Float getBatteryMaterialMass() {
		return this.batteryMaterialMass;
	}

	/**
	 * Returns isCriticalRawMaterial
	 *
	 * @return {@link #isCriticalRawMaterial}
	 */
	public Boolean isIsCriticalRawMaterial() {
		return this.isCriticalRawMaterial;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final BatteryMaterialEntity that = (BatteryMaterialEntity) o;
		return Objects.equals(batteryMaterialLocation, that.batteryMaterialLocation)
				&& Objects.equals(batteryMaterialIdentifier, that.batteryMaterialIdentifier)
				&& Objects.equals(batteryMaterialName, that.batteryMaterialName)
				&& Objects.equals(batteryMaterialMass, that.batteryMaterialMass)
				&& Objects.equals(isCriticalRawMaterial, that.isCriticalRawMaterial);
	}

	@Override
	public int hashCode() {
		return Objects.hash(batteryMaterialLocation, batteryMaterialIdentifier, batteryMaterialName,
				batteryMaterialMass, isCriticalRawMaterial);
	}
}
