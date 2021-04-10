package pl.coderslab.jeespringjava.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.jeespringjava.beans.HelloWorld;
import pl.coderslab.jeespringjava.beans.MessageSender;
import pl.coderslab.jeespringjava.controller.MessagesController;

public class MultipleBeansImplementingSameInterfaceExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

        MessageSender msgSender1 = ctx.getBean("smsMessageSender", MessageSender.class);
        MessageSender msgSender2 = ctx.getBean("emailMessageSender", MessageSender.class);
        msgSender1.sendSth();
        msgSender2.sendSth();

        ctx.close();
    }
}
