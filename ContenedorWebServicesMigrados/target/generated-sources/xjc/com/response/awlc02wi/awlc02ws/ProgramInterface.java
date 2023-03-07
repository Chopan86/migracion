//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.07 a las 11:59:19 AM CLST 
//


package com.response.awlc02wi.awlc02ws;

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
 *         &lt;element name="awlc02wo_salida" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="awlc02wo_o_cod_ret"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_desc_cod_ret"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="50"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_sqlcode"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                         &lt;maxInclusive value="999999999"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_parrafo"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="50"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_finpaginacion"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_numregistros"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                         &lt;maxInclusive value="99"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_nom_pag"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_ape1_pag"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_ape2_pag"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_nom_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_ape1_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_ape2_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_rut_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_dvf_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_sec_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                         &lt;maxInclusive value="999999999"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_raz_soc"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="60"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_nom_fan"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_cod_giro"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="5"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_tipo_clie"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_tipo_seg"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_desc_tipo_clie"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_cod_seg"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_desc_seg"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_cod_sub_seg"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_tipo_clie_mac"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_desc_clie_mac"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_desc_sub_seg"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_mail_cliente"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="60"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_fecha_alt_clte"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_area_fax"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_num_fax"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_num_celula"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_pag_web"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="60"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_calle_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="40"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_num_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="6"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_piso_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_dpto_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="6"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_desc_comun_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_desc_ciuda_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc02wo_o_lineas" maxOccurs="40" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="awlc02wo_o_area"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_fono"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="8"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_sec_linea"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="12"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_calle_inst"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="40"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_num_inst"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="6"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_piso_inst"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="2"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_dpto_inst"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="6"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_cod_post_inst"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="7"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_cod_comun"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_desc_comun_inst"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="15"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_ciuda_inst"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="15"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_zona"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="2"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_central"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="2"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_desc_zona_cent"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="25"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_pta_comercial"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="4"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_fec_instalacion"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_tipo_linea"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="2"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_desc_tipo_linea"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="15"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_ind_fact"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="1"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_ind_pagadora"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="1"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_est_linea"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="30"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_cod_agencia"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="4"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_desc_agencia"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="30"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_fec_alta_li"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_fec_fin_vi"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_clie"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                                   &lt;maxInclusive value="999999999"/&gt;
 *                                   &lt;minInclusive value="0"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_num_cuen"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                                   &lt;maxInclusive value="999999999"/&gt;
 *                                   &lt;minInclusive value="0"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc02wo_o_direccion_cob" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="awlc02wo_o_calle_cob"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="40"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="awlc02wo_o_num_cob"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="awlc02wo_o_dpto_cob"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="awlc02wo_o_post_cob"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="7"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="awlc02wo_o_cod_comun_cob"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="3"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="awlc02wo_o_desc_comun_cob"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="15"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="awlc02wo_o_ciuda_cob"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="15"/&gt;
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
 *                   &lt;element name="awlc02wo_o_respaldo"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="354"/&gt;
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
    "awlc02WoSalida"
})
public class ProgramInterface {

    @XmlElement(name = "awlc02wo_salida")
    protected ProgramInterface.Awlc02WoSalida awlc02WoSalida;

    /**
     * Obtiene el valor de la propiedad awlc02WoSalida.
     * 
     * @return
     *     possible object is
     *     {@link ProgramInterface.Awlc02WoSalida }
     *     
     */
    public ProgramInterface.Awlc02WoSalida getAwlc02WoSalida() {
        return awlc02WoSalida;
    }

