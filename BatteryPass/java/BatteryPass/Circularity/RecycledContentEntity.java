
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
 * Generated class for RecycledContentEntity. A battery passport must include
 * recycled content information.
 * 
 * The content information must include the percentage share of nickel that is
 * present in active materials and that has been recovered from battery
 * manufacturing waste, for each battery model per year and per manufacturing
 * plant.
 */

public class RecycledContentEntity {

	@NotNull
	@FloatMin(value = "0.0", boundDefinition = BoundDefinition.AT_LEAST)
	@FloatMax(value = "100.0", boundDefinition = BoundDefinition.AT_MOST)

	private Float preConsumerShare;

	@NotNull
	private RecycledMaterial recycledMaterial;

	@NotNull
	@FloatMin(value = "0.0", boundDefinition = BoundDefinition.AT_LEAST)
	@FloatMax(value = "100.0", boundDefinition = BoundDefinition.AT_MOST)

	private Float postConsumerShare;

	@JsonCreator
	public RecycledContentEntity(@JsonProperty(value = "preConsumerShare") Float preConsumerShare,
			@JsonProperty(value = "recycledMaterial") RecycledMaterial recycledMaterial,
			@JsonProperty(value = "postConsumerShare") Float postConsumerShare) {
		super(

		);
		this.preConsumerShare = preConsumerShare;
		this.recycledMaterial = recycledMaterial;
		this.postConsumerShare = postConsumerShare;
	}

	/**
	 * Returns preConsumerShare
	 *
	 * @return {@link #preConsumerShare}
	 */
	public Float getPreConsumerShare() {
		return this.preConsumerShare;
	}

	/**
	 * Returns RecycledMaterial
	 *
	 * @return {@link #recycledMaterial}
	 */
	public RecycledMaterial getRecycledMaterial() {
		return this.recycledMaterial;
	}

	/**
	 * Returns postConsumerShare
	 *
	 * @return {@link #postConsumerShare}
	 */
	public Float getPostConsumerShare() {
		return this.postConsumerShare;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final RecycledContentEntity that = (RecycledContentEntity) o;
		return Objects.equals(preConsumerShare, that.preConsumerShare)
				&& Objects.equals(recycledMaterial, that.recycledMaterial)
				&& Objects.equals(postConsumerShare, that.postConsumerShare);
	}

	@Override
	public int hashCode() {
		return Objects.hash(preConsumerShare, recycledMaterial, postConsumerShare);
	}
}
