
package io.BatteryPass.Labels;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import org.eclipse.esmf.aspectmodel.java.CollectionAspect;
import org.eclipse.esmf.metamodel.datatype.LangString;

/**
 * Generated class for LabelingEntity. Entity for the definition required
 * battery labeling
 */

public class LabelingEntity {

	@NotNull
	private URI labelingSymbol;

	@NotNull
	private LangString labelingMeaning;

	@NotNull
	private LabelingSubject labelingSubject;

	@JsonCreator
	public LabelingEntity(@JsonProperty(value = "labelingSymbol") URI labelingSymbol,
			@JsonProperty(value = "labelingMeaning") LangString labelingMeaning,
			@JsonProperty(value = "labelingSubject") LabelingSubject labelingSubject) {
		super(

		);
		this.labelingSymbol = labelingSymbol;
		this.labelingMeaning = labelingMeaning;
		this.labelingSubject = labelingSubject;
	}

	/**
	 * Returns labelingSymbol
	 *
	 * @return {@link #labelingSymbol}
	 */
	public URI getLabelingSymbol() {
		return this.labelingSymbol;
	}

	/**
	 * Returns labelingMeaning
	 *
	 * @return {@link #labelingMeaning}
	 */
	public LangString getLabelingMeaning() {
		return this.labelingMeaning;
	}

	/**
	 * Returns labelingSubject
	 *
	 * @return {@link #labelingSubject}
	 */
	public LabelingSubject getLabelingSubject() {
		return this.labelingSubject;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final LabelingEntity that = (LabelingEntity) o;
		return Objects.equals(labelingSymbol, that.labelingSymbol)
				&& Objects.equals(labelingMeaning, that.labelingMeaning)
				&& Objects.equals(labelingSubject, that.labelingSubject);
	}

	@Override
	public int hashCode() {
		return Objects.hash(labelingSymbol, labelingMeaning, labelingSubject);
	}
}
