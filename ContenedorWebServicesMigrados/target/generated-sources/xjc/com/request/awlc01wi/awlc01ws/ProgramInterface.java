//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.08 a las 12:48:28 AM CLST 
//


package com.request.awlc01wi.awlc01ws;

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
 *         &lt;element name="awlc01z3_entrada"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="awlc01z3_i_area"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_i_num_com"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_i_rut"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_i_dv"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_i_criterio"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_i_sec_linea"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                         &lt;maxInclusive value="999999999"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="filler1"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15620"/&gt;
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
    "awlc01Z3Entrada"
})
public class ProgramInterface {

    @XmlElement(name = "awlc01z3_entrada", required = true)
    protected ProgramInterface.Awlc01Z3Entrada awlc01Z3Entrada;

    /**
     * Obtiene el valor de la propiedad awlc01Z3Entrada.
     * 
     * @return
     *     possible object is
     *     {@link ProgramInterface.Awlc01Z3Entrada }
     *     
     */
    public ProgramInterface.Awlc01Z3Entrada getAwlc01Z3Entrada() {
        return awlc01Z3Entrada;
    }

    /**
     * Define el valor de la propiedad awlc01Z3Entrada.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramInterface.Awlc01Z3Entrada }
     *     
     */
    public void setAwlc01Z3Entrada(ProgramInterface.Awlc01Z3Entrada value) {
        this.awlc01Z3Entrada = value;
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
     *         &lt;element name="awlc01z3_i_area"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="3"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_i_num_com"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="8"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_i_rut"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="12"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_i_dv"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_i_criterio"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_i_sec_linea"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *               &lt;maxInclusive value="999999999"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="filler1"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="15620"/&gt;
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
        "awlc01Z3IArea",
        "awlc01Z3INumCom",
        "awlc01Z3IRut",
        "awlc01Z3IDv",
        "awlc01Z3ICriterio",
        "awlc01Z3ISecLinea",
        "filler1"
    })
    public static class Awlc01Z3Entrada {

        @XmlElement(name = "awlc01z3_i_area", required = true)
        protected String awlc01Z3IArea;
        @XmlElement(name = "awlc01z3_i_num_com", required = true)
        protected String awlc01Z3INumCom;
        @XmlElement(name = "awlc01z3_i_rut", required = true)
        protected String awlc01Z3IRut;
        @XmlElement(name = "awlc01z3_i_dv", required = true)
        protected String awlc01Z3IDv;
        @XmlElement(name = "awlc01z3_i_criterio", required = true)
        protected String awlc01Z3ICriterio;
        @XmlElement(name = "awlc01z3_i_sec_linea")
        protected long awlc01Z3ISecLinea;
        @XmlElement(required = true)
        protected String filler1;

        /**
         * Obtiene el valor de la propiedad awlc01Z3IArea.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3IArea() {
            return awlc01Z3IArea;
        }

        /**
         * Define el valor de la propiedad awlc01Z3IArea.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3IArea(String value) {
            this.awlc01Z3IArea = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3INumCom.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3INumCom() {
            return awlc01Z3INumCom;
        }

        /**
         * Define el valor de la propiedad awlc01Z3INumCom.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3INumCom(String value) {
            this.awlc01Z3INumCom = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3IRut.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3IRut() {
            return awlc01Z3IRut;
        }

        /**
         * Define el valor de la propiedad awlc01Z3IRut.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3IRut(String value) {
            this.awlc01Z3IRut = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3IDv.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3IDv() {
            return awlc01Z3IDv;
        }

        /**
         * Define el valor de la propiedad awlc01Z3IDv.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3IDv(String value) {
            this.awlc01Z3IDv = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3ICriterio.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3ICriterio() {
            return awlc01Z3ICriterio;
        }

        /**
         * Define el valor de la propiedad awlc01Z3ICriterio.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3ICriterio(String value) {
            this.awlc01Z3ICriterio = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3ISecLinea.
         * 
         */
        public long getAwlc01Z3ISecLinea() {
            return awlc01Z3ISecLinea;
        }

        /**
         * Define el valor de la propiedad awlc01Z3ISecLinea.
         * 
         */
        public void setAwlc01Z3ISecLinea(long value) {
            this.awlc01Z3ISecLinea = value;
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
