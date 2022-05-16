package br.com.correios.service;

import br.com.correios.client.EtiquetasClient;
import br.com.correios.domain.sigep.GeraDigitoVerificadorEtiquetas;
import br.com.correios.domain.sigep.GeraDigitoVerificadorEtiquetasResponse;
import br.com.correios.domain.sigep.SolicitaEtiquetas;
import br.com.correios.domain.sigep.SolicitaEtiquetasResponse;
import br.com.correios.exception.CommunicationFailureException;
import br.com.correios.mapper.EtiquetasMapper;
import br.com.correios.repositories.EtiquetaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service("correiosService")
@RequiredArgsConstructor
@Slf4j
public class EtiquetasService {

    private final EtiquetasClient client;
    private final EtiquetasMapper mapper;
    private final EtiquetaRepository repository;

    public void getEtiquetas() {
        solicitaEtiquetas(mapper.builderSolicitaEtiquetas());
    }

    private void solicitaEtiquetas(SolicitaEtiquetas request) {
        SolicitaEtiquetasResponse response = client.requestEtiquetas(request);
        Object[] sroList = Arrays.stream(response.getReturn().split(",")).toArray();
        salvarEtiquetas(List.of(sroList));
    }

    public GeraDigitoVerificadorEtiquetasResponse getDigitoVerificador(List<String> etiquetas) {
        GeraDigitoVerificadorEtiquetasResponse response = geraDigitoVerificador(mapper.builderGerarCodigoVerificador(etiquetas));
        return response;
    }

    private GeraDigitoVerificadorEtiquetasResponse geraDigitoVerificador(GeraDigitoVerificadorEtiquetas request) {
        return client.requestGeraDigitoVerificador(request);
    }

    @Transactional
    public void salvarEtiquetas(List<Object> etiquetas) {

        try {

            repository.saveAll(mapper.createBulderEtiqueta(etiquetas));
            log.info("Etiquetas salvas na base de dados.");
        } catch (Exception ex) {
            log.error(ex.getMessage());
            throw new CommunicationFailureException("Falha ao inserir salvar etiquetas", ex);
        }
    }
}
