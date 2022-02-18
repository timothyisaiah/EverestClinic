package com.everestgauge.bioMedical.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.everestgauge.bioMedical.repository.ServicequeueRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

@Controller
public class QueueController {
    @Autowired
    private SimpMessagingTemplate template;
    @Autowired
    private ServicequeueRepository servicequeueRepository;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    @Scheduled(fixedRate = 1000)
    @MessageMapping("/patientqueuesize/{unitserviceid}")
    public void patientQueueSize(Map<String, Object> data,
            @DestinationVariable String unitserviceid) throws ParseException {
        try {

            final Integer unitServiceId = Integer.parseInt(data.get("unitserviceid").toString());
            Integer queueSize = servicequeueRepository.queueSize(unitServiceId,
                    formatter.parse(formatter.format(new Date())),
                    Boolean.FALSE,
                    Boolean.FALSE, Boolean.FALSE);
            template.convertAndSend(
                    String.format("/topic/patientqueuesize/%s",
                            unitServiceId),
                    queueSize);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

}
