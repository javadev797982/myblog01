package com.myblog.myblog01.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "comments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String text;
    private String email;

    //Many comments belongs to one post
    // post is 1 and many is comment
    @ManyToOne
    @JoinColumn(name = "post_id")                                                                                                                     //@joinColumn means foreign key
    private Post post;


}

