//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.26 at 01:52:32 PM ICT 
//


package org.opencps.api.newsbroad.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewsBoardModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewsBoardModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newBoardId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="modifiedDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="newsTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newsContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newsStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewsBoardModel", propOrder = {
    "newBoardId",
    "groupId",
    "userId",
    "createDate",
    "modifiedDate",
    "newsTitle",
    "newsContent",
    "newsStatus"
})
public class NewsBoardModel {

    protected long newBoardId;
    protected long groupId;
    protected long userId;
    protected long createDate;
    protected long modifiedDate;
    @XmlElement(required = true)
    protected String newsTitle;
    @XmlElement(required = true)
    protected String newsContent;
    protected int newsStatus;

    /**
     * Gets the value of the newBoardId property.
     * 
     */
    public long getNewBoardId() {
        return newBoardId;
    }

    /**
     * Sets the value of the newBoardId property.
     * 
     */
    public void setNewBoardId(long value) {
        this.newBoardId = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     */
    public long getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     */
    public void setGroupId(long value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     */
    public long getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     */
    public void setCreateDate(long value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     */
    public long getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     */
    public void setModifiedDate(long value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the newsTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewsTitle() {
        return newsTitle;
    }

    /**
     * Sets the value of the newsTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewsTitle(String value) {
        this.newsTitle = value;
    }

    /**
     * Gets the value of the newsContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewsContent() {
        return newsContent;
    }

    /**
     * Sets the value of the newsContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewsContent(String value) {
        this.newsContent = value;
    }

    /**
     * Gets the value of the newsStatus property.
     * 
     */
    public int getNewsStatus() {
        return newsStatus;
    }

    /**
     * Sets the value of the newsStatus property.
     * 
     */
    public void setNewsStatus(int value) {
        this.newsStatus = value;
    }

}
