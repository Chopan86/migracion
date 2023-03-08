//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.08 a las 12:48:28 AM CLST 
//


package com.response.accpspwi.accpspws;

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
 *         &lt;element name="accpspwo_salida" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="accpspwo_o_cod_error"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                         &lt;maxInclusive value="999999999"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="accpspwo_o_desc_error"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="100"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="accpspwo_o_programa"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="accpspwo_o_cod_db"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                         &lt;maxInclusive value="999999999"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="accpspwo_o_lineas" maxOccurs="50" minOccurs="50"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="accpspwo_o_area"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="accpspwo_o_fono"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="8"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="accpspwo_ps_lineas" maxOccurs="3" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="accpspwo_o_ps"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                                             &lt;maxInclusive value="999999999"/&gt;
 *                                             &lt;minInclusive value="0"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="accpspwo_o_desc"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="30"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="accpspwo_o_cod_fam"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="5"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="accpspwo_o_subgr2"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                                             &lt;maxInclusive value="99999"/&gt;
 *                                             &lt;minInclusive value="0"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
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
    "accpspwoSalida"
})
public class ProgramInterface {

    @XmlElement(name = "accpspwo_salida")
    protected ProgramInterface.AccpspwoSalida accpspwoSalida;

    /**
     * Obtiene el valor de la propiedad accpspwoSalida.
     * 
     * @return
     *     possible object is
     *     {@link ProgramInterface.AccpspwoSalida }
     *     
     */
    public ProgramInterface.AccpspwoSalida getAccpspwoSalida() {
        return accpspwoSalida;
    }

