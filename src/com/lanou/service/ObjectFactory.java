
package com.lanou.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lanou.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SayHi_QNAME = new QName("http://service.lanou.com/", "sayHi");
    private final static QName _SayHiResponse_QNAME = new QName("http://service.lanou.com/", "sayHiResponse");
    private final static QName _SelectAll_QNAME = new QName("http://service.lanou.com/", "selectAll");
    private final static QName _SelectAllResponse_QNAME = new QName("http://service.lanou.com/", "selectAllResponse");
    private final static QName _SelectByFactoryName_QNAME = new QName("http://service.lanou.com/", "selectByFactoryName");
    private final static QName _SelectByFactoryNameResponse_QNAME = new QName("http://service.lanou.com/", "selectByFactoryNameResponse");
    private final static QName _SelectByMax_QNAME = new QName("http://service.lanou.com/", "selectByMax");
    private final static QName _SelectByMaxResponse_QNAME = new QName("http://service.lanou.com/", "selectByMaxResponse");
    private final static QName _SelectByPrimaryKey_QNAME = new QName("http://service.lanou.com/", "selectByPrimaryKey");
    private final static QName _SelectByPrimaryKeyResponse_QNAME = new QName("http://service.lanou.com/", "selectByPrimaryKeyResponse");
    private final static QName _SelectByTime_QNAME = new QName("http://service.lanou.com/", "selectByTime");
    private final static QName _SelectByTimeResponse_QNAME = new QName("http://service.lanou.com/", "selectByTimeResponse");
    private final static QName _SelectByYear_QNAME = new QName("http://service.lanou.com/", "selectByYear");
    private final static QName _SelectByYearResponse_QNAME = new QName("http://service.lanou.com/", "selectByYearResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lanou.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHi }
     * 
     */
    public SayHi createSayHi() {
        return new SayHi();
    }

    /**
     * Create an instance of {@link SayHiResponse }
     * 
     */
    public SayHiResponse createSayHiResponse() {
        return new SayHiResponse();
    }

    /**
     * Create an instance of {@link SelectAll }
     * 
     */
    public SelectAll createSelectAll() {
        return new SelectAll();
    }

    /**
     * Create an instance of {@link SelectAllResponse }
     * 
     */
    public SelectAllResponse createSelectAllResponse() {
        return new SelectAllResponse();
    }

    /**
     * Create an instance of {@link SelectByFactoryName }
     * 
     */
    public SelectByFactoryName createSelectByFactoryName() {
        return new SelectByFactoryName();
    }

    /**
     * Create an instance of {@link SelectByFactoryNameResponse }
     * 
     */
    public SelectByFactoryNameResponse createSelectByFactoryNameResponse() {
        return new SelectByFactoryNameResponse();
    }

    /**
     * Create an instance of {@link SelectByMax }
     * 
     */
    public SelectByMax createSelectByMax() {
        return new SelectByMax();
    }

    /**
     * Create an instance of {@link SelectByMaxResponse }
     * 
     */
    public SelectByMaxResponse createSelectByMaxResponse() {
        return new SelectByMaxResponse();
    }

    /**
     * Create an instance of {@link SelectByPrimaryKey }
     * 
     */
    public SelectByPrimaryKey createSelectByPrimaryKey() {
        return new SelectByPrimaryKey();
    }

    /**
     * Create an instance of {@link SelectByPrimaryKeyResponse }
     * 
     */
    public SelectByPrimaryKeyResponse createSelectByPrimaryKeyResponse() {
        return new SelectByPrimaryKeyResponse();
    }

    /**
     * Create an instance of {@link SelectByTime }
     * 
     */
    public SelectByTime createSelectByTime() {
        return new SelectByTime();
    }

    /**
     * Create an instance of {@link SelectByTimeResponse }
     * 
     */
    public SelectByTimeResponse createSelectByTimeResponse() {
        return new SelectByTimeResponse();
    }

    /**
     * Create an instance of {@link SelectByYear }
     * 
     */
    public SelectByYear createSelectByYear() {
        return new SelectByYear();
    }

    /**
     * Create an instance of {@link SelectByYearResponse }
     * 
     */
    public SelectByYearResponse createSelectByYearResponse() {
        return new SelectByYearResponse();
    }

    /**
     * Create an instance of {@link Contracthisc }
     * 
     */
    public Contracthisc createContracthisc() {
        return new Contracthisc();
    }

    /**
     * Create an instance of {@link ContractBean }
     * 
     */
    public ContractBean createContractBean() {
        return new ContractBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lanou.com/", name = "sayHi")
    public JAXBElement<SayHi> createSayHi(SayHi value) {
        return new JAXBElement<SayHi>(_SayHi_QNAME, SayHi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lanou.com/", name = "sayHiResponse")
    public JAXBElement<SayHiResponse> createSayHiResponse(SayHiResponse value) {
        return new JAXBElement<SayHiResponse>(_SayHiResponse_QNAME, SayHiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lanou.com/", name = "selectAll")
    public JAXBElement<SelectAll> createSelectAll(SelectAll value) {
        return new JAXBElement<SelectAll>(_SelectAll_QNAME, SelectAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lanou.com/", name = "selectAllResponse")
    public JAXBElement<SelectAllResponse> createSelectAllResponse(SelectAllResponse value) {
        return new JAXBElement<SelectAllResponse>(_SelectAllResponse_QNAME, SelectAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByFactoryName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lanou.com/", name = "selectByFactoryName")
    public JAXBElement<SelectByFactoryName> createSelectByFactoryName(SelectByFactoryName value) {
        return new JAXBElement<SelectByFactoryName>(_SelectByFactoryName_QNAME, SelectByFactoryName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByFactoryNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lanou.com/", name = "selectByFactoryNameResponse")
    public JAXBElement<SelectByFactoryNameResponse> createSelectByFactoryNameResponse(SelectByFactoryNameResponse value) {
        return new JAXBElement<SelectByFactoryNameResponse>(_SelectByFactoryNameResponse_QNAME, SelectByFactoryNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByMax }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lanou.com/", name = "selectByMax")
    public JAXBElement<SelectByMax> createSelectByMax(SelectByMax value) {
        return new JAXBElement<SelectByMax>(_SelectByMax_QNAME, SelectByMax.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByMaxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lanou.com/", name = "selectByMaxResponse")
    public JAXBElement<SelectByMaxResponse> createSelectByMaxResponse(SelectByMaxResponse value) {
        return new JAXBElement<SelectByMaxResponse>(_SelectByMaxResponse_QNAME, SelectByMaxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByPrimaryKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lanou.com/", name = "selectByPrimaryKey")
    public JAXBElement<SelectByPrimaryKey> createSelectByPrimaryKey(SelectByPrimaryKey value) {
        return new JAXBElement<SelectByPrimaryKey>(_SelectByPrimaryKey_QNAME, SelectByPrimaryKey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByPrimaryKeyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lanou.com/", name = "selectByPrimaryKeyResponse")
    public JAXBElement<SelectByPrimaryKeyResponse> createSelectByPrimaryKeyResponse(SelectByPrimaryKeyResponse value) {
        return new JAXBElement<SelectByPrimaryKeyResponse>(_SelectByPrimaryKeyResponse_QNAME, SelectByPrimaryKeyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lanou.com/", name = "selectByTime")
    public JAXBElement<SelectByTime> createSelectByTime(SelectByTime value) {
        return new JAXBElement<SelectByTime>(_SelectByTime_QNAME, SelectByTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByTimeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lanou.com/", name = "selectByTimeResponse")
    public JAXBElement<SelectByTimeResponse> createSelectByTimeResponse(SelectByTimeResponse value) {
        return new JAXBElement<SelectByTimeResponse>(_SelectByTimeResponse_QNAME, SelectByTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lanou.com/", name = "selectByYear")
    public JAXBElement<SelectByYear> createSelectByYear(SelectByYear value) {
        return new JAXBElement<SelectByYear>(_SelectByYear_QNAME, SelectByYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByYearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.lanou.com/", name = "selectByYearResponse")
    public JAXBElement<SelectByYearResponse> createSelectByYearResponse(SelectByYearResponse value) {
        return new JAXBElement<SelectByYearResponse>(_SelectByYearResponse_QNAME, SelectByYearResponse.class, null, value);
    }

}
