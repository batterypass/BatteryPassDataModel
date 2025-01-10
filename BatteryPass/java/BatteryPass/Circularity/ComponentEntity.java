
package io.BatteryPass.Circularity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated class for ComponentEntity.
 *
 */

public class ComponentEntity {

	@NotNull
	private String partName;

	@NotNull
	private String partNumber;

	@JsonCreator
	public ComponentEntity(@JsonProperty(value = "partName") String partName,
			@JsonProperty(value = "partNumber") String partNumber) {
		super(

		);
		this.partName = partName;
		this.partNumber = partNumber;
	}

	/**
	 * Returns PartName
	 *
	 * @return {@link #partName}
	 */
	public String getPartName() {
		return this.partName;
	}

	/**
	 * Returns partNumber
	 *
	 * @return {@link #partNumber}
	 */
	public String getPartNumber() {
		return this.partNumber;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final ComponentEntity that = (ComponentEntity) o;
		return Objects.equals(partName, that.partName) && Objects.equals(partNumber, that.partNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(partName, partNumber);
	}
}
