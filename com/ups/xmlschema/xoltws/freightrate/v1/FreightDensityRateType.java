
package com.ups.xmlschema.xoltws.freightrate.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreightDensityRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreightDensityRateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Density" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TotalCubicFeet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightDensityRateType", propOrder = {
    "density",
    "totalCubicFeet"
})
public class FreightDensityRateType {

    @XmlElement(name = "Density", required = true)
    protected String density;
    @XmlElement(name = "TotalCubicFeet", required = true)
    protected String totalCubicFeet;

    /**
     * Gets the value of the density property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDensity() {
        return density;
    }

    /**
     * Sets the value of the density property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDensity(String value) {
        this.density = value;
    }

    /**
     * Gets the value of the totalCubicFeet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCubicFeet() {
        return totalCubicFeet;
    }

    /**
     * Sets the value of the totalCubicFeet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCubicFeet(String value) {
        this.totalCubicFeet = value;
    }

}
