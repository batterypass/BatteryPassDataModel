
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
 * Generated class for CapacityFadeEntity.
 *
 */

public class CapacityFadeEntity {

	@NotNull
	private Float capacityFadeValue;

	@NotNull
	private XMLGregorianCalendar lastUpdate;

	@JsonCreator
	public CapacityFadeEntity(@JsonProperty(value = "capacityFadeValue") Float capacityFadeValue,
			@JsonProperty(value = "lastUpdate") XMLGregorianCalendar lastUpdate) {
		super(

		);
		this.capacityFadeValue = capacityFadeValue;
		this.lastUpdate = lastUpdate;
	}

	/**
	 * Returns capacityFadeValue
	 *
	 * @return {@link #capacityFadeValue}
	 */
	public Float getCapacityFadeValue() {
		return this.capacityFadeValue;
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

		final CapacityFadeEntity that = (CapacityFadeEntity) o;
		return Objects.equals(capacityFadeValue, that.capacityFadeValue) && Objects.equals(lastUpdate, that.lastUpdate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(capacityFadeValue, lastUpdate);
	}
}
