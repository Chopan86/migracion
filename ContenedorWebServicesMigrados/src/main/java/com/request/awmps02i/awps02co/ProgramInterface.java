//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.09 a las 01:48:07 AM CLST 
//


package com.request.awmps02i.awps02co;

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
 *         &lt;element name="awps02co_entrada"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="awps02co_i_area"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awps02co_i_num_com"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awps02co_i_cod_ps"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                         &lt;maxInclusive value="999999999"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awps02co_i_fec_ini_li"&gt;
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
    "awps02CoEntrada"
})
public class ProgramInterface {

    @XmlElement(name = "awps02co_entrada", required = true)
    protected ProgramInterface.Awps02CoEntrada awps02CoEntrada;

    /**
     * Obtiene el valor de la propiedad awps02CoEntrada.
     * 
     * @return
     *     possible object is
     *     {@link ProgramInterface.Awps02CoEntrada }
     *     
     */
    public ProgramInterface.Awps02CoEntrada getAwps02CoEntrada() {
        return awps02CoEntrada;
    }

    /**
     * Define el valor de la propiedad awps02CoEntrada.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramInterface.Awps02CoEntrada }
     *     
     */
    public void setAwps02CoEntrada(ProgramInterface.Awps02CoEntrada value) {
        this.awps02CoEntrada = value;
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
     *         &lt;element name="awps02co_i_area"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="3"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awps02co_i_num_com"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="8"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awps02co_i_cod_ps"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *               &lt;maxInclusive value="999999999"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awps02co_i_fec_ini_li"&gt;
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
        "awps02CoIArea",
        "awps02CoINumCom",
        "awps02CoICodPs",
        "awps02CoIFecIniLi",
        "filler1"
    })
    public static class Awps02CoEntrada {

        @XmlElement(name = "awps02co_i_area", required = true)
        protected String awps02CoIArea;
        @XmlElement(name = "awps02co_i_num_com", required = true)
        protected String awps02CoINumCom;
        @XmlElement(name = "awps02co_i_cod_ps")
        protected long awps02CoICodPs;
        @XmlElement(name = "awps02co_i_fec_ini_li", required = true)
        protected String awps02CoIFecIniLi;
        @XmlElement(required = true)
        protected String filler1;

        /**
         * Obtiene el valor de la propiedad awps02CoIArea.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwps02CoIArea() {
            return awps02CoIArea;
        }

        /**
         * Define el valor de la propiedad awps02CoIArea.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwps02CoIArea(String value) {
            this.awps02CoIArea = value;
        }

        /**
         * Obtiene el valor de la propiedad awps02CoINumCom.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwps02CoINumCom() {
            return awps02CoINumCom;
        }

        /**
         * Define el valor de la propiedad awps02CoINumCom.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwps02CoINumCom(String value) {
            this.awps02CoINumCom = value;
        }

        /**
         * Obtiene el valor de la propiedad awps02CoICodPs.
         * 
         */
        public long getAwps02CoICodPs() {
            return awps02CoICodPs;
        }

        /**
         * Define el valor de la propiedad awps02CoICodPs.
         * 
         */
        public void setAwps02CoICodPs(long value) {
            this.awps02CoICodPs = value;
        }

        /**
         * Obtiene el valor de la propiedad awps02CoIFecIniLi.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwps02CoIFecIniLi() {
            return awps02CoIFecIniLi;
        }

        /**
         * Define el valor de la propiedad awps02CoIFecIniLi.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwps02CoIFecIniLi(String value) {
            this.awps02CoIFecIniLi = value;
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
