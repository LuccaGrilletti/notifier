package br.com.senai.notifier.application.service;

import br.com.senai.notifier.adapter.in.controller.mapper.NotificatonMapper;
import br.com.senai.notifier.adapter.in.controller.request.NotificationDetail;
import br.com.senai.notifier.adapter.in.controller.request.NotificationRequest;
import br.com.senai.notifier.adapter.out.rabbitmq.EventPublisherImpl;
import br.com.senai.notifier.adapter.out.rabbitmq.event.NotificationEvent;
import br.com.senai.notifier.adapter.out.rabbitmq.mapper.NotificationEventMapper;
import br.com.senai.notifier.application.core.domain.Notification;
import br.com.senai.notifier.application.port.out.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificatonMapper mapper;
    private final NotificationRepository repository;
    private final NotificationEventMapper eventMapper;
    private final EventPublisherImpl publisher;

    public NotificationDetail notify(NotificationRequest request) {

        Notification notification = mapper.toDomain(request);
        notification.request();

        Notification saved = repository.save(notification);

        NotificationEvent event = eventMapper.toPub(notification);
        publisher.publish(event);

        return mapper.toDetail(notification);
    }

}
