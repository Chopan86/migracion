//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.09 a las 01:48:07 AM CLST 
//


package com.response.awmps02i.awps02co;

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
 *         &lt;element name="awps02co_salida"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="awps02co_o_cod_ret"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awps02co_o_desc_cod_ret"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awps02co_o_finpaginacion"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awps02co_o_numregistros"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awps02co_o_pi_cliente" maxOccurs="20" minOccurs="20"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="awps02co_o_sec_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="12"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_cod_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="9"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_desc_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="30"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_cod_op"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="9"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_desc_op"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="30"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_cant_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="9"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_tip_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="1"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_desc_tip_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_ind_fact_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="1"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_est_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_fec_alta_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_fec_baja_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_cod_familia"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="9"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_desc_familia"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="30"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_valor_ps"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="13"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_valor_ps_red"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="13"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_moneda"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_cod_cf"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="9"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_cod_conf"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="9"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_desc_cf"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="30"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_sec_paq"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="12"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_cod_paq"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="9"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_nombre_paq"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="8"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_cod_fam"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="5"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_des_fam"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_subg1_cod"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="5"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_des_subg1"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="35"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_subg2_cod"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="5"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_des_subg2"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="35"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awps02co_o_pi_cliente2" maxOccurs="15" minOccurs="15"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="awps02co_o_sec_car"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="awps02co_o_cod_car"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="awps02co_o_cod_dom"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="12"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="awps02co_o_tip_dom"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="1"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="awps02co_o_valor_dom"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="30"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
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
 *                   &lt;element name="awps02co_o_plan_minuto"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
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
    "awps02CoSalida"
})
public class ProgramInterface {

    @XmlElement(name = "awps02co_salida", required = true)
    protected ProgramInterface.Awps02CoSalida awps02CoSalida;

    /**
     * Obtiene el valor de la propiedad awps02CoSalida.
     * 
     * @return
     *     possible object is
     *     {@link ProgramInterface.Awps02CoSalida }
     *     
     */
    public ProgramInterface.Awps02CoSalida getAwps02CoSalida() {
        return awps02CoSalida;
    }

