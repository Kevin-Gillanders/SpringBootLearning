package com.javaWebService.demo;

public class Book implements IBookModel {

    private int ID;
    private String Title;
    private String Author;
    private boolean Fiction;

    public Book(int ID, String title, String author, boolean fiction) {
        this.ID = ID;
        Title = title;
        Author = author;
        Fiction = fiction;
    }

    @Override
    public String getTitle() {
        return Title;
    }

    @Override
    public void setTitle(String title) {
        Title = title;
    }

    @Override
    public String getAuthor() {
        return Author;
    }

    @Override
    public void setAuthor(String author) {
        Author = author;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public void setID(int id) {
        ID = id;
    }

    public Book() {
    }

    public boolean getFiction() {
        return Fiction;
    }

    public void setFiction(boolean fiction) {
        Fiction = fiction;
    }
}