    /**
     * Define el valor de la propiedad accpspwoSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramInterface.AccpspwoSalida }
     *     
     */
    public void setAccpspwoSalida(ProgramInterface.AccpspwoSalida value) {
        this.accpspwoSalida = value;
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
     *         &lt;element name="accpspwo_o_cod_error"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *               &lt;maxInclusive value="999999999"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="accpspwo_o_desc_error"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="100"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="accpspwo_o_programa"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="8"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="accpspwo_o_cod_db"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *               &lt;maxInclusive value="999999999"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="accpspwo_o_lineas" maxOccurs="50" minOccurs="50"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="accpspwo_o_area"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="accpspwo_o_fono"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="8"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="accpspwo_ps_lineas" maxOccurs="3" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="accpspwo_o_ps"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *                                   &lt;maxInclusive value="999999999"/&gt;
     *                                   &lt;minInclusive value="0"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="accpspwo_o_desc"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="30"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="accpspwo_o_cod_fam"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="5"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="accpspwo_o_subgr2"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *                                   &lt;maxInclusive value="99999"/&gt;
     *                                   &lt;minInclusive value="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "accpspwoOCodError",
        "accpspwoODescError",
        "accpspwoOPrograma",
        "accpspwoOCodDb",
        "accpspwoOLineas"
    })
    public static class AccpspwoSalida {

        @XmlElement(name = "accpspwo_o_cod_error", required = true, type = Long.class, nillable = true)
        protected Long accpspwoOCodError;
        @XmlElement(name = "accpspwo_o_desc_error", required = true, nillable = true)
        protected String accpspwoODescError;
        @XmlElement(name = "accpspwo_o_programa", required = true, nillable = true)
        protected String accpspwoOPrograma;
        @XmlElement(name = "accpspwo_o_cod_db", required = true, type = Long.class, nillable = true)
        protected Long accpspwoOCodDb;
        @XmlElement(name = "accpspwo_o_lineas", required = true)
        protected List<ProgramInterface.AccpspwoSalida.AccpspwoOLineas> accpspwoOLineas;

        /**
         * Obtiene el valor de la propiedad accpspwoOCodError.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAccpspwoOCodError() {
            return accpspwoOCodError;
        }

        /**
         * Define el valor de la propiedad accpspwoOCodError.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAccpspwoOCodError(Long value) {
            this.accpspwoOCodError = value;
        }

        /**
         * Obtiene el valor de la propiedad accpspwoODescError.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccpspwoODescError() {
            return accpspwoODescError;
        }

        /**
         * Define el valor de la propiedad accpspwoODescError.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccpspwoODescError(String value) {
            this.accpspwoODescError = value;
        }

        /**
         * Obtiene el valor de la propiedad accpspwoOPrograma.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccpspwoOPrograma() {
            return accpspwoOPrograma;
        }

        /**
         * Define el valor de la propiedad accpspwoOPrograma.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccpspwoOPrograma(String value) {
            this.accpspwoOPrograma = value;
        }

        /**
         * Obtiene el valor de la propiedad accpspwoOCodDb.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAccpspwoOCodDb() {
            return accpspwoOCodDb;
        }

        /**
         * Define el valor de la propiedad accpspwoOCodDb.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAccpspwoOCodDb(Long value) {
            this.accpspwoOCodDb = value;
        }

        /**
         * Gets the value of the accpspwoOLineas property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accpspwoOLineas property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccpspwoOLineas().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProgramInterface.AccpspwoSalida.AccpspwoOLineas }
         * 
         * 
         */
        public List<ProgramInterface.AccpspwoSalida.AccpspwoOLineas> getAccpspwoOLineas() {
            if (accpspwoOLineas == null) {
                accpspwoOLineas = new ArrayList<ProgramInterface.AccpspwoSalida.AccpspwoOLineas>();
            }
            return this.accpspwoOLineas;
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
         *         &lt;element name="accpspwo_o_area"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="accpspwo_o_fono"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="8"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="accpspwo_ps_lineas" maxOccurs="3" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="accpspwo_o_ps"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
         *                         &lt;maxInclusive value="999999999"/&gt;
         *                         &lt;minInclusive value="0"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="accpspwo_o_desc"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="30"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="accpspwo_o_cod_fam"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="5"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="accpspwo_o_subgr2"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
         *                         &lt;maxInclusive value="99999"/&gt;
         *                         &lt;minInclusive value="0"/&gt;
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
            "accpspwoOArea",
            "accpspwoOFono",
            "accpspwoPsLineas"
        })
        public static class AccpspwoOLineas {

            @XmlElement(name = "accpspwo_o_area", required = true, nillable = true)
            protected String accpspwoOArea;
            @XmlElement(name = "accpspwo_o_fono", required = true, nillable = true)
            protected String accpspwoOFono;
            @XmlElement(name = "accpspwo_ps_lineas")
            protected List<ProgramInterface.AccpspwoSalida.AccpspwoOLineas.AccpspwoPsLineas> accpspwoPsLineas;

            /**
             * Obtiene el valor de la propiedad accpspwoOArea.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccpspwoOArea() {
                return accpspwoOArea;
            }

            /**
             * Define el valor de la propiedad accpspwoOArea.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccpspwoOArea(String value) {
                this.accpspwoOArea = value;
            }

            /**
             * Obtiene el valor de la propiedad accpspwoOFono.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccpspwoOFono() {
                return accpspwoOFono;
            }

            /**
             * Define el valor de la propiedad accpspwoOFono.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccpspwoOFono(String value) {
                this.accpspwoOFono = value;
            }

            /**
             * Gets the value of the accpspwoPsLineas property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the accpspwoPsLineas property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAccpspwoPsLineas().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ProgramInterface.AccpspwoSalida.AccpspwoOLineas.AccpspwoPsLineas }
             * 
             * 
             */
            public List<ProgramInterface.AccpspwoSalida.AccpspwoOLineas.AccpspwoPsLineas> getAccpspwoPsLineas() {
                if (accpspwoPsLineas == null) {
                    accpspwoPsLineas = new ArrayList<ProgramInterface.AccpspwoSalida.AccpspwoOLineas.AccpspwoPsLineas>();
                }
                return this.accpspwoPsLineas;
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
             *         &lt;element name="accpspwo_o_ps"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
             *               &lt;maxInclusive value="999999999"/&gt;
             *               &lt;minInclusive value="0"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="accpspwo_o_desc"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="30"/&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="accpspwo_o_cod_fam"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="5"/&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="accpspwo_o_subgr2"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
             *               &lt;maxInclusive value="99999"/&gt;
             *               &lt;minInclusive value="0"/&gt;
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
                "accpspwoOPs",
                "accpspwoODesc",
                "accpspwoOCodFam",
                "accpspwoOSubgr2"
            })
            public static class AccpspwoPsLineas {

                @XmlElement(name = "accpspwo_o_ps", required = true, type = Long.class, nillable = true)
                protected Long accpspwoOPs;
                @XmlElement(name = "accpspwo_o_desc", required = true, nillable = true)
                protected String accpspwoODesc;
                @XmlElement(name = "accpspwo_o_cod_fam", required = true, nillable = true)
                protected String accpspwoOCodFam;
                @XmlElement(name = "accpspwo_o_subgr2", required = true, type = Long.class, nillable = true)
                protected Long accpspwoOSubgr2;

                /**
                 * Obtiene el valor de la propiedad accpspwoOPs.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                public Long getAccpspwoOPs() {
                    return accpspwoOPs;
                }

                /**
                 * Define el valor de la propiedad accpspwoOPs.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                public void setAccpspwoOPs(Long value) {
                    this.accpspwoOPs = value;
                }

                /**
                 * Obtiene el valor de la propiedad accpspwoODesc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccpspwoODesc() {
                    return accpspwoODesc;
                }

                /**
                 * Define el valor de la propiedad accpspwoODesc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccpspwoODesc(String value) {
                    this.accpspwoODesc = value;
                }

                /**
                 * Obtiene el valor de la propiedad accpspwoOCodFam.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccpspwoOCodFam() {
                    return accpspwoOCodFam;
                }

                /**
                 * Define el valor de la propiedad accpspwoOCodFam.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccpspwoOCodFam(String value) {
                    this.accpspwoOCodFam = value;
                }

                /**
                 * Obtiene el valor de la propiedad accpspwoOSubgr2.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                public Long getAccpspwoOSubgr2() {
                    return accpspwoOSubgr2;
                }

                /**
                 * Define el valor de la propiedad accpspwoOSubgr2.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                public void setAccpspwoOSubgr2(Long value) {
                    this.accpspwoOSubgr2 = value;
                }

            }

        }

    }

}
