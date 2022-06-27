package com.team7.question.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WsMessage {
    private String message;
    private String sender;
    private String receiver;
    private Status status;
}
