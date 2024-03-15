package com.myblog.myblog01.service.impl;

import com.myblog.myblog01.entity.Comment;
import com.myblog.myblog01.entity.Post;
import com.myblog.myblog01.exception.ResourseNotFoundException;
import com.myblog.myblog01.payload.CommentDto;
import com.myblog.myblog01.repository.CommentRepository;
import com.myblog.myblog01.repository.PostRepository;
import com.myblog.myblog01.service.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    private PostRepository postRepository;
    private CommentRepository commentRepository;
    private ModelMapper modelMapper;

    public CommentServiceImpl(PostRepository postRepository, CommentRepository commentRepository,ModelMapper modelMapper) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public CommentDto createComment(CommentDto commentDto, long postId) {
        Post post = postRepository.findById(postId).orElseThrow(
                () -> new ResourseNotFoundException("post not found with id :" + postId)
        );
        Comment comment=new Comment();
        comment.setEmail(commentDto.getEmail());
        comment.setText(commentDto.getText());
        comment.setPost(post);                                                                                                       //setting comment for particular post//this will do one to many mapping

        Comment savedComment = commentRepository.save(comment);

        CommentDto dto=new CommentDto();
        dto.setId(savedComment.getId());
        dto.setEmail(savedComment.getEmail());
        dto.setText(savedComment.getText());

        return dto;
    }

    @Override
    public void deleteComment(long id) {
        commentRepository.deleteById(id);
    }

    @Override
    public CommentDto updateComment(long id, CommentDto commentDto, long postId) {
        Post post = postRepository.findById(postId).orElseThrow(
                () -> new ResourseNotFoundException("Post Not found for id " + id)
        );
        Comment comment = commentRepository.findById(id).orElseThrow(
                () -> new ResourseNotFoundException("Comment not found for id :" + id)
        );
        Comment c = mapToEntity(commentDto);
        c.setId(comment.getId());
        c.setPost(post);
        Comment savedComment = commentRepository.save(c);

       return mapTODto(savedComment);

    }
    CommentDto mapTODto(Comment comment){
        CommentDto dto = modelMapper.map(comment, CommentDto.class);
        return dto;
    }
   Comment mapToEntity(CommentDto commentDto){
       Comment comment = modelMapper.map(commentDto, Comment.class);
       return comment;
   }
}
