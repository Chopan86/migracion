//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.09 a las 03:51:20 PM CLST 
//


package com.request.awpsl2wi.awpsl2ws;

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
 *         &lt;element name="awpsl2wi" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="awpsl2wi_area"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awpsl2wi_num_com"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awpsl2wi_cod_ps"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                         &lt;maxInclusive value="999999999"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awpsl2wi_fec_ini_li"&gt;
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
@XmlType(name = "ProgramInterface", propOrder = {
    "awpsl2Wi"
})
public class ProgramInterface {

    @XmlElement(name = "awpsl2wi")
    protected ProgramInterface.Awpsl2Wi awpsl2Wi;

    /**
     * Obtiene el valor de la propiedad awpsl2Wi.
     * 
     * @return
     *     possible object is
     *     {@link ProgramInterface.Awpsl2Wi }
     *     
     */
    public ProgramInterface.Awpsl2Wi getAwpsl2Wi() {
        return awpsl2Wi;
    }

    /**
     * Define el valor de la propiedad awpsl2Wi.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramInterface.Awpsl2Wi }
     *     
     */
    public void setAwpsl2Wi(ProgramInterface.Awpsl2Wi value) {
        this.awpsl2Wi = value;
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
     *         &lt;element name="awpsl2wi_area"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="3"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awpsl2wi_num_com"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="8"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awpsl2wi_cod_ps"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *               &lt;maxInclusive value="999999999"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awpsl2wi_fec_ini_li"&gt;
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
        "awpsl2WiArea",
        "awpsl2WiNumCom",
        "awpsl2WiCodPs",
        "awpsl2WiFecIniLi"
    })
    public static class Awpsl2Wi {

        @XmlElement(name = "awpsl2wi_area", required = true)
        protected String awpsl2WiArea;
        @XmlElement(name = "awpsl2wi_num_com", required = true)
        protected String awpsl2WiNumCom;
        @XmlElement(name = "awpsl2wi_cod_ps")
        protected long awpsl2WiCodPs;
        @XmlElement(name = "awpsl2wi_fec_ini_li", required = true)
        protected String awpsl2WiFecIniLi;

        /**
         * Obtiene el valor de la propiedad awpsl2WiArea.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwpsl2WiArea() {
            return awpsl2WiArea;
        }

        /**
         * Define el valor de la propiedad awpsl2WiArea.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwpsl2WiArea(String value) {
            this.awpsl2WiArea = value;
        }

        /**
         * Obtiene el valor de la propiedad awpsl2WiNumCom.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwpsl2WiNumCom() {
            return awpsl2WiNumCom;
        }

        /**
         * Define el valor de la propiedad awpsl2WiNumCom.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwpsl2WiNumCom(String value) {
            this.awpsl2WiNumCom = value;
        }

        /**
         * Obtiene el valor de la propiedad awpsl2WiCodPs.
         * 
         */
        public long getAwpsl2WiCodPs() {
            return awpsl2WiCodPs;
        }

        /**
         * Define el valor de la propiedad awpsl2WiCodPs.
         * 
         */
        public void setAwpsl2WiCodPs(long value) {
            this.awpsl2WiCodPs = value;
        }

        /**
         * Obtiene el valor de la propiedad awpsl2WiFecIniLi.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwpsl2WiFecIniLi() {
            return awpsl2WiFecIniLi;
        }

        /**
         * Define el valor de la propiedad awpsl2WiFecIniLi.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwpsl2WiFecIniLi(String value) {
            this.awpsl2WiFecIniLi = value;
        }

    }

}
