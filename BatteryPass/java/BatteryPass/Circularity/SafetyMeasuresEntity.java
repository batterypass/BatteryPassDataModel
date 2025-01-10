
package io.BatteryPass.Circularity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import org.eclipse.esmf.aspectmodel.java.customconstraint.FloatMax;
import org.eclipse.esmf.aspectmodel.java.customconstraint.FloatMin;
import org.eclipse.esmf.metamodel.BoundDefinition;

/**
 * Generated class for SafetyMeasuresEntity. The safety measures should be
 * provided via the instruction manual as URL linking to PDF.
 */

public class SafetyMeasuresEntity {

	@NotNull
	private URI safetyInstructions;

	@NotNull
	private List<String> extinguishingAgent;

	@JsonCreator
	public SafetyMeasuresEntity(@JsonProperty(value = "safetyInstructions") URI safetyInstructions,
			@JsonProperty(value = "extinguishingAgent") List<String> extinguishingAgent) {
		super(

		);
		this.safetyInstructions = safetyInstructions;
		this.extinguishingAgent = extinguishingAgent;
	}

	/**
	 * Returns safetyInstructions
	 *
	 * @return {@link #safetyInstructions}
	 */
	public URI getSafetyInstructions() {
		return this.safetyInstructions;
	}

	/**
	 * Returns extinguishingAgent
	 *
	 * @return {@link #extinguishingAgent}
	 */
	public List<String> getExtinguishingAgent() {
		return this.extinguishingAgent;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final SafetyMeasuresEntity that = (SafetyMeasuresEntity) o;
		return Objects.equals(safetyInstructions, that.safetyInstructions)
				&& Objects.equals(extinguishingAgent, that.extinguishingAgent);
	}

	@Override
	public int hashCode() {
		return Objects.hash(safetyInstructions, extinguishingAgent);
	}
}
