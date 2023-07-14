package ru.leonid.testwebsocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import ru.leonid.testwebsocket.model.MyMessage;

@Controller
public class MessageController {

    @MessageMapping("/hello")
    @SendTo("/topic/messages")
    public MyMessage mymessages(String name) throws Exception {
        System.out.println("Register user: "+ name);
        Thread.sleep(300); // simulated delay
        return new MyMessage(1, "Hello, " + name + "!");
    }

    @MessageMapping("/msg")
    @SendTo("/topic/messages")
    public MyMessage getMessages(MyMessage msg) throws Exception{
        System.out.println("Message: "+ msg);
        return new MyMessage(2, "msg from user: "+ msg);
    }


}
