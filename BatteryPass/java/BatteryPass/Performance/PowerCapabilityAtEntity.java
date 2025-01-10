
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
 * Generated class for PowerCapabilityAtEntity.
 *
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
		@JsonSubTypes.Type(value = RemainingPowerCapabilityDynamicAt.class, name = "RemainingPowerCapabilityDynamicAt")})
public class PowerCapabilityAtEntity {

	@NotNull
	private Float atSoC;

	@NotNull
	private Float powerCapabilityAt;

	@JsonCreator
	public PowerCapabilityAtEntity(@JsonProperty(value = "atSoC") Float atSoC,
			@JsonProperty(value = "powerCapabilityAt") Float powerCapabilityAt) {
		super(

		);
		this.atSoC = atSoC;
		this.powerCapabilityAt = powerCapabilityAt;
	}

	/**
	 * Returns atSoC
	 *
	 * @return {@link #atSoC}
	 */
	public Float getAtSoC() {
		return this.atSoC;
	}

	/**
	 * Returns powerCapabilityAt
	 *
	 * @return {@link #powerCapabilityAt}
	 */
	public Float getPowerCapabilityAt() {
		return this.powerCapabilityAt;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final PowerCapabilityAtEntity that = (PowerCapabilityAtEntity) o;
		return Objects.equals(atSoC, that.atSoC) && Objects.equals(powerCapabilityAt, that.powerCapabilityAt);
	}

	@Override
	public int hashCode() {
		return Objects.hash(atSoC, powerCapabilityAt);
	}
}
