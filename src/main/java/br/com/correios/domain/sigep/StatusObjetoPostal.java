//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v2.3.6 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2022.03.23 �s 05:22:51 PM BRT 
//


package br.com.correios.domain.sigep;;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de statusObjetoPostal.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="statusObjetoPostal"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EmBranco"/&gt;
 *     &lt;enumeration value="Postado"/&gt;
 *     &lt;enumeration value="Cancelado"/&gt;
 *     &lt;enumeration value="Estorno"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "statusObjetoPostal")
@XmlEnum
public enum StatusObjetoPostal {

    @XmlEnumValue("EmBranco")
    EM_BRANCO("EmBranco"),
    @XmlEnumValue("Postado")
    POSTADO("Postado"),
    @XmlEnumValue("Cancelado")
    CANCELADO("Cancelado"),
    @XmlEnumValue("Estorno")
    ESTORNO("Estorno");
    private final String value;

    StatusObjetoPostal(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusObjetoPostal fromValue(String v) {
        for (StatusObjetoPostal c: StatusObjetoPostal.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
