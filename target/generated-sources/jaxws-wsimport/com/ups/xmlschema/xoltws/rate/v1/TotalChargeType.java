
package com.ups.xmlschema.xoltws.rate.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TotalChargeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalChargeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccessorialCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ChargesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SurCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ChargesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TransportationCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ChargesType" minOccurs="0"/>
 *         &lt;element name="TaxCharges" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}TaxChargeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TotalCharge" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ChargesType"/>
 *         &lt;element name="TotalChargesWithTaxes" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ChargesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalChargeType", propOrder = {
    "accessorialCharges",
    "surCharges",
    "transportationCharges",
    "taxCharges",
    "totalCharge",
    "totalChargesWithTaxes"
})
public class TotalChargeType {

    @XmlElement(name = "AccessorialCharges")
    protected List<ChargesType> accessorialCharges;
    @XmlElement(name = "SurCharges")
    protected List<ChargesType> surCharges;
    @XmlElement(name = "TransportationCharges")
    protected ChargesType transportationCharges;
    @XmlElement(name = "TaxCharges")
    protected List<TaxChargeType> taxCharges;
    @XmlElement(name = "TotalCharge", required = true)
    protected ChargesType totalCharge;
    @XmlElement(name = "TotalChargesWithTaxes")
    protected ChargesType totalChargesWithTaxes;

    /**
     * Gets the value of the accessorialCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessorialCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessorialCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargesType }
     * 
     * 
     */
    public List<ChargesType> getAccessorialCharges() {
        if (accessorialCharges == null) {
            accessorialCharges = new ArrayList<ChargesType>();
        }
        return this.accessorialCharges;
    }

    /**
     * Gets the value of the surCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargesType }
     * 
     * 
     */
    public List<ChargesType> getSurCharges() {
        if (surCharges == null) {
            surCharges = new ArrayList<ChargesType>();
        }
        return this.surCharges;
    }

    /**
     * Gets the value of the transportationCharges property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesType }
     *     
     */
    public ChargesType getTransportationCharges() {
        return transportationCharges;
    }

    /**
     * Sets the value of the transportationCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *     
     */
    public void setTransportationCharges(ChargesType value) {
        this.transportationCharges = value;
    }

    /**
     * Gets the value of the taxCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxChargeType }
     * 
     * 
     */
    public List<TaxChargeType> getTaxCharges() {
        if (taxCharges == null) {
            taxCharges = new ArrayList<TaxChargeType>();
        }
        return this.taxCharges;
    }

    /**
     * Gets the value of the totalCharge property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesType }
     *     
     */
    public ChargesType getTotalCharge() {
        return totalCharge;
    }

    /**
     * Sets the value of the totalCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *     
     */
    public void setTotalCharge(ChargesType value) {
        this.totalCharge = value;
    }

    /**
     * Gets the value of the totalChargesWithTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesType }
     *     
     */
    public ChargesType getTotalChargesWithTaxes() {
        return totalChargesWithTaxes;
    }

    /**
     * Sets the value of the totalChargesWithTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *     
     */
    public void setTotalChargesWithTaxes(ChargesType value) {
        this.totalChargesWithTaxes = value;
    }

}
