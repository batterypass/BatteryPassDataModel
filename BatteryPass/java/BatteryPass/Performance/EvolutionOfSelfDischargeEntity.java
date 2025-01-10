
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
 * Generated class for EvolutionOfSelfDischargeEntity.
 *
 */

public class EvolutionOfSelfDischargeEntity {

	@NotNull
	private Float evolutionOfSelfDischargeEntityValue;

	@JsonCreator
	public EvolutionOfSelfDischargeEntity(
			@JsonProperty(value = "evolutionOfSelfDischargeEntityValue") Float evolutionOfSelfDischargeEntityValue) {
		super(

		);
		this.evolutionOfSelfDischargeEntityValue = evolutionOfSelfDischargeEntityValue;
	}

	/**
	 * Returns evolutionOfSelfDischargeEntityValue
	 *
	 * @return {@link #evolutionOfSelfDischargeEntityValue}
	 */
	public Float getEvolutionOfSelfDischargeEntityValue() {
		return this.evolutionOfSelfDischargeEntityValue;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final EvolutionOfSelfDischargeEntity that = (EvolutionOfSelfDischargeEntity) o;
		return Objects.equals(evolutionOfSelfDischargeEntityValue, that.evolutionOfSelfDischargeEntityValue);
	}

	@Override
	public int hashCode() {
		return Objects.hash(evolutionOfSelfDischargeEntityValue);
	}
}
