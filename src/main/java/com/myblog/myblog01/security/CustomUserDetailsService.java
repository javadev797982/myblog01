package com.myblog.myblog01.security;

import com.myblog.myblog01.entity.Role;
import com.myblog.myblog01.entity.User;
import com.myblog.myblog01.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CustomUserDetailsService implements UserDetailsService {//this class help to fetch the data from db
    //to get the data from db first supply username

    private UserRepository userRepository;
    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {//this method automatacally take the user name from UsernamePasswordAuthenticationToken()
      User user= userRepository.findByUsernameOrEmail(username, username)
        .orElseThrow(()->
              new UsernameNotFoundException("User Not found with username or email:" + username));//(username,username)-means username,email//username and email coming from db
       //org.springframework.security.core- used bcz two User class// to avoid conflict
        return new org.springframework.security.core.userdetails.User(user.getEmail(),
                user.getPassword(), mapRolesToAuthorities(user.getRoles()));

    }
    private Collection< ? extends GrantedAuthority>
    mapRolesToAuthorities(Set<Role> roles) {
        return roles.stream().map(role -> new
                SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());//return user object to User() class constructor
    }
}
