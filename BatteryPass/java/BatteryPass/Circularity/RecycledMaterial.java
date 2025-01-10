
package io.BatteryPass.Circularity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import org.eclipse.esmf.aspectmodel.java.customconstraint.FloatMax;
import org.eclipse.esmf.aspectmodel.java.customconstraint.FloatMin;
import org.eclipse.esmf.aspectmodel.java.exception.EnumAttributeNotFoundException;
import org.eclipse.esmf.metamodel.BoundDefinition;

/**
 * Generated class {@link RecycledMaterial}.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum RecycledMaterial {
	COBALT("Cobalt"), NICKEL("Nickel"), LITHIUM("Lithium"), LEAD("Lead"), COBALT("Cobalt"), NICKEL("Nickel"), LITHIUM(
			"Lithium"), LEAD("Lead");

	private String value;

	RecycledMaterial(String value) {
		this.value = value;
	}

	@JsonCreator
	static RecycledMaterial enumDeserializationConstructor(String value) {
		return fromValue(value).orElseThrow(() -> new EnumAttributeNotFoundException(
				"Tried to parse value \"" + value + "\", but there is no enum field like that in RecycledMaterial"));
	}

	@JsonValue
	public String getValue() {
		return value;
	}

	public static Optional<RecycledMaterial> fromValue(String value) {
		return Arrays.stream(RecycledMaterial.values()).filter(enumValue -> compareEnumValues(enumValue, value))
				.findAny();
	}

	private static boolean compareEnumValues(RecycledMaterial enumValue, String value) {
		return enumValue.getValue().equals(value);
	}

}
