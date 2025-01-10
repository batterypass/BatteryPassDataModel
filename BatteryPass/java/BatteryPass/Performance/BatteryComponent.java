
package io.BatteryPass.Performance;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.NotNull;
import java.math.BigInteger;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import javax.xml.datatype.XMLGregorianCalendar;
import org.eclipse.esmf.aspectmodel.java.customconstraint.DoubleMax;
import org.eclipse.esmf.aspectmodel.java.customconstraint.DoubleMin;
import org.eclipse.esmf.aspectmodel.java.exception.EnumAttributeNotFoundException;
import org.eclipse.esmf.metamodel.BoundDefinition;

/**
 * Generated class {@link BatteryComponent}.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum BatteryComponent {
	PACK("pack"), MODULE("module"), CELL("cell");

	private String value;

	BatteryComponent(String value) {
		this.value = value;
	}

	@JsonCreator
	static BatteryComponent enumDeserializationConstructor(String value) {
		return fromValue(value).orElseThrow(() -> new EnumAttributeNotFoundException(
				"Tried to parse value \"" + value + "\", but there is no enum field like that in BatteryComponent"));
	}

	@JsonValue
	public String getValue() {
		return value;
	}

	public static Optional<BatteryComponent> fromValue(String value) {
		return Arrays.stream(BatteryComponent.values()).filter(enumValue -> compareEnumValues(enumValue, value))
				.findAny();
	}

	private static boolean compareEnumValues(BatteryComponent enumValue, String value) {
		return enumValue.getValue().equals(value);
	}

}
