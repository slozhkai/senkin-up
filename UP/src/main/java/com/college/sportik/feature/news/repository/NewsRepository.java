package com.college.sportik.feature.news.repository;

import com.college.sportik.feature.news.entity.NewsEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends CrudRepository<NewsEntity, Long> {

    @Query(value = "select * from news WHERE news_id = ?1", nativeQuery = true)
    NewsEntity findNewsById(Long id);
}
