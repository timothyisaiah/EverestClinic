package com.everestgauge.bioMedical.Controller;

import java.util.Date;
import java.util.Map;

import com.everestgauge.bioMedical.repository.ServicequeueRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessagingException;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class QueueController {
    @Autowired
    private SimpMessagingTemplate template;
    @Autowired
    private ServicequeueRepository servicequeueRepository;

    @MessageMapping("/patientqueuesize/{serviceid}")
    // @SendTo("/topic/patientqueuesize/{serviceid}")
    public void patientQueueSize(Map<String, Object> data, @DestinationVariable String unitserviceid) {
        try {
            final Integer unitServiceId = Integer.parseInt(data.get("unitserviceid").toString());
            Integer queueSize = servicequeueRepository.queueSize(unitServiceId, new Date(), Boolean.FALSE,
                    Boolean.FALSE, Boolean.FALSE);
            template.convertAndSend(String.format("/topic/patientqueuesize/%s", unitserviceid),
                    queueSize);
        } catch (NumberFormatException | MessagingException e) {
            System.out.println(e);
        }
    }

    // @MessageMapping("/hello")
    // @SendTo("/topic/greetings")
    // public String greeting(String message) throws Exception {
    // Thread.sleep(1000); // simulated delay
    // return message + " returned";
    // }
}
