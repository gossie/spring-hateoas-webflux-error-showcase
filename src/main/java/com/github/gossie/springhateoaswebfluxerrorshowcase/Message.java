package com.github.gossie.springhateoaswebfluxerrorshowcase;

import org.springframework.hateoas.RepresentationModel;

public class Message extends RepresentationModel<Message> {
    private String text;

    public Message(String text) {
        this.text = text;
    }

    public Message() {}

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
