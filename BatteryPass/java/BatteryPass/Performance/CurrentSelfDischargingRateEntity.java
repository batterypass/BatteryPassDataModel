
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
 * Generated class for CurrentSelfDischargingRateEntity.
 *
 */

public class CurrentSelfDischargingRateEntity {

	@NotNull
	private Float currentSelfDischargingRateEntity;

	@NotNull
	private XMLGregorianCalendar lastUpdate;

	@JsonCreator
	public CurrentSelfDischargingRateEntity(
			@JsonProperty(value = "currentSelfDischargingRateEntity") Float currentSelfDischargingRateEntity,
			@JsonProperty(value = "lastUpdate") XMLGregorianCalendar lastUpdate) {
		super(

		);
		this.currentSelfDischargingRateEntity = currentSelfDischargingRateEntity;
		this.lastUpdate = lastUpdate;
	}

	/**
	 * Returns currentSelfDischargingRateEntity
	 *
	 * @return {@link #currentSelfDischargingRateEntity}
	 */
	public Float getCurrentSelfDischargingRateEntity() {
		return this.currentSelfDischargingRateEntity;
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

		final CurrentSelfDischargingRateEntity that = (CurrentSelfDischargingRateEntity) o;
		return Objects.equals(currentSelfDischargingRateEntity, that.currentSelfDischargingRateEntity)
				&& Objects.equals(lastUpdate, that.lastUpdate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(currentSelfDischargingRateEntity, lastUpdate);
	}
}
