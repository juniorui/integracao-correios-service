package br.com.correios.domain.dto.mongo;

import br.com.correios.domain.dto.enums.TipoServicoCorreios;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.Date;

@Getter
@Setter
@Builder
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Etiqueta {

    @Id
    @NotNull
    @NotBlank
    private String codigo;

    @NotNull
    @NotBlank
    private Date dataCriacao;

    @NotNull
    @NotBlank
    private TipoServicoCorreios tipoEtiqueta;

    private Boolean used;

    @Null
    private Date dataUtilizacao;

    @Null
    private Integer digitoVerificador;
}
