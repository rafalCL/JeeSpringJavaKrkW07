package pl.coderslab.jeespringjava.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SmsMessageSender extends MessageSender {
    @Autowired
    public SmsMessageSender(@Qualifier("smsService") MessageService smsService) {
        super(smsService);
    }
}
