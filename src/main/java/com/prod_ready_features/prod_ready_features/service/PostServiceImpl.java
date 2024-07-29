package com.prod_ready_features.prod_ready_features.service;

import com.prod_ready_features.prod_ready_features.Exceptions.NoResourceFoundException;
import com.prod_ready_features.prod_ready_features.dto.PostDto;
import com.prod_ready_features.prod_ready_features.entity.PostEntity;
import com.prod_ready_features.prod_ready_features.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<PostDto> getAllPost() {
        return postRepository.findAll()
                .stream()
                .map(postEntity -> modelMapper.map(postEntity,PostDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public PostDto createNewPost(PostDto postDto) {
        PostEntity postEntity = modelMapper.map(postDto,PostEntity.class);
        PostDto postDto1 = modelMapper.map(postRepository.save(postEntity),PostDto.class);
        return postDto1;
    }

    @Override
    public PostDto getPostByDto(Long postId) {
        PostEntity postEntity = postRepository.findById(postId).orElseThrow(()-> new NoResourceFoundException("No post found of given id "+postId));
        return modelMapper.map(postEntity,PostDto.class);
    }
}
