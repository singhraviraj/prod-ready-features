package com.prod_ready_features.prod_ready_features.controller;

import com.prod_ready_features.prod_ready_features.dto.PostDto;
import com.prod_ready_features.prod_ready_features.service.PostService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping
    public List<PostDto> getAllPost(){
        return postService.getAllPost();
    }

    @PostMapping
    public PostDto createPost(@RequestBody PostDto postDto){
        return postService.createNewPost(postDto);
    }

    @GetMapping(path = "/{postId}")
    public PostDto getPostByDto(@PathVariable Long postId){
        return postService.getPostByDto(postId);
    }
}
