package br.com.senai.notifier.adapter.out.repository.document;

import br.com.senai.notifier.application.core.enumeration.EventStatus;
import br.com.senai.notifier.application.core.enumeration.EventType;
import br.com.senai.notifier.application.core.enumeration.NotificationChannel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.NotActiveException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Document(collection = "notifications")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class NotificationDocument {

    @Id
    private String id;
    private EventType type;
    private NotificationChannel channel;
    private List<String> contacts;
    private LocalDateTime requestedAt;
    private String subject;
    private String template;
    private Map<String, Object> payload;
    private String author;
    private EventStatus status;
    private LocalDateTime updatedAt;


    public String getId() {
        return id;
    }

    public EventType getType() {
        return type;
    }

    public NotificationChannel getChannel() {
        return channel;
    }

    public List<String> getContacts() {
        return contacts;
    }

    public LocalDateTime getRequestedAt() {
        return requestedAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getTemplate() {
        return template;
    }

    public Map<String, Object> getPayload() {
        return payload;
    }

    public String getAuthor() {
        return author;
    }

    public EventStatus getStatus() {
        return status;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }


}
