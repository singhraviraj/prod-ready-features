package com.prod_ready_features.prod_ready_features.repository;

import com.prod_ready_features.prod_ready_features.dto.PostDto;
import com.prod_ready_features.prod_ready_features.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity,Long> {
}
