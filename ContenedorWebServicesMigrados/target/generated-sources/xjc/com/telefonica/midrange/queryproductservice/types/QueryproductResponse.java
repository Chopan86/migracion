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
 * <p>Clase Java para queryproductResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="queryproductResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseMsj" type="{http://midrange.telefonica.com/queryproductService/types}ResponseMsj" minOccurs="0"/&gt;
 *         &lt;element name="ResponseData" type="{http://midrange.telefonica.com/queryproductService/types}product" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryproductResponse", propOrder = {
    "responseMsj",
    "responseData"
})
public class QueryproductResponse {

    @XmlElement(name = "ResponseMsj")
    protected ResponseMsj responseMsj;
    @XmlElement(name = "ResponseData")
    protected List<Product> responseData;

    /**
     * Obtiene el valor de la propiedad responseMsj.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMsj }
     *     
     */
    public ResponseMsj getResponseMsj() {
        return responseMsj;
    }

    /**
     * Define el valor de la propiedad responseMsj.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMsj }
     *     
     */
    public void setResponseMsj(ResponseMsj value) {
        this.responseMsj = value;
    }

    /**
     * Gets the value of the responseData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product }
     * 
     * 
     */
    public List<Product> getResponseData() {
        if (responseData == null) {
            responseData = new ArrayList<Product>();
        }
        return this.responseData;
    }

}
