
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
 * Generated class for NegativeEventEntity.
 *
 */

public class NegativeEventEntity {

	@NotNull
	private String negativeEvent;

	@NotNull
	private XMLGregorianCalendar lastUpdate;

	@JsonCreator
	public NegativeEventEntity(@JsonProperty(value = "negativeEvent") String negativeEvent,
			@JsonProperty(value = "lastUpdate") XMLGregorianCalendar lastUpdate) {
		super(

		);
		this.negativeEvent = negativeEvent;
		this.lastUpdate = lastUpdate;
	}

	/**
	 * Returns Negative events, such as accidents. No further definition provided by
	 * regulation.
	 *
	 * @return {@link #negativeEvent}
	 */
	public String getNegativeEvent() {
		return this.negativeEvent;
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

		final NegativeEventEntity that = (NegativeEventEntity) o;
		return Objects.equals(negativeEvent, that.negativeEvent) && Objects.equals(lastUpdate, that.lastUpdate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(negativeEvent, lastUpdate);
	}
}
