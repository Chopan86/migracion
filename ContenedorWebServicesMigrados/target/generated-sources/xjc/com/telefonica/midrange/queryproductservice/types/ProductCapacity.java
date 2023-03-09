//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.09 a las 03:51:20 PM CLST 
//


package com.telefonica.midrange.queryproductservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para productCapacity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productCapacity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="plannedOrActualCapacity" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_12"/&gt;
 *         &lt;element name="capacityAmount" type="{http://midrange.telefonica.com/queryproductService/types}longLimit_18"/&gt;
 *         &lt;element name="capacityAmountFrom" type="{http://midrange.telefonica.com/queryproductService/types}longLimit_18"/&gt;
 *         &lt;element name="capacityAmountTo" type="{http://midrange.telefonica.com/queryproductService/types}longLimit_18"/&gt;
 *         &lt;element name="rangeInterval" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_12"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productCapacity", propOrder = {
    "plannedOrActualCapacity",
    "capacityAmount",
    "capacityAmountFrom",
    "capacityAmountTo",
    "rangeInterval"
})
public class ProductCapacity {

    @XmlElement(required = true, nillable = true)
    protected String plannedOrActualCapacity;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long capacityAmount;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long capacityAmountFrom;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long capacityAmountTo;
    @XmlElement(required = true, nillable = true)
    protected String rangeInterval;

    /**
     * Obtiene el valor de la propiedad plannedOrActualCapacity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlannedOrActualCapacity() {
        return plannedOrActualCapacity;
    }

    /**
     * Define el valor de la propiedad plannedOrActualCapacity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlannedOrActualCapacity(String value) {
        this.plannedOrActualCapacity = value;
    }

    /**
     * Obtiene el valor de la propiedad capacityAmount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCapacityAmount() {
        return capacityAmount;
    }

    /**
     * Define el valor de la propiedad capacityAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCapacityAmount(Long value) {
        this.capacityAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad capacityAmountFrom.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCapacityAmountFrom() {
        return capacityAmountFrom;
    }

    /**
     * Define el valor de la propiedad capacityAmountFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCapacityAmountFrom(Long value) {
        this.capacityAmountFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad capacityAmountTo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCapacityAmountTo() {
        return capacityAmountTo;
    }

    /**
     * Define el valor de la propiedad capacityAmountTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCapacityAmountTo(Long value) {
        this.capacityAmountTo = value;
    }

    /**
     * Obtiene el valor de la propiedad rangeInterval.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangeInterval() {
        return rangeInterval;
    }

    /**
     * Define el valor de la propiedad rangeInterval.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangeInterval(String value) {
        this.rangeInterval = value;
    }

}
