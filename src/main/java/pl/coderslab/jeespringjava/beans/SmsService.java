package pl.coderslab.jeespringjava.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("smsService")
public class SmsService implements MessageService {
    @Override
    public void send(String msg) {
        System.out.println("Sending sms: "+msg);
    }
}
