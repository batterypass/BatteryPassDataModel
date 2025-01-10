
package io.BatteryPass.MaterialComposition;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated class for Chemistry.
 *
 */

public class BatteryChemistryEntity {

	@NotNull
	private String shortName;

	@NotNull
	private String clearName;

	@JsonCreator
	public BatteryChemistryEntity(@JsonProperty(value = "shortName") String shortName,
			@JsonProperty(value = "clearName") String clearName) {
		super(

		);
		this.shortName = shortName;
		this.clearName = clearName;
	}

	/**
	 * Returns shortName
	 *
	 * @return {@link #shortName}
	 */
	public String getShortName() {
		return this.shortName;
	}

	/**
	 * Returns clearName
	 *
	 * @return {@link #clearName}
	 */
	public String getClearName() {
		return this.clearName;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final BatteryChemistryEntity that = (BatteryChemistryEntity) o;
		return Objects.equals(shortName, that.shortName) && Objects.equals(clearName, that.clearName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(shortName, clearName);
	}
}
