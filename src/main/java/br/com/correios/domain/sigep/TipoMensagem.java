//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v2.3.6 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2022.03.23 �s 05:22:51 PM BRT 
//


package br.com.correios.domain.sigep;;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoMensagem.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="tipoMensagem"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoMensagem")
@XmlEnum
public enum TipoMensagem {

    A,
    E,
    S;

    public String value() {
        return name();
    }

    public static TipoMensagem fromValue(String v) {
        return valueOf(v);
    }

}
