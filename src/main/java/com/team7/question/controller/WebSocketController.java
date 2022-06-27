package com.team7.question.controller;

import com.team7.question.model.WsMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;


@Controller
@CrossOrigin
public class WebSocketController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/message")
    @SendTo("/chatroom/public")
    public WsMessage chatEndpoint(@Payload WsMessage wsMessage) {
        System.out.println(wsMessage);
        return wsMessage;
    }

    @MessageMapping("/private-message")
    public WsMessage receivePrivateMessage(@Payload WsMessage wsMessage) {
        messagingTemplate.convertAndSendToUser(wsMessage.getSender(),"/private",wsMessage);
        return wsMessage;
    }



}
