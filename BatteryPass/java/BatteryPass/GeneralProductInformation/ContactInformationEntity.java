
package io.BatteryPass.GeneralProductInformation;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Generated class for ContactInformationEntity.
 *
 */

public class ContactInformationEntity {

	@NotNull
	private String contactName;

	@NotNull
	private PostalAddressEntity postalAddress;

	@NotNull
	private String identifier;

	@JsonCreator
	public ContactInformationEntity(@JsonProperty(value = "contactName") String contactName,
			@JsonProperty(value = "postalAddress") PostalAddressEntity postalAddress,
			@JsonProperty(value = "identifier") String identifier) {
		super(

		);
		this.contactName = contactName;
		this.postalAddress = postalAddress;
		this.identifier = identifier;
	}

	/**
	 * Returns contactName
	 *
	 * @return {@link #contactName}
	 */
	public String getContactName() {
		return this.contactName;
	}

	/**
	 * Returns postalAddress
	 *
	 * @return {@link #postalAddress}
	 */
	public PostalAddressEntity getPostalAddress() {
		return this.postalAddress;
	}

	/**
	 * Returns identifier
	 *
	 * @return {@link #identifier}
	 */
	public String getIdentifier() {
		return this.identifier;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final ContactInformationEntity that = (ContactInformationEntity) o;
		return Objects.equals(contactName, that.contactName) && Objects.equals(postalAddress, that.postalAddress)
				&& Objects.equals(identifier, that.identifier);
	}

	@Override
	public int hashCode() {
		return Objects.hash(contactName, postalAddress, identifier);
	}
}
