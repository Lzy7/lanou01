
package com.lanou.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>contractBean complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="contractBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CNUMBER" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CONTRACT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CONTRACT_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUSTOM_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DELIVERY_PERIOD" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="expNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SHIP_TIME" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SIGNING_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractBean", propOrder = {
    "cnumber",
    "contractid",
    "contractno",
    "customname",
    "deliveryperiod",
    "expNum",
    "shiptime",
    "signingdate",
    "state",
    "totalamount"
})
public class ContractBean {

    @XmlElement(name = "CNUMBER")
    protected Integer cnumber;
    @XmlElement(name = "CONTRACT_ID")
    protected String contractid;
    @XmlElement(name = "CONTRACT_NO")
    protected String contractno;
    @XmlElement(name = "CUSTOM_NAME")
    protected String customname;
    @XmlElement(name = "DELIVERY_PERIOD")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryperiod;
    protected Integer expNum;
    @XmlElement(name = "SHIP_TIME")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shiptime;
    @XmlElement(name = "SIGNING_DATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signingdate;
    @XmlElement(name = "STATE")
    protected Short state;
    @XmlElement(name = "TOTAL_AMOUNT")
    protected BigDecimal totalamount;

    /**
     * 获取cnumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCNUMBER() {
        return cnumber;
    }

    /**
     * 设置cnumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCNUMBER(Integer value) {
        this.cnumber = value;
    }

    /**
     * 获取contractid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTRACTID() {
        return contractid;
    }

    /**
     * 设置contractid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTRACTID(String value) {
        this.contractid = value;
    }

    /**
     * 获取contractno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTRACTNO() {
        return contractno;
    }

    /**
     * 设置contractno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTRACTNO(String value) {
        this.contractno = value;
    }

    /**
     * 获取customname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMNAME() {
        return customname;
    }

    /**
     * 设置customname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMNAME(String value) {
        this.customname = value;
    }

    /**
     * 获取deliveryperiod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDELIVERYPERIOD() {
        return deliveryperiod;
    }

    /**
     * 设置deliveryperiod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDELIVERYPERIOD(XMLGregorianCalendar value) {
        this.deliveryperiod = value;
    }

    /**
     * 获取expNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpNum() {
        return expNum;
    }

    /**
     * 设置expNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpNum(Integer value) {
        this.expNum = value;
    }

    /**
     * 获取shiptime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSHIPTIME() {
        return shiptime;
    }

    /**
     * 设置shiptime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSHIPTIME(XMLGregorianCalendar value) {
        this.shiptime = value;
    }

    /**
     * 获取signingdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSIGNINGDATE() {
        return signingdate;
    }

    /**
     * 设置signingdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSIGNINGDATE(XMLGregorianCalendar value) {
        this.signingdate = value;
    }

    /**
     * 获取state属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSTATE() {
        return state;
    }

    /**
     * 设置state属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSTATE(Short value) {
        this.state = value;
    }

    /**
     * 获取totalamount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALAMOUNT() {
        return totalamount;
    }

    /**
     * 设置totalamount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALAMOUNT(BigDecimal value) {
        this.totalamount = value;
    }

}
