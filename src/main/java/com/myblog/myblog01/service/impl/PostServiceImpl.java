package com.myblog.myblog01.service.impl;

import com.myblog.myblog01.entity.Post;
import com.myblog.myblog01.exception.ResourseNotFoundException;
import com.myblog.myblog01.payload.PostDto;

import com.myblog.myblog01.repository.PostRepository;
import com.myblog.myblog01.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;
    private ModelMapper modelMapper;//ModelMapper is 3rd party library and spring IOC has no information of modelmapper
    public PostServiceImpl(PostRepository postRepository,ModelMapper modelMapper) {
        this.postRepository = postRepository;
        this.modelMapper = modelMapper;
    }

    //return type is Dto(PostDto)
    @Override
    public PostDto createPost(PostDto postDto) {

        //methods can be call any number of times that make code reusable
        Post post = mapToEntity(postDto);//called 1//converting dto to entity//calling methods mapToEntity from converted method

        Post savedPost = postRepository.save(post);//

        PostDto dto = mapToDto(savedPost);//called 2//this method will convert this entity to dto object//and this will make the methods reusable

        return dto;
    }

    //return type is Dto(PostDto)
    @Override
    public PostDto getPostById(long id) {
        Post post = postRepository.findById(id).orElseThrow(
                ()->new ResourseNotFoundException("Post not found with id:"+id)
        );//supplier functional interface//java8 feature used//if the record is found it will give post object// if the record is not found orElseThrow will run

        PostDto dto = new PostDto();//object of PostDto
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setDescription(post.getDescription());
        dto.setContent(post.getContent());
        return dto;
    }

    //return type is Dto(PostDto)

    //Sort.Direction.ASC.name()-return Asc
    @Override
    public List<PostDto> getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir) {
        Sort sort = (sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())) ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
        Pageable pageable =PageRequest.of(pageNo,pageSize, sort);
        Page<Post> pagePost = postRepository.findAll(pageable);//return type post then
        List<Post> posts = pagePost.getContent();//convert into list
        List<PostDto> dtos = posts.stream().map(p -> mapToDto(p)).collect(Collectors.toList());//mapToDto given to below method that will convert to dto and give to this method
        return dtos;
    }

    //return type is Dto(PostDto)
    //methods is created for reusable
    PostDto mapToDto(Post post){
        PostDto dto = modelMapper.map(post, PostDto.class);

        return dto;
    }

    //return type is entity(post)
    //methods is created for reusable
    Post mapToEntity(PostDto postDto) {

        Post post = modelMapper.map(postDto, Post.class);//modelmapper library used to reduce line of code
        return post;
    }
}
