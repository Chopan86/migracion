//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.09 a las 03:51:20 PM CLST 
//


package com.telefonica.midrange.queryproductservice.types;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para customerFacingService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="customerFacingService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isServiceEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasStarted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="isMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="startMode" type="{http://midrange.telefonica.com/queryproductService/types}integerLimit_9"/&gt;
 *         &lt;element name="isStateful" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="commonName" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_30"/&gt;
 *         &lt;element name="description" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_100"/&gt;
 *         &lt;element name="objectID" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_24"/&gt;
 *         &lt;element name="cfsStatus" type="{http://midrange.telefonica.com/queryproductService/types}integerLimit_9"/&gt;
 *         &lt;element name="productCharacteristic" type="{http://midrange.telefonica.com/queryproductService/types}productCharacteristic" maxOccurs="15" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerFacingService", propOrder = {
    "isServiceEnabled",
    "hasStarted",
    "isMandatory",
    "startMode",
    "isStateful",
    "commonName",
    "description",
    "objectID",
    "cfsStatus",
    "productCharacteristic"
})
public class CustomerFacingService {

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isServiceEnabled;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean hasStarted;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isMandatory;
    @XmlElement(required = true, nillable = true)
    protected BigInteger startMode;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean isStateful;
    @XmlElement(required = true, nillable = true)
    protected String commonName;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(required = true, nillable = true)
    protected String objectID;
    @XmlElement(required = true, nillable = true)
    protected BigInteger cfsStatus;
    protected List<ProductCharacteristic> productCharacteristic;

    /**
     * Obtiene el valor de la propiedad isServiceEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsServiceEnabled() {
        return isServiceEnabled;
    }

    /**
     * Define el valor de la propiedad isServiceEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsServiceEnabled(Boolean value) {
        this.isServiceEnabled = value;
    }

    /**
     * Obtiene el valor de la propiedad hasStarted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasStarted() {
        return hasStarted;
    }

    /**
     * Define el valor de la propiedad hasStarted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasStarted(Boolean value) {
        this.hasStarted = value;
    }

    /**
     * Obtiene el valor de la propiedad isMandatory.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMandatory() {
        return isMandatory;
    }

    /**
     * Define el valor de la propiedad isMandatory.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMandatory(Boolean value) {
        this.isMandatory = value;
    }

    /**
     * Obtiene el valor de la propiedad startMode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartMode() {
        return startMode;
    }

    /**
     * Define el valor de la propiedad startMode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartMode(BigInteger value) {
        this.startMode = value;
    }

    /**
     * Obtiene el valor de la propiedad isStateful.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStateful() {
        return isStateful;
    }

    /**
     * Define el valor de la propiedad isStateful.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStateful(Boolean value) {
        this.isStateful = value;
    }

    /**
     * Obtiene el valor de la propiedad commonName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonName() {
        return commonName;
    }

    /**
     * Define el valor de la propiedad commonName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonName(String value) {
        this.commonName = value;
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
     * Obtiene el valor de la propiedad objectID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectID() {
        return objectID;
    }

    /**
     * Define el valor de la propiedad objectID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectID(String value) {
        this.objectID = value;
    }

    /**
     * Obtiene el valor de la propiedad cfsStatus.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCfsStatus() {
        return cfsStatus;
    }

    /**
     * Define el valor de la propiedad cfsStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCfsStatus(BigInteger value) {
        this.cfsStatus = value;
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

}
