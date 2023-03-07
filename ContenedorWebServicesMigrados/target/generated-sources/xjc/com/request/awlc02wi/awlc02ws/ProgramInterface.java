//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.07 a las 04:06:18 PM CLST 
//


package com.request.awlc02wi.awlc02ws;

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
 *         &lt;element name="awlc02wi_entrada" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="awlc02wi_i_area"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wi_i_num_com"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wi_i_rut"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wi_i_dv"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wi_i_criterio"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wi_i_sec_linea"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
 *                         &lt;maxInclusive value="999999999999"/&gt;
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
@XmlType(name = "ProgramInterface", propOrder = {
    "awlc02WiEntrada"
})
public class ProgramInterface {

    @XmlElement(name = "awlc02wi_entrada")
    protected ProgramInterface.Awlc02WiEntrada awlc02WiEntrada;

    /**
     * Obtiene el valor de la propiedad awlc02WiEntrada.
     * 
     * @return
     *     possible object is
     *     {@link ProgramInterface.Awlc02WiEntrada }
     *     
     */
    public ProgramInterface.Awlc02WiEntrada getAwlc02WiEntrada() {
        return awlc02WiEntrada;
    }

    /**
     * Define el valor de la propiedad awlc02WiEntrada.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramInterface.Awlc02WiEntrada }
     *     
     */
    public void setAwlc02WiEntrada(ProgramInterface.Awlc02WiEntrada value) {
        this.awlc02WiEntrada = value;
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
     *         &lt;element name="awlc02wi_i_area"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="3"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wi_i_num_com"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="8"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wi_i_rut"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="12"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wi_i_dv"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wi_i_criterio"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wi_i_sec_linea"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
     *               &lt;maxInclusive value="999999999999"/&gt;
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
        "awlc02WiIArea",
        "awlc02WiINumCom",
        "awlc02WiIRut",
        "awlc02WiIDv",
        "awlc02WiICriterio",
        "awlc02WiISecLinea"
    })
    public static class Awlc02WiEntrada {

        @XmlElement(name = "awlc02wi_i_area", required = true)
        protected String awlc02WiIArea;
        @XmlElement(name = "awlc02wi_i_num_com", required = true)
        protected String awlc02WiINumCom;
        @XmlElement(name = "awlc02wi_i_rut", required = true)
        protected String awlc02WiIRut;
        @XmlElement(name = "awlc02wi_i_dv", required = true)
        protected String awlc02WiIDv;
        @XmlElement(name = "awlc02wi_i_criterio", required = true)
        protected String awlc02WiICriterio;
        @XmlElement(name = "awlc02wi_i_sec_linea")
        protected long awlc02WiISecLinea;

        /**
         * Obtiene el valor de la propiedad awlc02WiIArea.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WiIArea() {
            return awlc02WiIArea;
        }

        /**
         * Define el valor de la propiedad awlc02WiIArea.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WiIArea(String value) {
            this.awlc02WiIArea = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WiINumCom.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WiINumCom() {
            return awlc02WiINumCom;
        }

        /**
         * Define el valor de la propiedad awlc02WiINumCom.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WiINumCom(String value) {
            this.awlc02WiINumCom = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WiIRut.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WiIRut() {
            return awlc02WiIRut;
        }

        /**
         * Define el valor de la propiedad awlc02WiIRut.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WiIRut(String value) {
            this.awlc02WiIRut = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WiIDv.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WiIDv() {
            return awlc02WiIDv;
        }

        /**
         * Define el valor de la propiedad awlc02WiIDv.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WiIDv(String value) {
            this.awlc02WiIDv = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WiICriterio.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WiICriterio() {
            return awlc02WiICriterio;
        }

        /**
         * Define el valor de la propiedad awlc02WiICriterio.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WiICriterio(String value) {
            this.awlc02WiICriterio = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WiISecLinea.
         * 
         */
        public long getAwlc02WiISecLinea() {
            return awlc02WiISecLinea;
        }

        /**
         * Define el valor de la propiedad awlc02WiISecLinea.
         * 
         */
        public void setAwlc02WiISecLinea(long value) {
            this.awlc02WiISecLinea = value;
        }

    }

}