    /**
     * Define el valor de la propiedad awlc02WoSalida.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramInterface.Awlc02WoSalida }
     *     
     */
    public void setAwlc02WoSalida(ProgramInterface.Awlc02WoSalida value) {
        this.awlc02WoSalida = value;
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
     *         &lt;element name="awlc02wo_o_cod_ret"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="3"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_desc_cod_ret"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="50"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_sqlcode"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *               &lt;maxInclusive value="999999999"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_parrafo"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="50"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_finpaginacion"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_numregistros"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *               &lt;maxInclusive value="99"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_nom_pag"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_ape1_pag"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="20"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_ape2_pag"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="20"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_nom_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_ape1_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="20"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_ape2_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="20"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_rut_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="12"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_dvf_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_sec_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *               &lt;maxInclusive value="999999999"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_raz_soc"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="60"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_nom_fan"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_cod_giro"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="5"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_tipo_clie"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_tipo_seg"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_desc_tipo_clie"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="15"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_cod_seg"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="3"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_desc_seg"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_cod_sub_seg"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="3"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_tipo_clie_mac"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_desc_clie_mac"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="20"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_desc_sub_seg"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_mail_cliente"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="60"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_fecha_alt_clte"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="10"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_area_fax"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="3"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_num_fax"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="8"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_num_celula"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="10"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_pag_web"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="60"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_calle_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="40"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_num_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="6"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_piso_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="2"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_dpto_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="6"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_desc_comun_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_desc_ciuda_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="15"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc02wo_o_lineas" maxOccurs="40" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="awlc02wo_o_area"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_fono"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="8"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_sec_linea"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="12"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_calle_inst"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="40"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_num_inst"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="6"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_piso_inst"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="2"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_dpto_inst"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="6"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_cod_post_inst"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="7"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_cod_comun"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_desc_comun_inst"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="15"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_ciuda_inst"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="15"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_zona"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="2"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_central"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="2"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_desc_zona_cent"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="25"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_pta_comercial"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="4"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_fec_instalacion"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="10"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_tipo_linea"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="2"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_desc_tipo_linea"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="15"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_ind_fact"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="1"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_ind_pagadora"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="1"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_est_linea"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="30"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_cod_agencia"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="4"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_desc_agencia"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="30"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_fec_alta_li"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="10"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_fec_fin_vi"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="10"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_clie"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *                         &lt;maxInclusive value="999999999"/&gt;
     *                         &lt;minInclusive value="0"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_num_cuen"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *                         &lt;maxInclusive value="999999999"/&gt;
     *                         &lt;minInclusive value="0"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc02wo_o_direccion_cob" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="awlc02wo_o_calle_cob"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="40"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="awlc02wo_o_num_cob"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="awlc02wo_o_dpto_cob"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="awlc02wo_o_post_cob"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="7"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="awlc02wo_o_cod_comun_cob"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="3"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="awlc02wo_o_desc_comun_cob"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="15"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="awlc02wo_o_ciuda_cob"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="15"/&gt;
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
     *         &lt;element name="awlc02wo_o_respaldo"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="354"/&gt;
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
        "awlc02WoOCodRet",
        "awlc02WoODescCodRet",
        "awlc02WoOSqlcode",
        "awlc02WoOParrafo",
        "awlc02WoOFinpaginacion",
        "awlc02WoONumregistros",
        "awlc02WoONomPag",
        "awlc02WoOApe1Pag",
        "awlc02WoOApe2Pag",
        "awlc02WoONomTit",
        "awlc02WoOApe1Tit",
        "awlc02WoOApe2Tit",
        "awlc02WoORutTit",
        "awlc02WoODvfTit",
        "awlc02WoOSecTit",
        "awlc02WoORazSoc",
        "awlc02WoONomFan",
        "awlc02WoOCodGiro",
        "awlc02WoOTipoClie",
        "awlc02WoOTipoSeg",
        "awlc02WoODescTipoClie",
        "awlc02WoOCodSeg",
        "awlc02WoODescSeg",
        "awlc02WoOCodSubSeg",
        "awlc02WoOTipoClieMac",
        "awlc02WoODescClieMac",
        "awlc02WoODescSubSeg",
        "awlc02WoOMailCliente",
        "awlc02WoOFechaAltClte",
        "awlc02WoOAreaFax",
        "awlc02WoONumFax",
        "awlc02WoONumCelula",
        "awlc02WoOPagWeb",
        "awlc02WoOCalleTit",
        "awlc02WoONumTit",
        "awlc02WoOPisoTit",
        "awlc02WoODptoTit",
        "awlc02WoODescComunTit",
        "awlc02WoODescCiudaTit",
        "awlc02WoOLineas",
        "awlc02WoORespaldo"
    })
    public static class Awlc02WoSalida {

        @XmlElement(name = "awlc02wo_o_cod_ret", required = true, nillable = true)
        protected String awlc02WoOCodRet;
        @XmlElement(name = "awlc02wo_o_desc_cod_ret", required = true, nillable = true)
        protected String awlc02WoODescCodRet;
        @XmlElement(name = "awlc02wo_o_sqlcode", required = true, type = Long.class, nillable = true)
        protected Long awlc02WoOSqlcode;
        @XmlElement(name = "awlc02wo_o_parrafo", required = true, nillable = true)
        protected String awlc02WoOParrafo;
        @XmlElement(name = "awlc02wo_o_finpaginacion", required = true, nillable = true)
        protected String awlc02WoOFinpaginacion;
        @XmlElement(name = "awlc02wo_o_numregistros", required = true, type = Long.class, nillable = true)
        protected Long awlc02WoONumregistros;
        @XmlElement(name = "awlc02wo_o_nom_pag", required = true, nillable = true)
        protected String awlc02WoONomPag;
        @XmlElement(name = "awlc02wo_o_ape1_pag", required = true, nillable = true)
        protected String awlc02WoOApe1Pag;
        @XmlElement(name = "awlc02wo_o_ape2_pag", required = true, nillable = true)
        protected String awlc02WoOApe2Pag;
        @XmlElement(name = "awlc02wo_o_nom_tit", required = true, nillable = true)
        protected String awlc02WoONomTit;
        @XmlElement(name = "awlc02wo_o_ape1_tit", required = true, nillable = true)
        protected String awlc02WoOApe1Tit;
        @XmlElement(name = "awlc02wo_o_ape2_tit", required = true, nillable = true)
        protected String awlc02WoOApe2Tit;
        @XmlElement(name = "awlc02wo_o_rut_tit", required = true, nillable = true)
        protected String awlc02WoORutTit;
        @XmlElement(name = "awlc02wo_o_dvf_tit", required = true, nillable = true)
        protected String awlc02WoODvfTit;
        @XmlElement(name = "awlc02wo_o_sec_tit", required = true, type = Long.class, nillable = true)
        protected Long awlc02WoOSecTit;
        @XmlElement(name = "awlc02wo_o_raz_soc", required = true, nillable = true)
        protected String awlc02WoORazSoc;
        @XmlElement(name = "awlc02wo_o_nom_fan", required = true, nillable = true)
        protected String awlc02WoONomFan;
        @XmlElement(name = "awlc02wo_o_cod_giro", required = true, nillable = true)
        protected String awlc02WoOCodGiro;
        @XmlElement(name = "awlc02wo_o_tipo_clie", required = true, nillable = true)
        protected String awlc02WoOTipoClie;
        @XmlElement(name = "awlc02wo_o_tipo_seg", required = true, nillable = true)
        protected String awlc02WoOTipoSeg;
        @XmlElement(name = "awlc02wo_o_desc_tipo_clie", required = true, nillable = true)
        protected String awlc02WoODescTipoClie;
        @XmlElement(name = "awlc02wo_o_cod_seg", required = true, nillable = true)
        protected String awlc02WoOCodSeg;
        @XmlElement(name = "awlc02wo_o_desc_seg", required = true, nillable = true)
        protected String awlc02WoODescSeg;
        @XmlElement(name = "awlc02wo_o_cod_sub_seg", required = true, nillable = true)
        protected String awlc02WoOCodSubSeg;
        @XmlElement(name = "awlc02wo_o_tipo_clie_mac", required = true, nillable = true)
        protected String awlc02WoOTipoClieMac;
        @XmlElement(name = "awlc02wo_o_desc_clie_mac", required = true, nillable = true)
        protected String awlc02WoODescClieMac;
        @XmlElement(name = "awlc02wo_o_desc_sub_seg", required = true, nillable = true)
        protected String awlc02WoODescSubSeg;
        @XmlElement(name = "awlc02wo_o_mail_cliente", required = true, nillable = true)
        protected String awlc02WoOMailCliente;
        @XmlElement(name = "awlc02wo_o_fecha_alt_clte", required = true, nillable = true)
        protected String awlc02WoOFechaAltClte;
        @XmlElement(name = "awlc02wo_o_area_fax", required = true, nillable = true)
        protected String awlc02WoOAreaFax;
        @XmlElement(name = "awlc02wo_o_num_fax", required = true, nillable = true)
        protected String awlc02WoONumFax;
        @XmlElement(name = "awlc02wo_o_num_celula", required = true, nillable = true)
        protected String awlc02WoONumCelula;
        @XmlElement(name = "awlc02wo_o_pag_web", required = true, nillable = true)
        protected String awlc02WoOPagWeb;
        @XmlElement(name = "awlc02wo_o_calle_tit", required = true, nillable = true)
        protected String awlc02WoOCalleTit;
        @XmlElement(name = "awlc02wo_o_num_tit", required = true, nillable = true)
        protected String awlc02WoONumTit;
        @XmlElement(name = "awlc02wo_o_piso_tit", required = true, nillable = true)
        protected String awlc02WoOPisoTit;
        @XmlElement(name = "awlc02wo_o_dpto_tit", required = true, nillable = true)
        protected String awlc02WoODptoTit;
        @XmlElement(name = "awlc02wo_o_desc_comun_tit", required = true, nillable = true)
        protected String awlc02WoODescComunTit;
        @XmlElement(name = "awlc02wo_o_desc_ciuda_tit", required = true, nillable = true)
        protected String awlc02WoODescCiudaTit;
        @XmlElement(name = "awlc02wo_o_lineas")
        protected List<ProgramInterface.Awlc02WoSalida.Awlc02WoOLineas> awlc02WoOLineas;
        @XmlElement(name = "awlc02wo_o_respaldo", required = true, nillable = true)
        protected String awlc02WoORespaldo;

        /**
         * Obtiene el valor de la propiedad awlc02WoOCodRet.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoOCodRet() {
            return awlc02WoOCodRet;
        }

        /**
         * Define el valor de la propiedad awlc02WoOCodRet.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoOCodRet(String value) {
            this.awlc02WoOCodRet = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoODescCodRet.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoODescCodRet() {
            return awlc02WoODescCodRet;
        }

        /**
         * Define el valor de la propiedad awlc02WoODescCodRet.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoODescCodRet(String value) {
            this.awlc02WoODescCodRet = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoOSqlcode.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAwlc02WoOSqlcode() {
            return awlc02WoOSqlcode;
        }

        /**
         * Define el valor de la propiedad awlc02WoOSqlcode.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAwlc02WoOSqlcode(Long value) {
            this.awlc02WoOSqlcode = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoOParrafo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoOParrafo() {
            return awlc02WoOParrafo;
        }

        /**
         * Define el valor de la propiedad awlc02WoOParrafo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoOParrafo(String value) {
            this.awlc02WoOParrafo = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoOFinpaginacion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoOFinpaginacion() {
            return awlc02WoOFinpaginacion;
        }

        /**
         * Define el valor de la propiedad awlc02WoOFinpaginacion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoOFinpaginacion(String value) {
            this.awlc02WoOFinpaginacion = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoONumregistros.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAwlc02WoONumregistros() {
            return awlc02WoONumregistros;
        }

        /**
         * Define el valor de la propiedad awlc02WoONumregistros.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAwlc02WoONumregistros(Long value) {
            this.awlc02WoONumregistros = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoONomPag.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoONomPag() {
            return awlc02WoONomPag;
        }

        /**
         * Define el valor de la propiedad awlc02WoONomPag.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoONomPag(String value) {
            this.awlc02WoONomPag = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoOApe1Pag.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoOApe1Pag() {
            return awlc02WoOApe1Pag;
        }

        /**
         * Define el valor de la propiedad awlc02WoOApe1Pag.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoOApe1Pag(String value) {
            this.awlc02WoOApe1Pag = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoOApe2Pag.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoOApe2Pag() {
            return awlc02WoOApe2Pag;
        }

        /**
         * Define el valor de la propiedad awlc02WoOApe2Pag.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoOApe2Pag(String value) {
            this.awlc02WoOApe2Pag = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoONomTit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoONomTit() {
            return awlc02WoONomTit;
        }

        /**
         * Define el valor de la propiedad awlc02WoONomTit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoONomTit(String value) {
            this.awlc02WoONomTit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoOApe1Tit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoOApe1Tit() {
            return awlc02WoOApe1Tit;
        }

        /**
         * Define el valor de la propiedad awlc02WoOApe1Tit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoOApe1Tit(String value) {
            this.awlc02WoOApe1Tit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoOApe2Tit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoOApe2Tit() {
            return awlc02WoOApe2Tit;
        }

        /**
         * Define el valor de la propiedad awlc02WoOApe2Tit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoOApe2Tit(String value) {
            this.awlc02WoOApe2Tit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoORutTit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoORutTit() {
            return awlc02WoORutTit;
        }

        /**
         * Define el valor de la propiedad awlc02WoORutTit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoORutTit(String value) {
            this.awlc02WoORutTit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoODvfTit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoODvfTit() {
            return awlc02WoODvfTit;
        }

        /**
         * Define el valor de la propiedad awlc02WoODvfTit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoODvfTit(String value) {
            this.awlc02WoODvfTit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoOSecTit.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getAwlc02WoOSecTit() {
            return awlc02WoOSecTit;
        }

        /**
         * Define el valor de la propiedad awlc02WoOSecTit.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setAwlc02WoOSecTit(Long value) {
            this.awlc02WoOSecTit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoORazSoc.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoORazSoc() {
            return awlc02WoORazSoc;
        }

        /**
         * Define el valor de la propiedad awlc02WoORazSoc.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoORazSoc(String value) {
            this.awlc02WoORazSoc = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoONomFan.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoONomFan() {
            return awlc02WoONomFan;
        }

        /**
         * Define el valor de la propiedad awlc02WoONomFan.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoONomFan(String value) {
            this.awlc02WoONomFan = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoOCodGiro.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoOCodGiro() {
            return awlc02WoOCodGiro;
        }

        /**
         * Define el valor de la propiedad awlc02WoOCodGiro.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoOCodGiro(String value) {
            this.awlc02WoOCodGiro = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoOTipoClie.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoOTipoClie() {
            return awlc02WoOTipoClie;
        }

        /**
         * Define el valor de la propiedad awlc02WoOTipoClie.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoOTipoClie(String value) {
            this.awlc02WoOTipoClie = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoOTipoSeg.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoOTipoSeg() {
            return awlc02WoOTipoSeg;
        }

        /**
         * Define el valor de la propiedad awlc02WoOTipoSeg.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoOTipoSeg(String value) {
            this.awlc02WoOTipoSeg = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoODescTipoClie.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoODescTipoClie() {
            return awlc02WoODescTipoClie;
        }

        /**
         * Define el valor de la propiedad awlc02WoODescTipoClie.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoODescTipoClie(String value) {
            this.awlc02WoODescTipoClie = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoOCodSeg.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoOCodSeg() {
            return awlc02WoOCodSeg;
        }

        /**
         * Define el valor de la propiedad awlc02WoOCodSeg.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoOCodSeg(String value) {
            this.awlc02WoOCodSeg = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoODescSeg.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoODescSeg() {
            return awlc02WoODescSeg;
        }

        /**
         * Define el valor de la propiedad awlc02WoODescSeg.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoODescSeg(String value) {
            this.awlc02WoODescSeg = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoOCodSubSeg.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoOCodSubSeg() {
            return awlc02WoOCodSubSeg;
        }

        /**
         * Define el valor de la propiedad awlc02WoOCodSubSeg.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoOCodSubSeg(String value) {
            this.awlc02WoOCodSubSeg = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoOTipoClieMac.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoOTipoClieMac() {
            return awlc02WoOTipoClieMac;
        }

        /**
         * Define el valor de la propiedad awlc02WoOTipoClieMac.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoOTipoClieMac(String value) {
            this.awlc02WoOTipoClieMac = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoODescClieMac.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoODescClieMac() {
            return awlc02WoODescClieMac;
        }

        /**
         * Define el valor de la propiedad awlc02WoODescClieMac.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoODescClieMac(String value) {
            this.awlc02WoODescClieMac = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoODescSubSeg.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoODescSubSeg() {
            return awlc02WoODescSubSeg;
        }

        /**
         * Define el valor de la propiedad awlc02WoODescSubSeg.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoODescSubSeg(String value) {
            this.awlc02WoODescSubSeg = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoOMailCliente.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoOMailCliente() {
            return awlc02WoOMailCliente;
        }

        /**
         * Define el valor de la propiedad awlc02WoOMailCliente.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoOMailCliente(String value) {
            this.awlc02WoOMailCliente = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoOFechaAltClte.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoOFechaAltClte() {
            return awlc02WoOFechaAltClte;
        }

        /**
         * Define el valor de la propiedad awlc02WoOFechaAltClte.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoOFechaAltClte(String value) {
            this.awlc02WoOFechaAltClte = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoOAreaFax.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoOAreaFax() {
            return awlc02WoOAreaFax;
        }

        /**
         * Define el valor de la propiedad awlc02WoOAreaFax.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoOAreaFax(String value) {
            this.awlc02WoOAreaFax = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoONumFax.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoONumFax() {
            return awlc02WoONumFax;
        }

        /**
         * Define el valor de la propiedad awlc02WoONumFax.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoONumFax(String value) {
            this.awlc02WoONumFax = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoONumCelula.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoONumCelula() {
            return awlc02WoONumCelula;
        }

        /**
         * Define el valor de la propiedad awlc02WoONumCelula.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoONumCelula(String value) {
            this.awlc02WoONumCelula = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoOPagWeb.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoOPagWeb() {
            return awlc02WoOPagWeb;
        }

        /**
         * Define el valor de la propiedad awlc02WoOPagWeb.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoOPagWeb(String value) {
            this.awlc02WoOPagWeb = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoOCalleTit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoOCalleTit() {
            return awlc02WoOCalleTit;
        }

        /**
         * Define el valor de la propiedad awlc02WoOCalleTit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoOCalleTit(String value) {
            this.awlc02WoOCalleTit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoONumTit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoONumTit() {
            return awlc02WoONumTit;
        }

        /**
         * Define el valor de la propiedad awlc02WoONumTit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoONumTit(String value) {
            this.awlc02WoONumTit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoOPisoTit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoOPisoTit() {
            return awlc02WoOPisoTit;
        }

        /**
         * Define el valor de la propiedad awlc02WoOPisoTit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoOPisoTit(String value) {
            this.awlc02WoOPisoTit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoODptoTit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoODptoTit() {
            return awlc02WoODptoTit;
        }

        /**
         * Define el valor de la propiedad awlc02WoODptoTit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoODptoTit(String value) {
            this.awlc02WoODptoTit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoODescComunTit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoODescComunTit() {
            return awlc02WoODescComunTit;
        }

        /**
         * Define el valor de la propiedad awlc02WoODescComunTit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoODescComunTit(String value) {
            this.awlc02WoODescComunTit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoODescCiudaTit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoODescCiudaTit() {
            return awlc02WoODescCiudaTit;
        }

        /**
         * Define el valor de la propiedad awlc02WoODescCiudaTit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoODescCiudaTit(String value) {
            this.awlc02WoODescCiudaTit = value;
        }

        /**
         * Gets the value of the awlc02WoOLineas property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the awlc02WoOLineas property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAwlc02WoOLineas().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProgramInterface.Awlc02WoSalida.Awlc02WoOLineas }
         * 
         * 
         */
        public List<ProgramInterface.Awlc02WoSalida.Awlc02WoOLineas> getAwlc02WoOLineas() {
            if (awlc02WoOLineas == null) {
                awlc02WoOLineas = new ArrayList<ProgramInterface.Awlc02WoSalida.Awlc02WoOLineas>();
            }
            return this.awlc02WoOLineas;
        }

        /**
         * Obtiene el valor de la propiedad awlc02WoORespaldo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc02WoORespaldo() {
            return awlc02WoORespaldo;
        }

        /**
         * Define el valor de la propiedad awlc02WoORespaldo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc02WoORespaldo(String value) {
            this.awlc02WoORespaldo = value;
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
         *         &lt;element name="awlc02wo_o_area"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_fono"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="8"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_sec_linea"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="12"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_calle_inst"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="40"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_num_inst"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="6"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_piso_inst"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="2"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_dpto_inst"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="6"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_cod_post_inst"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="7"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_cod_comun"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_desc_comun_inst"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="15"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_ciuda_inst"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="15"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_zona"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="2"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_central"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="2"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_desc_zona_cent"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="25"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_pta_comercial"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="4"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_fec_instalacion"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="10"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_tipo_linea"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="2"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_desc_tipo_linea"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="15"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_ind_fact"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="1"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_ind_pagadora"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="1"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_est_linea"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="30"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_cod_agencia"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="4"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_desc_agencia"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="30"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_fec_alta_li"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="10"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_fec_fin_vi"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="10"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_clie"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
         *               &lt;maxInclusive value="999999999"/&gt;
         *               &lt;minInclusive value="0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_num_cuen"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
         *               &lt;maxInclusive value="999999999"/&gt;
         *               &lt;minInclusive value="0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc02wo_o_direccion_cob" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="awlc02wo_o_calle_cob"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="40"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="awlc02wo_o_num_cob"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="awlc02wo_o_dpto_cob"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="awlc02wo_o_post_cob"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="7"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="awlc02wo_o_cod_comun_cob"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="3"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="awlc02wo_o_desc_comun_cob"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="15"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="awlc02wo_o_ciuda_cob"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="15"/&gt;
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
            "awlc02WoOArea",
            "awlc02WoOFono",
            "awlc02WoOSecLinea",
            "awlc02WoOCalleInst",
            "awlc02WoONumInst",
            "awlc02WoOPisoInst",
            "awlc02WoODptoInst",
            "awlc02WoOCodPostInst",
            "awlc02WoOCodComun",
            "awlc02WoODescComunInst",
            "awlc02WoOCiudaInst",
            "awlc02WoOZona",
            "awlc02WoOCentral",
            "awlc02WoODescZonaCent",
            "awlc02WoOPtaComercial",
            "awlc02WoOFecInstalacion",
            "awlc02WoOTipoLinea",
            "awlc02WoODescTipoLinea",
            "awlc02WoOIndFact",
            "awlc02WoOIndPagadora",
            "awlc02WoOEstLinea",
            "awlc02WoOCodAgencia",
            "awlc02WoODescAgencia",
            "awlc02WoOFecAltaLi",
            "awlc02WoOFecFinVi",
            "awlc02WoOClie",
            "awlc02WoONumCuen",
            "awlc02WoODireccionCob"
        })
        public static class Awlc02WoOLineas {

            @XmlElement(name = "awlc02wo_o_area", required = true, nillable = true)
            protected String awlc02WoOArea;
            @XmlElement(name = "awlc02wo_o_fono", required = true, nillable = true)
            protected String awlc02WoOFono;
            @XmlElement(name = "awlc02wo_o_sec_linea", required = true, nillable = true)
            protected String awlc02WoOSecLinea;
            @XmlElement(name = "awlc02wo_o_calle_inst", required = true, nillable = true)
            protected String awlc02WoOCalleInst;
            @XmlElement(name = "awlc02wo_o_num_inst", required = true, nillable = true)
            protected String awlc02WoONumInst;
            @XmlElement(name = "awlc02wo_o_piso_inst", required = true, nillable = true)
            protected String awlc02WoOPisoInst;
            @XmlElement(name = "awlc02wo_o_dpto_inst", required = true, nillable = true)
            protected String awlc02WoODptoInst;
            @XmlElement(name = "awlc02wo_o_cod_post_inst", required = true, nillable = true)
            protected String awlc02WoOCodPostInst;
            @XmlElement(name = "awlc02wo_o_cod_comun", required = true, nillable = true)
            protected String awlc02WoOCodComun;
            @XmlElement(name = "awlc02wo_o_desc_comun_inst", required = true, nillable = true)
            protected String awlc02WoODescComunInst;
            @XmlElement(name = "awlc02wo_o_ciuda_inst", required = true, nillable = true)
            protected String awlc02WoOCiudaInst;
            @XmlElement(name = "awlc02wo_o_zona", required = true, nillable = true)
            protected String awlc02WoOZona;
            @XmlElement(name = "awlc02wo_o_central", required = true, nillable = true)
            protected String awlc02WoOCentral;
            @XmlElement(name = "awlc02wo_o_desc_zona_cent", required = true, nillable = true)
            protected String awlc02WoODescZonaCent;
            @XmlElement(name = "awlc02wo_o_pta_comercial", required = true, nillable = true)
            protected String awlc02WoOPtaComercial;
            @XmlElement(name = "awlc02wo_o_fec_instalacion", required = true, nillable = true)
            protected String awlc02WoOFecInstalacion;
            @XmlElement(name = "awlc02wo_o_tipo_linea", required = true, nillable = true)
            protected String awlc02WoOTipoLinea;
            @XmlElement(name = "awlc02wo_o_desc_tipo_linea", required = true, nillable = true)
            protected String awlc02WoODescTipoLinea;
            @XmlElement(name = "awlc02wo_o_ind_fact", required = true, nillable = true)
            protected String awlc02WoOIndFact;
            @XmlElement(name = "awlc02wo_o_ind_pagadora", required = true, nillable = true)
            protected String awlc02WoOIndPagadora;
            @XmlElement(name = "awlc02wo_o_est_linea", required = true, nillable = true)
            protected String awlc02WoOEstLinea;
            @XmlElement(name = "awlc02wo_o_cod_agencia", required = true, nillable = true)
            protected String awlc02WoOCodAgencia;
            @XmlElement(name = "awlc02wo_o_desc_agencia", required = true, nillable = true)
            protected String awlc02WoODescAgencia;
            @XmlElement(name = "awlc02wo_o_fec_alta_li", required = true, nillable = true)
            protected String awlc02WoOFecAltaLi;
            @XmlElement(name = "awlc02wo_o_fec_fin_vi", required = true, nillable = true)
            protected String awlc02WoOFecFinVi;
            @XmlElement(name = "awlc02wo_o_clie", required = true, type = Long.class, nillable = true)
            protected Long awlc02WoOClie;
            @XmlElement(name = "awlc02wo_o_num_cuen", required = true, type = Long.class, nillable = true)
            protected Long awlc02WoONumCuen;
            @XmlElement(name = "awlc02wo_o_direccion_cob")
            protected ProgramInterface.Awlc02WoSalida.Awlc02WoOLineas.Awlc02WoODireccionCob awlc02WoODireccionCob;

            /**
             * Obtiene el valor de la propiedad awlc02WoOArea.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc02WoOArea() {
                return awlc02WoOArea;
            }

            /**
             * Define el valor de la propiedad awlc02WoOArea.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc02WoOArea(String value) {
                this.awlc02WoOArea = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoOFono.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc02WoOFono() {
                return awlc02WoOFono;
            }

            /**
             * Define el valor de la propiedad awlc02WoOFono.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc02WoOFono(String value) {
                this.awlc02WoOFono = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoOSecLinea.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc02WoOSecLinea() {
                return awlc02WoOSecLinea;
            }

            /**
             * Define el valor de la propiedad awlc02WoOSecLinea.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc02WoOSecLinea(String value) {
                this.awlc02WoOSecLinea = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoOCalleInst.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc02WoOCalleInst() {
                return awlc02WoOCalleInst;
            }

            /**
             * Define el valor de la propiedad awlc02WoOCalleInst.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc02WoOCalleInst(String value) {
                this.awlc02WoOCalleInst = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoONumInst.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc02WoONumInst() {
                return awlc02WoONumInst;
            }

            /**
             * Define el valor de la propiedad awlc02WoONumInst.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc02WoONumInst(String value) {
                this.awlc02WoONumInst = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoOPisoInst.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc02WoOPisoInst() {
                return awlc02WoOPisoInst;
            }

            /**
             * Define el valor de la propiedad awlc02WoOPisoInst.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc02WoOPisoInst(String value) {
                this.awlc02WoOPisoInst = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoODptoInst.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc02WoODptoInst() {
                return awlc02WoODptoInst;
            }

            /**
             * Define el valor de la propiedad awlc02WoODptoInst.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc02WoODptoInst(String value) {
                this.awlc02WoODptoInst = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoOCodPostInst.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc02WoOCodPostInst() {
                return awlc02WoOCodPostInst;
            }

            /**
             * Define el valor de la propiedad awlc02WoOCodPostInst.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc02WoOCodPostInst(String value) {
                this.awlc02WoOCodPostInst = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoOCodComun.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc02WoOCodComun() {
                return awlc02WoOCodComun;
            }

            /**
             * Define el valor de la propiedad awlc02WoOCodComun.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc02WoOCodComun(String value) {
                this.awlc02WoOCodComun = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoODescComunInst.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc02WoODescComunInst() {
                return awlc02WoODescComunInst;
            }

            /**
             * Define el valor de la propiedad awlc02WoODescComunInst.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc02WoODescComunInst(String value) {
                this.awlc02WoODescComunInst = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoOCiudaInst.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc02WoOCiudaInst() {
                return awlc02WoOCiudaInst;
            }

            /**
             * Define el valor de la propiedad awlc02WoOCiudaInst.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc02WoOCiudaInst(String value) {
                this.awlc02WoOCiudaInst = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoOZona.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc02WoOZona() {
                return awlc02WoOZona;
            }

            /**
             * Define el valor de la propiedad awlc02WoOZona.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc02WoOZona(String value) {
                this.awlc02WoOZona = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoOCentral.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc02WoOCentral() {
                return awlc02WoOCentral;
            }

            /**
             * Define el valor de la propiedad awlc02WoOCentral.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc02WoOCentral(String value) {
                this.awlc02WoOCentral = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoODescZonaCent.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc02WoODescZonaCent() {
                return awlc02WoODescZonaCent;
            }

            /**
             * Define el valor de la propiedad awlc02WoODescZonaCent.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc02WoODescZonaCent(String value) {
                this.awlc02WoODescZonaCent = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoOPtaComercial.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc02WoOPtaComercial() {
                return awlc02WoOPtaComercial;
            }

            /**
             * Define el valor de la propiedad awlc02WoOPtaComercial.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc02WoOPtaComercial(String value) {
                this.awlc02WoOPtaComercial = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoOFecInstalacion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc02WoOFecInstalacion() {
                return awlc02WoOFecInstalacion;
            }

            /**
             * Define el valor de la propiedad awlc02WoOFecInstalacion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc02WoOFecInstalacion(String value) {
                this.awlc02WoOFecInstalacion = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoOTipoLinea.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc02WoOTipoLinea() {
                return awlc02WoOTipoLinea;
            }

            /**
             * Define el valor de la propiedad awlc02WoOTipoLinea.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc02WoOTipoLinea(String value) {
                this.awlc02WoOTipoLinea = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoODescTipoLinea.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc02WoODescTipoLinea() {
                return awlc02WoODescTipoLinea;
            }

            /**
             * Define el valor de la propiedad awlc02WoODescTipoLinea.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc02WoODescTipoLinea(String value) {
                this.awlc02WoODescTipoLinea = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoOIndFact.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc02WoOIndFact() {
                return awlc02WoOIndFact;
            }

            /**
             * Define el valor de la propiedad awlc02WoOIndFact.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc02WoOIndFact(String value) {
                this.awlc02WoOIndFact = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoOIndPagadora.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc02WoOIndPagadora() {
                return awlc02WoOIndPagadora;
            }

            /**
             * Define el valor de la propiedad awlc02WoOIndPagadora.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc02WoOIndPagadora(String value) {
                this.awlc02WoOIndPagadora = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoOEstLinea.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc02WoOEstLinea() {
                return awlc02WoOEstLinea;
            }

            /**
             * Define el valor de la propiedad awlc02WoOEstLinea.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc02WoOEstLinea(String value) {
                this.awlc02WoOEstLinea = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoOCodAgencia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc02WoOCodAgencia() {
                return awlc02WoOCodAgencia;
            }

            /**
             * Define el valor de la propiedad awlc02WoOCodAgencia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc02WoOCodAgencia(String value) {
                this.awlc02WoOCodAgencia = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoODescAgencia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc02WoODescAgencia() {
                return awlc02WoODescAgencia;
            }

            /**
             * Define el valor de la propiedad awlc02WoODescAgencia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc02WoODescAgencia(String value) {
                this.awlc02WoODescAgencia = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoOFecAltaLi.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc02WoOFecAltaLi() {
                return awlc02WoOFecAltaLi;
            }

            /**
             * Define el valor de la propiedad awlc02WoOFecAltaLi.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc02WoOFecAltaLi(String value) {
                this.awlc02WoOFecAltaLi = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoOFecFinVi.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc02WoOFecFinVi() {
                return awlc02WoOFecFinVi;
            }

            /**
             * Define el valor de la propiedad awlc02WoOFecFinVi.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc02WoOFecFinVi(String value) {
                this.awlc02WoOFecFinVi = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoOClie.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAwlc02WoOClie() {
                return awlc02WoOClie;
            }

            /**
             * Define el valor de la propiedad awlc02WoOClie.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAwlc02WoOClie(Long value) {
                this.awlc02WoOClie = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoONumCuen.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getAwlc02WoONumCuen() {
                return awlc02WoONumCuen;
            }

            /**
             * Define el valor de la propiedad awlc02WoONumCuen.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setAwlc02WoONumCuen(Long value) {
                this.awlc02WoONumCuen = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc02WoODireccionCob.
             * 
             * @return
             *     possible object is
             *     {@link ProgramInterface.Awlc02WoSalida.Awlc02WoOLineas.Awlc02WoODireccionCob }
             *     
             */
            public ProgramInterface.Awlc02WoSalida.Awlc02WoOLineas.Awlc02WoODireccionCob getAwlc02WoODireccionCob() {
                return awlc02WoODireccionCob;
            }

            /**
             * Define el valor de la propiedad awlc02WoODireccionCob.
             * 
             * @param value
             *     allowed object is
             *     {@link ProgramInterface.Awlc02WoSalida.Awlc02WoOLineas.Awlc02WoODireccionCob }
             *     
             */
            public void setAwlc02WoODireccionCob(ProgramInterface.Awlc02WoSalida.Awlc02WoOLineas.Awlc02WoODireccionCob value) {
                this.awlc02WoODireccionCob = value;
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
             *         &lt;element name="awlc02wo_o_calle_cob"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="40"/&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="awlc02wo_o_num_cob"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="awlc02wo_o_dpto_cob"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="awlc02wo_o_post_cob"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="7"/&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="awlc02wo_o_cod_comun_cob"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="3"/&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="awlc02wo_o_desc_comun_cob"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="15"/&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="awlc02wo_o_ciuda_cob"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="15"/&gt;
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
                "awlc02WoOCalleCob",
                "awlc02WoONumCob",
                "awlc02WoODptoCob",
                "awlc02WoOPostCob",
                "awlc02WoOCodComunCob",
                "awlc02WoODescComunCob",
                "awlc02WoOCiudaCob"
            })
            public static class Awlc02WoODireccionCob {

                @XmlElement(name = "awlc02wo_o_calle_cob", required = true, nillable = true)
                protected String awlc02WoOCalleCob;
                @XmlElement(name = "awlc02wo_o_num_cob", required = true, nillable = true)
                protected String awlc02WoONumCob;
                @XmlElement(name = "awlc02wo_o_dpto_cob", required = true, nillable = true)
                protected String awlc02WoODptoCob;
                @XmlElement(name = "awlc02wo_o_post_cob", required = true, nillable = true)
                protected String awlc02WoOPostCob;
                @XmlElement(name = "awlc02wo_o_cod_comun_cob", required = true, nillable = true)
                protected String awlc02WoOCodComunCob;
                @XmlElement(name = "awlc02wo_o_desc_comun_cob", required = true, nillable = true)
                protected String awlc02WoODescComunCob;
                @XmlElement(name = "awlc02wo_o_ciuda_cob", required = true, nillable = true)
                protected String awlc02WoOCiudaCob;

                /**
                 * Obtiene el valor de la propiedad awlc02WoOCalleCob.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwlc02WoOCalleCob() {
                    return awlc02WoOCalleCob;
                }

                /**
                 * Define el valor de la propiedad awlc02WoOCalleCob.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwlc02WoOCalleCob(String value) {
                    this.awlc02WoOCalleCob = value;
                }

                /**
                 * Obtiene el valor de la propiedad awlc02WoONumCob.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwlc02WoONumCob() {
                    return awlc02WoONumCob;
                }

                /**
                 * Define el valor de la propiedad awlc02WoONumCob.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwlc02WoONumCob(String value) {
                    this.awlc02WoONumCob = value;
                }

                /**
                 * Obtiene el valor de la propiedad awlc02WoODptoCob.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwlc02WoODptoCob() {
                    return awlc02WoODptoCob;
                }

                /**
                 * Define el valor de la propiedad awlc02WoODptoCob.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwlc02WoODptoCob(String value) {
                    this.awlc02WoODptoCob = value;
                }

                /**
                 * Obtiene el valor de la propiedad awlc02WoOPostCob.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwlc02WoOPostCob() {
                    return awlc02WoOPostCob;
                }

                /**
                 * Define el valor de la propiedad awlc02WoOPostCob.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwlc02WoOPostCob(String value) {
                    this.awlc02WoOPostCob = value;
                }

                /**
                 * Obtiene el valor de la propiedad awlc02WoOCodComunCob.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwlc02WoOCodComunCob() {
                    return awlc02WoOCodComunCob;
                }

                /**
                 * Define el valor de la propiedad awlc02WoOCodComunCob.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwlc02WoOCodComunCob(String value) {
                    this.awlc02WoOCodComunCob = value;
                }

                /**
                 * Obtiene el valor de la propiedad awlc02WoODescComunCob.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwlc02WoODescComunCob() {
                    return awlc02WoODescComunCob;
                }

                /**
                 * Define el valor de la propiedad awlc02WoODescComunCob.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwlc02WoODescComunCob(String value) {
                    this.awlc02WoODescComunCob = value;
                }

                /**
                 * Obtiene el valor de la propiedad awlc02WoOCiudaCob.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwlc02WoOCiudaCob() {
                    return awlc02WoOCiudaCob;
                }

                /**
                 * Define el valor de la propiedad awlc02WoOCiudaCob.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwlc02WoOCiudaCob(String value) {
                    this.awlc02WoOCiudaCob = value;
                }

            }

        }

    }

}
