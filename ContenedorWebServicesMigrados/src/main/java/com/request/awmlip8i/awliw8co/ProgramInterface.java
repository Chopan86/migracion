//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.09 a las 02:27:30 PM CLST 
//


package com.request.awmlip8i.awliw8co;

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
 *         &lt;element name="awlip8co_entrada"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="awlip8co_i_area"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_i_num_com"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_i_cod_ps"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                         &lt;maxInclusive value="999999999"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlip8co_i_sec_ps"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
 *                         &lt;maxInclusive value="999999999999"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="filler1"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="32000"/&gt;
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
    "awlip8CoEntrada"
})
public class ProgramInterface {

    @XmlElement(name = "awlip8co_entrada", required = true)
    protected ProgramInterface.Awlip8CoEntrada awlip8CoEntrada;

    /**
     * Obtiene el valor de la propiedad awlip8CoEntrada.
     * 
     * @return
     *     possible object is
     *     {@link ProgramInterface.Awlip8CoEntrada }
     *     
     */
    public ProgramInterface.Awlip8CoEntrada getAwlip8CoEntrada() {
        return awlip8CoEntrada;
    }

    /**
     * Define el valor de la propiedad awlip8CoEntrada.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramInterface.Awlip8CoEntrada }
     *     
     */
    public void setAwlip8CoEntrada(ProgramInterface.Awlip8CoEntrada value) {
        this.awlip8CoEntrada = value;
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
     *         &lt;element name="awlip8co_i_area"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="3"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_i_num_com"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="8"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_i_cod_ps"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *               &lt;maxInclusive value="999999999"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlip8co_i_sec_ps"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&gt;
     *               &lt;maxInclusive value="999999999999"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="filler1"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="32000"/&gt;
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
        "awlip8CoIArea",
        "awlip8CoINumCom",
        "awlip8CoICodPs",
        "awlip8CoISecPs",
        "filler1"
    })
    public static class Awlip8CoEntrada {

        @XmlElement(name = "awlip8co_i_area", required = true)
        protected String awlip8CoIArea;
        @XmlElement(name = "awlip8co_i_num_com", required = true)
        protected String awlip8CoINumCom;
        @XmlElement(name = "awlip8co_i_cod_ps")
        protected long awlip8CoICodPs;
        @XmlElement(name = "awlip8co_i_sec_ps")
        protected long awlip8CoISecPs;
        @XmlElement(required = true)
        protected String filler1;

        /**
         * Obtiene el valor de la propiedad awlip8CoIArea.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoIArea() {
            return awlip8CoIArea;
        }

        /**
         * Define el valor de la propiedad awlip8CoIArea.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoIArea(String value) {
            this.awlip8CoIArea = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoINumCom.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlip8CoINumCom() {
            return awlip8CoINumCom;
        }

        /**
         * Define el valor de la propiedad awlip8CoINumCom.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlip8CoINumCom(String value) {
            this.awlip8CoINumCom = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoICodPs.
         * 
         */
        public long getAwlip8CoICodPs() {
            return awlip8CoICodPs;
        }

        /**
         * Define el valor de la propiedad awlip8CoICodPs.
         * 
         */
        public void setAwlip8CoICodPs(long value) {
            this.awlip8CoICodPs = value;
        }

        /**
         * Obtiene el valor de la propiedad awlip8CoISecPs.
         * 
         */
        public long getAwlip8CoISecPs() {
            return awlip8CoISecPs;
        }

        /**
         * Define el valor de la propiedad awlip8CoISecPs.
         * 
         */
        public void setAwlip8CoISecPs(long value) {
            this.awlip8CoISecPs = value;
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
