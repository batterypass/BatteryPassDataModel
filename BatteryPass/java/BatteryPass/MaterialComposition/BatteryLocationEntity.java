
package io.BatteryPass.MaterialComposition;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated class for BatteryLocation . Battery component that includes the
 * material
 */

public class BatteryLocationEntity {

	@NotNull
	private String componentName;
	private Optional<String> componentId;

	@JsonCreator
	public BatteryLocationEntity(@JsonProperty(value = "componentName") String componentName,
			@JsonProperty(value = "componentId") Optional<String> componentId) {
		super(

		);
		this.componentName = componentName;
		this.componentId = componentId == null ? Optional.empty() : componentId;
	}

	/**
	 * Returns Name
	 *
	 * @return {@link #componentName}
	 */
	public String getComponentName() {
		return this.componentName;
	}

	/**
	 * Returns SubstanceId
	 *
	 * @return {@link #componentId}
	 */
	public Optional<String> getComponentId() {
		return this.componentId;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final BatteryLocationEntity that = (BatteryLocationEntity) o;
		return Objects.equals(componentName, that.componentName) && Objects.equals(componentId, that.componentId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(componentName, componentId);
	}
}
