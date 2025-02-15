package com.college.sportik.feature.category.repository;

import com.college.sportik.feature.category.dto.CategoryDTOResponse;
import com.college.sportik.feature.category.entity.CategoryEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity, Long> {

    CategoryDTOResponse findByCode(String code);

    @Modifying
    @Transactional
    @Query("update category u set u.title = ?2, u.code = ?3 where u.id = ?1")
    void updateCategory(Integer id, String title, String code);
}