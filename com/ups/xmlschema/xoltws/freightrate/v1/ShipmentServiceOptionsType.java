
package com.ups.xmlschema.xoltws.freightrate.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentServiceOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentServiceOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PickupOptions" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}PickupOptionsType" minOccurs="0"/>
 *         &lt;element name="DeliveryOptions" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}DeliveryOptionsType" minOccurs="0"/>
 *         &lt;element name="OverSeasLeg" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}OverSeasLegType" minOccurs="0"/>
 *         &lt;element name="COD" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}CODType" minOccurs="0"/>
 *         &lt;element name="DangerousGoods" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}DangerousGoodsType" minOccurs="0"/>
 *         &lt;element name="SortingAndSegregating" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}SortingAndSegregatingType" minOccurs="0"/>
 *         &lt;element name="DeclaredValue" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}DeclaredValueType" minOccurs="0"/>
 *         &lt;element name="ExcessDeclaredValue" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}DeclaredValueType" minOccurs="0"/>
 *         &lt;element name="CustomsValue" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}CustomsValueType" minOccurs="0"/>
 *         &lt;element name="DeliveryDutiesPaidIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryDutiesUnpaidIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HandlingCharge" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}HandlingChargeType" minOccurs="0"/>
 *         &lt;element name="CustomsClearanceIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreezableProtectionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtremeLengthIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdjustedHeight" type="{http://www.ups.com/XMLSchema/XOLTWS/FreightRate/v1.0}AdjustedHeightType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentServiceOptionsType", propOrder = {
    "pickupOptions",
    "deliveryOptions",
    "overSeasLeg",
    "cod",
    "dangerousGoods",
    "sortingAndSegregating",
    "declaredValue",
    "excessDeclaredValue",
    "customsValue",
    "deliveryDutiesPaidIndicator",
    "deliveryDutiesUnpaidIndicator",
    "handlingCharge",
    "customsClearanceIndicator",
    "freezableProtectionIndicator",
    "extremeLengthIndicator",
    "adjustedHeight"
})
public class ShipmentServiceOptionsType {

    @XmlElement(name = "PickupOptions")
    protected PickupOptionsType pickupOptions;
    @XmlElement(name = "DeliveryOptions")
    protected DeliveryOptionsType deliveryOptions;
    @XmlElement(name = "OverSeasLeg")
    protected OverSeasLegType overSeasLeg;
    @XmlElement(name = "COD")
    protected CODType cod;
    @XmlElement(name = "DangerousGoods")
    protected DangerousGoodsType dangerousGoods;
    @XmlElement(name = "SortingAndSegregating")
    protected SortingAndSegregatingType sortingAndSegregating;
    @XmlElement(name = "DeclaredValue")
    protected DeclaredValueType declaredValue;
    @XmlElement(name = "ExcessDeclaredValue")
    protected DeclaredValueType excessDeclaredValue;
    @XmlElement(name = "CustomsValue")
    protected CustomsValueType customsValue;
    @XmlElement(name = "DeliveryDutiesPaidIndicator")
    protected String deliveryDutiesPaidIndicator;
    @XmlElement(name = "DeliveryDutiesUnpaidIndicator")
    protected String deliveryDutiesUnpaidIndicator;
    @XmlElement(name = "HandlingCharge")
    protected HandlingChargeType handlingCharge;
    @XmlElement(name = "CustomsClearanceIndicator")
    protected String customsClearanceIndicator;
    @XmlElement(name = "FreezableProtectionIndicator")
    protected String freezableProtectionIndicator;
    @XmlElement(name = "ExtremeLengthIndicator")
    protected String extremeLengthIndicator;
    @XmlElement(name = "AdjustedHeight")
    protected AdjustedHeightType adjustedHeight;

    /**
     * Gets the value of the pickupOptions property.
     * 
     * @return
     *     possible object is
     *     {@link PickupOptionsType }
     *     
     */
    public PickupOptionsType getPickupOptions() {
        return pickupOptions;
    }

    /**
     * Sets the value of the pickupOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupOptionsType }
     *     
     */
    public void setPickupOptions(PickupOptionsType value) {
        this.pickupOptions = value;
    }

    /**
     * Gets the value of the deliveryOptions property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryOptionsType }
     *     
     */
    public DeliveryOptionsType getDeliveryOptions() {
        return deliveryOptions;
    }

    /**
     * Sets the value of the deliveryOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryOptionsType }
     *     
     */
    public void setDeliveryOptions(DeliveryOptionsType value) {
        this.deliveryOptions = value;
    }

    /**
     * Gets the value of the overSeasLeg property.
     * 
     * @return
     *     possible object is
     *     {@link OverSeasLegType }
     *     
     */
    public OverSeasLegType getOverSeasLeg() {
        return overSeasLeg;
    }

    /**
     * Sets the value of the overSeasLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverSeasLegType }
     *     
     */
    public void setOverSeasLeg(OverSeasLegType value) {
        this.overSeasLeg = value;
    }