    /**
     * Define el valor de la propiedad awps02CoSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramInterface.Awps02CoSalida }
     *     
     */
    public void setAwps02CoSalida(ProgramInterface.Awps02CoSalida value) {
        this.awps02CoSalida = value;
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
     *         &lt;element name="awps02co_o_cod_ret"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="3"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awps02co_o_desc_cod_ret"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awps02co_o_finpaginacion"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awps02co_o_numregistros"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="2"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awps02co_o_pi_cliente" maxOccurs="20" minOccurs="20"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="awps02co_o_sec_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="12"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_cod_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="9"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_desc_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="30"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_cod_op"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="9"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_desc_op"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="30"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_cant_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="9"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_tip_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="1"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_desc_tip_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="20"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_ind_fact_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="1"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_est_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="20"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_fec_alta_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="10"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_fec_baja_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="10"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_cod_familia"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="9"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_desc_familia"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="30"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_valor_ps"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="13"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_valor_ps_red"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="13"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_moneda"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_cod_cf"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="9"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_cod_conf"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="9"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_desc_cf"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="30"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_sec_paq"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="12"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_cod_paq"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="9"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_nombre_paq"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="8"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_cod_fam"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="5"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_des_fam"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="20"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_subg1_cod"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="5"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_des_subg1"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="35"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_subg2_cod"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="5"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_des_subg2"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="35"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awps02co_o_pi_cliente2" maxOccurs="15" minOccurs="15"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="awps02co_o_sec_car"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="awps02co_o_cod_car"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="awps02co_o_cod_dom"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="12"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="awps02co_o_tip_dom"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="1"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="awps02co_o_valor_dom"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="30"/&gt;
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
     *         &lt;element name="awps02co_o_plan_minuto"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
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
        "awps02CoOCodRet",
        "awps02CoODescCodRet",
        "awps02CoOFinpaginacion",
        "awps02CoONumregistros",
        "awps02CoOPiCliente",
        "awps02CoOPlanMinuto"
    })
    public static class Awps02CoSalida {

        @XmlElement(name = "awps02co_o_cod_ret", required = true)
        protected String awps02CoOCodRet;
        @XmlElement(name = "awps02co_o_desc_cod_ret", required = true)
        protected String awps02CoODescCodRet;
        @XmlElement(name = "awps02co_o_finpaginacion", required = true)
        protected String awps02CoOFinpaginacion;
        @XmlElement(name = "awps02co_o_numregistros", required = true)
        protected String awps02CoONumregistros;
        @XmlElement(name = "awps02co_o_pi_cliente", required = true)
        protected List<ProgramInterface.Awps02CoSalida.Awps02CoOPiCliente> awps02CoOPiCliente;
        @XmlElement(name = "awps02co_o_plan_minuto", required = true)
        protected String awps02CoOPlanMinuto;

        /**
         * Obtiene el valor de la propiedad awps02CoOCodRet.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwps02CoOCodRet() {
            return awps02CoOCodRet;
        }

        /**
         * Define el valor de la propiedad awps02CoOCodRet.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwps02CoOCodRet(String value) {
            this.awps02CoOCodRet = value;
        }

        /**
         * Obtiene el valor de la propiedad awps02CoODescCodRet.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwps02CoODescCodRet() {
            return awps02CoODescCodRet;
        }

        /**
         * Define el valor de la propiedad awps02CoODescCodRet.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwps02CoODescCodRet(String value) {
            this.awps02CoODescCodRet = value;
        }

        /**
         * Obtiene el valor de la propiedad awps02CoOFinpaginacion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwps02CoOFinpaginacion() {
            return awps02CoOFinpaginacion;
        }

        /**
         * Define el valor de la propiedad awps02CoOFinpaginacion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwps02CoOFinpaginacion(String value) {
            this.awps02CoOFinpaginacion = value;
        }

        /**
         * Obtiene el valor de la propiedad awps02CoONumregistros.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwps02CoONumregistros() {
            return awps02CoONumregistros;
        }

        /**
         * Define el valor de la propiedad awps02CoONumregistros.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwps02CoONumregistros(String value) {
            this.awps02CoONumregistros = value;
        }

        /**
         * Gets the value of the awps02CoOPiCliente property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the awps02CoOPiCliente property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAwps02CoOPiCliente().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProgramInterface.Awps02CoSalida.Awps02CoOPiCliente }
         * 
         * 
         */
        public List<ProgramInterface.Awps02CoSalida.Awps02CoOPiCliente> getAwps02CoOPiCliente() {
            if (awps02CoOPiCliente == null) {
                awps02CoOPiCliente = new ArrayList<ProgramInterface.Awps02CoSalida.Awps02CoOPiCliente>();
            }
            return this.awps02CoOPiCliente;
        }

        /**
         * Obtiene el valor de la propiedad awps02CoOPlanMinuto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwps02CoOPlanMinuto() {
            return awps02CoOPlanMinuto;
        }

        /**
         * Define el valor de la propiedad awps02CoOPlanMinuto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwps02CoOPlanMinuto(String value) {
            this.awps02CoOPlanMinuto = value;
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
         *         &lt;element name="awps02co_o_sec_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="12"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_cod_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="9"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_desc_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="30"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_cod_op"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="9"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_desc_op"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="30"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_cant_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="9"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_tip_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="1"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_desc_tip_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="20"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_ind_fact_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="1"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_est_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="20"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_fec_alta_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="10"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_fec_baja_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="10"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_cod_familia"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="9"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_desc_familia"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="30"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_valor_ps"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="13"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_valor_ps_red"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="13"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_moneda"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_cod_cf"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="9"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_cod_conf"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="9"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_desc_cf"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="30"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_sec_paq"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="12"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_cod_paq"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="9"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_nombre_paq"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="8"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_cod_fam"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="5"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_des_fam"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="20"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_subg1_cod"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="5"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_des_subg1"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="35"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_subg2_cod"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="5"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_des_subg2"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="35"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awps02co_o_pi_cliente2" maxOccurs="15" minOccurs="15"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="awps02co_o_sec_car"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="awps02co_o_cod_car"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="awps02co_o_cod_dom"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="12"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="awps02co_o_tip_dom"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="1"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="awps02co_o_valor_dom"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="30"/&gt;
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
            "awps02CoOSecPs",
            "awps02CoOCodPs",
            "awps02CoODescPs",
            "awps02CoOCodOp",
            "awps02CoODescOp",
            "awps02CoOCantPs",
            "awps02CoOTipPs",
            "awps02CoODescTipPs",
            "awps02CoOIndFactPs",
            "awps02CoOEstPs",
            "awps02CoOFecAltaPs",
            "awps02CoOFecBajaPs",
            "awps02CoOCodFamilia",
            "awps02CoODescFamilia",
            "awps02CoOValorPs",
            "awps02CoOValorPsRed",
            "awps02CoOMoneda",
            "awps02CoOCodCf",
            "awps02CoOCodConf",
            "awps02CoODescCf",
            "awps02CoOSecPaq",
            "awps02CoOCodPaq",
            "awps02CoONombrePaq",
            "awps02CoOCodFam",
            "awps02CoODesFam",
            "awps02CoOSubg1Cod",
            "awps02CoODesSubg1",
            "awps02CoOSubg2Cod",
            "awps02CoODesSubg2",
            "awps02CoOPiCliente2"
        })
        public static class Awps02CoOPiCliente {

            @XmlElement(name = "awps02co_o_sec_ps", required = true)
            protected String awps02CoOSecPs;
            @XmlElement(name = "awps02co_o_cod_ps", required = true)
            protected String awps02CoOCodPs;
            @XmlElement(name = "awps02co_o_desc_ps", required = true)
            protected String awps02CoODescPs;
            @XmlElement(name = "awps02co_o_cod_op", required = true)
            protected String awps02CoOCodOp;
            @XmlElement(name = "awps02co_o_desc_op", required = true)
            protected String awps02CoODescOp;
            @XmlElement(name = "awps02co_o_cant_ps", required = true)
            protected String awps02CoOCantPs;
            @XmlElement(name = "awps02co_o_tip_ps", required = true)
            protected String awps02CoOTipPs;
            @XmlElement(name = "awps02co_o_desc_tip_ps", required = true)
            protected String awps02CoODescTipPs;
            @XmlElement(name = "awps02co_o_ind_fact_ps", required = true)
            protected String awps02CoOIndFactPs;
            @XmlElement(name = "awps02co_o_est_ps", required = true)
            protected String awps02CoOEstPs;
            @XmlElement(name = "awps02co_o_fec_alta_ps", required = true)
            protected String awps02CoOFecAltaPs;
            @XmlElement(name = "awps02co_o_fec_baja_ps", required = true)
            protected String awps02CoOFecBajaPs;
            @XmlElement(name = "awps02co_o_cod_familia", required = true)
            protected String awps02CoOCodFamilia;
            @XmlElement(name = "awps02co_o_desc_familia", required = true)
            protected String awps02CoODescFamilia;
            @XmlElement(name = "awps02co_o_valor_ps", required = true)
            protected String awps02CoOValorPs;
            @XmlElement(name = "awps02co_o_valor_ps_red", required = true)
            protected String awps02CoOValorPsRed;
            @XmlElement(name = "awps02co_o_moneda", required = true)
            protected String awps02CoOMoneda;
            @XmlElement(name = "awps02co_o_cod_cf", required = true)
            protected String awps02CoOCodCf;
            @XmlElement(name = "awps02co_o_cod_conf", required = true)
            protected String awps02CoOCodConf;
            @XmlElement(name = "awps02co_o_desc_cf", required = true)
            protected String awps02CoODescCf;
            @XmlElement(name = "awps02co_o_sec_paq", required = true)
            protected String awps02CoOSecPaq;
            @XmlElement(name = "awps02co_o_cod_paq", required = true)
            protected String awps02CoOCodPaq;
            @XmlElement(name = "awps02co_o_nombre_paq", required = true)
            protected String awps02CoONombrePaq;
            @XmlElement(name = "awps02co_o_cod_fam", required = true)
            protected String awps02CoOCodFam;
            @XmlElement(name = "awps02co_o_des_fam", required = true)
            protected String awps02CoODesFam;
            @XmlElement(name = "awps02co_o_subg1_cod", required = true)
            protected String awps02CoOSubg1Cod;
            @XmlElement(name = "awps02co_o_des_subg1", required = true)
            protected String awps02CoODesSubg1;
            @XmlElement(name = "awps02co_o_subg2_cod", required = true)
            protected String awps02CoOSubg2Cod;
            @XmlElement(name = "awps02co_o_des_subg2", required = true)
            protected String awps02CoODesSubg2;
            @XmlElement(name = "awps02co_o_pi_cliente", required = true)
            protected List<ProgramInterface.Awps02CoSalida.Awps02CoOPiCliente.Awps02CoOPiCliente2> awps02CoOPiCliente2;

            /**
             * Obtiene el valor de la propiedad awps02CoOSecPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoOSecPs() {
                return awps02CoOSecPs;
            }

            /**
             * Define el valor de la propiedad awps02CoOSecPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoOSecPs(String value) {
                this.awps02CoOSecPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoOCodPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoOCodPs() {
                return awps02CoOCodPs;
            }

            /**
             * Define el valor de la propiedad awps02CoOCodPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoOCodPs(String value) {
                this.awps02CoOCodPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoODescPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoODescPs() {
                return awps02CoODescPs;
            }

            /**
             * Define el valor de la propiedad awps02CoODescPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoODescPs(String value) {
                this.awps02CoODescPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoOCodOp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoOCodOp() {
                return awps02CoOCodOp;
            }

            /**
             * Define el valor de la propiedad awps02CoOCodOp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoOCodOp(String value) {
                this.awps02CoOCodOp = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoODescOp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoODescOp() {
                return awps02CoODescOp;
            }

            /**
             * Define el valor de la propiedad awps02CoODescOp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoODescOp(String value) {
                this.awps02CoODescOp = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoOCantPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoOCantPs() {
                return awps02CoOCantPs;
            }

            /**
             * Define el valor de la propiedad awps02CoOCantPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoOCantPs(String value) {
                this.awps02CoOCantPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoOTipPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoOTipPs() {
                return awps02CoOTipPs;
            }

            /**
             * Define el valor de la propiedad awps02CoOTipPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoOTipPs(String value) {
                this.awps02CoOTipPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoODescTipPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoODescTipPs() {
                return awps02CoODescTipPs;
            }

            /**
             * Define el valor de la propiedad awps02CoODescTipPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoODescTipPs(String value) {
                this.awps02CoODescTipPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoOIndFactPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoOIndFactPs() {
                return awps02CoOIndFactPs;
            }

            /**
             * Define el valor de la propiedad awps02CoOIndFactPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoOIndFactPs(String value) {
                this.awps02CoOIndFactPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoOEstPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoOEstPs() {
                return awps02CoOEstPs;
            }

            /**
             * Define el valor de la propiedad awps02CoOEstPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoOEstPs(String value) {
                this.awps02CoOEstPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoOFecAltaPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoOFecAltaPs() {
                return awps02CoOFecAltaPs;
            }

            /**
             * Define el valor de la propiedad awps02CoOFecAltaPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoOFecAltaPs(String value) {
                this.awps02CoOFecAltaPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoOFecBajaPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoOFecBajaPs() {
                return awps02CoOFecBajaPs;
            }

            /**
             * Define el valor de la propiedad awps02CoOFecBajaPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoOFecBajaPs(String value) {
                this.awps02CoOFecBajaPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoOCodFamilia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoOCodFamilia() {
                return awps02CoOCodFamilia;
            }

            /**
             * Define el valor de la propiedad awps02CoOCodFamilia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoOCodFamilia(String value) {
                this.awps02CoOCodFamilia = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoODescFamilia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoODescFamilia() {
                return awps02CoODescFamilia;
            }

            /**
             * Define el valor de la propiedad awps02CoODescFamilia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoODescFamilia(String value) {
                this.awps02CoODescFamilia = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoOValorPs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoOValorPs() {
                return awps02CoOValorPs;
            }

            /**
             * Define el valor de la propiedad awps02CoOValorPs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoOValorPs(String value) {
                this.awps02CoOValorPs = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoOValorPsRed.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoOValorPsRed() {
                return awps02CoOValorPsRed;
            }

            /**
             * Define el valor de la propiedad awps02CoOValorPsRed.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoOValorPsRed(String value) {
                this.awps02CoOValorPsRed = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoOMoneda.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoOMoneda() {
                return awps02CoOMoneda;
            }

            /**
             * Define el valor de la propiedad awps02CoOMoneda.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoOMoneda(String value) {
                this.awps02CoOMoneda = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoOCodCf.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoOCodCf() {
                return awps02CoOCodCf;
            }

            /**
             * Define el valor de la propiedad awps02CoOCodCf.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoOCodCf(String value) {
                this.awps02CoOCodCf = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoOCodConf.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoOCodConf() {
                return awps02CoOCodConf;
            }

            /**
             * Define el valor de la propiedad awps02CoOCodConf.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoOCodConf(String value) {
                this.awps02CoOCodConf = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoODescCf.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoODescCf() {
                return awps02CoODescCf;
            }

            /**
             * Define el valor de la propiedad awps02CoODescCf.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoODescCf(String value) {
                this.awps02CoODescCf = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoOSecPaq.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoOSecPaq() {
                return awps02CoOSecPaq;
            }

            /**
             * Define el valor de la propiedad awps02CoOSecPaq.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoOSecPaq(String value) {
                this.awps02CoOSecPaq = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoOCodPaq.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoOCodPaq() {
                return awps02CoOCodPaq;
            }

            /**
             * Define el valor de la propiedad awps02CoOCodPaq.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoOCodPaq(String value) {
                this.awps02CoOCodPaq = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoONombrePaq.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoONombrePaq() {
                return awps02CoONombrePaq;
            }

            /**
             * Define el valor de la propiedad awps02CoONombrePaq.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoONombrePaq(String value) {
                this.awps02CoONombrePaq = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoOCodFam.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoOCodFam() {
                return awps02CoOCodFam;
            }

            /**
             * Define el valor de la propiedad awps02CoOCodFam.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoOCodFam(String value) {
                this.awps02CoOCodFam = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoODesFam.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoODesFam() {
                return awps02CoODesFam;
            }

            /**
             * Define el valor de la propiedad awps02CoODesFam.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoODesFam(String value) {
                this.awps02CoODesFam = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoOSubg1Cod.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoOSubg1Cod() {
                return awps02CoOSubg1Cod;
            }

            /**
             * Define el valor de la propiedad awps02CoOSubg1Cod.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoOSubg1Cod(String value) {
                this.awps02CoOSubg1Cod = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoODesSubg1.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoODesSubg1() {
                return awps02CoODesSubg1;
            }

            /**
             * Define el valor de la propiedad awps02CoODesSubg1.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoODesSubg1(String value) {
                this.awps02CoODesSubg1 = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoOSubg2Cod.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoOSubg2Cod() {
                return awps02CoOSubg2Cod;
            }

            /**
             * Define el valor de la propiedad awps02CoOSubg2Cod.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoOSubg2Cod(String value) {
                this.awps02CoOSubg2Cod = value;
            }

            /**
             * Obtiene el valor de la propiedad awps02CoODesSubg2.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwps02CoODesSubg2() {
                return awps02CoODesSubg2;
            }

            /**
             * Define el valor de la propiedad awps02CoODesSubg2.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwps02CoODesSubg2(String value) {
                this.awps02CoODesSubg2 = value;
            }

            /**
             * Gets the value of the awps02CoOPiCliente2 property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the awps02CoOPiCliente2 property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAwps02CoOPiCliente2().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ProgramInterface.Awps02CoSalida.Awps02CoOPiCliente.Awps02CoOPiCliente2 }
             * 
             * 
             */
            public List<ProgramInterface.Awps02CoSalida.Awps02CoOPiCliente.Awps02CoOPiCliente2> getAwps02CoOPiCliente2() {
                if (awps02CoOPiCliente2 == null) {
                    awps02CoOPiCliente2 = new ArrayList<ProgramInterface.Awps02CoSalida.Awps02CoOPiCliente.Awps02CoOPiCliente2>();
                }
                return this.awps02CoOPiCliente2;
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
             *         &lt;element name="awps02co_o_sec_car"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="12"/&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="awps02co_o_cod_car"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="12"/&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="awps02co_o_cod_dom"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="12"/&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="awps02co_o_tip_dom"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="1"/&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="awps02co_o_valor_dom"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="30"/&gt;
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
                "awps02CoOSecCar",
                "awps02CoOCodCar",
                "awps02CoOCodDom",
                "awps02CoOTipDom",
                "awps02CoOValorDom"
            })
            public static class Awps02CoOPiCliente2 {

                @XmlElement(name = "awps02co_o_sec_car", required = true)
                protected String awps02CoOSecCar;
                @XmlElement(name = "awps02co_o_cod_car", required = true)
                protected String awps02CoOCodCar;
                @XmlElement(name = "awps02co_o_cod_dom", required = true)
                protected String awps02CoOCodDom;
                @XmlElement(name = "awps02co_o_tip_dom", required = true)
                protected String awps02CoOTipDom;
                @XmlElement(name = "awps02co_o_valor_dom", required = true)
                protected String awps02CoOValorDom;

                /**
                 * Obtiene el valor de la propiedad awps02CoOSecCar.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwps02CoOSecCar() {
                    return awps02CoOSecCar;
                }

                /**
                 * Define el valor de la propiedad awps02CoOSecCar.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwps02CoOSecCar(String value) {
                    this.awps02CoOSecCar = value;
                }

                /**
                 * Obtiene el valor de la propiedad awps02CoOCodCar.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwps02CoOCodCar() {
                    return awps02CoOCodCar;
                }

                /**
                 * Define el valor de la propiedad awps02CoOCodCar.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwps02CoOCodCar(String value) {
                    this.awps02CoOCodCar = value;
                }

                /**
                 * Obtiene el valor de la propiedad awps02CoOCodDom.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwps02CoOCodDom() {
                    return awps02CoOCodDom;
                }

                /**
                 * Define el valor de la propiedad awps02CoOCodDom.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwps02CoOCodDom(String value) {
                    this.awps02CoOCodDom = value;
                }

                /**
                 * Obtiene el valor de la propiedad awps02CoOTipDom.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwps02CoOTipDom() {
                    return awps02CoOTipDom;
                }

                /**
                 * Define el valor de la propiedad awps02CoOTipDom.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwps02CoOTipDom(String value) {
                    this.awps02CoOTipDom = value;
                }

                /**
                 * Obtiene el valor de la propiedad awps02CoOValorDom.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwps02CoOValorDom() {
                    return awps02CoOValorDom;
                }

                /**
                 * Define el valor de la propiedad awps02CoOValorDom.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwps02CoOValorDom(String value) {
                    this.awps02CoOValorDom = value;
                }

            }

        }

    }

}
