package pl.coderslab.jeespringjava.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("emailService")
public class EmailService implements MessageService {
    @Override
    public void send(String msg) {
        System.out.println("Sending email: "+msg);
    }
}
