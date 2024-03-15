package com.myblog.myblog01.repository;

import com.myblog.myblog01.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
