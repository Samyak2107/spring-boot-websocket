package com.example.websocket.controllers;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.websocket.models.Message;

@RestController
public class MessageController {

    public MessageController() {
    }

    @MessageMapping("/message") //Agent will send the step on this end point
    @SendTo("/topic/return-to")  //Customer will subscribe this endpoint for message changes
    public Message getMessage(@RequestBody Message message) {
        // try {
        // Thread.sleep(1000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        return message;
    }
}
