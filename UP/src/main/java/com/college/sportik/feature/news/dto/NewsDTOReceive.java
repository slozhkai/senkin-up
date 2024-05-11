package com.college.sportik.feature.news.dto;

public class NewsDTOReceive {
    Integer id;
    Integer categoryId;
    String title;
    String description;
    String date;

    public NewsDTOReceive(Integer id, Integer categoryId, String title, String description, String date) {
        this.id = id;
        this.categoryId = categoryId;
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}