
package io.BatteryPass.Circularity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated class for Circularity. Dismantling information (including at least:
 * exploded diagrams of the battery system/pack showing the location of battery
 * cells; disassembly sequences; type and number of fastening techniques to be
 * unlocked; tools required for disassembly; warnings if risk of damaging parts
 * exists; amount of cells used and layout); part numbers for components and
 * contact details of sources for replacement spares; safety measures (Annex
 * XIII (2b-d)); usable extinguishing agent (Annex VI, Part A(9)). 2024 Circulor
 * (for and on behalf of the Battery Pass Consortium). This work is licensed
 * under a Creative Commons License Attribution-NonCommercial 4.0 International
 * (CC BY-NC 4.0). Readers may reproduce material for their own publications, as
 * long as it is not sold commercially and is given appropriate attribution.
 */
public class Circularity {

	@NotNull
	private List<DismantlingandRemovalDocumentation> dismantlingAndRemovalInformation;

	@NotNull
	private List<SparePartSupplierEntity> sparePartSources;

	@NotNull
	private List<RecycledContentEntity> recycledContent;

	@NotNull
	private SafetyMeasuresEntity safetyMeasures;

	@NotNull
	private EndOfLifeInformationEntity endOfLifeInformation;

	@NotNull
	private Float renewableContent;

	@JsonCreator
	public Circularity(
			@JsonProperty(value = "dismantlingAndRemovalInformation") List<DismantlingandRemovalDocumentation> dismantlingAndRemovalInformation,
			@JsonProperty(value = "sparePartSources") List<SparePartSupplierEntity> sparePartSources,
			@JsonProperty(value = "recycledContent") List<RecycledContentEntity> recycledContent,
			@JsonProperty(value = "safetyMeasures") SafetyMeasuresEntity safetyMeasures,
			@JsonProperty(value = "endOfLifeInformation") EndOfLifeInformationEntity endOfLifeInformation,
			@JsonProperty(value = "renewableContent") Float renewableContent) {
		super(

		);
		this.dismantlingAndRemovalInformation = dismantlingAndRemovalInformation;
		this.sparePartSources = sparePartSources;
		this.recycledContent = recycledContent;
		this.safetyMeasures = safetyMeasures;
		this.endOfLifeInformation = endOfLifeInformation;
		this.renewableContent = renewableContent;
	}

	/**
	 * Returns dismantlingAndRemovalInformation
	 *
	 * @return {@link #dismantlingAndRemovalInformation}
	 */
	public List<DismantlingandRemovalDocumentation> getDismantlingAndRemovalInformation() {
		return this.dismantlingAndRemovalInformation;
	}

	/**
	 * Returns sparePartSources
	 *
	 * @return {@link #sparePartSources}
	 */
	public List<SparePartSupplierEntity> getSparePartSources() {
		return this.sparePartSources;
	}

	/**
	 * Returns recycledContent
	 *
	 * @return {@link #recycledContent}
	 */
	public List<RecycledContentEntity> getRecycledContent() {
		return this.recycledContent;
	}

	/**
	 * Returns SafetyMeasures
	 *
	 * @return {@link #safetyMeasures}
	 */
	public SafetyMeasuresEntity getSafetyMeasures() {
		return this.safetyMeasures;
	}

	/**
	 * Returns EndOfLifeInformation
	 *
	 * @return {@link #endOfLifeInformation}
	 */
	public EndOfLifeInformationEntity getEndOfLifeInformation() {
		return this.endOfLifeInformation;
	}

	/**
	 * Returns RenewableContent
	 *
	 * @return {@link #renewableContent}
	 */
	public Float getRenewableContent() {
		return this.renewableContent;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final Circularity that = (Circularity) o;
		return Objects.equals(dismantlingAndRemovalInformation, that.dismantlingAndRemovalInformation)
				&& Objects.equals(sparePartSources, that.sparePartSources)
				&& Objects.equals(recycledContent, that.recycledContent)
				&& Objects.equals(safetyMeasures, that.safetyMeasures)
				&& Objects.equals(endOfLifeInformation, that.endOfLifeInformation)
				&& Objects.equals(renewableContent, that.renewableContent);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dismantlingAndRemovalInformation, sparePartSources, recycledContent, safetyMeasures,
				endOfLifeInformation, renewableContent);
	}
}
