
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
 * Generated class for CarbonFootprintForBatteries. The battery passport must
 * contain carbon footprint per functional unit of the battery as declared in
 * the battery carbon footprint declaration in accordance with the entry into
 * force of the implementing acts on the format of declaration. Reference:
 * REGULATION (EU) 2023/1542 aka EU Battery Regulation
 */
public class CarbonFootprintForBatteries
		implements
			CollectionAspect<List<CarbonFootprintPerLifecycleStageEntity>, CarbonFootprintPerLifecycleStageEntity> {

	@NotNull
	private Double batteryCarbonFootprint;

	@NotNull
	private List<CarbonFootprintPerLifecycleStageEntity> carbonFootprintPerLifecycleStage;

	@NotNull
	private String carbonFootprintPerformanceClass;

	@NotNull
	private URI carbonFootprintStudy;
	private Optional<Double> absoluteCarbonFootprint;

	@JsonCreator
	public CarbonFootprintForBatteries(@JsonProperty(value = "batteryCarbonFootprint") Double batteryCarbonFootprint,
			@JsonProperty(value = "carbonFootprintPerLifecycleStage") List<CarbonFootprintPerLifecycleStageEntity> carbonFootprintPerLifecycleStage,
			@JsonProperty(value = "carbonFootprintPerformanceClass") String carbonFootprintPerformanceClass,
			@JsonProperty(value = "carbonFootprintStudy") URI carbonFootprintStudy,
			@JsonProperty(value = "absoluteCarbonFootprint") Optional<Double> absoluteCarbonFootprint) {
		super(

		);
		this.batteryCarbonFootprint = batteryCarbonFootprint;
		this.carbonFootprintPerLifecycleStage = carbonFootprintPerLifecycleStage;
		this.carbonFootprintPerformanceClass = carbonFootprintPerformanceClass;
		this.carbonFootprintStudy = carbonFootprintStudy;
		this.absoluteCarbonFootprint = absoluteCarbonFootprint == null ? Optional.empty() : absoluteCarbonFootprint;
	}

	/**
	 * Returns batteryCarbonFootprint
	 *
	 * @return {@link #batteryCarbonFootprint}
	 */
	public Double getBatteryCarbonFootprint() {
		return this.batteryCarbonFootprint;
	}

	/**
	 * Returns carbonFootprintPerLifecycleStage
	 *
	 * @return {@link #carbonFootprintPerLifecycleStage}
	 */
	public List<CarbonFootprintPerLifecycleStageEntity> getCarbonFootprintPerLifecycleStage() {
		return this.carbonFootprintPerLifecycleStage;
	}

	/**
	 * Returns carbonFootprintPerformanceClass
	 *
	 * @return {@link #carbonFootprintPerformanceClass}
	 */
	public String getCarbonFootprintPerformanceClass() {
		return this.carbonFootprintPerformanceClass;
	}

	/**
	 * Returns carbonFootprintStudy
	 *
	 * @return {@link #carbonFootprintStudy}
	 */
	public URI getCarbonFootprintStudy() {
		return this.carbonFootprintStudy;
	}

	/**
	 * Returns absoluteCarbonFootprint
	 *
	 * @return {@link #absoluteCarbonFootprint}
	 */
	public Optional<Double> getAbsoluteCarbonFootprint() {
		return this.absoluteCarbonFootprint;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final CarbonFootprintForBatteries that = (CarbonFootprintForBatteries) o;
		return Objects.equals(batteryCarbonFootprint, that.batteryCarbonFootprint)
				&& Objects.equals(carbonFootprintPerLifecycleStage, that.carbonFootprintPerLifecycleStage)
				&& Objects.equals(carbonFootprintPerformanceClass, that.carbonFootprintPerformanceClass)
				&& Objects.equals(carbonFootprintStudy, that.carbonFootprintStudy)
				&& Objects.equals(absoluteCarbonFootprint, that.absoluteCarbonFootprint);
	}

	@Override
	public int hashCode() {
		return Objects.hash(batteryCarbonFootprint, carbonFootprintPerLifecycleStage, carbonFootprintPerformanceClass,
				carbonFootprintStudy, absoluteCarbonFootprint);
	}
}
