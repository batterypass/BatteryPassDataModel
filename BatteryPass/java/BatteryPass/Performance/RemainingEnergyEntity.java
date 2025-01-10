
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
 * Generated class for RemainingEnergyEntity.
 *
 */

public class RemainingEnergyEntity {

	@NotNull
	private Float remainingEnergyalue;

	@NotNull
	private XMLGregorianCalendar lastUpdate;

	@JsonCreator
	public RemainingEnergyEntity(@JsonProperty(value = "remainingEnergyalue") Float remainingEnergyalue,
			@JsonProperty(value = "lastUpdate") XMLGregorianCalendar lastUpdate) {
		super(

		);
		this.remainingEnergyalue = remainingEnergyalue;
		this.lastUpdate = lastUpdate;
	}

	/**
	 * Returns remainingEnergyalue
	 *
	 * @return {@link #remainingEnergyalue}
	 */
	public Float getRemainingEnergyalue() {
		return this.remainingEnergyalue;
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

		final RemainingEnergyEntity that = (RemainingEnergyEntity) o;
		return Objects.equals(remainingEnergyalue, that.remainingEnergyalue)
				&& Objects.equals(lastUpdate, that.lastUpdate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(remainingEnergyalue, lastUpdate);
	}
}
