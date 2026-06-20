package com.sidd_production_ready_feature.production_ready_futures.repository;

import com.sidd_production_ready_feature.production_ready_futures.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {


}
