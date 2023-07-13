package com.example.telegrambot.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "notification_tasks")
public class NotificationTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String massage;
    @Column(name = "chat_id", nullable = false)
    private long chat_id;
    @Column(name = "notification_data_time", nullable = false)
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

    public long getChatId() {
        return chat_id;
    }

    public void setChatId(long chat_id) {
        this.chat_id = chat_id;
    }

    public LocalDateTime getNotificationDataTime() {
        return notificationDataTime;
    }

    public void setNotificationDataTime(LocalDateTime notificationDataTime) {
        this.notificationDataTime = notificationDataTime;
    }
}
