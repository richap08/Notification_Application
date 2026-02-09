package com.notification.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class EmailNotification implements Notification {

    private static final Logger log =
            LoggerFactory.getLogger(EmailNotification.class);

    @Override
    public void send(String message) {
        log.info("EMAIL notification started");
        System.out.println("📧 Email sent: " + message);
    }
}


