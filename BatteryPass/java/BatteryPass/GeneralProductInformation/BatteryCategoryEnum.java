
package io.BatteryPass.GeneralProductInformation;

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
import javax.xml.datatype.XMLGregorianCalendar;
import org.eclipse.esmf.aspectmodel.java.exception.EnumAttributeNotFoundException;

/**
 * Generated class {@link BatteryCategoryEnum}.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum BatteryCategoryEnum {
	LMT("lmt"), EV("ev"), INDUSTRIAL("industrial"), STATIONARY("stationary");

	private String value;

	BatteryCategoryEnum(String value) {
		this.value = value;
	}

	@JsonCreator
	static BatteryCategoryEnum enumDeserializationConstructor(String value) {
		return fromValue(value).orElseThrow(() -> new EnumAttributeNotFoundException(
				"Tried to parse value \"" + value + "\", but there is no enum field like that in BatteryCategoryEnum"));
	}

	@JsonValue
	public String getValue() {
		return value;
	}

	public static Optional<BatteryCategoryEnum> fromValue(String value) {
		return Arrays.stream(BatteryCategoryEnum.values()).filter(enumValue -> compareEnumValues(enumValue, value))
				.findAny();
	}

	private static boolean compareEnumValues(BatteryCategoryEnum enumValue, String value) {
		return enumValue.getValue().equals(value);
	}

}
