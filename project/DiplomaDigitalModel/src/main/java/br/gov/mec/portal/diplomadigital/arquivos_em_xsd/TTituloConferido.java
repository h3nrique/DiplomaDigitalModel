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
 * <p>Java class for TTituloConferido.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TTituloConferido">
 *   &lt;restriction base="{http://portal.mec.gov.br/diplomadigital/arquivos-em-xsd}TString">
 *     &lt;enumeration value="Bacharel"/>
 *     &lt;enumeration value="Engenheiro"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TTituloConferido")
@XmlEnum
public enum TTituloConferido {

    @XmlEnumValue("Bacharel")
    BACHAREL("Bacharel"),
    @XmlEnumValue("Engenheiro")
    ENGENHEIRO("Engenheiro");
    private final String value;

    TTituloConferido(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TTituloConferido fromValue(String v) {
        for (TTituloConferido c: TTituloConferido.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
