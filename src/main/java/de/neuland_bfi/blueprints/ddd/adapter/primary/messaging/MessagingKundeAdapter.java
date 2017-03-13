package de.neuland_bfi.blueprints.ddd.adapter.primary.messaging;

import de.neuland_bfi.blueprints.ddd.application.KundeApplicationService;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@EnableScheduling
public class MessagingKundeAdapter {

    private KundeApplicationService applicationService;

    public MessagingKundeAdapter(KundeApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @Scheduled(fixedDelay = 30000L)
    public void receive() {
        final KundeApplicationService.KundeAnlegenCommand command = new KundeApplicationService.KundeAnlegenCommand(UUID.randomUUID().toString(), "Mustermann");
        applicationService.anlegen(command);
    }

}
