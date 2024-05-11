package com.college.sportik.feature.news.controller;

import com.college.sportik.feature.news.dto.NewsDTOReceive;
import com.college.sportik.feature.news.dto.NewsDTOResponse;
import com.college.sportik.feature.news.service.NewsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/news")
public class NewsController {

    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @PostMapping
    NewsDTOResponse createNews(@RequestParam("category_id") Integer category_id, @RequestBody NewsDTOResponse newsDTOResponse) {
        return newsService.createNews(category_id, newsDTOResponse);
    }

    @GetMapping("/{id}")
    NewsDTOReceive getNewsById(@PathVariable("id") Long id) {
        return newsService.getProductById(id);
    }

    @GetMapping
    List<NewsDTOReceive> getNews() {
        return newsService.getProducts();
    }

    @DeleteMapping("/{id}")
    String deleteNewsById(@PathVariable("id") Long id) {
        return newsService.deleteProductById(id);
    }
}
