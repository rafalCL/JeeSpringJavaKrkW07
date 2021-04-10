package pl.coderslab.jeespringjava.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmailMessageSender extends MessageSender {
    @Autowired
    public EmailMessageSender(@Qualifier("emailService") MessageService emailService) {
        super(emailService);
    }
}
