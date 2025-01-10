
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
 * Generated class for RemainingPowerCapabilityDynamicAt.
 *
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION, defaultImpl = RemainingPowerCapabilityDynamicAt.class)
public class RemainingPowerCapabilityDynamicAt extends PowerCapabilityAtEntity {

	@NotNull
	private XMLGregorianCalendar rPCLastUpdated;

	@JsonCreator
	public RemainingPowerCapabilityDynamicAt(
			@JsonProperty(value = "rPCLastUpdated") XMLGregorianCalendar rPCLastUpdated,
			@JsonProperty(value = "atSoC") Float atSoC,
			@JsonProperty(value = "powerCapabilityAt") Float powerCapabilityAt) {
		super(atSoC, powerCapabilityAt);
		this.rPCLastUpdated = rPCLastUpdated;
	}

	/**
	 * Returns rPCLastUpdated
	 *
	 * @return {@link #rPCLastUpdated}
	 */
	public XMLGregorianCalendar getRPCLastUpdated() {
		return this.rPCLastUpdated;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		if (!super.equals(o)) {
			return false;
		}

		final RemainingPowerCapabilityDynamicAt that = (RemainingPowerCapabilityDynamicAt) o;
		return Objects.equals(rPCLastUpdated, that.rPCLastUpdated);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), rPCLastUpdated);
	}
}
