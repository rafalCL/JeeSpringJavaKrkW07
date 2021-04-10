package pl.coderslab.jeespringjava.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.jeespringjava.beans.HelloWorld;
import pl.coderslab.jeespringjava.controller.MessagesController;

public class SpringDiApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld hw = ctx.getBean("helloWorld", HelloWorld.class);
        hw.hello();

        MessagesController mc = ctx.getBean("messagesController", MessagesController.class);
        mc.handleClick();

        ctx.close();
    }
}
