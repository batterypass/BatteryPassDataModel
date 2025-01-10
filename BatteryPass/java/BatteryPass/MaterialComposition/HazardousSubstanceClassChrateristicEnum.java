
package io.BatteryPass.MaterialComposition;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import org.eclipse.esmf.aspectmodel.java.exception.EnumAttributeNotFoundException;

/**
 * Generated class {@link HazardousSubstanceClassChrateristicEnum}.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum HazardousSubstanceClassChrateristicEnum {
	ACUTE_TOXICITY("AcuteToxicity"), SKIN_CORROSION_OR_IRRITATION(
			"SkinCorrosionOrIrritation"), EYE_DAMAGE_OR_IRRITATION("EyeDamageOrIrritation");

	private String value;

	HazardousSubstanceClassChrateristicEnum(String value) {
		this.value = value;
	}

	@JsonCreator
	static HazardousSubstanceClassChrateristicEnum enumDeserializationConstructor(String value) {
		return fromValue(value).orElseThrow(() -> new EnumAttributeNotFoundException("Tried to parse value \"" + value
				+ "\", but there is no enum field like that in HazardousSubstanceClassChrateristicEnum"));
	}

	@JsonValue
	public String getValue() {
		return value;
	}

	public static Optional<HazardousSubstanceClassChrateristicEnum> fromValue(String value) {
		return Arrays.stream(HazardousSubstanceClassChrateristicEnum.values())
				.filter(enumValue -> compareEnumValues(enumValue, value)).findAny();
	}

	private static boolean compareEnumValues(HazardousSubstanceClassChrateristicEnum enumValue, String value) {
		return enumValue.getValue().equals(value);
	}

}
