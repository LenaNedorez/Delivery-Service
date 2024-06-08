package com.uniloftsky.springframework.spring5freelancedeliveryservice.services;

import com.uniloftsky.springframework.spring5freelancedeliveryservice.api.model.UserDTO;
import com.uniloftsky.springframework.spring5freelancedeliveryservice.model.Notification;
import com.uniloftsky.springframework.spring5freelancedeliveryservice.model.auth0.User;
import com.uniloftsky.springframework.spring5freelancedeliveryservice.repositories.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class NotificationServiceImpl implements NotificationService {

    private final NotificationRepository notificationRepository;
    private final UserService userService;

    public NotificationServiceImpl(NotificationRepository notificationRepository, UserService userService) {
        this.notificationRepository = notificationRepository;
        this.userService = userService;
    }

    @Override
    public Notification findById(Long id) {
        return notificationRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public Set<Notification> findAll() {
        Set<Notification> notifications = new HashSet<>();
        notificationRepository.findAll().iterator().forEachRemaining(notifications::add);
        return notifications;
    }

    @Override
    public Notification save(Notification notification) {
        return notificationRepository.save(notification);
    }

    @Override
    public Notification save(Notification notification, User user) throws IllegalAccessException {
        notificationRepository.save(notification);
        UserDTO userDTO = user.clone();
        userDTO.getUserMetadata().getNotifications().removeIf(e -> e.getId().equals(notification.getId()));
        userDTO.getUserMetadata().getNotifications().add(notification);
        userService.save(user, userDTO);
        return notification;
    }

    @Override
    public void delete(Notification notification) {
        notificationRepository.delete(notification);
    }

    @Override
    public void delete(Notification notification, User user) throws IllegalAccessException {
        UserDTO userDTO = user.clone();
        userDTO.getUserMetadata().getNotifications().removeIf(e -> e.getId().equals(notification.getId()));
        userService.save(user, userDTO);
        notificationRepository.delete(notification);
    }
}
