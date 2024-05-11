package com.college.sportik.feature.news.service;

import com.college.sportik.feature.news.dto.NewsDTOReceive;
import com.college.sportik.feature.news.dto.NewsDTOResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NewsService {

    NewsDTOResponse createNews(Integer category_id, NewsDTOResponse newsDTOResponse);
    NewsDTOReceive getProductById(Long id);
    List<NewsDTOReceive> getProducts();
    String deleteProductById(Long id);
}
