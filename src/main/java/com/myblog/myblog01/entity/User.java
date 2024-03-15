package com.myblog.myblog01.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"username"}),
        @UniqueConstraint(columnNames = {"email"})
})

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String username;
    private String email;
    private String password;

    //set is used bcz many
    //Here Many is user and many is role//CascadeType.ALL-means- any changes in parent will also change in child
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    //join both table based on third table- user_roles//inverseJoinColumns-is child table to third table//user_id-is foreign key,//id-is primary key
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private Set<Role> roles;//set is taken bcz role will be unique//list not used bcz list can consist of duplicate
}
