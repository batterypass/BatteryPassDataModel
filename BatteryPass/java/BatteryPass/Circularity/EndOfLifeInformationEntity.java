
package io.BatteryPass.Circularity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated class for EndOfLifeInformationEntity.
 *
 */

public class EndOfLifeInformationEntity {

	@NotNull
	private URI wastePrevention;

	@NotNull
	private URI separateCollection;

	@NotNull
	private URI informationOnCollection;

	@JsonCreator
	public EndOfLifeInformationEntity(@JsonProperty(value = "wastePrevention") URI wastePrevention,
			@JsonProperty(value = "separateCollection") URI separateCollection,
			@JsonProperty(value = "informationOnCollection") URI informationOnCollection) {
		super(

		);
		this.wastePrevention = wastePrevention;
		this.separateCollection = separateCollection;
		this.informationOnCollection = informationOnCollection;
	}

	/**
	 * Returns wastePrevention
	 *
	 * @return {@link #wastePrevention}
	 */
	public URI getWastePrevention() {
		return this.wastePrevention;
	}

	/**
	 * Returns separateCollection
	 *
	 * @return {@link #separateCollection}
	 */
	public URI getSeparateCollection() {
		return this.separateCollection;
	}

	/**
	 * Returns informationOnCollection
	 *
	 * @return {@link #informationOnCollection}
	 */
	public URI getInformationOnCollection() {
		return this.informationOnCollection;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final EndOfLifeInformationEntity that = (EndOfLifeInformationEntity) o;
		return Objects.equals(wastePrevention, that.wastePrevention)
				&& Objects.equals(separateCollection, that.separateCollection)
				&& Objects.equals(informationOnCollection, that.informationOnCollection);
	}

	@Override
	public int hashCode() {
		return Objects.hash(wastePrevention, separateCollection, informationOnCollection);
	}
}
