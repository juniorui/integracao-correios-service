package br.com.correios.client;

import br.com.correios.domain.sigep.GeraDigitoVerificadorEtiquetas;
import br.com.correios.domain.sigep.GeraDigitoVerificadorEtiquetasResponse;
import br.com.correios.domain.sigep.SolicitaEtiquetas;
import br.com.correios.domain.sigep.SolicitaEtiquetasResponse;
import br.com.correios.exception.CommunicationFailureException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.xml.bind.JAXBElement;

public class EtiquetasClient extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(EtiquetasClient.class);

    @SuppressWarnings("all")
    public SolicitaEtiquetasResponse requestEtiquetas(SolicitaEtiquetas request) {
        log.info("Chamada efetuada: Solicitação de SROs.");
        try {
            JAXBElement<SolicitaEtiquetasResponse> response = (JAXBElement<SolicitaEtiquetasResponse>) getWebServiceTemplate()
                    .marshalSendAndReceive(request, new SoapActionCallback("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/solicitaEtiquetas"));
            log.info("Chamada finalizada: SROs: " + response.getValue().getReturn());
            return response.getValue();
        } catch (Exception ex) {
            log.error(ex.getMessage());
            throw new CommunicationFailureException("Falha ao solicitar etiquetas", ex);
        }
    }


    public GeraDigitoVerificadorEtiquetasResponse requestGeraDigitoVerificador(GeraDigitoVerificadorEtiquetas request) {
        log.info("Digitos verificadores solicitados.");
        try {
            JAXBElement<GeraDigitoVerificadorEtiquetasResponse> response = (JAXBElement<GeraDigitoVerificadorEtiquetasResponse>) getWebServiceTemplate()
                    .marshalSendAndReceive(request, new SoapActionCallback("http://cliente.bean.master.sigep.bsb.correios.com.br/AtendeCliente/geraDigitoVerificadorEtiquetas"));
            log.info("Dígitos obtitidos com sucesso: " + response.getValue().getReturn());
            return response.getValue();
        } catch (Exception ex) {
            log.error(ex.getMessage());
            throw new CommunicationFailureException("Falha ao solicitar os digitos.", ex);
        }
    }
}
