package com.prod_ready_features.prod_ready_features.service;

import com.prod_ready_features.prod_ready_features.dto.PostDto;

import java.util.List;

public interface PostService {

    public List<PostDto> getAllPost();

    public PostDto createNewPost(PostDto postDto);

    PostDto getPostByDto(Long postId);
}
