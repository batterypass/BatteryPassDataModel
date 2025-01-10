
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
 * Generated class for InternalResistanceEntity. The internal resistance is �a
 * quotient of change of voltage of a battery by the corresponding change in
 * discharge current under specified conditions� (IEV 482 03 36).
 */

public class InternalResistanceEntity {

	@NotNull
	private Double ohmicResistance;

	@NotNull
	private BatteryComponent batteryComponent;

	@JsonCreator
	public InternalResistanceEntity(@JsonProperty(value = "ohmicResistance") Double ohmicResistance,
			@JsonProperty(value = "batteryComponent") BatteryComponent batteryComponent) {
		super(

		);
		this.ohmicResistance = ohmicResistance;
		this.batteryComponent = batteryComponent;
	}

	/**
	 * Returns ohmicResistance
	 *
	 * @return {@link #ohmicResistance}
	 */
	public Double getOhmicResistance() {
		return this.ohmicResistance;
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

		final InternalResistanceEntity that = (InternalResistanceEntity) o;
		return Objects.equals(ohmicResistance, that.ohmicResistance)
				&& Objects.equals(batteryComponent, that.batteryComponent);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ohmicResistance, batteryComponent);
	}
}
