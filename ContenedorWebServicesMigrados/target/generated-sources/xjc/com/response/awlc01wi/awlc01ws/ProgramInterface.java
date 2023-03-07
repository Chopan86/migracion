//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.03.07 a las 04:06:18 PM CLST 
//


package com.response.awlc01wi.awlc01ws;

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
 *         &lt;element name="awlc01z3_salida"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="awlc01z3_o_cod_ret"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_desc_cod_ret"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="50"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_sqlcode"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                         &lt;maxInclusive value="999999999"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_parrafo"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="50"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_finpaginacion"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_numregistros"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *                         &lt;maxInclusive value="99"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_nom_pag"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_ape1_pag"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_ape2_pag"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_nom_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_ape1_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_ape2_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_rut_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_dvf_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_sec_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                         &lt;maxInclusive value="999999999"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_raz_soc"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="60"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_nom_fan"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_cod_giro"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="5"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_tipo_clie"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_tipo_seg"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_desc_tipo_clie"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_cod_seg"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_desc_seg"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_cod_sub_seg"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_desc_sub_seg"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_mail_cliente"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="60"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_fecha_alt_clte"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_area_fax"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_num_fax"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="8"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_num_celula"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_pag_web"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="60"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_calle_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="40"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_num_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="6"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_piso_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_dpto_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="6"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_desc_comun_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_desc_ciuda_tit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="awlc01z3_o_lineas" maxOccurs="40" minOccurs="40"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="awlc01z3_o_area"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_fono"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="8"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_sec_linea"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="12"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_calle_inst"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="40"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_num_inst"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="6"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_piso_inst"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="2"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_dpto_inst"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="6"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_cod_post_inst"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="7"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_cod_comun"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_desc_comun_inst"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="15"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_ciuda_inst"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="15"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_zona"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="2"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_central"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="2"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_desc_zona_cent"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="25"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_pta_comercial"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="4"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_fec_instalacion"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_tipo_linea"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="2"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_desc_tipo_linea"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="15"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_ind_fact"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="1"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_ind_pagadora"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="1"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_est_linea"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="30"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_cod_agencia"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="4"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_desc_agencia"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="30"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_fec_alta_li"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_fec_fin_vi"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="10"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_clie"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                                   &lt;maxInclusive value="999999999"/&gt;
 *                                   &lt;minInclusive value="0"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_num_cuen"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *                                   &lt;maxInclusive value="999999999"/&gt;
 *                                   &lt;minInclusive value="0"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="awlc01z3_o_direccion_cob"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="awlc01z3_o_calle_cob"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="40"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="awlc01z3_o_num_cob"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="awlc01z3_o_dpto_cob"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="6"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="awlc01z3_o_post_cob"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="7"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="awlc01z3_o_cod_comun_cob"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="3"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="awlc01z3_o_desc_comun_cob"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="15"/&gt;
 *                                             &lt;whiteSpace value="preserve"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="awlc01z3_o_ciuda_cob"&gt;
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
    "awlc01Z3Salida"
})
public class ProgramInterface {

    @XmlElement(name = "awlc01z3_salida", required = true)
    protected ProgramInterface.Awlc01Z3Salida awlc01Z3Salida;

    /**
     * Obtiene el valor de la propiedad awlc01Z3Salida.
     * 
     * @return
     *     possible object is
     *     {@link ProgramInterface.Awlc01Z3Salida }
     *     
     */
    public ProgramInterface.Awlc01Z3Salida getAwlc01Z3Salida() {
        return awlc01Z3Salida;
    }

