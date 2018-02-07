
package com.lanou.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>contracthisc complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="contracthisc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CHECK_BY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CONTRACT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CONTRACT_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CREATE_BY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CREATE_DEPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CREATE_TIME" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CREQUEST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUSTOM_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DELIVERY_PERIOD" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IMPORT_NUM" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="INPUT_BY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INSPECTOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OFFEROR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OLD_STATE" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="OUT_STATE" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="PRINT_STYLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REMARK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SHIP_TIME" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SIGNING_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TRADE_TERMS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contracthisc", propOrder = {
    "checkby",
    "contractid",
    "contractno",
    "createby",
    "createdept",
    "createtime",
    "crequest",
    "customname",
    "deliveryperiod",
    "importnum",
    "inputby",
    "inspector",
    "offeror",
    "oldstate",
    "outstate",
    "printstyle",
    "remark",
    "shiptime",
    "signingdate",
    "state",
    "totalamount",
    "tradeterms"
})
public class Contracthisc {

    @XmlElement(name = "CHECK_BY")
    protected String checkby;
    @XmlElement(name = "CONTRACT_ID")
    protected String contractid;
    @XmlElement(name = "CONTRACT_NO")
    protected String contractno;
    @XmlElement(name = "CREATE_BY")
    protected String createby;
    @XmlElement(name = "CREATE_DEPT")
    protected String createdept;
    @XmlElement(name = "CREATE_TIME")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createtime;
    @XmlElement(name = "CREQUEST")
    protected String crequest;
    @XmlElement(name = "CUSTOM_NAME")
    protected String customname;
    @XmlElement(name = "DELIVERY_PERIOD")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryperiod;
    @XmlElement(name = "IMPORT_NUM")
    protected Short importnum;
    @XmlElement(name = "INPUT_BY")
    protected String inputby;
    @XmlElement(name = "INSPECTOR")
    protected String inspector;
    @XmlElement(name = "OFFEROR")
    protected String offeror;
    @XmlElement(name = "OLD_STATE")
    protected Short oldstate;
    @XmlElement(name = "OUT_STATE")
    protected Short outstate;
    @XmlElement(name = "PRINT_STYLE")
    protected String printstyle;
    @XmlElement(name = "REMARK")
    protected String remark;
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
    @XmlElement(name = "TRADE_TERMS")
    protected String tradeterms;

    /**
     * 获取checkby属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKBY() {
        return checkby;
    }

    /**
     * 设置checkby属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKBY(String value) {
        this.checkby = value;
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
     * 获取createby属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREATEBY() {
        return createby;
    }

    /**
     * 设置createby属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREATEBY(String value) {
        this.createby = value;
    }

    /**
     * 获取createdept属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREATEDEPT() {
        return createdept;
    }

    /**
     * 设置createdept属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREATEDEPT(String value) {
        this.createdept = value;
    }

    /**
     * 获取createtime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCREATETIME() {
        return createtime;
    }

    /**
     * 设置createtime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCREATETIME(XMLGregorianCalendar value) {
        this.createtime = value;
    }

    /**
     * 获取crequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREQUEST() {
        return crequest;
    }

    /**
     * 设置crequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREQUEST(String value) {
        this.crequest = value;
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
     * 获取importnum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIMPORTNUM() {
        return importnum;
    }

    /**
     * 设置importnum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIMPORTNUM(Short value) {
        this.importnum = value;
    }

    /**
     * 获取inputby属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINPUTBY() {
        return inputby;
    }

    /**
     * 设置inputby属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINPUTBY(String value) {
        this.inputby = value;
    }

    /**
     * 获取inspector属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPECTOR() {
        return inspector;
    }

    /**
     * 设置inspector属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSPECTOR(String value) {
        this.inspector = value;
    }

    /**
     * 获取offeror属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOFFEROR() {
        return offeror;
    }

    /**
     * 设置offeror属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOFFEROR(String value) {
        this.offeror = value;
    }

    /**
     * 获取oldstate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOLDSTATE() {
        return oldstate;
    }

    /**
     * 设置oldstate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOLDSTATE(Short value) {
        this.oldstate = value;
    }

    /**
     * 获取outstate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOUTSTATE() {
        return outstate;
    }

    /**
     * 设置outstate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOUTSTATE(Short value) {
        this.outstate = value;
    }

    /**
     * 获取printstyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINTSTYLE() {
        return printstyle;
    }

    /**
     * 设置printstyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINTSTYLE(String value) {
        this.printstyle = value;
    }

    /**
     * 获取remark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARK() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARK(String value) {
        this.remark = value;
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

    /**
     * 获取tradeterms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRADETERMS() {
        return tradeterms;
    }

    /**
     * 设置tradeterms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRADETERMS(String value) {
        this.tradeterms = value;
    }

}
