package com.example.telegrambot.service;

import com.example.telegrambot.entity.NotificationTask;
import com.example.telegrambot.repository.NotificationTaskRepository;
import org.springframework.stereotype.Service;

@Service
public class NorificationTaskService {

    private final NotificationTaskRepository notificationTaskRepository;

    public NorificationTaskService(NotificationTaskRepository notificationTaskRepository) {
        this.notificationTaskRepository = notificationTaskRepository;
    }

    public void save(NotificationTask notificationTask){
        notificationTaskRepository.save(notificationTask);

    }
}
