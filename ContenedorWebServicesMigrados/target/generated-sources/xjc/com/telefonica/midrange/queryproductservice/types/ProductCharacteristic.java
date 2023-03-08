//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.08 a las 12:48:28 AM CLST 
//


package com.telefonica.midrange.queryproductservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para productCharacteristic complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productCharacteristic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idPs" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_24"/&gt;
 *         &lt;element name="descPs" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_200"/&gt;
 *         &lt;element name="idFam" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_24"/&gt;
 *         &lt;element name="descFam" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_200"/&gt;
 *         &lt;element name="idSubg1" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_24"/&gt;
 *         &lt;element name="descSubg1" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_200"/&gt;
 *         &lt;element name="idSubg2" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_24"/&gt;
 *         &lt;element name="descSubg2" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_200"/&gt;
 *         &lt;element name="talla" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_24"/&gt;
 *         &lt;element name="validFor" type="{http://midrange.telefonica.com/queryproductService/types}validFor" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productCharacteristic", propOrder = {
    "idPs",
    "descPs",
    "idFam",
    "descFam",
    "idSubg1",
    "descSubg1",
    "idSubg2",
    "descSubg2",
    "talla",
    "validFor"
})
public class ProductCharacteristic {

    @XmlElement(required = true, nillable = true)
    protected String idPs;
    @XmlElement(required = true, nillable = true)
    protected String descPs;
    @XmlElement(required = true, nillable = true)
    protected String idFam;
    @XmlElement(required = true, nillable = true)
    protected String descFam;
    @XmlElement(required = true, nillable = true)
    protected String idSubg1;
    @XmlElement(required = true, nillable = true)
    protected String descSubg1;
    @XmlElement(required = true, nillable = true)
    protected String idSubg2;
    @XmlElement(required = true, nillable = true)
    protected String descSubg2;
    @XmlElement(required = true, nillable = true)
    protected String talla;
    protected ValidFor validFor;

    /**
     * Obtiene el valor de la propiedad idPs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPs() {
        return idPs;
    }

    /**
     * Define el valor de la propiedad idPs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPs(String value) {
        this.idPs = value;
    }

    /**
     * Obtiene el valor de la propiedad descPs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescPs() {
        return descPs;
    }

    /**
     * Define el valor de la propiedad descPs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescPs(String value) {
        this.descPs = value;
    }

    /**
     * Obtiene el valor de la propiedad idFam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFam() {
        return idFam;
    }

    /**
     * Define el valor de la propiedad idFam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFam(String value) {
        this.idFam = value;
    }

    /**
     * Obtiene el valor de la propiedad descFam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescFam() {
        return descFam;
    }

    /**
     * Define el valor de la propiedad descFam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescFam(String value) {
        this.descFam = value;
    }

    /**
     * Obtiene el valor de la propiedad idSubg1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSubg1() {
        return idSubg1;
    }

    /**
     * Define el valor de la propiedad idSubg1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSubg1(String value) {
        this.idSubg1 = value;
    }

    /**
     * Obtiene el valor de la propiedad descSubg1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescSubg1() {
        return descSubg1;
    }

    /**
     * Define el valor de la propiedad descSubg1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescSubg1(String value) {
        this.descSubg1 = value;
    }

    /**
     * Obtiene el valor de la propiedad idSubg2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSubg2() {
        return idSubg2;
    }

    /**
     * Define el valor de la propiedad idSubg2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSubg2(String value) {
        this.idSubg2 = value;
    }

    /**
     * Obtiene el valor de la propiedad descSubg2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescSubg2() {
        return descSubg2;
    }

    /**
     * Define el valor de la propiedad descSubg2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescSubg2(String value) {
        this.descSubg2 = value;
    }

    /**
     * Obtiene el valor de la propiedad talla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTalla() {
        return talla;
    }

    /**
     * Define el valor de la propiedad talla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTalla(String value) {
        this.talla = value;
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

}
