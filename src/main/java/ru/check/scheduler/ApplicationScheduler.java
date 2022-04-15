package ru.check.scheduler;

import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.check.service.CatSavingService;

import static lombok.AccessLevel.PRIVATE;

@RequiredArgsConstructor
@FieldDefaults(
        level = PRIVATE,
        makeFinal = true
)
@Log4j2
@Component
public class ApplicationScheduler {
    CatSavingService catSavingService;

    @Scheduled(fixedRate = 20000)
    public void scheduleCatSavingService() {
        try {
            catSavingService.process();
        } catch (Exception e) {
            log.error("Problems with saving cats", e);
        }
    }
}
