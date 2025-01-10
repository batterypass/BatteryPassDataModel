
package io.BatteryPass.GeneralProductInformation;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Generated class for GeneralProductInformation. Mandatory data: Product
 * identification; manufacturer?s identification; manufacturing place;
 * manufacturing date; battery category; battery weight; battery status (Annex
 * VI, Part A and Annex XIII) Copyright ? 2023 Circulor (for and on behalf of
 * the Battery Pass Consortium). This work is li-censed under a Creative Commons
 * License Attribution-NonCommercial 4.0 International (CC BY-NC 4.0). Readers
 * may reproduce material for their own publications, as long as it is not sold
 * com-mercially and is given appropriate attribution.
 */
public class GeneralProductInformation {

	@NotNull
	private String productIdentifier;

	@NotNull
	@Pattern(regexp = "^urn:[a-z0-9]+:[a-z0-9]+$")

	private String batteryPassportIdentifier;

	@NotNull
	private BatteryCategoryEnum batteryCategory;

	@NotNull
	private ContactInformationEntity manufacturerInformation;

	@NotNull
	private XMLGregorianCalendar manufacturingDate;

	@NotNull
	private BatteryStatusEnumeration batteryStatus;

	@NotNull
	private Float batteryMass;

	@NotNull
	private PostalAddressEntity manufacturingPlace;

	@NotNull
	private ContactInformationEntity operatorInformation;

	@NotNull
	private XMLGregorianCalendar puttingIntoService;

	@NotNull
	private XMLGregorianCalendar warrentyPeriod;

	@JsonCreator
	public GeneralProductInformation(@JsonProperty(value = "productIdentifier") String productIdentifier,
			@JsonProperty(value = "batteryPassportIdentifier") String batteryPassportIdentifier,
			@JsonProperty(value = "batteryCategory") BatteryCategoryEnum batteryCategory,
			@JsonProperty(value = "manufacturerInformation") ContactInformationEntity manufacturerInformation,
			@JsonProperty(value = "manufacturingDate") XMLGregorianCalendar manufacturingDate,
			@JsonProperty(value = "batteryStatus") BatteryStatusEnumeration batteryStatus,
			@JsonProperty(value = "batteryMass") Float batteryMass,
			@JsonProperty(value = "manufacturingPlace") PostalAddressEntity manufacturingPlace,
			@JsonProperty(value = "operatorInformation") ContactInformationEntity operatorInformation,
			@JsonProperty(value = "puttingIntoService") XMLGregorianCalendar puttingIntoService,
			@JsonProperty(value = "warrentyPeriod") XMLGregorianCalendar warrentyPeriod) {
		super(

		);
		this.productIdentifier = productIdentifier;
		this.batteryPassportIdentifier = batteryPassportIdentifier;
		this.batteryCategory = batteryCategory;
		this.manufacturerInformation = manufacturerInformation;
		this.manufacturingDate = manufacturingDate;
		this.batteryStatus = batteryStatus;
		this.batteryMass = batteryMass;
		this.manufacturingPlace = manufacturingPlace;
		this.operatorInformation = operatorInformation;
		this.puttingIntoService = puttingIntoService;
		this.warrentyPeriod = warrentyPeriod;
	}

	/**
	 * Returns ProductIdentifier
	 *
	 * @return {@link #productIdentifier}
	 */
	public String getProductIdentifier() {
		return this.productIdentifier;
	}

	/**
	 * Returns BatteryPassportIdentifier
	 *
	 * @return {@link #batteryPassportIdentifier}
	 */
	public String getBatteryPassportIdentifier() {
		return this.batteryPassportIdentifier;
	}

	/**
	 * Returns BatteryCategory
	 *
	 * @return {@link #batteryCategory}
	 */
	public BatteryCategoryEnum getBatteryCategory() {
		return this.batteryCategory;
	}

	/**
	 * Returns ManufacturerIdentification
	 *
	 * @return {@link #manufacturerInformation}
	 */
	public ContactInformationEntity getManufacturerInformation() {
		return this.manufacturerInformation;
	}

	/**
	 * Returns manufacturingDate
	 *
	 * @return {@link #manufacturingDate}
	 */
	public XMLGregorianCalendar getManufacturingDate() {
		return this.manufacturingDate;
	}

	/**
	 * Returns BatteryStatus
	 *
	 * @return {@link #batteryStatus}
	 */
	public BatteryStatusEnumeration getBatteryStatus() {
		return this.batteryStatus;
	}

	/**
	 * Returns batteryMass
	 *
	 * @return {@link #batteryMass}
	 */
	public Float getBatteryMass() {
		return this.batteryMass;
	}

	/**
	 * Returns ManufacturingPlace
	 *
	 * @return {@link #manufacturingPlace}
	 */
	public PostalAddressEntity getManufacturingPlace() {
		return this.manufacturingPlace;
	}

	/**
	 * Returns OperatorInformation
	 *
	 * @return {@link #operatorInformation}
	 */
	public ContactInformationEntity getOperatorInformation() {
		return this.operatorInformation;
	}

	/**
	 * Returns puttingIntoService
	 *
	 * @return {@link #puttingIntoService}
	 */
	public XMLGregorianCalendar getPuttingIntoService() {
		return this.puttingIntoService;
	}

	/**
	 * Returns warrentyPeriod
	 *
	 * @return {@link #warrentyPeriod}
	 */
	public XMLGregorianCalendar getWarrentyPeriod() {
		return this.warrentyPeriod;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		final GeneralProductInformation that = (GeneralProductInformation) o;
		return Objects.equals(productIdentifier, that.productIdentifier)
				&& Objects.equals(batteryPassportIdentifier, that.batteryPassportIdentifier)
				&& Objects.equals(batteryCategory, that.batteryCategory)
				&& Objects.equals(manufacturerInformation, that.manufacturerInformation)
				&& Objects.equals(manufacturingDate, that.manufacturingDate)
				&& Objects.equals(batteryStatus, that.batteryStatus) && Objects.equals(batteryMass, that.batteryMass)
				&& Objects.equals(manufacturingPlace, that.manufacturingPlace)
				&& Objects.equals(operatorInformation, that.operatorInformation)
				&& Objects.equals(puttingIntoService, that.puttingIntoService)
				&& Objects.equals(warrentyPeriod, that.warrentyPeriod);
	}

	@Override
	public int hashCode() {
		return Objects.hash(productIdentifier, batteryPassportIdentifier, batteryCategory, manufacturerInformation,
				manufacturingDate, batteryStatus, batteryMass, manufacturingPlace, operatorInformation,
				puttingIntoService, warrentyPeriod);
	}
}
