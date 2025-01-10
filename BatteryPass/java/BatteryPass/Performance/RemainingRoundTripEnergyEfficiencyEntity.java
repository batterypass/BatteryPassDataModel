
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
 * Generated class for RemainingRoundTripEnergyEfficiencyEntity.
 *
 */

public class RemainingRoundTripEnergyEfficiencyEntity {

	@NotNull
	private Float remainingRoundTripEnergyEfficiencyValue;

	@NotNull
	private XMLGregorianCalendar lastUpdate;

	@JsonCreator
	public RemainingRoundTripEnergyEfficiencyEntity(
			@JsonProperty(value = "remainingRoundTripEnergyEfficiencyValue") Float remainingRoundTripEnergyEfficiencyValue,
			@JsonProperty(value = "lastUpdate") XMLGregorianCalendar lastUpdate) {
		super(

		);
		this.remainingRoundTripEnergyEfficiencyValue = remainingRoundTripEnergyEfficiencyValue;
		this.lastUpdate = lastUpdate;
	}

	/**
	 * Returns remainingRoundTripEnergyEfficiencyValue
	 *
	 * @return {@link #remainingRoundTripEnergyEfficiencyValue}
	 */
	public Float getRemainingRoundTripEnergyEfficiencyValue() {
		return this.remainingRoundTripEnergyEfficiencyValue;
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

		final RemainingRoundTripEnergyEfficiencyEntity that = (RemainingRoundTripEnergyEfficiencyEntity) o;
		return Objects.equals(remainingRoundTripEnergyEfficiencyValue, that.remainingRoundTripEnergyEfficiencyValue)
				&& Objects.equals(lastUpdate, that.lastUpdate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(remainingRoundTripEnergyEfficiencyValue, lastUpdate);
	}
}
