
package com.ups.xmlschema.xoltws.rate.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Shipper" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ShipperType"/>
 *         &lt;element name="ShipTo" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ShipToType"/>
 *         &lt;element name="ShipFrom" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ShipFromType" minOccurs="0"/>
 *         &lt;element name="AlternateDeliveryAddress" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}AlternateDeliveryAddressType" minOccurs="0"/>
 *         &lt;element name="ShipmentIndicationType" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}IndicationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FRSPaymentInformation" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}FRSPaymentInfoType" minOccurs="0"/>
 *         &lt;element name="Service" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}CodeDescriptionType" minOccurs="0"/>
 *         &lt;element name="DocumentsOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumOfPieces" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Package" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}PackageType" maxOccurs="unbounded"/>
 *         &lt;element name="ShipmentServiceOptions" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ShipmentServiceOptionsType" minOccurs="0"/>
 *         &lt;element name="ShipmentRatingOptions" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}ShipmentRatingOptionsType" minOccurs="0"/>
 *         &lt;element name="InvoiceLineTotal" type="{http://www.ups.com/XMLSchema/XOLTWS/Rate/v1.1}InvoiceLineTotalType" minOccurs="0"/>
 *         &lt;element name="ItemizedChargesRequestedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RatingMethodRequestedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxInformationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentType", propOrder = {
    "shipper",
    "shipTo",
    "shipFrom",
    "alternateDeliveryAddress",
    "shipmentIndicationType",
    "frsPaymentInformation",
    "service",
    "documentsOnlyIndicator",
    "numOfPieces",
    "_package",
    "shipmentServiceOptions",
    "shipmentRatingOptions",
    "invoiceLineTotal",
    "itemizedChargesRequestedIndicator",
    "ratingMethodRequestedIndicator",
    "taxInformationIndicator"
})
public class ShipmentType {

    @XmlElement(name = "Shipper", required = true)
    protected ShipperType shipper;
    @XmlElement(name = "ShipTo", required = true)
    protected ShipToType shipTo;
    @XmlElement(name = "ShipFrom")
    protected ShipFromType shipFrom;
    @XmlElement(name = "AlternateDeliveryAddress")
    protected AlternateDeliveryAddressType alternateDeliveryAddress;
    @XmlElement(name = "ShipmentIndicationType")
    protected List<IndicationType> shipmentIndicationType;
    @XmlElement(name = "FRSPaymentInformation")
    protected FRSPaymentInfoType frsPaymentInformation;
    @XmlElement(name = "Service")
    protected CodeDescriptionType service;
    @XmlElement(name = "DocumentsOnlyIndicator")
    protected String documentsOnlyIndicator;
    @XmlElement(name = "NumOfPieces")
    protected String numOfPieces;
    @XmlElement(name = "Package", required = true)
    protected List<PackageType> _package;
    @XmlElement(name = "ShipmentServiceOptions")
    protected ShipmentServiceOptionsType shipmentServiceOptions;
    @XmlElement(name = "ShipmentRatingOptions")
    protected ShipmentRatingOptionsType shipmentRatingOptions;
    @XmlElement(name = "InvoiceLineTotal")
    protected InvoiceLineTotalType invoiceLineTotal;
    @XmlElement(name = "ItemizedChargesRequestedIndicator")
    protected String itemizedChargesRequestedIndicator;
    @XmlElement(name = "RatingMethodRequestedIndicator")
    protected String ratingMethodRequestedIndicator;
    @XmlElement(name = "TaxInformationIndicator")
    protected String taxInformationIndicator;

    /**
     * Gets the value of the shipper property.
     * 
     * @return
     *     possible object is
     *     {@link ShipperType }
     *     
     */
    public ShipperType getShipper() {
        return shipper;
    }

