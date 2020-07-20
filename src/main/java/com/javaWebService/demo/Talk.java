package com.javaWebService.demo;

public class Talk {
    private String talkBack;

    private int id;

    public Talk(String talkBack) {
        this.talkBack = talkBack;
        this.id = 420;
    }
    public int getId() {
        return id;
    }
    public String getTalkBack() {
        return talkBack;
    }

    public void setTalkBack(String talkBack) {
        this.talkBack = talkBack;
    }
}
