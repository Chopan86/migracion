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
 * <p>Clase Java para place complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="place"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_24"/&gt;
 *         &lt;element name="validFor" type="{http://midrange.telefonica.com/queryproductService/types}validFor" minOccurs="0"/&gt;
 *         &lt;element name="localAddress" type="{http://midrange.telefonica.com/queryproductService/types}localAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "place", propOrder = {
    "id",
    "validFor",
    "localAddress"
})
public class Place {

    @XmlElement(required = true, nillable = true)
    protected String id;
    protected ValidFor validFor;
    protected LocalAddress localAddress;

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
     * Obtiene el valor de la propiedad localAddress.
     * 
     * @return
     *     possible object is
     *     {@link LocalAddress }
     *     
     */
    public LocalAddress getLocalAddress() {
        return localAddress;
    }

    /**
     * Define el valor de la propiedad localAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalAddress }
     *     
     */
    public void setLocalAddress(LocalAddress value) {
        this.localAddress = value;
    }

}
