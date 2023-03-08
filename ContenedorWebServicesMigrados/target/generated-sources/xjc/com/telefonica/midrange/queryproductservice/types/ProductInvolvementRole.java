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
 * <p>Clase Java para productInvolvementRole complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productInvolvementRole"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="involvementRole" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_20"/&gt;
 *         &lt;element name="validFor" type="{http://midrange.telefonica.com/queryproductService/types}validFor" minOccurs="0"/&gt;
 *         &lt;element name="partyRole" type="{http://midrange.telefonica.com/queryproductService/types}partyRole" minOccurs="0"/&gt;
 *         &lt;element name="involvementIdentificationRole" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_24"/&gt;
 *         &lt;element name="customerAccount" type="{http://midrange.telefonica.com/queryproductService/types}customerAccount" minOccurs="0"/&gt;
 *         &lt;element name="resourceRole" type="{http://midrange.telefonica.com/queryproductService/types}stringLimit_24"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productInvolvementRole", propOrder = {
    "involvementRole",
    "validFor",
    "partyRole",
    "involvementIdentificationRole",
    "customerAccount",
    "resourceRole"
})
public class ProductInvolvementRole {

    @XmlElement(required = true, nillable = true)
    protected String involvementRole;
    protected ValidFor validFor;
    protected PartyRole partyRole;
    @XmlElement(required = true, nillable = true)
    protected String involvementIdentificationRole;
    protected CustomerAccount customerAccount;
    @XmlElement(required = true, nillable = true)
    protected String resourceRole;

    /**
     * Obtiene el valor de la propiedad involvementRole.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvolvementRole() {
        return involvementRole;
    }

    /**
     * Define el valor de la propiedad involvementRole.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvolvementRole(String value) {
        this.involvementRole = value;
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
     * Obtiene el valor de la propiedad partyRole.
     * 
     * @return
     *     possible object is
     *     {@link PartyRole }
     *     
     */
    public PartyRole getPartyRole() {
        return partyRole;
    }

    /**
     * Define el valor de la propiedad partyRole.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRole }
     *     
     */
    public void setPartyRole(PartyRole value) {
        this.partyRole = value;
    }

    /**
     * Obtiene el valor de la propiedad involvementIdentificationRole.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvolvementIdentificationRole() {
        return involvementIdentificationRole;
    }

    /**
     * Define el valor de la propiedad involvementIdentificationRole.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvolvementIdentificationRole(String value) {
        this.involvementIdentificationRole = value;
    }

    /**
     * Obtiene el valor de la propiedad customerAccount.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccount }
     *     
     */
    public CustomerAccount getCustomerAccount() {
        return customerAccount;
    }

    /**
     * Define el valor de la propiedad customerAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccount }
     *     
     */
    public void setCustomerAccount(CustomerAccount value) {
        this.customerAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad resourceRole.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceRole() {
        return resourceRole;
    }

    /**
     * Define el valor de la propiedad resourceRole.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceRole(String value) {
        this.resourceRole = value;
    }

}
