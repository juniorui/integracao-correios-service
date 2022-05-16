package br.com.correios.mapper;

import br.com.correios.domain.dto.enums.TipoServicoCorreios;
import br.com.correios.domain.dto.mongo.Etiqueta;
import br.com.correios.domain.sigep.GeraDigitoVerificadorEtiquetas;
import br.com.correios.domain.sigep.SolicitaEtiquetas;
import br.com.correios.properties.SigepProps;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@RequiredArgsConstructor
public class EtiquetasMapper {

    private final SigepProps props;

    public SolicitaEtiquetas builderSolicitaEtiquetas() {

        SolicitaEtiquetas builder = new SolicitaEtiquetas();
        builder.setTipoDestinatario(props.getTipoDestinatario());
        builder.setIdentificador(props.getIdentificador());
        builder.setIdServico(props.getIdServico());
        builder.setQtdEtiquetas(props.getQtdEtiquetas());
        builder.setUsuario(props.getUsuario());
        builder.setSenha(props.getSenha());

        return builder;
    }

    public GeraDigitoVerificadorEtiquetas builderGerarCodigoVerificador(List<String> etiquetas) {

        GeraDigitoVerificadorEtiquetas builder = new GeraDigitoVerificadorEtiquetas();
        builder.getEtiquetas().addAll(etiquetas);
        builder.setUsuario(props.getUsuario());
        builder.setSenha(props.getSenha());

        return builder;
    }

    public List<Etiqueta> createBulderEtiqueta(List<Object> etiquetas) {

        List<Etiqueta> etiquetaList = new ArrayList<>();

        for (Object etiqueta : etiquetas) {
            Etiqueta objeto = Etiqueta.builder()
                    .codigo((String) etiqueta)
                    .tipoEtiqueta(TipoServicoCorreios.SEDEX)
                    .dataCriacao(new Date())
                    .used(Boolean.FALSE)
                    .build();
            etiquetaList.add(objeto);
        }

        return etiquetaList;
    }

}
