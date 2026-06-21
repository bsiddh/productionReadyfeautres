package com.sidd_production_ready_feature.production_ready_futures.controller;

import com.sidd_production_ready_feature.production_ready_futures.dto.PostDto;
import com.sidd_production_ready_feature.production_ready_futures.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;



    @GetMapping
    public List<PostDto> getAllPosts(){
       return postService.getAllPosts();
    }

    @PostMapping
    public PostDto createNewPost(@RequestBody PostDto postDto){
        return postService.createPost(postDto);
    }

    @GetMapping("/{postId}")
    public PostDto getPostById(@PathVariable Long postId){
        return postService.getPostById(postId);
    }

    @PutMapping("{postId}")
    public PostDto updatePost(@RequestBody PostDto postDto,@PathVariable Long postId){
        return postService.updatePost(postDto,postId);
    }
}
