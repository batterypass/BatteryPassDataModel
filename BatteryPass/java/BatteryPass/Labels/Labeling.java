
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

/**
 * Generated class for Labeling. Data model for battery labels and conformity
 * 
 * Copyright 2024 Circulor (for and on behalf of the Battery Pass Consortium).
 * This work is li-censed under a Creative Commons License
 * Attribution-NonCommercial 4.0 International (CC BY-NC 4.0). Readers may
 * reproduce material for their own publications, as long as it is not sold
 * com-mercially and is given appropriate attribution.
 */
public class Labeling implements CollectionAspect<List<LabelingEntity>, LabelingEntity> {

	@NotNull
	private URI declarationOfConformity;

	@NotNull
	private URI resultOfTestReport;

	@NotNull
	private List<LabelingEntity> labels;

	@JsonCreator
	public Labeling(@JsonProperty(value = "declarationOfConformity") URI declarationOfConformity,
			@JsonProperty(value = "resultOfTestReport") URI resultOfTestReport,
			@JsonProperty(value = "labels") List<LabelingEntity> labels) {
		super(

		);
		this.declarationOfConformity = declarationOfConformity;
		this.resultOfTestReport = resultOfTestReport;
		this.labels = labels;
	}

	/**
	 * Returns declarationOfConformity
	 *
	 * @return {@link #declarationOfConformity}
	 */
	public URI getDeclarationOfConformity() {
		return this.declarationOfConformity;
	}

	/**
	 * Returns resultOfTestReport
	 *
	 * @return {@link #resultOfTestReport}
	 */
	public URI getResultOfTestReport() {
		return this.resultOfTestReport;
	}

	/**
	 * Returns labels
	 *
	 * @return {@link #labels}
	 */
	public List<LabelingEntity> getLabels() {
		return this.labels;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final Labeling that = (Labeling) o;
		return Objects.equals(declarationOfConformity, that.declarationOfConformity)
				&& Objects.equals(resultOfTestReport, that.resultOfTestReport) && Objects.equals(labels, that.labels);
	}

	@Override
	public int hashCode() {
		return Objects.hash(declarationOfConformity, resultOfTestReport, labels);
	}
}
