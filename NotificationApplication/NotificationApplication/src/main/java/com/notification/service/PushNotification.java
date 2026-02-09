package com.notification.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class PushNotification implements Notification {

    private static final Logger log =
            LoggerFactory.getLogger(PushNotification.class);

    @Override
    public void send(String message) {
        log.info("PUSH notification started");
        System.out.println("🔔 Push sent: " + message);
    }
}

