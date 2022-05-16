package br.com.correios.scheduler;

import br.com.correios.service.EtiquetasService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Slf4j
@Configuration
@EnableScheduling
@RequiredArgsConstructor
public class CorreiosScheduler {
    private final EtiquetasService service;

    //@Scheduled(cron = "*/30 * * * * *") // Atualizacao a cada 30 segundos
    //@Scheduled(cron = "0 0 01 * * ") // - Atualizacao às 01h
    @Scheduled(fixedRate = 1000000)
    public void scheduleFixedRateTask() {
        service.getEtiquetas();
    }

}
