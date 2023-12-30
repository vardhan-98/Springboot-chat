package com.example.demo;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin("*")
public class WebSocketController {

    @MessageMapping("/chat/{roomCode}")
    @SendTo("/topic/messages/{roomCode}")
    public HelloMessage sendMessage(@DestinationVariable String roomCode, @Payload HelloMessage message) {
        // Add logic to handle messages in the specified room
        return message;
    }
}

