package com.notification.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import com.notification.factory.NotificationFactory;
import com.notification.service.Notification;

@RestController
@RequestMapping("/notify")
public class NotificationController {

    private static final Logger log =
            LoggerFactory.getLogger(NotificationController.class);

    private final NotificationFactory factory;

    public NotificationController(NotificationFactory factory) {
        this.factory = factory;
    }

    @PostMapping("/send")
    public String sendNotification(@RequestParam String type,
                                   @RequestParam String message) {

        log.info("Request received for type: {}", type);

        Notification notification = factory.getNotification(type);
        notification.send(message);

        log.info("Notification sent successfully");
        return "Notification sent successfully";
    }
}
