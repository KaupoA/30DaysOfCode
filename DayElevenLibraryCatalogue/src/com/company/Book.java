package com.company;

public class Book {

    // Properties, Fields, Global Variables
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut; // is the book checked out or not
    int dayCheckedOut = -1;

    // Constructor
    public Book(String bookTitle, int bookPageCount, int bookISBN) {

        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN = bookISBN;
        isCheckedOut = false;

    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getISBN() {
        return ISBN;
    }

    public boolean getIsCheckedOut() {
        return isCheckedOut;
    }

    public int getDayCheckedOut() {
        return dayCheckedOut;
    }

    // Setters
    public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut) {
        isCheckedOut = newIsCheckedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }

    private void setDayCheckedOut(int day) {
        dayCheckedOut = day;
    }

}
