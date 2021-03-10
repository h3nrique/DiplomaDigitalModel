//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.10 at 04:01:49 AM BRT 
//


package br.gov.mec.portal.diplomadigital.arquivos_em_xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2000._09.xmldsig_.SignatureType;


/**
 * Tipo Diploma Digital
 * 
 * <p>Java class for TDadosDiploma complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDadosDiploma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Diplomado" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TDadosDiplomado"/>
 *         &lt;element name="DadosCurso" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TDadosCurso"/>
 *         &lt;element name="IesEmissora" type="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TDadosIesEmissora"/>
 *         &lt;sequence maxOccurs="unbounded">
 *           &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID">
 *             &lt;pattern value="Dip[0-9]{44}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDadosDiploma", propOrder = {
    "diplomado",
    "dadosCurso",
    "iesEmissora",
    "signature"
})
public class TDadosDiploma {

    @XmlElement(name = "Diplomado", required = true)
    protected TDadosDiplomado diplomado;
    @XmlElement(name = "DadosCurso", required = true)
    protected TDadosCurso dadosCurso;
    @XmlElement(name = "IesEmissora", required = true)
    protected TDadosIesEmissora iesEmissora;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected List<SignatureType> signature;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the diplomado property.
     * 
     * @return
     *     possible object is
     *     {@link TDadosDiplomado }
     *     
     */
    public TDadosDiplomado getDiplomado() {
        return diplomado;
    }

    /**
     * Sets the value of the diplomado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosDiplomado }
     *     
     */
    public void setDiplomado(TDadosDiplomado value) {
        this.diplomado = value;
    }

    /**
     * Gets the value of the dadosCurso property.
     * 
     * @return
     *     possible object is
     *     {@link TDadosCurso }
     *     
     */
    public TDadosCurso getDadosCurso() {
        return dadosCurso;
    }

    /**
     * Sets the value of the dadosCurso property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosCurso }
     *     
     */
    public void setDadosCurso(TDadosCurso value) {
        this.dadosCurso = value;
    }

    /**
     * Gets the value of the iesEmissora property.
     * 
     * @return
     *     possible object is
     *     {@link TDadosIesEmissora }
     *     
     */
    public TDadosIesEmissora getIesEmissora() {
        return iesEmissora;
    }

    /**
     * Sets the value of the iesEmissora property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDadosIesEmissora }
     *     
     */
    public void setIesEmissora(TDadosIesEmissora value) {
        this.iesEmissora = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureType }
     * 
     * 
     */
    public List<SignatureType> getSignature() {
        if (signature == null) {
            signature = new ArrayList<SignatureType>();
        }
        return this.signature;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
