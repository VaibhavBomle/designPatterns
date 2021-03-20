package com.designPatterns.commandPattern1.editor;

public class HtmlDocument {

    private String content;

    public void makeBold(){
        content = "<B>"+content+"</B>";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
