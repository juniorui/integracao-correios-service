package br.com.correios.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "credenciais-correios")
public class SigepProps {

    private String tipoDestinatario;
    private String identificador;
    private Long idServico;
    private Integer qtdEtiquetas;
    private String usuario;
    private String senha;
}
