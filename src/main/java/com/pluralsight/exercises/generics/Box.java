package com.pluralsight.exercises.generics;

import java.util.List;

public class Box<T> {
    private List<T> content;

    public Box() {

    }

    public void printBoxContent(){
        System.out.println(content);
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }
}
