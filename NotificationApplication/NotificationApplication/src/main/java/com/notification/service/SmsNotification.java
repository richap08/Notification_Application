package com.notification.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SmsNotification implements Notification {

    private static final Logger log =
            LoggerFactory.getLogger(SmsNotification.class);

    @Override
    public void send(String message) {
        log.info("SMS notification started");
        System.out.println("📱 SMS sent: " + message);
    }
}

