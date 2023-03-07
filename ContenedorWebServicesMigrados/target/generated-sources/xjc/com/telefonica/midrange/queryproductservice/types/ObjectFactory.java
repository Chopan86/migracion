//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.07 a las 04:06:18 PM CLST 
//


package com.telefonica.midrange.queryproductservice.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.telefonica.midrange.queryproductservice.types package. 
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

    private final static QName _ConsultaQueryProductMsgRequest_QNAME = new QName("http://midrange.telefonica.com/queryproductService/types", "consultaQueryProductMsgRequest");
    private final static QName _ConsultaQueryProductMsgResponse_QNAME = new QName("http://midrange.telefonica.com/queryproductService/types", "consultaQueryProductMsgResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.telefonica.midrange.queryproductservice.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryproductRequest }
     * 
     */
    public QueryproductRequest createQueryproductRequest() {
        return new QueryproductRequest();
    }

    /**
     * Create an instance of {@link QueryproductResponse }
     * 
     */
    public QueryproductResponse createQueryproductResponse() {
        return new QueryproductResponse();
    }

    /**
     * Create an instance of {@link ResponseMsj }
     * 
     */
    public ResponseMsj createResponseMsj() {
        return new ResponseMsj();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link ProductBundle }
     * 
     */
    public ProductBundle createProductBundle() {
        return new ProductBundle();
    }

    /**
     * Create an instance of {@link ValidFor }
     * 
     */
    public ValidFor createValidFor() {
        return new ValidFor();
    }

    /**
     * Create an instance of {@link ProductCapacity }
     * 
     */
    public ProductCapacity createProductCapacity() {
        return new ProductCapacity();
    }

    /**
     * Create an instance of {@link ProductOffering }
     * 
     */
    public ProductOffering createProductOffering() {
        return new ProductOffering();
    }

    /**
     * Create an instance of {@link ProductCharacteristic }
     * 
     */
    public ProductCharacteristic createProductCharacteristic() {
        return new ProductCharacteristic();
    }

    /**
     * Create an instance of {@link Place }
     * 
     */
    public Place createPlace() {
        return new Place();
    }

    /**
     * Create an instance of {@link LocalAddress }
     * 
     */
    public LocalAddress createLocalAddress() {
        return new LocalAddress();
    }

    /**
     * Create an instance of {@link ProductInvolvementRole }
     * 
     */
    public ProductInvolvementRole createProductInvolvementRole() {
        return new ProductInvolvementRole();
    }

    /**
     * Create an instance of {@link PartyRole }
     * 
     */
    public PartyRole createPartyRole() {
        return new PartyRole();
    }

    /**
     * Create an instance of {@link CustomerAccount }
     * 
     */
    public CustomerAccount createCustomerAccount() {
        return new CustomerAccount();
    }

    /**
     * Create an instance of {@link CustomerFacingService }
     * 
     */
    public CustomerFacingService createCustomerFacingService() {
        return new CustomerFacingService();
    }

    /**
     * Create an instance of {@link ProductPrice }
     * 
     */
    public ProductPrice createProductPrice() {
        return new ProductPrice();
    }

    /**
     * Create an instance of {@link ProductSpecification }
     * 
     */
    public ProductSpecification createProductSpecification() {
        return new ProductSpecification();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryproductRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://midrange.telefonica.com/queryproductService/types", name = "consultaQueryProductMsgRequest")
    public JAXBElement<QueryproductRequest> createConsultaQueryProductMsgRequest(QueryproductRequest value) {
        return new JAXBElement<QueryproductRequest>(_ConsultaQueryProductMsgRequest_QNAME, QueryproductRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryproductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://midrange.telefonica.com/queryproductService/types", name = "consultaQueryProductMsgResponse")
    public JAXBElement<QueryproductResponse> createConsultaQueryProductMsgResponse(QueryproductResponse value) {
        return new JAXBElement<QueryproductResponse>(_ConsultaQueryProductMsgResponse_QNAME, QueryproductResponse.class, null, value);
    }

}
