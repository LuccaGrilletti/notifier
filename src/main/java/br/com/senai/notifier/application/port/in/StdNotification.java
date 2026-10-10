package br.com.senai.notifier.application.port.in;

import br.com.senai.notifier.adapter.in.controller.request.NotificationDetail;
import br.com.senai.notifier.adapter.in.controller.request.NotificationRequest;
import org.springframework.http.ResponseEntity;

public interface StdNotification {
    ResponseEntity<NotificationDetail> notify(NotificationRequest request);
}
