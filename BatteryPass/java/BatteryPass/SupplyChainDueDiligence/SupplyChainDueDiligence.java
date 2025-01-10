
package io.BatteryPass.SupplyChainDueDiligence;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated class for SupplyChainDueDiligence. Data model for Battery due
 * diligence
 * 
 * Copyright ? 2024 Circulor (for and on behalf of the Battery Pass Consortium).
 * This work is li-censed under a Creative Commons License
 * Attribution-NonCommercial 4.0 International (CC BY-NC 4.0). Readers may
 * reproduce material for their own publications, as long as it is not sold
 * com-mercially and is given appropriate attribution.
 */
public class SupplyChainDueDiligence {

	@NotNull
	private URI supplyChainDueDiligenceReport;
	private Optional<URI> thirdPartyAussurances;
	private Optional<Float> supplyChainIndicies;

	@JsonCreator
	public SupplyChainDueDiligence(
			@JsonProperty(value = "supplyChainDueDiligenceReport") URI supplyChainDueDiligenceReport,
			@JsonProperty(value = "thirdPartyAussurances") Optional<URI> thirdPartyAussurances,
			@JsonProperty(value = "supplyChainIndicies") Optional<Float> supplyChainIndicies) {
		super(

		);
		this.supplyChainDueDiligenceReport = supplyChainDueDiligenceReport;
		this.thirdPartyAussurances = thirdPartyAussurances == null ? Optional.empty() : thirdPartyAussurances;
		this.supplyChainIndicies = supplyChainIndicies == null ? Optional.empty() : supplyChainIndicies;
	}

	/**
	 * Returns supplyChainDueDiligenceReport
	 *
	 * @return {@link #supplyChainDueDiligenceReport}
	 */
	public URI getSupplyChainDueDiligenceReport() {
		return this.supplyChainDueDiligenceReport;
	}

	/**
	 * Returns thirdPartyAussurances
	 *
	 * @return {@link #thirdPartyAussurances}
	 */
	public Optional<URI> getThirdPartyAussurances() {
		return this.thirdPartyAussurances;
	}

	/**
	 * Returns supplyChainIndicies
	 *
	 * @return {@link #supplyChainIndicies}
	 */
	public Optional<Float> getSupplyChainIndicies() {
		return this.supplyChainIndicies;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final SupplyChainDueDiligence that = (SupplyChainDueDiligence) o;
		return Objects.equals(supplyChainDueDiligenceReport, that.supplyChainDueDiligenceReport)
				&& Objects.equals(thirdPartyAussurances, that.thirdPartyAussurances)
				&& Objects.equals(supplyChainIndicies, that.supplyChainIndicies);
	}

	@Override
	public int hashCode() {
		return Objects.hash(supplyChainDueDiligenceReport, thirdPartyAussurances, supplyChainIndicies);
	}
}
