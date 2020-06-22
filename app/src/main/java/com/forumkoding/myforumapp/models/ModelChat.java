package com.forumkoding.myforumapp.models;

import com.google.firebase.database.PropertyName;

public class ModelChat {
    String message, receiver, sender, timestamp;
    boolean isPelong;

    public ModelChat(){
    }

    public ModelChat(String message, String receiver, String sender, String timestamp, boolean isPelong) {
        this.message = message;
        this.receiver = receiver;
        this.sender = sender;
        this.timestamp = timestamp;
        this.isPelong = isPelong;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isPelong() {
        return isPelong;
    }

    public void setPelong(boolean pelong) {
        isPelong = pelong;
    }
}
