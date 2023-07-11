package com.example.telegrambot.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "notification task")
public class NotificationTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String massage;

    private long chat_id;

    private LocalDateTime notificationDataTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public long getChat_id() {
        return chat_id;
    }

    public void setChat_id(long chat_id) {
        this.chat_id = chat_id;
    }

    public LocalDateTime getNotificationDataTime() {
        return notificationDataTime;
    }

    public void setNotificationDataTime(LocalDateTime notificationDataTime) {
        this.notificationDataTime = notificationDataTime;
    }
}
