//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v2.3.6 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2022.03.23 �s 05:22:51 PM BRT 
//


package br.com.correios.domain.sigep;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de acao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="acao"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEVOLVIDO_AO_REMETENTE"/&gt;
 *     &lt;enumeration value="ENCAMINHADO_PARA_REFUGO"/&gt;
 *     &lt;enumeration value="REINTEGRADO_E_DEVOLVIDO_AO_REMETENTE"/&gt;
 *     &lt;enumeration value="DESBLOQUEADO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "acao")
@XmlEnum
public enum Acao {

    DEVOLVIDO_AO_REMETENTE,
    ENCAMINHADO_PARA_REFUGO,
    REINTEGRADO_E_DEVOLVIDO_AO_REMETENTE,
    DESBLOQUEADO;

    public String value() {
        return name();
    }

    public static Acao fromValue(String v) {
        return valueOf(v);
    }

}
