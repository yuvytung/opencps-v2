//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.23 at 02:23:58 PM ICT 
//


package org.opencps.api.einvoice.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Hoadon_gtgt_ctT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Hoadon_gtgt_ctT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ma_vt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dvt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="luong" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tien" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ts" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="thue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ttoan" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hoadon_gtgt_ctT", propOrder = {
    "maVt",
    "ten",
    "dvt",
    "luong",
    "gia",
    "tien",
    "ts",
    "thue",
    "ttoan"
})
public class HoadonGtgtCtT {

    @XmlElement(name = "ma_vt", required = true)
    protected String maVt;
    @XmlElement(name = "TEN", required = true)
    protected String ten;
    @XmlElement(required = true)
    protected String dvt;
    @XmlElement(required = true)
    protected Integer luong;
    @XmlElement(required = true)
    protected String gia;
    @XmlElement(required = true)
    protected BigDecimal tien;
    @XmlElement(required = true)
    protected String ts;
    @XmlElement(required = true)
    protected String thue;
    @XmlElement(required = true)
    protected BigDecimal ttoan;
	public String getMaVt() {
		return maVt;
	}
	public void setMaVt(String maVt) {
		this.maVt = maVt;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDvt() {
		return dvt;
	}
	public void setDvt(String dvt) {
		this.dvt = dvt;
	}
	public Integer getLuong() {
		return luong;
	}
	public void setLuong(Integer luong) {
		this.luong = luong;
	}
	public String getGia() {
		return gia;
	}
	public void setGia(String gia) {
		this.gia = gia;
	}
	public BigDecimal getTien() {
		return tien;
	}
	public void setTien(BigDecimal tien) {
		this.tien = tien;
	}
	public String getTs() {
		return ts;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}
	public String getThue() {
		return thue;
	}
	public void setThue(String thue) {
		this.thue = thue;
	}
	public BigDecimal getTtoan() {
		return ttoan;
	}
	public void setTtoan(BigDecimal ttoan) {
		this.ttoan = ttoan;
	}
    
}
