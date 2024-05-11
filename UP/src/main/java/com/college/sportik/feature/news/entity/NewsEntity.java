package com.college.sportik.feature.news.entity;

import com.college.sportik.feature.category.entity.CategoryEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "news")
public class NewsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "news_id")
    private Integer id;

//    @OneToOne
    @JoinColumn(name = "category")
    private Integer category;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String date;

    NewsEntity() {
    }

    public NewsEntity(Integer id, Integer category, String title, String description, String date) {
        this.id = id;
        this.category = category;
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

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
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
