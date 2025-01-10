
package io.BatteryPass.Performance;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
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
 * Generated class for CapacityThroughputEntity.
 *
 */

public class CapacityThroughputEntity {

	@NotNull
	private Float capacityThroughputValue;

	@NotNull
	private XMLGregorianCalendar lastUpdate;

	@JsonCreator
	public CapacityThroughputEntity(@JsonProperty(value = "capacityThroughputValue") Float capacityThroughputValue,
			@JsonProperty(value = "lastUpdate") XMLGregorianCalendar lastUpdate) {
		super(

		);
		this.capacityThroughputValue = capacityThroughputValue;
		this.lastUpdate = lastUpdate;
	}

	/**
	 * Returns capacityThroughputValue
	 *
	 * @return {@link #capacityThroughputValue}
	 */
	public Float getCapacityThroughputValue() {
		return this.capacityThroughputValue;
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

		final CapacityThroughputEntity that = (CapacityThroughputEntity) o;
		return Objects.equals(capacityThroughputValue, that.capacityThroughputValue)
				&& Objects.equals(lastUpdate, that.lastUpdate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(capacityThroughputValue, lastUpdate);
	}
}
