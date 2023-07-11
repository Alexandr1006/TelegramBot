package com.example.telegrambot.repository;

import com.example.telegrambot.entity.NotificationTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationTaskRepository extends JpaRepository<NotificationTask,Long> {
}
