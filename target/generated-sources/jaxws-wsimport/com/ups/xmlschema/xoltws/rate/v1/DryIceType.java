
package com.ups.xmlschema.xoltws.rate.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DryIceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DryIceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegulationSet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DryIceWeight" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}DryIceWeightType"/>
 *         &lt;element name="MedicalUseIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuditRequired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DryIceType", propOrder = {
    "regulationSet",
    "dryIceWeight",
    "medicalUseIndicator",
    "auditRequired"
})
public class DryIceType {

    @XmlElement(name = "RegulationSet", required = true)
    protected String regulationSet;
    @XmlElement(name = "DryIceWeight", required = true)
    protected DryIceWeightType dryIceWeight;
    @XmlElement(name = "MedicalUseIndicator")
    protected String medicalUseIndicator;
    @XmlElement(name = "AuditRequired")
    protected String auditRequired;

    /**
     * Gets the value of the regulationSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationSet() {
        return regulationSet;
    }

    /**
     * Sets the value of the regulationSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationSet(String value) {
        this.regulationSet = value;
    }

    /**
     * Gets the value of the dryIceWeight property.
     * 
     * @return
     *     possible object is
     *     {@link DryIceWeightType }
     *     
     */
    public DryIceWeightType getDryIceWeight() {
        return dryIceWeight;
    }

    /**
     * Sets the value of the dryIceWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link DryIceWeightType }
     *     
     */
    public void setDryIceWeight(DryIceWeightType value) {
        this.dryIceWeight = value;
    }

    /**
     * Gets the value of the medicalUseIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalUseIndicator() {
        return medicalUseIndicator;
    }

    /**
     * Sets the value of the medicalUseIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalUseIndicator(String value) {
        this.medicalUseIndicator = value;
    }

    /**
     * Gets the value of the auditRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditRequired() {
        return auditRequired;
    }

    /**
     * Sets the value of the auditRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditRequired(String value) {
        this.auditRequired = value;
    }

}
