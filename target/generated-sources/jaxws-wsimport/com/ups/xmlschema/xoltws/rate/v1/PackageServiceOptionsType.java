
package com.ups.xmlschema.xoltws.rate.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageServiceOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageServiceOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeliveryConfirmation" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}DeliveryConfirmationType" minOccurs="0"/>
 *         &lt;element name="AccessPointCOD" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}PackageServiceOptionsAccessPointCODType" minOccurs="0"/>
 *         &lt;element name="COD" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}CODType" minOccurs="0"/>
 *         &lt;element name="DeclaredValue" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}InsuredValueType" minOccurs="0"/>
 *         &lt;element name="ShipperDeclaredValue" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ShipperDeclaredValueType" minOccurs="0"/>
 *         &lt;element name="ProactiveIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Insurance" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}InsuranceType" minOccurs="0"/>
 *         &lt;element name="VerbalConfirmationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPSPremiumCareIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DryIce" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}DryIceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageServiceOptionsType", propOrder = {
    "deliveryConfirmation",
    "accessPointCOD",
    "cod",
    "declaredValue",
    "shipperDeclaredValue",
    "proactiveIndicator",
    "insurance",
    "verbalConfirmationIndicator",
    "upsPremiumCareIndicator",
    "dryIce"
})
public class PackageServiceOptionsType {

    @XmlElement(name = "DeliveryConfirmation")
    protected DeliveryConfirmationType deliveryConfirmation;
    @XmlElement(name = "AccessPointCOD")
    protected PackageServiceOptionsAccessPointCODType accessPointCOD;
    @XmlElement(name = "COD")
    protected CODType cod;
    @XmlElement(name = "DeclaredValue")
    protected InsuredValueType declaredValue;
    @XmlElement(name = "ShipperDeclaredValue")
    protected ShipperDeclaredValueType shipperDeclaredValue;
    @XmlElement(name = "ProactiveIndicator")
    protected String proactiveIndicator;
    @XmlElement(name = "Insurance")
    protected InsuranceType insurance;
    @XmlElement(name = "VerbalConfirmationIndicator")
    protected String verbalConfirmationIndicator;
    @XmlElement(name = "UPSPremiumCareIndicator")
    protected String upsPremiumCareIndicator;
    @XmlElement(name = "DryIce")
    protected DryIceType dryIce;

    /**
     * Gets the value of the deliveryConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryConfirmationType }
     *     
     */
    public DeliveryConfirmationType getDeliveryConfirmation() {
        return deliveryConfirmation;
    }

    /**
     * Sets the value of the deliveryConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryConfirmationType }
     *     
     */
    public void setDeliveryConfirmation(DeliveryConfirmationType value) {
        this.deliveryConfirmation = value;
    }

    /**
     * Gets the value of the accessPointCOD property.
     * 
     * @return
     *     possible object is
     *     {@link PackageServiceOptionsAccessPointCODType }
     *     
     */
    public PackageServiceOptionsAccessPointCODType getAccessPointCOD() {
        return accessPointCOD;
    }

    /**
     * Sets the value of the accessPointCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageServiceOptionsAccessPointCODType }
     *     
     */
    public void setAccessPointCOD(PackageServiceOptionsAccessPointCODType value) {
        this.accessPointCOD = value;
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
     * Gets the value of the declaredValue property.
     * 
     * @return
     *     possible object is
     *     {@link InsuredValueType }
     *     
     */
    public InsuredValueType getDeclaredValue() {
        return declaredValue;
    }

    /**
     * Sets the value of the declaredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuredValueType }
     *     
     */
    public void setDeclaredValue(InsuredValueType value) {
        this.declaredValue = value;
    }

    /**
     * Gets the value of the shipperDeclaredValue property.
     * 
     * @return
     *     possible object is
     *     {@link ShipperDeclaredValueType }
     *     
     */
    public ShipperDeclaredValueType getShipperDeclaredValue() {
        return shipperDeclaredValue;
    }

    /**
     * Sets the value of the shipperDeclaredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipperDeclaredValueType }
     *     
     */
    public void setShipperDeclaredValue(ShipperDeclaredValueType value) {
        this.shipperDeclaredValue = value;
    }

    /**
     * Gets the value of the proactiveIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProactiveIndicator() {
        return proactiveIndicator;
    }

    /**
     * Sets the value of the proactiveIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProactiveIndicator(String value) {
        this.proactiveIndicator = value;
    }

    /**
     * Gets the value of the insurance property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceType }
     *     
     */
    public InsuranceType getInsurance() {
        return insurance;
    }

    /**
     * Sets the value of the insurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceType }
     *     
     */
    public void setInsurance(InsuranceType value) {
        this.insurance = value;
    }

    /**
     * Gets the value of the verbalConfirmationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerbalConfirmationIndicator() {
        return verbalConfirmationIndicator;
    }

    /**
     * Sets the value of the verbalConfirmationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerbalConfirmationIndicator(String value) {
        this.verbalConfirmationIndicator = value;
    }

    /**
     * Gets the value of the upsPremiumCareIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPSPremiumCareIndicator() {
        return upsPremiumCareIndicator;
    }

    /**
     * Sets the value of the upsPremiumCareIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPSPremiumCareIndicator(String value) {
        this.upsPremiumCareIndicator = value;
    }

    /**
     * Gets the value of the dryIce property.
     * 
     * @return
     *     possible object is
     *     {@link DryIceType }
     *     
     */
    public DryIceType getDryIce() {
        return dryIce;
    }

    /**
     * Sets the value of the dryIce property.
     * 
     * @param value
     *     allowed object is
     *     {@link DryIceType }
     *     
     */
    public void setDryIce(DryIceType value) {
        this.dryIce = value;
    }

}
