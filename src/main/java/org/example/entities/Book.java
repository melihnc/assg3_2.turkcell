package org.example.entities;

import java.time.LocalDateTime;

public class Book extends BaseEntity{
    private String name;
    private String authorName;
    private int numberOfPages;
    private boolean isAvailable;
    private LocalDateTime dueDate;
    private String publisherName;
    private Category[] categories;

    public Book(int id, boolean isDeleted, String name, String authorName, int numberOfPages, boolean isAvailable, LocalDateTime deliveredTime, String publisherName, Category[] categories) {
        super(id, isDeleted);
        this.name = name;
        this.authorName = authorName;
        this.numberOfPages = numberOfPages;
        this.isAvailable = isAvailable;
        this.dueDate = deliveredTime;
        this.publisherName = publisherName;
        this.categories = categories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public Category[] getCategories() {
        return categories;
    }

    public void setCategories(Category[] categories) {
        this.categories = categories;
    }
}
