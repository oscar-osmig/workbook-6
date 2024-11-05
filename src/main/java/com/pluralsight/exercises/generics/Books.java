package com.pluralsight.exercises.generics;

public class Books {
    private String title;
    private String author;

    public Books(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
