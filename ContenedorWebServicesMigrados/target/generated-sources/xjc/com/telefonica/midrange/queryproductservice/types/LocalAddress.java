//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.07 a las 04:06:18 PM CLST 
//


package com.telefonica.midrange.queryproductservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para localAddress complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="localAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_18"/&gt;
 *         &lt;element name="positionNr" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_30"/&gt;
 *         &lt;element name="fullAdress" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_200"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "localAddress", propOrder = {
    "type",
    "positionNr",
    "fullAdress"
})
public class LocalAddress {

    @XmlElement(required = true, nillable = true)
    protected String type;
    @XmlElement(required = true, nillable = true)
    protected String positionNr;
    @XmlElement(required = true, nillable = true)
    protected String fullAdress;

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad positionNr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionNr() {
        return positionNr;
    }

    /**
     * Define el valor de la propiedad positionNr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionNr(String value) {
        this.positionNr = value;
    }

    /**
     * Obtiene el valor de la propiedad fullAdress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullAdress() {
        return fullAdress;
    }

    /**
     * Define el valor de la propiedad fullAdress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullAdress(String value) {
        this.fullAdress = value;
    }

}
