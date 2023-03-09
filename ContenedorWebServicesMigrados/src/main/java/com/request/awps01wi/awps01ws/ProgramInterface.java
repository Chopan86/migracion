//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.09 a las 02:24:26 PM CLST 
//


package com.request.awps01wi.awps01ws;

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
 *         &lt;element name="awps01co_entrada"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="awps01co_i_area"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awps01co_i_num_com"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awps01co_i_cod_ps"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                         &lt;maxInclusive value="999999999"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awps01co_i_fec_ini_li"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="filler1"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="28327"/&gt;
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
@XmlType(name = "ProgramInterface", propOrder = {
    "awps01CoEntrada"
})
public class ProgramInterface {

    @XmlElement(name = "awps01co_entrada", required = true)
    protected ProgramInterface.Awps01CoEntrada awps01CoEntrada;

    /**
     * Obtiene el valor de la propiedad awps01CoEntrada.
     * 
     * @return
     *     possible object is
     *     {@link ProgramInterface.Awps01CoEntrada }
     *     
     */
    public ProgramInterface.Awps01CoEntrada getAwps01CoEntrada() {
        return awps01CoEntrada;
    }

    /**
     * Define el valor de la propiedad awps01CoEntrada.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramInterface.Awps01CoEntrada }
     *     
     */
    public void setAwps01CoEntrada(ProgramInterface.Awps01CoEntrada value) {
        this.awps01CoEntrada = value;
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
     *         &lt;element name="awps01co_i_area"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="3"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awps01co_i_num_com"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="8"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awps01co_i_cod_ps"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *               &lt;maxInclusive value="999999999"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awps01co_i_fec_ini_li"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="10"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="filler1"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="28327"/&gt;
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
        "awps01CoIArea",
        "awps01CoINumCom",
        "awps01CoICodPs",
        "awps01CoIFecIniLi",
        "filler1"
    })
    public static class Awps01CoEntrada {

        @XmlElement(name = "awps01co_i_area", required = true)
        protected String awps01CoIArea;
        @XmlElement(name = "awps01co_i_num_com", required = true)
        protected String awps01CoINumCom;
        @XmlElement(name = "awps01co_i_cod_ps")
        protected long awps01CoICodPs;
        @XmlElement(name = "awps01co_i_fec_ini_li", required = true)
        protected String awps01CoIFecIniLi;
        @XmlElement(required = true)
        protected String filler1;

        /**
         * Obtiene el valor de la propiedad awps01CoIArea.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwps01CoIArea() {
            return awps01CoIArea;
        }

        /**
         * Define el valor de la propiedad awps01CoIArea.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwps01CoIArea(String value) {
            this.awps01CoIArea = value;
        }

        /**
         * Obtiene el valor de la propiedad awps01CoINumCom.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwps01CoINumCom() {
            return awps01CoINumCom;
        }

        /**
         * Define el valor de la propiedad awps01CoINumCom.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwps01CoINumCom(String value) {
            this.awps01CoINumCom = value;
        }

        /**
         * Obtiene el valor de la propiedad awps01CoICodPs.
         * 
         */
        public long getAwps01CoICodPs() {
            return awps01CoICodPs;
        }

        /**
         * Define el valor de la propiedad awps01CoICodPs.
         * 
         */
        public void setAwps01CoICodPs(long value) {
            this.awps01CoICodPs = value;
        }

        /**
         * Obtiene el valor de la propiedad awps01CoIFecIniLi.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwps01CoIFecIniLi() {
            return awps01CoIFecIniLi;
        }

        /**
         * Define el valor de la propiedad awps01CoIFecIniLi.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwps01CoIFecIniLi(String value) {
            this.awps01CoIFecIniLi = value;
        }

        /**
         * Obtiene el valor de la propiedad filler1.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFiller1() {
            return filler1;
        }

        /**
         * Define el valor de la propiedad filler1.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFiller1(String value) {
            this.filler1 = value;
        }

    }

}
