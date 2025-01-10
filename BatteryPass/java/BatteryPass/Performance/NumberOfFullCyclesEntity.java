
package io.BatteryPass.Performance;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
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
 * Generated class for NumberOfFullCyclesEntity.
 *
 */

public class NumberOfFullCyclesEntity {

	@NotNull
	private BigInteger numberOfFullCyclesValue;

	@NotNull
	private XMLGregorianCalendar lastUpdate;

	@JsonCreator
	public NumberOfFullCyclesEntity(@JsonProperty(value = "numberOfFullCyclesValue") BigInteger numberOfFullCyclesValue,
			@JsonProperty(value = "lastUpdate") XMLGregorianCalendar lastUpdate) {
		super(

		);
		this.numberOfFullCyclesValue = numberOfFullCyclesValue;
		this.lastUpdate = lastUpdate;
	}

	/**
	 * Returns numberOfFullCyclesValue
	 *
	 * @return {@link #numberOfFullCyclesValue}
	 */
	public BigInteger getNumberOfFullCyclesValue() {
		return this.numberOfFullCyclesValue;
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

		final NumberOfFullCyclesEntity that = (NumberOfFullCyclesEntity) o;
		return Objects.equals(numberOfFullCyclesValue, that.numberOfFullCyclesValue)
				&& Objects.equals(lastUpdate, that.lastUpdate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(numberOfFullCyclesValue, lastUpdate);
	}
}
