
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
 * Generated class for HazardousSubstanceEntity. Hazardous substances (No.
 * 19-23): Name (agreed substance nomenclature, e.g. IUPAC or chemical name) all
 * hazardous substance (as ?any substance that poses a threat to human health
 * and the environment?). Suggested above 0.1 % weight by weight within each
 * (sub-)component.
 */

public class HazardousSubstanceEntity {

	@NotNull
	private HazardousSubstanceClassChrateristicEnum hazardousSubstanceClass;

	@NotNull
	private String hazardousSubstanceName;

	@NotNull
	private Double hazardousSubstanceConcentration;

	@NotNull
	private List<String> hazardousSubstanceImpact;

	@NotNull
	private BatteryLocationEntity hazardousSubstanceLocation;

	@NotNull
	@Pattern(regexp = "^\\d{2,7}-\\d{2}-\\d{1}$")

	private String hazardousSubstanceIdentifier;

	@JsonCreator
	public HazardousSubstanceEntity(
			@JsonProperty(value = "hazardousSubstanceClass") HazardousSubstanceClassChrateristicEnum hazardousSubstanceClass,
			@JsonProperty(value = "hazardousSubstanceName") String hazardousSubstanceName,
			@JsonProperty(value = "hazardousSubstanceConcentration") Double hazardousSubstanceConcentration,
			@JsonProperty(value = "hazardousSubstanceImpact") List<String> hazardousSubstanceImpact,
			@JsonProperty(value = "hazardousSubstanceLocation") BatteryLocationEntity hazardousSubstanceLocation,
			@JsonProperty(value = "hazardousSubstanceIdentifier") String hazardousSubstanceIdentifier) {
		super(

		);
		this.hazardousSubstanceClass = hazardousSubstanceClass;
		this.hazardousSubstanceName = hazardousSubstanceName;
		this.hazardousSubstanceConcentration = hazardousSubstanceConcentration;
		this.hazardousSubstanceImpact = hazardousSubstanceImpact;
		this.hazardousSubstanceLocation = hazardousSubstanceLocation;
		this.hazardousSubstanceIdentifier = hazardousSubstanceIdentifier;
	}

	/**
	 * Returns Class
	 *
	 * @return {@link #hazardousSubstanceClass}
	 */
	public HazardousSubstanceClassChrateristicEnum getHazardousSubstanceClass() {
		return this.hazardousSubstanceClass;
	}

	/**
	 * Returns Name
	 *
	 * @return {@link #hazardousSubstanceName}
	 */
	public String getHazardousSubstanceName() {
		return this.hazardousSubstanceName;
	}

	/**
	 * Returns Concentration
	 *
	 * @return {@link #hazardousSubstanceConcentration}
	 */
	public Double getHazardousSubstanceConcentration() {
		return this.hazardousSubstanceConcentration;
	}

	/**
	 * Returns Impact
	 *
	 * @return {@link #hazardousSubstanceImpact}
	 */
	public List<String> getHazardousSubstanceImpact() {
		return this.hazardousSubstanceImpact;
	}

	/**
	 * Returns Location
	 *
	 * @return {@link #hazardousSubstanceLocation}
	 */
	public BatteryLocationEntity getHazardousSubstanceLocation() {
		return this.hazardousSubstanceLocation;
	}

	/**
	 * Returns Identifier
	 *
	 * @return {@link #hazardousSubstanceIdentifier}
	 */
	public String getHazardousSubstanceIdentifier() {
		return this.hazardousSubstanceIdentifier;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final HazardousSubstanceEntity that = (HazardousSubstanceEntity) o;
		return Objects.equals(hazardousSubstanceClass, that.hazardousSubstanceClass)
				&& Objects.equals(hazardousSubstanceName, that.hazardousSubstanceName)
				&& Objects.equals(hazardousSubstanceConcentration, that.hazardousSubstanceConcentration)
				&& Objects.equals(hazardousSubstanceImpact, that.hazardousSubstanceImpact)
				&& Objects.equals(hazardousSubstanceLocation, that.hazardousSubstanceLocation)
				&& Objects.equals(hazardousSubstanceIdentifier, that.hazardousSubstanceIdentifier);
	}

	@Override
	public int hashCode() {
		return Objects.hash(hazardousSubstanceClass, hazardousSubstanceName, hazardousSubstanceConcentration,
				hazardousSubstanceImpact, hazardousSubstanceLocation, hazardousSubstanceIdentifier);
	}
}
