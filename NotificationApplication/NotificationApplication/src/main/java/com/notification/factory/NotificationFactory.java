package com.notification.factory;

import com.notification.service.Notification;
import org.springframework.stereotype.Component;
import com.notification.service.*;

@Component
public class NotificationFactory {

    public Notification getNotification(String type) {

        return switch (type.toUpperCase()) {
            case "EMAIL" -> new EmailNotification();
            case "SMS" -> new SmsNotification();
            case "PUSH" -> new PushNotification();
            default -> throw new IllegalArgumentException("Invalid notification type");
        };
    }
}
