
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
 * Generated class for PostalAddress.
 *
 */

public class PostalAddress {

	@NotNull
	private String addressCountry;

	@NotNull
	private String postalCode;

	@NotNull
	private String streetAddress;

	@JsonCreator
	public PostalAddress(@JsonProperty(value = "addressCountry") String addressCountry,
			@JsonProperty(value = "postalCode") String postalCode,
			@JsonProperty(value = "streetAddress") String streetAddress) {
		super(

		);
		this.addressCountry = addressCountry;
		this.postalCode = postalCode;
		this.streetAddress = streetAddress;
	}

	/**
	 * Returns addressCountry
	 *
	 * @return {@link #addressCountry}
	 */
	public String getAddressCountry() {
		return this.addressCountry;
	}

	/**
	 * Returns PostalCode
	 *
	 * @return {@link #postalCode}
	 */
	public String getPostalCode() {
		return this.postalCode;
	}

	/**
	 * Returns streetAddress
	 *
	 * @return {@link #streetAddress}
	 */
	public String getStreetAddress() {
		return this.streetAddress;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final PostalAddress that = (PostalAddress) o;
		return Objects.equals(addressCountry, that.addressCountry) && Objects.equals(postalCode, that.postalCode)
				&& Objects.equals(streetAddress, that.streetAddress);
	}

	@Override
	public int hashCode() {
		return Objects.hash(addressCountry, postalCode, streetAddress);
	}
}
