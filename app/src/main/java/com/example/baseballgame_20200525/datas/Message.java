package com.example.baseballgame_20200525.datas;

public class Message {

    private  String contents;
    private String who;

    public Message(String contents, String who) {
        this.contents = contents;
        this.who = who;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }
}
