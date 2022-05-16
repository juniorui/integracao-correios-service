package br.com.correios.controller;

import br.com.correios.domain.sigep.GeraDigitoVerificadorEtiquetasResponse;
import br.com.correios.service.EtiquetasService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/etiquetas")
public class EtiquetasController {

    private final EtiquetasService service;

    @GetMapping("/geraDigitoVerificador")
    public ResponseEntity<GeraDigitoVerificadorEtiquetasResponse> geraDigitoVerificador(
            @RequestParam(value = "etiquetas", required = true) List<String> etiquetas) {
        GeraDigitoVerificadorEtiquetasResponse response = service.getDigitoVerificador(etiquetas);
        return ResponseEntity.ok(response);
    }
}
