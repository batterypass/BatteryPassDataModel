
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
 * Generated class for StateOfCertifiedEnergyEntity.
 *
 */

public class StateOfCertifiedEnergyEntity {

	@NotNull
	private Float stateOfCertifiedEnergyValue;

	@NotNull
	private XMLGregorianCalendar lastUpdate;

	@JsonCreator
	public StateOfCertifiedEnergyEntity(
			@JsonProperty(value = "stateOfCertifiedEnergyValue") Float stateOfCertifiedEnergyValue,
			@JsonProperty(value = "lastUpdate") XMLGregorianCalendar lastUpdate) {
		super(

		);
		this.stateOfCertifiedEnergyValue = stateOfCertifiedEnergyValue;
		this.lastUpdate = lastUpdate;
	}

	/**
	 * Returns stateOfCertifiedEnergyValue
	 *
	 * @return {@link #stateOfCertifiedEnergyValue}
	 */
	public Float getStateOfCertifiedEnergyValue() {
		return this.stateOfCertifiedEnergyValue;
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

		final StateOfCertifiedEnergyEntity that = (StateOfCertifiedEnergyEntity) o;
		return Objects.equals(stateOfCertifiedEnergyValue, that.stateOfCertifiedEnergyValue)
				&& Objects.equals(lastUpdate, that.lastUpdate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(stateOfCertifiedEnergyValue, lastUpdate);
	}
}
