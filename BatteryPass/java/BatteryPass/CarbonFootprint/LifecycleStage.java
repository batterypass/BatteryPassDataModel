
package io.BatteryPass.CarbonFootprint;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import org.eclipse.esmf.aspectmodel.java.CollectionAspect;
import org.eclipse.esmf.aspectmodel.java.exception.EnumAttributeNotFoundException;

/**
 * Generated class {@link LifecycleStage}.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum LifecycleStage {
	RAW_MATERIAL_EXTRACTION("RawMaterialExtraction"), MAIN_PRODUCTION("MainProduction"), DISTRIBUTION(
			"Distribution"), RECYCLING("Recycling");

	private String value;

	LifecycleStage(String value) {
		this.value = value;
	}

	@JsonCreator
	static LifecycleStage enumDeserializationConstructor(String value) {
		return fromValue(value).orElseThrow(() -> new EnumAttributeNotFoundException(
				"Tried to parse value \"" + value + "\", but there is no enum field like that in LifecycleStage"));
	}

	@JsonValue
	public String getValue() {
		return value;
	}

	public static Optional<LifecycleStage> fromValue(String value) {
		return Arrays.stream(LifecycleStage.values()).filter(enumValue -> compareEnumValues(enumValue, value))
				.findAny();
	}

	private static boolean compareEnumValues(LifecycleStage enumValue, String value) {
		return enumValue.getValue().equals(value);
	}

}
