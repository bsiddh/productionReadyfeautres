package com.sidd_production_ready_feature.production_ready_futures.service;

import com.sidd_production_ready_feature.production_ready_futures.dto.PostDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {

    List<PostDto> getAllPosts();

    PostDto createPost(PostDto inputPost);

    PostDto getPostById(Long postId);
}