    /**
     * Define el valor de la propiedad awlc01Z3Salida.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramInterface.Awlc01Z3Salida }
     *     
     */
    public void setAwlc01Z3Salida(ProgramInterface.Awlc01Z3Salida value) {
        this.awlc01Z3Salida = value;
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
     *         &lt;element name="awlc01z3_o_cod_ret"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="3"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_desc_cod_ret"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="50"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_sqlcode"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *               &lt;maxInclusive value="999999999"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_parrafo"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="50"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_finpaginacion"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_numregistros"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
     *               &lt;maxInclusive value="99"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_nom_pag"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_ape1_pag"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="20"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_ape2_pag"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="20"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_nom_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_ape1_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="20"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_ape2_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="20"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_rut_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="12"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_dvf_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_sec_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *               &lt;maxInclusive value="999999999"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_raz_soc"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="60"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_nom_fan"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_cod_giro"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="5"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_tipo_clie"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_tipo_seg"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_desc_tipo_clie"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="15"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_cod_seg"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="3"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_desc_seg"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_cod_sub_seg"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="3"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_desc_sub_seg"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_mail_cliente"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="60"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_fecha_alt_clte"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="10"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_area_fax"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="3"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_num_fax"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="8"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_num_celula"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="10"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_pag_web"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="60"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_calle_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="40"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_num_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="6"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_piso_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="2"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_dpto_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="6"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_desc_comun_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_desc_ciuda_tit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="15"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="awlc01z3_o_lineas" maxOccurs="40" minOccurs="40"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="awlc01z3_o_area"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_fono"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="8"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_sec_linea"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="12"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_calle_inst"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="40"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_num_inst"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="6"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_piso_inst"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="2"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_dpto_inst"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="6"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_cod_post_inst"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="7"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_cod_comun"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_desc_comun_inst"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="15"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_ciuda_inst"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="15"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_zona"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="2"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_central"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="2"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_desc_zona_cent"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="25"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_pta_comercial"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="4"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_fec_instalacion"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="10"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_tipo_linea"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="2"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_desc_tipo_linea"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="15"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_ind_fact"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="1"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_ind_pagadora"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="1"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_est_linea"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="30"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_cod_agencia"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="4"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_desc_agencia"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="30"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_fec_alta_li"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="10"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_fec_fin_vi"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="10"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_clie"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *                         &lt;maxInclusive value="999999999"/&gt;
     *                         &lt;minInclusive value="0"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_num_cuen"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
     *                         &lt;maxInclusive value="999999999"/&gt;
     *                         &lt;minInclusive value="0"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="awlc01z3_o_direccion_cob"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="awlc01z3_o_calle_cob"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="40"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="awlc01z3_o_num_cob"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="awlc01z3_o_dpto_cob"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="6"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="awlc01z3_o_post_cob"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="7"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="awlc01z3_o_cod_comun_cob"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="3"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="awlc01z3_o_desc_comun_cob"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="15"/&gt;
     *                                   &lt;whiteSpace value="preserve"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="awlc01z3_o_ciuda_cob"&gt;
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
        "awlc01Z3OCodRet",
        "awlc01Z3ODescCodRet",
        "awlc01Z3OSqlcode",
        "awlc01Z3OParrafo",
        "awlc01Z3OFinpaginacion",
        "awlc01Z3ONumregistros",
        "awlc01Z3ONomPag",
        "awlc01Z3OApe1Pag",
        "awlc01Z3OApe2Pag",
        "awlc01Z3ONomTit",
        "awlc01Z3OApe1Tit",
        "awlc01Z3OApe2Tit",
        "awlc01Z3ORutTit",
        "awlc01Z3ODvfTit",
        "awlc01Z3OSecTit",
        "awlc01Z3ORazSoc",
        "awlc01Z3ONomFan",
        "awlc01Z3OCodGiro",
        "awlc01Z3OTipoClie",
        "awlc01Z3OTipoSeg",
        "awlc01Z3ODescTipoClie",
        "awlc01Z3OCodSeg",
        "awlc01Z3ODescSeg",
        "awlc01Z3OCodSubSeg",
        "awlc01Z3ODescSubSeg",
        "awlc01Z3OMailCliente",
        "awlc01Z3OFechaAltClte",
        "awlc01Z3OAreaFax",
        "awlc01Z3ONumFax",
        "awlc01Z3ONumCelula",
        "awlc01Z3OPagWeb",
        "awlc01Z3OCalleTit",
        "awlc01Z3ONumTit",
        "awlc01Z3OPisoTit",
        "awlc01Z3ODptoTit",
        "awlc01Z3ODescComunTit",
        "awlc01Z3ODescCiudaTit",
        "awlc01Z3OLineas"
    })
    public static class Awlc01Z3Salida {

        @XmlElement(name = "awlc01z3_o_cod_ret", required = true)
        protected String awlc01Z3OCodRet;
        @XmlElement(name = "awlc01z3_o_desc_cod_ret", required = true)
        protected String awlc01Z3ODescCodRet;
        @XmlElement(name = "awlc01z3_o_sqlcode")
        protected long awlc01Z3OSqlcode;
        @XmlElement(name = "awlc01z3_o_parrafo", required = true)
        protected String awlc01Z3OParrafo;
        @XmlElement(name = "awlc01z3_o_finpaginacion", required = true)
        protected String awlc01Z3OFinpaginacion;
        @XmlElement(name = "awlc01z3_o_numregistros")
        protected int awlc01Z3ONumregistros;
        @XmlElement(name = "awlc01z3_o_nom_pag", required = true)
        protected String awlc01Z3ONomPag;
        @XmlElement(name = "awlc01z3_o_ape1_pag", required = true)
        protected String awlc01Z3OApe1Pag;
        @XmlElement(name = "awlc01z3_o_ape2_pag", required = true)
        protected String awlc01Z3OApe2Pag;
        @XmlElement(name = "awlc01z3_o_nom_tit", required = true)
        protected String awlc01Z3ONomTit;
        @XmlElement(name = "awlc01z3_o_ape1_tit", required = true)
        protected String awlc01Z3OApe1Tit;
        @XmlElement(name = "awlc01z3_o_ape2_tit", required = true)
        protected String awlc01Z3OApe2Tit;
        @XmlElement(name = "awlc01z3_o_rut_tit", required = true)
        protected String awlc01Z3ORutTit;
        @XmlElement(name = "awlc01z3_o_dvf_tit", required = true)
        protected String awlc01Z3ODvfTit;
        @XmlElement(name = "awlc01z3_o_sec_tit")
        protected long awlc01Z3OSecTit;
        @XmlElement(name = "awlc01z3_o_raz_soc", required = true)
        protected String awlc01Z3ORazSoc;
        @XmlElement(name = "awlc01z3_o_nom_fan", required = true)
        protected String awlc01Z3ONomFan;
        @XmlElement(name = "awlc01z3_o_cod_giro", required = true)
        protected String awlc01Z3OCodGiro;
        @XmlElement(name = "awlc01z3_o_tipo_clie", required = true)
        protected String awlc01Z3OTipoClie;
        @XmlElement(name = "awlc01z3_o_tipo_seg", required = true)
        protected String awlc01Z3OTipoSeg;
        @XmlElement(name = "awlc01z3_o_desc_tipo_clie", required = true)
        protected String awlc01Z3ODescTipoClie;
        @XmlElement(name = "awlc01z3_o_cod_seg", required = true)
        protected String awlc01Z3OCodSeg;
        @XmlElement(name = "awlc01z3_o_desc_seg", required = true)
        protected String awlc01Z3ODescSeg;
        @XmlElement(name = "awlc01z3_o_cod_sub_seg", required = true)
        protected String awlc01Z3OCodSubSeg;
        @XmlElement(name = "awlc01z3_o_desc_sub_seg", required = true)
        protected String awlc01Z3ODescSubSeg;
        @XmlElement(name = "awlc01z3_o_mail_cliente", required = true)
        protected String awlc01Z3OMailCliente;
        @XmlElement(name = "awlc01z3_o_fecha_alt_clte", required = true)
        protected String awlc01Z3OFechaAltClte;
        @XmlElement(name = "awlc01z3_o_area_fax", required = true)
        protected String awlc01Z3OAreaFax;
        @XmlElement(name = "awlc01z3_o_num_fax", required = true)
        protected String awlc01Z3ONumFax;
        @XmlElement(name = "awlc01z3_o_num_celula", required = true)
        protected String awlc01Z3ONumCelula;
        @XmlElement(name = "awlc01z3_o_pag_web", required = true)
        protected String awlc01Z3OPagWeb;
        @XmlElement(name = "awlc01z3_o_calle_tit", required = true)
        protected String awlc01Z3OCalleTit;
        @XmlElement(name = "awlc01z3_o_num_tit", required = true)
        protected String awlc01Z3ONumTit;
        @XmlElement(name = "awlc01z3_o_piso_tit", required = true)
        protected String awlc01Z3OPisoTit;
        @XmlElement(name = "awlc01z3_o_dpto_tit", required = true)
        protected String awlc01Z3ODptoTit;
        @XmlElement(name = "awlc01z3_o_desc_comun_tit", required = true)
        protected String awlc01Z3ODescComunTit;
        @XmlElement(name = "awlc01z3_o_desc_ciuda_tit", required = true)
        protected String awlc01Z3ODescCiudaTit;
        @XmlElement(name = "awlc01z3_o_lineas", required = true)
        protected List<ProgramInterface.Awlc01Z3Salida.Awlc01Z3OLineas> awlc01Z3OLineas;

        /**
         * Obtiene el valor de la propiedad awlc01Z3OCodRet.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3OCodRet() {
            return awlc01Z3OCodRet;
        }

        /**
         * Define el valor de la propiedad awlc01Z3OCodRet.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3OCodRet(String value) {
            this.awlc01Z3OCodRet = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3ODescCodRet.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3ODescCodRet() {
            return awlc01Z3ODescCodRet;
        }

        /**
         * Define el valor de la propiedad awlc01Z3ODescCodRet.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3ODescCodRet(String value) {
            this.awlc01Z3ODescCodRet = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3OSqlcode.
         * 
         */
        public long getAwlc01Z3OSqlcode() {
            return awlc01Z3OSqlcode;
        }

        /**
         * Define el valor de la propiedad awlc01Z3OSqlcode.
         * 
         */
        public void setAwlc01Z3OSqlcode(long value) {
            this.awlc01Z3OSqlcode = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3OParrafo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3OParrafo() {
            return awlc01Z3OParrafo;
        }

        /**
         * Define el valor de la propiedad awlc01Z3OParrafo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3OParrafo(String value) {
            this.awlc01Z3OParrafo = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3OFinpaginacion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3OFinpaginacion() {
            return awlc01Z3OFinpaginacion;
        }

        /**
         * Define el valor de la propiedad awlc01Z3OFinpaginacion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3OFinpaginacion(String value) {
            this.awlc01Z3OFinpaginacion = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3ONumregistros.
         * 
         */
        public int getAwlc01Z3ONumregistros() {
            return awlc01Z3ONumregistros;
        }

        /**
         * Define el valor de la propiedad awlc01Z3ONumregistros.
         * 
         */
        public void setAwlc01Z3ONumregistros(int value) {
            this.awlc01Z3ONumregistros = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3ONomPag.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3ONomPag() {
            return awlc01Z3ONomPag;
        }

        /**
         * Define el valor de la propiedad awlc01Z3ONomPag.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3ONomPag(String value) {
            this.awlc01Z3ONomPag = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3OApe1Pag.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3OApe1Pag() {
            return awlc01Z3OApe1Pag;
        }

        /**
         * Define el valor de la propiedad awlc01Z3OApe1Pag.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3OApe1Pag(String value) {
            this.awlc01Z3OApe1Pag = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3OApe2Pag.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3OApe2Pag() {
            return awlc01Z3OApe2Pag;
        }

        /**
         * Define el valor de la propiedad awlc01Z3OApe2Pag.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3OApe2Pag(String value) {
            this.awlc01Z3OApe2Pag = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3ONomTit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3ONomTit() {
            return awlc01Z3ONomTit;
        }

        /**
         * Define el valor de la propiedad awlc01Z3ONomTit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3ONomTit(String value) {
            this.awlc01Z3ONomTit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3OApe1Tit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3OApe1Tit() {
            return awlc01Z3OApe1Tit;
        }

        /**
         * Define el valor de la propiedad awlc01Z3OApe1Tit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3OApe1Tit(String value) {
            this.awlc01Z3OApe1Tit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3OApe2Tit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3OApe2Tit() {
            return awlc01Z3OApe2Tit;
        }

        /**
         * Define el valor de la propiedad awlc01Z3OApe2Tit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3OApe2Tit(String value) {
            this.awlc01Z3OApe2Tit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3ORutTit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3ORutTit() {
            return awlc01Z3ORutTit;
        }

        /**
         * Define el valor de la propiedad awlc01Z3ORutTit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3ORutTit(String value) {
            this.awlc01Z3ORutTit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3ODvfTit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3ODvfTit() {
            return awlc01Z3ODvfTit;
        }

        /**
         * Define el valor de la propiedad awlc01Z3ODvfTit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3ODvfTit(String value) {
            this.awlc01Z3ODvfTit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3OSecTit.
         * 
         */
        public long getAwlc01Z3OSecTit() {
            return awlc01Z3OSecTit;
        }

        /**
         * Define el valor de la propiedad awlc01Z3OSecTit.
         * 
         */
        public void setAwlc01Z3OSecTit(long value) {
            this.awlc01Z3OSecTit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3ORazSoc.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3ORazSoc() {
            return awlc01Z3ORazSoc;
        }

        /**
         * Define el valor de la propiedad awlc01Z3ORazSoc.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3ORazSoc(String value) {
            this.awlc01Z3ORazSoc = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3ONomFan.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3ONomFan() {
            return awlc01Z3ONomFan;
        }

        /**
         * Define el valor de la propiedad awlc01Z3ONomFan.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3ONomFan(String value) {
            this.awlc01Z3ONomFan = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3OCodGiro.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3OCodGiro() {
            return awlc01Z3OCodGiro;
        }

        /**
         * Define el valor de la propiedad awlc01Z3OCodGiro.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3OCodGiro(String value) {
            this.awlc01Z3OCodGiro = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3OTipoClie.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3OTipoClie() {
            return awlc01Z3OTipoClie;
        }

        /**
         * Define el valor de la propiedad awlc01Z3OTipoClie.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3OTipoClie(String value) {
            this.awlc01Z3OTipoClie = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3OTipoSeg.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3OTipoSeg() {
            return awlc01Z3OTipoSeg;
        }

        /**
         * Define el valor de la propiedad awlc01Z3OTipoSeg.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3OTipoSeg(String value) {
            this.awlc01Z3OTipoSeg = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3ODescTipoClie.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3ODescTipoClie() {
            return awlc01Z3ODescTipoClie;
        }

        /**
         * Define el valor de la propiedad awlc01Z3ODescTipoClie.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3ODescTipoClie(String value) {
            this.awlc01Z3ODescTipoClie = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3OCodSeg.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3OCodSeg() {
            return awlc01Z3OCodSeg;
        }

        /**
         * Define el valor de la propiedad awlc01Z3OCodSeg.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3OCodSeg(String value) {
            this.awlc01Z3OCodSeg = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3ODescSeg.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3ODescSeg() {
            return awlc01Z3ODescSeg;
        }

        /**
         * Define el valor de la propiedad awlc01Z3ODescSeg.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3ODescSeg(String value) {
            this.awlc01Z3ODescSeg = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3OCodSubSeg.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3OCodSubSeg() {
            return awlc01Z3OCodSubSeg;
        }

        /**
         * Define el valor de la propiedad awlc01Z3OCodSubSeg.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3OCodSubSeg(String value) {
            this.awlc01Z3OCodSubSeg = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3ODescSubSeg.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3ODescSubSeg() {
            return awlc01Z3ODescSubSeg;
        }

        /**
         * Define el valor de la propiedad awlc01Z3ODescSubSeg.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3ODescSubSeg(String value) {
            this.awlc01Z3ODescSubSeg = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3OMailCliente.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3OMailCliente() {
            return awlc01Z3OMailCliente;
        }

        /**
         * Define el valor de la propiedad awlc01Z3OMailCliente.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3OMailCliente(String value) {
            this.awlc01Z3OMailCliente = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3OFechaAltClte.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3OFechaAltClte() {
            return awlc01Z3OFechaAltClte;
        }

        /**
         * Define el valor de la propiedad awlc01Z3OFechaAltClte.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3OFechaAltClte(String value) {
            this.awlc01Z3OFechaAltClte = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3OAreaFax.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3OAreaFax() {
            return awlc01Z3OAreaFax;
        }

        /**
         * Define el valor de la propiedad awlc01Z3OAreaFax.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3OAreaFax(String value) {
            this.awlc01Z3OAreaFax = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3ONumFax.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3ONumFax() {
            return awlc01Z3ONumFax;
        }

        /**
         * Define el valor de la propiedad awlc01Z3ONumFax.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3ONumFax(String value) {
            this.awlc01Z3ONumFax = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3ONumCelula.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3ONumCelula() {
            return awlc01Z3ONumCelula;
        }

        /**
         * Define el valor de la propiedad awlc01Z3ONumCelula.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3ONumCelula(String value) {
            this.awlc01Z3ONumCelula = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3OPagWeb.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3OPagWeb() {
            return awlc01Z3OPagWeb;
        }

        /**
         * Define el valor de la propiedad awlc01Z3OPagWeb.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3OPagWeb(String value) {
            this.awlc01Z3OPagWeb = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3OCalleTit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3OCalleTit() {
            return awlc01Z3OCalleTit;
        }

        /**
         * Define el valor de la propiedad awlc01Z3OCalleTit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3OCalleTit(String value) {
            this.awlc01Z3OCalleTit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3ONumTit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3ONumTit() {
            return awlc01Z3ONumTit;
        }

        /**
         * Define el valor de la propiedad awlc01Z3ONumTit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3ONumTit(String value) {
            this.awlc01Z3ONumTit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3OPisoTit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3OPisoTit() {
            return awlc01Z3OPisoTit;
        }

        /**
         * Define el valor de la propiedad awlc01Z3OPisoTit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3OPisoTit(String value) {
            this.awlc01Z3OPisoTit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3ODptoTit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3ODptoTit() {
            return awlc01Z3ODptoTit;
        }

        /**
         * Define el valor de la propiedad awlc01Z3ODptoTit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3ODptoTit(String value) {
            this.awlc01Z3ODptoTit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3ODescComunTit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3ODescComunTit() {
            return awlc01Z3ODescComunTit;
        }

        /**
         * Define el valor de la propiedad awlc01Z3ODescComunTit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3ODescComunTit(String value) {
            this.awlc01Z3ODescComunTit = value;
        }

        /**
         * Obtiene el valor de la propiedad awlc01Z3ODescCiudaTit.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwlc01Z3ODescCiudaTit() {
            return awlc01Z3ODescCiudaTit;
        }

        /**
         * Define el valor de la propiedad awlc01Z3ODescCiudaTit.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwlc01Z3ODescCiudaTit(String value) {
            this.awlc01Z3ODescCiudaTit = value;
        }

        /**
         * Gets the value of the awlc01Z3OLineas property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the awlc01Z3OLineas property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAwlc01Z3OLineas().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProgramInterface.Awlc01Z3Salida.Awlc01Z3OLineas }
         * 
         * 
         */
        public List<ProgramInterface.Awlc01Z3Salida.Awlc01Z3OLineas> getAwlc01Z3OLineas() {
            if (awlc01Z3OLineas == null) {
                awlc01Z3OLineas = new ArrayList<ProgramInterface.Awlc01Z3Salida.Awlc01Z3OLineas>();
            }
            return this.awlc01Z3OLineas;
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
         *         &lt;element name="awlc01z3_o_area"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_fono"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="8"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_sec_linea"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="12"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_calle_inst"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="40"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_num_inst"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="6"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_piso_inst"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="2"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_dpto_inst"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="6"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_cod_post_inst"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="7"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_cod_comun"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_desc_comun_inst"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="15"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_ciuda_inst"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="15"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_zona"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="2"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_central"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="2"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_desc_zona_cent"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="25"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_pta_comercial"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="4"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_fec_instalacion"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="10"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_tipo_linea"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="2"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_desc_tipo_linea"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="15"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_ind_fact"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="1"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_ind_pagadora"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="1"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_est_linea"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="30"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_cod_agencia"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="4"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_desc_agencia"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="30"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_fec_alta_li"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="10"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_fec_fin_vi"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="10"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_clie"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
         *               &lt;maxInclusive value="999999999"/&gt;
         *               &lt;minInclusive value="0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_num_cuen"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
         *               &lt;maxInclusive value="999999999"/&gt;
         *               &lt;minInclusive value="0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="awlc01z3_o_direccion_cob"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="awlc01z3_o_calle_cob"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="40"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="awlc01z3_o_num_cob"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="awlc01z3_o_dpto_cob"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="6"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="awlc01z3_o_post_cob"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="7"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="awlc01z3_o_cod_comun_cob"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="3"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="awlc01z3_o_desc_comun_cob"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="15"/&gt;
         *                         &lt;whiteSpace value="preserve"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="awlc01z3_o_ciuda_cob"&gt;
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
            "awlc01Z3OArea",
            "awlc01Z3OFono",
            "awlc01Z3OSecLinea",
            "awlc01Z3OCalleInst",
            "awlc01Z3ONumInst",
            "awlc01Z3OPisoInst",
            "awlc01Z3ODptoInst",
            "awlc01Z3OCodPostInst",
            "awlc01Z3OCodComun",
            "awlc01Z3ODescComunInst",
            "awlc01Z3OCiudaInst",
            "awlc01Z3OZona",
            "awlc01Z3OCentral",
            "awlc01Z3ODescZonaCent",
            "awlc01Z3OPtaComercial",
            "awlc01Z3OFecInstalacion",
            "awlc01Z3OTipoLinea",
            "awlc01Z3ODescTipoLinea",
            "awlc01Z3OIndFact",
            "awlc01Z3OIndPagadora",
            "awlc01Z3OEstLinea",
            "awlc01Z3OCodAgencia",
            "awlc01Z3ODescAgencia",
            "awlc01Z3OFecAltaLi",
            "awlc01Z3OFecFinVi",
            "awlc01Z3OClie",
            "awlc01Z3ONumCuen",
            "awlc01Z3ODireccionCob"
        })
        public static class Awlc01Z3OLineas {

            @XmlElement(name = "awlc01z3_o_area", required = true)
            protected String awlc01Z3OArea;
            @XmlElement(name = "awlc01z3_o_fono", required = true)
            protected String awlc01Z3OFono;
            @XmlElement(name = "awlc01z3_o_sec_linea", required = true)
            protected String awlc01Z3OSecLinea;
            @XmlElement(name = "awlc01z3_o_calle_inst", required = true)
            protected String awlc01Z3OCalleInst;
            @XmlElement(name = "awlc01z3_o_num_inst", required = true)
            protected String awlc01Z3ONumInst;
            @XmlElement(name = "awlc01z3_o_piso_inst", required = true)
            protected String awlc01Z3OPisoInst;
            @XmlElement(name = "awlc01z3_o_dpto_inst", required = true)
            protected String awlc01Z3ODptoInst;
            @XmlElement(name = "awlc01z3_o_cod_post_inst", required = true)
            protected String awlc01Z3OCodPostInst;
            @XmlElement(name = "awlc01z3_o_cod_comun", required = true)
            protected String awlc01Z3OCodComun;
            @XmlElement(name = "awlc01z3_o_desc_comun_inst", required = true)
            protected String awlc01Z3ODescComunInst;
            @XmlElement(name = "awlc01z3_o_ciuda_inst", required = true)
            protected String awlc01Z3OCiudaInst;
            @XmlElement(name = "awlc01z3_o_zona", required = true)
            protected String awlc01Z3OZona;
            @XmlElement(name = "awlc01z3_o_central", required = true)
            protected String awlc01Z3OCentral;
            @XmlElement(name = "awlc01z3_o_desc_zona_cent", required = true)
            protected String awlc01Z3ODescZonaCent;
            @XmlElement(name = "awlc01z3_o_pta_comercial", required = true)
            protected String awlc01Z3OPtaComercial;
            @XmlElement(name = "awlc01z3_o_fec_instalacion", required = true)
            protected String awlc01Z3OFecInstalacion;
            @XmlElement(name = "awlc01z3_o_tipo_linea", required = true)
            protected String awlc01Z3OTipoLinea;
            @XmlElement(name = "awlc01z3_o_desc_tipo_linea", required = true)
            protected String awlc01Z3ODescTipoLinea;
            @XmlElement(name = "awlc01z3_o_ind_fact", required = true)
            protected String awlc01Z3OIndFact;
            @XmlElement(name = "awlc01z3_o_ind_pagadora", required = true)
            protected String awlc01Z3OIndPagadora;
            @XmlElement(name = "awlc01z3_o_est_linea", required = true)
            protected String awlc01Z3OEstLinea;
            @XmlElement(name = "awlc01z3_o_cod_agencia", required = true)
            protected String awlc01Z3OCodAgencia;
            @XmlElement(name = "awlc01z3_o_desc_agencia", required = true)
            protected String awlc01Z3ODescAgencia;
            @XmlElement(name = "awlc01z3_o_fec_alta_li", required = true)
            protected String awlc01Z3OFecAltaLi;
            @XmlElement(name = "awlc01z3_o_fec_fin_vi", required = true)
            protected String awlc01Z3OFecFinVi;
            @XmlElement(name = "awlc01z3_o_clie")
            protected long awlc01Z3OClie;
            @XmlElement(name = "awlc01z3_o_num_cuen")
            protected long awlc01Z3ONumCuen;
            @XmlElement(name = "awlc01z3_o_direccion_cob", required = true)
            protected ProgramInterface.Awlc01Z3Salida.Awlc01Z3OLineas.Awlc01Z3ODireccionCob awlc01Z3ODireccionCob;

            /**
             * Obtiene el valor de la propiedad awlc01Z3OArea.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc01Z3OArea() {
                return awlc01Z3OArea;
            }

            /**
             * Define el valor de la propiedad awlc01Z3OArea.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc01Z3OArea(String value) {
                this.awlc01Z3OArea = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3OFono.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc01Z3OFono() {
                return awlc01Z3OFono;
            }

            /**
             * Define el valor de la propiedad awlc01Z3OFono.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc01Z3OFono(String value) {
                this.awlc01Z3OFono = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3OSecLinea.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc01Z3OSecLinea() {
                return awlc01Z3OSecLinea;
            }

            /**
             * Define el valor de la propiedad awlc01Z3OSecLinea.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc01Z3OSecLinea(String value) {
                this.awlc01Z3OSecLinea = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3OCalleInst.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc01Z3OCalleInst() {
                return awlc01Z3OCalleInst;
            }

            /**
             * Define el valor de la propiedad awlc01Z3OCalleInst.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc01Z3OCalleInst(String value) {
                this.awlc01Z3OCalleInst = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3ONumInst.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc01Z3ONumInst() {
                return awlc01Z3ONumInst;
            }

            /**
             * Define el valor de la propiedad awlc01Z3ONumInst.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc01Z3ONumInst(String value) {
                this.awlc01Z3ONumInst = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3OPisoInst.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc01Z3OPisoInst() {
                return awlc01Z3OPisoInst;
            }

            /**
             * Define el valor de la propiedad awlc01Z3OPisoInst.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc01Z3OPisoInst(String value) {
                this.awlc01Z3OPisoInst = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3ODptoInst.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc01Z3ODptoInst() {
                return awlc01Z3ODptoInst;
            }

            /**
             * Define el valor de la propiedad awlc01Z3ODptoInst.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc01Z3ODptoInst(String value) {
                this.awlc01Z3ODptoInst = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3OCodPostInst.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc01Z3OCodPostInst() {
                return awlc01Z3OCodPostInst;
            }

            /**
             * Define el valor de la propiedad awlc01Z3OCodPostInst.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc01Z3OCodPostInst(String value) {
                this.awlc01Z3OCodPostInst = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3OCodComun.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc01Z3OCodComun() {
                return awlc01Z3OCodComun;
            }

            /**
             * Define el valor de la propiedad awlc01Z3OCodComun.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc01Z3OCodComun(String value) {
                this.awlc01Z3OCodComun = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3ODescComunInst.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc01Z3ODescComunInst() {
                return awlc01Z3ODescComunInst;
            }

            /**
             * Define el valor de la propiedad awlc01Z3ODescComunInst.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc01Z3ODescComunInst(String value) {
                this.awlc01Z3ODescComunInst = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3OCiudaInst.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc01Z3OCiudaInst() {
                return awlc01Z3OCiudaInst;
            }

            /**
             * Define el valor de la propiedad awlc01Z3OCiudaInst.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc01Z3OCiudaInst(String value) {
                this.awlc01Z3OCiudaInst = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3OZona.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc01Z3OZona() {
                return awlc01Z3OZona;
            }

            /**
             * Define el valor de la propiedad awlc01Z3OZona.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc01Z3OZona(String value) {
                this.awlc01Z3OZona = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3OCentral.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc01Z3OCentral() {
                return awlc01Z3OCentral;
            }

            /**
             * Define el valor de la propiedad awlc01Z3OCentral.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc01Z3OCentral(String value) {
                this.awlc01Z3OCentral = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3ODescZonaCent.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc01Z3ODescZonaCent() {
                return awlc01Z3ODescZonaCent;
            }

            /**
             * Define el valor de la propiedad awlc01Z3ODescZonaCent.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc01Z3ODescZonaCent(String value) {
                this.awlc01Z3ODescZonaCent = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3OPtaComercial.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc01Z3OPtaComercial() {
                return awlc01Z3OPtaComercial;
            }

            /**
             * Define el valor de la propiedad awlc01Z3OPtaComercial.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc01Z3OPtaComercial(String value) {
                this.awlc01Z3OPtaComercial = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3OFecInstalacion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc01Z3OFecInstalacion() {
                return awlc01Z3OFecInstalacion;
            }

            /**
             * Define el valor de la propiedad awlc01Z3OFecInstalacion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc01Z3OFecInstalacion(String value) {
                this.awlc01Z3OFecInstalacion = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3OTipoLinea.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc01Z3OTipoLinea() {
                return awlc01Z3OTipoLinea;
            }

            /**
             * Define el valor de la propiedad awlc01Z3OTipoLinea.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc01Z3OTipoLinea(String value) {
                this.awlc01Z3OTipoLinea = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3ODescTipoLinea.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc01Z3ODescTipoLinea() {
                return awlc01Z3ODescTipoLinea;
            }

            /**
             * Define el valor de la propiedad awlc01Z3ODescTipoLinea.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc01Z3ODescTipoLinea(String value) {
                this.awlc01Z3ODescTipoLinea = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3OIndFact.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc01Z3OIndFact() {
                return awlc01Z3OIndFact;
            }

            /**
             * Define el valor de la propiedad awlc01Z3OIndFact.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc01Z3OIndFact(String value) {
                this.awlc01Z3OIndFact = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3OIndPagadora.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc01Z3OIndPagadora() {
                return awlc01Z3OIndPagadora;
            }

            /**
             * Define el valor de la propiedad awlc01Z3OIndPagadora.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc01Z3OIndPagadora(String value) {
                this.awlc01Z3OIndPagadora = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3OEstLinea.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc01Z3OEstLinea() {
                return awlc01Z3OEstLinea;
            }

            /**
             * Define el valor de la propiedad awlc01Z3OEstLinea.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc01Z3OEstLinea(String value) {
                this.awlc01Z3OEstLinea = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3OCodAgencia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc01Z3OCodAgencia() {
                return awlc01Z3OCodAgencia;
            }

            /**
             * Define el valor de la propiedad awlc01Z3OCodAgencia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc01Z3OCodAgencia(String value) {
                this.awlc01Z3OCodAgencia = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3ODescAgencia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc01Z3ODescAgencia() {
                return awlc01Z3ODescAgencia;
            }

            /**
             * Define el valor de la propiedad awlc01Z3ODescAgencia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc01Z3ODescAgencia(String value) {
                this.awlc01Z3ODescAgencia = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3OFecAltaLi.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc01Z3OFecAltaLi() {
                return awlc01Z3OFecAltaLi;
            }

            /**
             * Define el valor de la propiedad awlc01Z3OFecAltaLi.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc01Z3OFecAltaLi(String value) {
                this.awlc01Z3OFecAltaLi = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3OFecFinVi.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwlc01Z3OFecFinVi() {
                return awlc01Z3OFecFinVi;
            }

            /**
             * Define el valor de la propiedad awlc01Z3OFecFinVi.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwlc01Z3OFecFinVi(String value) {
                this.awlc01Z3OFecFinVi = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3OClie.
             * 
             */
            public long getAwlc01Z3OClie() {
                return awlc01Z3OClie;
            }

            /**
             * Define el valor de la propiedad awlc01Z3OClie.
             * 
             */
            public void setAwlc01Z3OClie(long value) {
                this.awlc01Z3OClie = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3ONumCuen.
             * 
             */
            public long getAwlc01Z3ONumCuen() {
                return awlc01Z3ONumCuen;
            }

            /**
             * Define el valor de la propiedad awlc01Z3ONumCuen.
             * 
             */
            public void setAwlc01Z3ONumCuen(long value) {
                this.awlc01Z3ONumCuen = value;
            }

            /**
             * Obtiene el valor de la propiedad awlc01Z3ODireccionCob.
             * 
             * @return
             *     possible object is
             *     {@link ProgramInterface.Awlc01Z3Salida.Awlc01Z3OLineas.Awlc01Z3ODireccionCob }
             *     
             */
            public ProgramInterface.Awlc01Z3Salida.Awlc01Z3OLineas.Awlc01Z3ODireccionCob getAwlc01Z3ODireccionCob() {
                return awlc01Z3ODireccionCob;
            }

            /**
             * Define el valor de la propiedad awlc01Z3ODireccionCob.
             * 
             * @param value
             *     allowed object is
             *     {@link ProgramInterface.Awlc01Z3Salida.Awlc01Z3OLineas.Awlc01Z3ODireccionCob }
             *     
             */
            public void setAwlc01Z3ODireccionCob(ProgramInterface.Awlc01Z3Salida.Awlc01Z3OLineas.Awlc01Z3ODireccionCob value) {
                this.awlc01Z3ODireccionCob = value;
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
             *         &lt;element name="awlc01z3_o_calle_cob"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="40"/&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="awlc01z3_o_num_cob"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="awlc01z3_o_dpto_cob"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="6"/&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="awlc01z3_o_post_cob"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="7"/&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="awlc01z3_o_cod_comun_cob"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="3"/&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="awlc01z3_o_desc_comun_cob"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="15"/&gt;
             *               &lt;whiteSpace value="preserve"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="awlc01z3_o_ciuda_cob"&gt;
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
                "awlc01Z3OCalleCob",
                "awlc01Z3ONumCob",
                "awlc01Z3ODptoCob",
                "awlc01Z3OPostCob",
                "awlc01Z3OCodComunCob",
                "awlc01Z3ODescComunCob",
                "awlc01Z3OCiudaCob"
            })
            public static class Awlc01Z3ODireccionCob {

                @XmlElement(name = "awlc01z3_o_calle_cob", required = true)
                protected String awlc01Z3OCalleCob;
                @XmlElement(name = "awlc01z3_o_num_cob", required = true)
                protected String awlc01Z3ONumCob;
                @XmlElement(name = "awlc01z3_o_dpto_cob", required = true)
                protected String awlc01Z3ODptoCob;
                @XmlElement(name = "awlc01z3_o_post_cob", required = true)
                protected String awlc01Z3OPostCob;
                @XmlElement(name = "awlc01z3_o_cod_comun_cob", required = true)
                protected String awlc01Z3OCodComunCob;
                @XmlElement(name = "awlc01z3_o_desc_comun_cob", required = true)
                protected String awlc01Z3ODescComunCob;
                @XmlElement(name = "awlc01z3_o_ciuda_cob", required = true)
                protected String awlc01Z3OCiudaCob;

                /**
                 * Obtiene el valor de la propiedad awlc01Z3OCalleCob.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwlc01Z3OCalleCob() {
                    return awlc01Z3OCalleCob;
                }

                /**
                 * Define el valor de la propiedad awlc01Z3OCalleCob.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwlc01Z3OCalleCob(String value) {
                    this.awlc01Z3OCalleCob = value;
                }

                /**
                 * Obtiene el valor de la propiedad awlc01Z3ONumCob.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwlc01Z3ONumCob() {
                    return awlc01Z3ONumCob;
                }

                /**
                 * Define el valor de la propiedad awlc01Z3ONumCob.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwlc01Z3ONumCob(String value) {
                    this.awlc01Z3ONumCob = value;
                }

                /**
                 * Obtiene el valor de la propiedad awlc01Z3ODptoCob.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwlc01Z3ODptoCob() {
                    return awlc01Z3ODptoCob;
                }

                /**
                 * Define el valor de la propiedad awlc01Z3ODptoCob.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwlc01Z3ODptoCob(String value) {
                    this.awlc01Z3ODptoCob = value;
                }

                /**
                 * Obtiene el valor de la propiedad awlc01Z3OPostCob.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwlc01Z3OPostCob() {
                    return awlc01Z3OPostCob;
                }

                /**
                 * Define el valor de la propiedad awlc01Z3OPostCob.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwlc01Z3OPostCob(String value) {
                    this.awlc01Z3OPostCob = value;
                }

                /**
                 * Obtiene el valor de la propiedad awlc01Z3OCodComunCob.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwlc01Z3OCodComunCob() {
                    return awlc01Z3OCodComunCob;
                }

                /**
                 * Define el valor de la propiedad awlc01Z3OCodComunCob.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwlc01Z3OCodComunCob(String value) {
                    this.awlc01Z3OCodComunCob = value;
                }

                /**
                 * Obtiene el valor de la propiedad awlc01Z3ODescComunCob.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwlc01Z3ODescComunCob() {
                    return awlc01Z3ODescComunCob;
                }

                /**
                 * Define el valor de la propiedad awlc01Z3ODescComunCob.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwlc01Z3ODescComunCob(String value) {
                    this.awlc01Z3ODescComunCob = value;
                }

                /**
                 * Obtiene el valor de la propiedad awlc01Z3OCiudaCob.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAwlc01Z3OCiudaCob() {
                    return awlc01Z3OCiudaCob;
                }

                /**
                 * Define el valor de la propiedad awlc01Z3OCiudaCob.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAwlc01Z3OCiudaCob(String value) {
                    this.awlc01Z3OCiudaCob = value;
                }

            }

        }

    }

}
