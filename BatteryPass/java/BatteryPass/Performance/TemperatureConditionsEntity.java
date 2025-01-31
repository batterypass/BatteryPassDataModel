
package io.BatteryPass.Performance;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.validation.constraints.NotNull;
import java.math.BigInteger;
import java.net.URI;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import javax.xml.datatype.XMLGregorianCalendar;
import org.eclipse.esmf.aspectmodel.java.customconstraint.DoubleMax;
import org.eclipse.esmf.aspectmodel.java.customconstraint.DoubleMin;
import org.eclipse.esmf.metamodel.BoundDefinition;

/**
 * Generated class for TemperatureConditionsEntity.
 *
 */

public class TemperatureConditionsEntity {

	@NotNull
	private Double timeExtremeHighTemp;

	@NotNull
	private Double timeExtremeLowTemp;

	@NotNull
	private Double timeExtremeHighTempCharging;

	@NotNull
	private Double timeExtremeLowTempCharging;

	@NotNull
	private XMLGregorianCalendar lastUpdate;

	@JsonCreator
	public TemperatureConditionsEntity(@JsonProperty(value = "timeExtremeHighTemp") Double timeExtremeHighTemp,
			@JsonProperty(value = "timeExtremeLowTemp") Double timeExtremeLowTemp,
			@JsonProperty(value = "timeExtremeHighTempCharging") Double timeExtremeHighTempCharging,
			@JsonProperty(value = "timeExtremeLowTempCharging") Double timeExtremeLowTempCharging,
			@JsonProperty(value = "lastUpdate") XMLGregorianCalendar lastUpdate) {
		super(

		);
		this.timeExtremeHighTemp = timeExtremeHighTemp;
		this.timeExtremeLowTemp = timeExtremeLowTemp;
		this.timeExtremeHighTempCharging = timeExtremeHighTempCharging;
		this.timeExtremeLowTempCharging = timeExtremeLowTempCharging;
		this.lastUpdate = lastUpdate;
	}

	/**
	 * Returns timeExtremeHighTemp
	 *
	 * @return {@link #timeExtremeHighTemp}
	 */
	public Double getTimeExtremeHighTemp() {
		return this.timeExtremeHighTemp;
	}

	/**
	 * Returns timeExtremeLowTemp
	 *
	 * @return {@link #timeExtremeLowTemp}
	 */
	public Double getTimeExtremeLowTemp() {
		return this.timeExtremeLowTemp;
	}

	/**
	 * Returns timeExtremeHighTempCharging
	 *
	 * @return {@link #timeExtremeHighTempCharging}
	 */
	public Double getTimeExtremeHighTempCharging() {
		return this.timeExtremeHighTempCharging;
	}

	/**
	 * Returns timeExtremeLowTempCharging
	 *
	 * @return {@link #timeExtremeLowTempCharging}
	 */
	public Double getTimeExtremeLowTempCharging() {
		return this.timeExtremeLowTempCharging;
	}

	/**
	 * Returns lastUpdate
	 *
	 * @return {@link #lastUpdate}
	 */
	public XMLGregorianCalendar getLastUpdate() {
		return this.lastUpdate;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final TemperatureConditionsEntity that = (TemperatureConditionsEntity) o;
		return Objects.equals(timeExtremeHighTemp, that.timeExtremeHighTemp)
				&& Objects.equals(timeExtremeLowTemp, that.timeExtremeLowTemp)
				&& Objects.equals(timeExtremeHighTempCharging, that.timeExtremeHighTempCharging)
				&& Objects.equals(timeExtremeLowTempCharging, that.timeExtremeLowTempCharging)
				&& Objects.equals(lastUpdate, that.lastUpdate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(timeExtremeHighTemp, timeExtremeLowTemp, timeExtremeHighTempCharging,
				timeExtremeLowTempCharging, lastUpdate);
	}
}
