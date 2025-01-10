
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
 * Generated class for InternalResistanceIncreaseEntity.
 *
 */

public class InternalResistanceIncreaseEntity {

	@NotNull
	private Float internalResistanceIncreaseValue;

	@NotNull
	private XMLGregorianCalendar lastUpdate;

	@NotNull
	private BatteryComponent batteryComponent;

	@JsonCreator
	public InternalResistanceIncreaseEntity(
			@JsonProperty(value = "internalResistanceIncreaseValue") Float internalResistanceIncreaseValue,
			@JsonProperty(value = "lastUpdate") XMLGregorianCalendar lastUpdate,
			@JsonProperty(value = "batteryComponent") BatteryComponent batteryComponent) {
		super(

		);
		this.internalResistanceIncreaseValue = internalResistanceIncreaseValue;
		this.lastUpdate = lastUpdate;
		this.batteryComponent = batteryComponent;
	}

	/**
	 * Returns internalResistanceIncreaseValue
	 *
	 * @return {@link #internalResistanceIncreaseValue}
	 */
	public Float getInternalResistanceIncreaseValue() {
		return this.internalResistanceIncreaseValue;
	}

	/**
	 * Returns lastUpdate
	 *
	 * @return {@link #lastUpdate}
	 */
	public XMLGregorianCalendar getLastUpdate() {
		return this.lastUpdate;
	}

	/**
	 * Returns batteryComponent
	 *
	 * @return {@link #batteryComponent}
	 */
	public BatteryComponent getBatteryComponent() {
		return this.batteryComponent;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final InternalResistanceIncreaseEntity that = (InternalResistanceIncreaseEntity) o;
		return Objects.equals(internalResistanceIncreaseValue, that.internalResistanceIncreaseValue)
				&& Objects.equals(lastUpdate, that.lastUpdate)
				&& Objects.equals(batteryComponent, that.batteryComponent);
	}

	@Override
	public int hashCode() {
		return Objects.hash(internalResistanceIncreaseValue, lastUpdate, batteryComponent);
	}
}
