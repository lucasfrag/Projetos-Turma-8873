package solid;

public interface MessageSender {
    void sendMessage(String message);
}

public class EmailSender implements MessageSender {
    public void sendMessage(String message) {
        // Lógica para enviar mensagem por e=mail
    }
}

public class SMSSender implements MessageSender {
    public void sendMessage(String message) {
        // Lógica para enviar mensagem por SNS
    }
}

public class NotificationService {
    private MessageSender messageSender;
    
    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }
    
    public void sendNotification(String message) {
        messageSender.sendMessage(message);
    }
}