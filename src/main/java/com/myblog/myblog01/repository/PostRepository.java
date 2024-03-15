package com.myblog.myblog01.repository;

import com.myblog.myblog01.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
