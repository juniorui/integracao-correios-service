package br.com.correios.config;

import br.com.correios.client.EtiquetasClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class CorreiosConfig {

    public static final String URI = "https://apphom.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente";

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("br.com.correios.domain.sigep");
        return marshaller;
    }
    
    @Bean
    public EtiquetasClient solicitaEtiquetas(Jaxb2Marshaller marshaller) {
        EtiquetasClient client = new EtiquetasClient();
        client.setDefaultUri(URI);
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
