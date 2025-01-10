
package io.BatteryPass.Labels;

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
import org.eclipse.esmf.metamodel.datatype.LangString;

/**
 * Generated class {@link LabelingSubject}.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum LabelingSubject {
	SEPARATE_COLLECTION("SeparateCollection"), HAZARDOUS_MATERIAL("HazardousMaterial"), CARBON_FOOT_PRINT(
			"CarbonFootPrint"), EXTINGUISHING_AGENT("ExtinguishingAgent");

	private String value;

	LabelingSubject(String value) {
		this.value = value;
	}

	@JsonCreator
	static LabelingSubject enumDeserializationConstructor(String value) {
		return fromValue(value).orElseThrow(() -> new EnumAttributeNotFoundException(
				"Tried to parse value \"" + value + "\", but there is no enum field like that in LabelingSubject"));
	}

	@JsonValue
	public String getValue() {
		return value;
	}

	public static Optional<LabelingSubject> fromValue(String value) {
		return Arrays.stream(LabelingSubject.values()).filter(enumValue -> compareEnumValues(enumValue, value))
				.findAny();
	}

	private static boolean compareEnumValues(LabelingSubject enumValue, String value) {
		return enumValue.getValue().equals(value);
	}

}
