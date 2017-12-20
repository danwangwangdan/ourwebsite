package com.qyjy.ourwebsite.model;

public class Info extends BaseBody{

    private static final long serialVersionUID = -6532654002676706820L;
    private String title;
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