    /**
     * Gets the value of the cod property.
     * 
     * @return
     *     possible object is
     *     {@link CODType }
     *     
     */
    public CODType getCOD() {
        return cod;
    }

    /**
     * Sets the value of the cod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODType }
     *     
     */
    public void setCOD(CODType value) {
        this.cod = value;
    }

    /**
     * Gets the value of the dangerousGoods property.
     * 
     * @return
     *     possible object is
     *     {@link DangerousGoodsType }
     *     
     */
    public DangerousGoodsType getDangerousGoods() {
        return dangerousGoods;
    }

    /**
     * Sets the value of the dangerousGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link DangerousGoodsType }
     *     
     */
    public void setDangerousGoods(DangerousGoodsType value) {
        this.dangerousGoods = value;
    }

    /**
     * Gets the value of the sortingAndSegregating property.
     * 
     * @return
     *     possible object is
     *     {@link SortingAndSegregatingType }
     *     
     */
    public SortingAndSegregatingType getSortingAndSegregating() {
        return sortingAndSegregating;
    }

    /**
     * Sets the value of the sortingAndSegregating property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortingAndSegregatingType }
     *     
     */
    public void setSortingAndSegregating(SortingAndSegregatingType value) {
        this.sortingAndSegregating = value;
    }

    /**
     * Gets the value of the declaredValue property.
     * 
     * @return
     *     possible object is
     *     {@link DeclaredValueType }
     *     
     */
    public DeclaredValueType getDeclaredValue() {
        return declaredValue;
    }

    /**
     * Sets the value of the declaredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaredValueType }
     *     
     */
    public void setDeclaredValue(DeclaredValueType value) {
        this.declaredValue = value;
    }

    /**
     * Gets the value of the excessDeclaredValue property.
     * 
     * @return
     *     possible object is
     *     {@link DeclaredValueType }
     *     
     */
    public DeclaredValueType getExcessDeclaredValue() {
        return excessDeclaredValue;
    }

    /**
     * Sets the value of the excessDeclaredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaredValueType }
     *     
     */
    public void setExcessDeclaredValue(DeclaredValueType value) {
        this.excessDeclaredValue = value;
    }

    /**
     * Gets the value of the customsValue property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsValueType }
     *     
     */
    public CustomsValueType getCustomsValue() {
        return customsValue;
    }

    /**
     * Sets the value of the customsValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsValueType }
     *     
     */
    public void setCustomsValue(CustomsValueType value) {
        this.customsValue = value;
    }

    /**
     * Gets the value of the deliveryDutiesPaidIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDutiesPaidIndicator() {
        return deliveryDutiesPaidIndicator;
    }

    /**
     * Sets the value of the deliveryDutiesPaidIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDutiesPaidIndicator(String value) {
        this.deliveryDutiesPaidIndicator = value;
    }

    /**
     * Gets the value of the deliveryDutiesUnpaidIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDutiesUnpaidIndicator() {
        return deliveryDutiesUnpaidIndicator;
    }

    /**
     * Sets the value of the deliveryDutiesUnpaidIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDutiesUnpaidIndicator(String value) {
        this.deliveryDutiesUnpaidIndicator = value;
    }

    /**
     * Gets the value of the handlingCharge property.
     * 
     * @return
     *     possible object is
     *     {@link HandlingChargeType }
     *     
     */
    public HandlingChargeType getHandlingCharge() {
        return handlingCharge;
    }

    /**
     * Sets the value of the handlingCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandlingChargeType }
     *     
     */
    public void setHandlingCharge(HandlingChargeType value) {
        this.handlingCharge = value;
    }

    /**
     * Gets the value of the customsClearanceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsClearanceIndicator() {
        return customsClearanceIndicator;
    }

    /**
     * Sets the value of the customsClearanceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsClearanceIndicator(String value) {
        this.customsClearanceIndicator = value;
    }

    /**
     * Gets the value of the freezableProtectionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreezableProtectionIndicator() {
        return freezableProtectionIndicator;
    }

    /**
     * Sets the value of the freezableProtectionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreezableProtectionIndicator(String value) {
        this.freezableProtectionIndicator = value;
    }

    /**
     * Gets the value of the extremeLengthIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtremeLengthIndicator() {
        return extremeLengthIndicator;
    }

    /**
     * Sets the value of the extremeLengthIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtremeLengthIndicator(String value) {
        this.extremeLengthIndicator = value;
    }

    /**
     * Gets the value of the adjustedHeight property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustedHeightType }
     *     
     */
    public AdjustedHeightType getAdjustedHeight() {
        return adjustedHeight;
    }

    /**
     * Sets the value of the adjustedHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustedHeightType }
     *     
     */
    public void setAdjustedHeight(AdjustedHeightType value) {
        this.adjustedHeight = value;
    }

}
