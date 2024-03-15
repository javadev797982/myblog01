package com.myblog.myblog01.repository;

import com.myblog.myblog01.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    //this custom(user query) query used to check user exist or not //if exist already not register // if not exist then register
    Optional<User> findByEmail(String email);//take emailid n return optional object
    Optional<User> findByUsernameOrEmail(String username, String email);
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);


}
