//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.10 at 04:01:49 AM BRT 
//


package br.gov.mec.portal.diplomadigital.arquivos_em_xsd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSituacaoAlunoHistorico.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TSituacaoAlunoHistorico">
 *   &lt;restriction base="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TString">
 *     &lt;enumeration value="Aprovado"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TSituacaoAlunoHistorico")
@XmlEnum
public enum TSituacaoAlunoHistorico {

    @XmlEnumValue("Aprovado")
    APROVADO("Aprovado");
    private final String value;

    TSituacaoAlunoHistorico(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TSituacaoAlunoHistorico fromValue(String v) {
        for (TSituacaoAlunoHistorico c: TSituacaoAlunoHistorico.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
