//
//This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
//See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
//Any modifications to this file will be lost upon recompilation of the source schema. 
//Generated on: 2017.10.23 at 09:44:18 AM ICT 
//

package org.opencps.statistic.rest.dto;

import com.liferay.petra.string.StringPool;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
	"keyword",
	"start",
	"end",
	"sort",
	"order",
	"year",
	"month",
	"agency",
	"service",
	"votingCode",
	"fromStatisticDate",
	"toStatisticDate"
})
@XmlRootElement(name = "VotingSearchModel")
public class VotingSearchModel {

	@QueryParam(value = "keyword")
	protected String keyword;
	@QueryParam(value = "start")
	protected int start;
	@QueryParam(value = "end")
	protected int end;
	@QueryParam(value = "sort")
	protected String sort;
	@QueryParam(value = "order")
	protected String order;
	@QueryParam(value = "year")
	protected int year;
	@QueryParam(value = "month")
	@DefaultValue("-1")
	protected int month;
	@QueryParam(value = "agency")
	protected String agency;
	@QueryParam(value = "service")
	protected String service;
	@QueryParam(value = "votingCode")
	protected String votingCode;
	@QueryParam(value = "fromStatisticDate")
	protected String fromStatisticDate;
	@QueryParam(value = "toStatisticDate")
	protected String toStatisticDate;
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getVotingCode() {
		return votingCode;
	}
	public void setVotingCode(String votingCode) {
		this.votingCode = votingCode;
	}
	public String getFromStatisticDate() {
		return fromStatisticDate;
	}
	public void setFromStatisticDate(String fromStatisticDate) {
		this.fromStatisticDate = fromStatisticDate;
	}
	public String getToStatisticDate() {
		return toStatisticDate;
	}
	public void setToStatisticDate(String toStatisticDate) {
		this.toStatisticDate = toStatisticDate;
	}

}