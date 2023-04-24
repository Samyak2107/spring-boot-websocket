package com.example.websocket.models;

public class Message {
    private String step;

    public Message() {
    }

    public Message(String step) {
        this.step = step;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }
}
