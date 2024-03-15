package com.myblog.myblog01.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

//in role table only @Setter&@Getter are working// @Data not working here
@Setter
@Getter
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 60)
    private String name;
}
