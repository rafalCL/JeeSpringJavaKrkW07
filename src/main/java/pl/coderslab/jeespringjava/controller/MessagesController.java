package pl.coderslab.jeespringjava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.coderslab.jeespringjava.beans.MessageSender;

@Controller
public class MessagesController {
    private MessageSender sender;

    @Autowired
    public MessagesController(MessageSender sender) {
        this.sender = sender;
    }

    public void handleClick(){
        this.sender.sendSth();
    }
}
