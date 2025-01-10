
package io.BatteryPass.CarbonFootprint;

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
 * Generated class for CarbonFootprintPerLifecycleStageEntity. The carbon
 * footprint of the battery as share of total Battery Carbon Footprint,
 * differentiated per life cycle stage raw material extraction, main production,
 * distribution and end of �ife and recycling.
 */

public class CarbonFootprintPerLifecycleStageEntity {

	@NotNull
	private LifecycleStage lifecycleStage;

	@NotNull
	private Double carbonFootprint;

	@JsonCreator
	public CarbonFootprintPerLifecycleStageEntity(@JsonProperty(value = "lifecycleStage") LifecycleStage lifecycleStage,
			@JsonProperty(value = "carbonFootprint") Double carbonFootprint) {
		super(

		);
		this.lifecycleStage = lifecycleStage;
		this.carbonFootprint = carbonFootprint;
	}

	/**
	 * Returns lifecycleStage
	 *
	 * @return {@link #lifecycleStage}
	 */
	public LifecycleStage getLifecycleStage() {
		return this.lifecycleStage;
	}

	/**
	 * Returns carbonFootprint
	 *
	 * @return {@link #carbonFootprint}
	 */
	public Double getCarbonFootprint() {
		return this.carbonFootprint;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final CarbonFootprintPerLifecycleStageEntity that = (CarbonFootprintPerLifecycleStageEntity) o;
		return Objects.equals(lifecycleStage, that.lifecycleStage)
				&& Objects.equals(carbonFootprint, that.carbonFootprint);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lifecycleStage, carbonFootprint);
	}
}
