//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.09 a las 03:51:20 PM CLST 
//


package com.request.accpspwi.accpspws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProgramInterface complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProgramInterface"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accpspwi_entrada" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="accpspwi_i_lineas" maxOccurs="50" minOccurs="50"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="accpspwi_i_area"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="accpspwi_i_num_com"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="8"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="accpspwi_i_ini_vi"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramInterface", propOrder = {
    "accpspwiEntrada"
})
public class ProgramInterface {

    @XmlElement(name = "accpspwi_entrada")
    protected ProgramInterface.AccpspwiEntrada accpspwiEntrada;

    /**
     * Obtiene el valor de la propiedad accpspwiEntrada.
     * 
     * @return
     *     possible object is
     *     {@link ProgramInterface.AccpspwiEntrada }
     *     
     */
    public ProgramInterface.AccpspwiEntrada getAccpspwiEntrada() {
        return accpspwiEntrada;
    }

    /**
     * Define el valor de la propiedad accpspwiEntrada.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramInterface.AccpspwiEntrada }
     *     
     */
    public void setAccpspwiEntrada(ProgramInterface.AccpspwiEntrada value) {
        this.accpspwiEntrada = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="accpspwi_i_lineas" maxOccurs="50" minOccurs="50"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="accpspwi_i_area"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="accpspwi_i_num_com"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="8"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="accpspwi_i_ini_vi"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="10"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accpspwiILineas"
    })
    public static class AccpspwiEntrada {

        @XmlElement(name = "accpspwi_i_lineas", required = true)
        protected List<ProgramInterface.AccpspwiEntrada.AccpspwiILineas> accpspwiILineas;

        /**
         * Gets the value of the accpspwiILineas property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accpspwiILineas property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccpspwiILineas().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProgramInterface.AccpspwiEntrada.AccpspwiILineas }
         * 
         * 
         */
        public List<ProgramInterface.AccpspwiEntrada.AccpspwiILineas> getAccpspwiILineas() {
            if (accpspwiILineas == null) {
                accpspwiILineas = new ArrayList<ProgramInterface.AccpspwiEntrada.AccpspwiILineas>();
            }
            return this.accpspwiILineas;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="accpspwi_i_area"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="accpspwi_i_num_com"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="8"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="accpspwi_i_ini_vi"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="10"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "accpspwiIArea",
            "accpspwiINumCom",
            "accpspwiIIniVi"
        })
        public static class AccpspwiILineas {

            @XmlElement(name = "accpspwi_i_area", required = true)
            protected String accpspwiIArea;
            @XmlElement(name = "accpspwi_i_num_com", required = true)
            protected String accpspwiINumCom;
            @XmlElement(name = "accpspwi_i_ini_vi", required = true)
            protected String accpspwiIIniVi;

            /**
             * Obtiene el valor de la propiedad accpspwiIArea.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccpspwiIArea() {
                return accpspwiIArea;
            }

            /**
             * Define el valor de la propiedad accpspwiIArea.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccpspwiIArea(String value) {
                this.accpspwiIArea = value;
            }

            /**
             * Obtiene el valor de la propiedad accpspwiINumCom.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccpspwiINumCom() {
                return accpspwiINumCom;
            }

            /**
             * Define el valor de la propiedad accpspwiINumCom.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccpspwiINumCom(String value) {
                this.accpspwiINumCom = value;
            }

            /**
             * Obtiene el valor de la propiedad accpspwiIIniVi.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccpspwiIIniVi() {
                return accpspwiIIniVi;
            }

            /**
             * Define el valor de la propiedad accpspwiIIniVi.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccpspwiIIniVi(String value) {
                this.accpspwiIIniVi = value;
            }

        }

    }

}