    /**
     * Sets the value of the shipper property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipperType }
     *     
     */
    public void setShipper(ShipperType value) {
        this.shipper = value;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link ShipToType }
     *     
     */
    public ShipToType getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipToType }
     *     
     */
    public void setShipTo(ShipToType value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the shipFrom property.
     * 
     * @return
     *     possible object is
     *     {@link ShipFromType }
     *     
     */
    public ShipFromType getShipFrom() {
        return shipFrom;
    }

    /**
     * Sets the value of the shipFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipFromType }
     *     
     */
    public void setShipFrom(ShipFromType value) {
        this.shipFrom = value;
    }

    /**
     * Gets the value of the alternateDeliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateDeliveryAddressType }
     *     
     */
    public AlternateDeliveryAddressType getAlternateDeliveryAddress() {
        return alternateDeliveryAddress;
    }

    /**
     * Sets the value of the alternateDeliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateDeliveryAddressType }
     *     
     */
    public void setAlternateDeliveryAddress(AlternateDeliveryAddressType value) {
        this.alternateDeliveryAddress = value;
    }

    /**
     * Gets the value of the shipmentIndicationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentIndicationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentIndicationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndicationType }
     * 
     * 
     */
    public List<IndicationType> getShipmentIndicationType() {
        if (shipmentIndicationType == null) {
            shipmentIndicationType = new ArrayList<IndicationType>();
        }
        return this.shipmentIndicationType;
    }

    /**
     * Gets the value of the frsPaymentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FRSPaymentInfoType }
     *     
     */
    public FRSPaymentInfoType getFRSPaymentInformation() {
        return frsPaymentInformation;
    }

    /**
     * Sets the value of the frsPaymentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FRSPaymentInfoType }
     *     
     */
    public void setFRSPaymentInformation(FRSPaymentInfoType value) {
        this.frsPaymentInformation = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionType }
     *     
     */
    public CodeDescriptionType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionType }
     *     
     */
    public void setService(CodeDescriptionType value) {
        this.service = value;
    }

    /**
     * Gets the value of the documentsOnlyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentsOnlyIndicator() {
        return documentsOnlyIndicator;
    }

    /**
     * Sets the value of the documentsOnlyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentsOnlyIndicator(String value) {
        this.documentsOnlyIndicator = value;
    }

    /**
     * Gets the value of the numOfPieces property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumOfPieces() {
        return numOfPieces;
    }

    /**
     * Sets the value of the numOfPieces property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumOfPieces(String value) {
        this.numOfPieces = value;
    }

    /**
     * Gets the value of the package property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the package property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageType }
     * 
     * 
     */
    public List<PackageType> getPackage() {
        if (_package == null) {
            _package = new ArrayList<PackageType>();
        }
        return this._package;
    }

    /**
     * Gets the value of the shipmentServiceOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentServiceOptionsType }
     *     
     */
    public ShipmentServiceOptionsType getShipmentServiceOptions() {
        return shipmentServiceOptions;
    }

    /**
     * Sets the value of the shipmentServiceOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentServiceOptionsType }
     *     
     */
    public void setShipmentServiceOptions(ShipmentServiceOptionsType value) {
        this.shipmentServiceOptions = value;
    }

    /**
     * Gets the value of the shipmentRatingOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentRatingOptionsType }
     *     
     */
    public ShipmentRatingOptionsType getShipmentRatingOptions() {
        return shipmentRatingOptions;
    }

    /**
     * Sets the value of the shipmentRatingOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentRatingOptionsType }
     *     
     */
    public void setShipmentRatingOptions(ShipmentRatingOptionsType value) {
        this.shipmentRatingOptions = value;
    }

    /**
     * Gets the value of the invoiceLineTotal property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceLineTotalType }
     *     
     */
    public InvoiceLineTotalType getInvoiceLineTotal() {
        return invoiceLineTotal;
    }

    /**
     * Sets the value of the invoiceLineTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceLineTotalType }
     *     
     */
    public void setInvoiceLineTotal(InvoiceLineTotalType value) {
        this.invoiceLineTotal = value;
    }

    /**
     * Gets the value of the itemizedChargesRequestedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemizedChargesRequestedIndicator() {
        return itemizedChargesRequestedIndicator;
    }

    /**
     * Sets the value of the itemizedChargesRequestedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemizedChargesRequestedIndicator(String value) {
        this.itemizedChargesRequestedIndicator = value;
    }

    /**
     * Gets the value of the ratingMethodRequestedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingMethodRequestedIndicator() {
        return ratingMethodRequestedIndicator;
    }

    /**
     * Sets the value of the ratingMethodRequestedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingMethodRequestedIndicator(String value) {
        this.ratingMethodRequestedIndicator = value;
    }

    /**
     * Gets the value of the taxInformationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxInformationIndicator() {
        return taxInformationIndicator;
    }

    /**
     * Sets the value of the taxInformationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxInformationIndicator(String value) {
        this.taxInformationIndicator = value;
    }

}
