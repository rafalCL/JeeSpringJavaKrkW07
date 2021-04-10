package pl.coderslab.jeespringjava.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class MessageSender {
    private MessageService messageService;

    @Autowired
    public MessageSender(MessageService smsService) {
        this.messageService = smsService;
    }

    public void sendSth() {
        this.messageService.send("sth");
    }
}
