package pl.coderslab.jeespringjava.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    private MessageService smsService;
    private MessageService emailService;

    @Autowired
    public MessageSender(@Qualifier("smsService") MessageService smsService,
                         @Qualifier("emailService") MessageService emailService) {
        this.smsService = smsService;
        this.emailService = emailService;
    }

    public void sendSth() {
        this.smsService.send("sth");
        this.emailService.send("sth by email");
    }
}
