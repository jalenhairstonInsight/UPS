
package com.ups.xmlschema.xoltws.rate.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PickupOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PickupOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LiftGateAtPickupIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoldForPickupIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PickupOptionsType", propOrder = {
    "liftGateAtPickupIndicator",
    "holdForPickupIndicator"
})
public class PickupOptionsType {

    @XmlElement(name = "LiftGateAtPickupIndicator")
    protected String liftGateAtPickupIndicator;
    @XmlElement(name = "HoldForPickupIndicator")
    protected String holdForPickupIndicator;

    /**
     * Gets the value of the liftGateAtPickupIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiftGateAtPickupIndicator() {
        return liftGateAtPickupIndicator;
    }

    /**
     * Sets the value of the liftGateAtPickupIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiftGateAtPickupIndicator(String value) {
        this.liftGateAtPickupIndicator = value;
    }

    /**
     * Gets the value of the holdForPickupIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldForPickupIndicator() {
        return holdForPickupIndicator;
    }

    /**
     * Sets the value of the holdForPickupIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldForPickupIndicator(String value) {
        this.holdForPickupIndicator = value;
    }

}
