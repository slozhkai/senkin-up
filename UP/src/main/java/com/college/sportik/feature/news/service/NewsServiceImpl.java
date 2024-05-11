package com.college.sportik.feature.news.service;

import com.college.sportik.feature.category.repository.CategoryRepository;
import com.college.sportik.feature.news.dto.NewsDTOReceive;
import com.college.sportik.feature.news.dto.NewsDTOResponse;
import com.college.sportik.feature.news.entity.NewsEntity;
import com.college.sportik.feature.news.repository.NewsRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    private final NewsRepository newsRepository;
    private final CategoryRepository categoryRepository;

    public NewsServiceImpl(NewsRepository newsRepository, CategoryRepository categoryRepository) {
        this.newsRepository = newsRepository;
        this.categoryRepository = categoryRepository;
    }


    @Override
    public NewsDTOResponse createNews(Integer category_id, NewsDTOResponse newsDTOResponse) {

        newsRepository.save(new NewsEntity(
                newsDTOResponse.getId(),
                category_id,
                newsDTOResponse.getTitle(),
                newsDTOResponse.getDescription(),
                newsDTOResponse.getDate()

        ));
        return newsDTOResponse;
    }

    @Override
    public NewsDTOReceive getProductById(Long id) {
        NewsEntity product = newsRepository.findNewsById(id);
        return new NewsDTOReceive(
                product.getId(),
                product.getCategory(),
                product.getTitle(),
                product.getDescription(),
                product.getDate()
        );
    }

    @Override
    public List<NewsDTOReceive> getProducts() {
        List<NewsDTOReceive> products = new ArrayList<>();
        newsRepository.findAll().forEach(item -> {
                    products.add(
                            new NewsDTOReceive(
                                    item.getId(),
                                    item.getCategory(),
                                    item.getTitle(),
                                    item.getDescription(),
                                    item.getDate()
                            )
                    );
                }
        );
        return products;
    }

    @Override
    public String deleteProductById(Long id) {
        newsRepository.deleteById(id);
        return "Product with id " + id + " deleted";
    }
}
