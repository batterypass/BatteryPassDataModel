
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
 * Generated class for DismantlingandRemovalDocumentation. Dismantling and
 * Removal information, including at least:- Exploded diagrams of the battery
 * system/pack showing the location of battery cells- Disassembly sequences-
 * Type and number of fastening techniques to be unlocked- Tools required for
 * disassembly- Warnings if risk of damaging parts exists- Amount of cells used
 * and layoutEUBR: Annex XIII (2c)
 */

public class DismantlingandRemovalDocumentation {

	@NotNull
	private Documenttype documentType;

	@NotNull
	private String mimeType;

	@NotNull
	private URI documentURL;

	@JsonCreator
	public DismantlingandRemovalDocumentation(@JsonProperty(value = "documentType") Documenttype documentType,
			@JsonProperty(value = "mimeType") String mimeType, @JsonProperty(value = "documentURL") URI documentURL) {
		super(

		);
		this.documentType = documentType;
		this.mimeType = mimeType;
		this.documentURL = documentURL;
	}

	/**
	 * Returns documentType
	 *
	 * @return {@link #documentType}
	 */
	public Documenttype getDocumentType() {
		return this.documentType;
	}

	/**
	 * Returns mimeType
	 *
	 * @return {@link #mimeType}
	 */
	public String getMimeType() {
		return this.mimeType;
	}

	/**
	 * Returns documentURL
	 *
	 * @return {@link #documentURL}
	 */
	public URI getDocumentURL() {
		return this.documentURL;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final DismantlingandRemovalDocumentation that = (DismantlingandRemovalDocumentation) o;
		return Objects.equals(documentType, that.documentType) && Objects.equals(mimeType, that.mimeType)
				&& Objects.equals(documentURL, that.documentURL);
	}

	@Override
	public int hashCode() {
		return Objects.hash(documentType, mimeType, documentURL);
	}
}
