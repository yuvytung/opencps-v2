//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.01 at 05:22:36 PM ICT 
//


package org.opencps.api.dossiertemplate.model;

import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partTip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="multiple" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileTemplateNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliverableAction" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "partNo",
    "partName",
    "partTip",
    "partType",
    "multiple",
    "required",
    "fileTemplateNo",
    "esign",
    "hasForm",
    "typeCode",
    "deliverableAction",
    "eForm"
})
@XmlRootElement(name = "DossierPartInputModel")
public class DossierPartInputModel {

   	@FormParam(value = "partNo")
	protected String partNo;
	@FormParam(value = "partName")
	protected String partName;
	@FormParam(value = "partTip")
	protected String partTip;
	@FormParam(value = "partType")
	protected int partType;
	@FormParam(value = "multiple")
	protected String multiple;
	@FormParam(value = "required")
	protected String required;
	@FormParam(value = "fileTemplateNo")
	protected String fileTemplateNo;
	@FormParam(value = "esign")
	protected String esign;
	@FormParam(value = "hasForm")
	protected String hasForm;
	@FormParam(value = "typeCode")
    protected String typeCode;
	@FormParam(value = "deliverableAction")
    protected Integer deliverableAction;
	@FormParam(value = "eForm")
    protected String eForm;

    /**
     * Gets the value of the partNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNo() {
        return partNo;
    }

    /**
     * Sets the value of the partNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNo(String value) {
        this.partNo = value;
    }

    /**
     * Gets the value of the partName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartName() {
        return partName;
    }

    /**
     * Sets the value of the partName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartName(String value) {
        this.partName = value;
    }

    /**
     * Gets the value of the partTip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartTip() {
        return partTip;
    }

    /**
     * Sets the value of the partTip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartTip(String value) {
        this.partTip = value;
    }

    /**
     * Gets the value of the partType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPartType() {
        return partType;
    }

    /**
     * Sets the value of the partType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPartType(Integer value) {
        this.partType = value;
    }

    /**
     * Gets the value of the multiple property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiple() {
        return multiple;
    }

    /**
     * Sets the value of the multiple property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiple(String value) {
        this.multiple = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequired(String value) {
        this.required = value;
    }

    /**
     * Gets the value of the fileTemplateNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileTemplateNo() {
        return fileTemplateNo;
    }

    /**
     * Sets the value of the fileTemplateNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileTemplateNo(String value) {
        this.fileTemplateNo = value;
    }

    /**
     * Gets the value of the esign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsign() {
        return esign;
    }

    /**
     * Sets the value of the esign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsign(String value) {
        this.esign = value;
    }

    /**
     * Gets the value of the hasForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasForm() {
        return hasForm;
    }

    /**
     * Sets the value of the hasForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasForm(String value) {
        this.hasForm = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the deliverableAction property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeliverableAction() {
        return deliverableAction;
    }

    /**
     * Sets the value of the deliverableAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeliverableAction(Integer value) {
        this.deliverableAction = value;
    }

	public String geteForm() {
		return eForm;
	}

	public void seteForm(String eForm) {
		this.eForm = eForm;
	}

}
