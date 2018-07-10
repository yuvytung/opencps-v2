//
//This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
//See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
//Any modifications to this file will be lost upon recompilation of the source schema. 
//Generated on: 2017.12.16 at 03:30:29 PM ICT 
//


package org.opencps.api.dossieraction.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
* <p>Java class for DossierActionNextActionModel complex type.
* 
* <p>The following schema fragment specifies the expected content contained within this class.
* 
* <pre>
* &lt;complexType name="DossierActionNextActionModel">
*   &lt;complexContent>
*     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
*       &lt;sequence>
*         &lt;element name="processActionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
*         &lt;element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="actionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="preStepCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="postStepCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="autoEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="preCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="allowAssignUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
*         &lt;element name="assignUserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
*         &lt;element name="toUsers" type="{}DossierActionNextActiontoUser" maxOccurs="unbounded" minOccurs="0"/>
*         &lt;element name="createFiles" type="{}DossierActionNextActioncreateFiles" maxOccurs="unbounded" minOccurs="0"/>
*       &lt;/sequence>
*     &lt;/restriction>
*   &lt;/complexContent>
* &lt;/complexType>
* </pre>
* 
* 
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DossierNextActionModel", propOrder = {
 "processActionId",
 "actionCode",
 "actionName",
 "preStepCode",
 "postStepCode",
 "autoEvent",
 "preCondition",
 "enable"
})
public class DossierNextActionModel {

	protected Long processActionId;
	protected String actionCode;
	protected String actionName;
	protected String preStepCode;
	protected String postStepCode;
	protected String autoEvent;
	protected String preCondition;
	protected Integer enable;

 /**
  * Gets the value of the processActionId property.
  * 
  * @return
  *     possible object is
  *     {@link Long }
  *     
  */
 public Long getProcessActionId() {
     return processActionId;
 }

 /**
  * Sets the value of the processActionId property.
  * 
  * @param value
  *     allowed object is
  *     {@link Long }
  *     
  */
 public void setProcessActionId(Long value) {
     this.processActionId = value;
 }

 /**
  * Gets the value of the actionCode property.
  * 
  * @return
  *     possible object is
  *     {@link String }
  *     
  */
 public String getActionCode() {
     return actionCode;
 }

 /**
  * Sets the value of the actionCode property.
  * 
  * @param value
  *     allowed object is
  *     {@link String }
  *     
  */
 public void setActionCode(String value) {
     this.actionCode = value;
 }

 /**
  * Gets the value of the actionName property.
  * 
  * @return
  *     possible object is
  *     {@link String }
  *     
  */
 public String getActionName() {
     return actionName;
 }

 /**
  * Sets the value of the actionName property.
  * 
  * @param value
  *     allowed object is
  *     {@link String }
  *     
  */
 public void setActionName(String value) {
     this.actionName = value;
 }

 /**
  * Gets the value of the preStepCode property.
  * 
  * @return
  *     possible object is
  *     {@link String }
  *     
  */
 public String getPreStepCode() {
     return preStepCode;
 }

 /**
  * Sets the value of the preStepCode property.
  * 
  * @param value
  *     allowed object is
  *     {@link String }
  *     
  */
 public void setPreStepCode(String value) {
     this.preStepCode = value;
 }

 /**
  * Gets the value of the postStepCode property.
  * 
  * @return
  *     possible object is
  *     {@link String }
  *     
  */
 public String getPostStepCode() {
     return postStepCode;
 }

 /**
  * Sets the value of the postStepCode property.
  * 
  * @param value
  *     allowed object is
  *     {@link String }
  *     
  */
 public void setPostStepCode(String value) {
     this.postStepCode = value;
 }

 /**
  * Gets the value of the autoEvent property.
  * 
  * @return
  *     possible object is
  *     {@link String }
  *     
  */
 public String getAutoEvent() {
     return autoEvent;
 }

 /**
  * Sets the value of the autoEvent property.
  * 
  * @param value
  *     allowed object is
  *     {@link String }
  *     
  */
 public void setAutoEvent(String value) {
     this.autoEvent = value;
 }

 /**
  * Gets the value of the preCondition property.
  * 
  * @return
  *     possible object is
  *     {@link String }
  *     
  */
 public String getPreCondition() {
     return preCondition;
 }

 /**
  * Sets the value of the preCondition property.
  * 
  * @param value
  *     allowed object is
  *     {@link String }
  *     
  */
 public void setPreCondition(String value) {
     this.preCondition = value;
 }

public Integer getEnable() {
	return enable;
}

public void setEnable(Integer enable) {
	this.enable = enable;
}

}
