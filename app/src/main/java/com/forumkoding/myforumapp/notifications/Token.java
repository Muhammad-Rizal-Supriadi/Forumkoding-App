package com.forumkoding.myforumapp.notifications;

public class Token {
    /* an FCM Token, or much commonly known as a registrationToken
    * An ID issued by the GCMconnection servers to the client app that allows it to received messages */

    String token;

    public Token(String token) {
        this.token = token;
    }

    public Token() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
