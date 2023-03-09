//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.09 a las 03:51:20 PM CLST 
//


package com.telefonica.midrange.queryproductservice.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para productBundle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productBundle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idType" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_18"/&gt;
 *         &lt;element name="id" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_24"/&gt;
 *         &lt;element name="name" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_30"/&gt;
 *         &lt;element name="description" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_100"/&gt;
 *         &lt;element name="productStatus" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_16"/&gt;
 *         &lt;element name="productSerialNumber" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_24"/&gt;
 *         &lt;element name="validFor" type="{http://midrange.telefonica.com/queryproductService/types}validFor" minOccurs="0"/&gt;
 *         &lt;element name="productCapacity" type="{http://midrange.telefonica.com/queryproductService/types}productCapacity" minOccurs="0"/&gt;
 *         &lt;element name="productOffering" type="{http://midrange.telefonica.com/queryproductService/types}productOffering" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="productCharacteristic" type="{http://midrange.telefonica.com/queryproductService/types}productCharacteristic" maxOccurs="60" minOccurs="0"/&gt;
 *         &lt;element name="place" type="{http://midrange.telefonica.com/queryproductService/types}place" minOccurs="0"/&gt;
 *         &lt;element name="productInvolvementRole" type="{http://midrange.telefonica.com/queryproductService/types}productInvolvementRole" minOccurs="0"/&gt;
 *         &lt;element name="customerFacingService" type="{http://midrange.telefonica.com/queryproductService/types}customerFacingService" maxOccurs="30" minOccurs="0"/&gt;
 *         &lt;element name="productPrice" type="{http://midrange.telefonica.com/queryproductService/types}productPrice" minOccurs="0"/&gt;
 *         &lt;element name="productSpecification" type="{http://midrange.telefonica.com/queryproductService/types}productSpecification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productBundle", propOrder = {
    "idType",
    "id",
    "name",
    "description",
    "productStatus",
    "productSerialNumber",
    "validFor",
    "productCapacity",
    "productOffering",
    "productCharacteristic",
    "place",
    "productInvolvementRole",
    "customerFacingService",
    "productPrice",
    "productSpecification"
})
public class ProductBundle {

    @XmlElement(required = true, nillable = true)
    protected String idType;
    @XmlElement(required = true, nillable = true)
    protected String id;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(required = true, nillable = true)
    protected String productStatus;
    @XmlElement(required = true, nillable = true)
    protected String productSerialNumber;
    protected ValidFor validFor;
    protected ProductCapacity productCapacity;
    protected List<ProductOffering> productOffering;
    protected List<ProductCharacteristic> productCharacteristic;
    protected Place place;
    protected ProductInvolvementRole productInvolvementRole;
    protected List<CustomerFacingService> customerFacingService;
    protected ProductPrice productPrice;
    protected ProductSpecification productSpecification;

    /**
     * Obtiene el valor de la propiedad idType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Define el valor de la propiedad idType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdType(String value) {
        this.idType = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad productStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductStatus() {
        return productStatus;
    }

    /**
     * Define el valor de la propiedad productStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductStatus(String value) {
        this.productStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad productSerialNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSerialNumber() {
        return productSerialNumber;
    }

    /**
     * Define el valor de la propiedad productSerialNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSerialNumber(String value) {
        this.productSerialNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad validFor.
     * 
     * @return
     *     possible object is
     *     {@link ValidFor }
     *     
     */
    public ValidFor getValidFor() {
        return validFor;
    }

    /**
     * Define el valor de la propiedad validFor.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidFor }
     *     
     */
    public void setValidFor(ValidFor value) {
        this.validFor = value;
    }

    /**
     * Obtiene el valor de la propiedad productCapacity.
     * 
     * @return
     *     possible object is
     *     {@link ProductCapacity }
     *     
     */
    public ProductCapacity getProductCapacity() {
        return productCapacity;
    }

    /**
     * Define el valor de la propiedad productCapacity.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCapacity }
     *     
     */
    public void setProductCapacity(ProductCapacity value) {
        this.productCapacity = value;
    }

    /**
     * Gets the value of the productOffering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productOffering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductOffering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductOffering }
     * 
     * 
     */
    public List<ProductOffering> getProductOffering() {
        if (productOffering == null) {
            productOffering = new ArrayList<ProductOffering>();
        }
        return this.productOffering;
    }

    /**
     * Gets the value of the productCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCharacteristic }
     * 
     * 
     */
    public List<ProductCharacteristic> getProductCharacteristic() {
        if (productCharacteristic == null) {
            productCharacteristic = new ArrayList<ProductCharacteristic>();
        }
        return this.productCharacteristic;
    }

    /**
     * Obtiene el valor de la propiedad place.
     * 
     * @return
     *     possible object is
     *     {@link Place }
     *     
     */
    public Place getPlace() {
        return place;
    }

    /**
     * Define el valor de la propiedad place.
     * 
     * @param value
     *     allowed object is
     *     {@link Place }
     *     
     */
    public void setPlace(Place value) {
        this.place = value;
    }

    /**
     * Obtiene el valor de la propiedad productInvolvementRole.
     * 
     * @return
     *     possible object is
     *     {@link ProductInvolvementRole }
     *     
     */
    public ProductInvolvementRole getProductInvolvementRole() {
        return productInvolvementRole;
    }

    /**
     * Define el valor de la propiedad productInvolvementRole.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInvolvementRole }
     *     
     */
    public void setProductInvolvementRole(ProductInvolvementRole value) {
        this.productInvolvementRole = value;
    }

    /**
     * Gets the value of the customerFacingService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerFacingService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerFacingService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerFacingService }
     * 
     * 
     */
    public List<CustomerFacingService> getCustomerFacingService() {
        if (customerFacingService == null) {
            customerFacingService = new ArrayList<CustomerFacingService>();
        }
        return this.customerFacingService;
    }

    /**
     * Obtiene el valor de la propiedad productPrice.
     * 
     * @return
     *     possible object is
     *     {@link ProductPrice }
     *     
     */
    public ProductPrice getProductPrice() {
        return productPrice;
    }

    /**
     * Define el valor de la propiedad productPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPrice }
     *     
     */
    public void setProductPrice(ProductPrice value) {
        this.productPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad productSpecification.
     * 
     * @return
     *     possible object is
     *     {@link ProductSpecification }
     *     
     */
    public ProductSpecification getProductSpecification() {
        return productSpecification;
    }

    /**
     * Define el valor de la propiedad productSpecification.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSpecification }
     *     
     */
    public void setProductSpecification(ProductSpecification value) {
        this.productSpecification = value;
    }

}
