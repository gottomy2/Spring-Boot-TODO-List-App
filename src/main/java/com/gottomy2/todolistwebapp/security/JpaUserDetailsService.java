package com.gottomy2.todolistwebapp.security;

import com.gottomy2.todolistwebapp.user.UserEntity;
import com.gottomy2.todolistwebapp.user.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class JpaUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    public JpaUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findUserByUsername(username);

        if(user==null){
            throw new UsernameNotFoundException("User with username: " + username + " not found");
        }

        List<GrantedAuthority> authorities = new ArrayList<>();
        var authority = new SimpleGrantedAuthority(user.getRole().toString());

        return new User(user.getUsername(), user.getPassword(), authorities);
    }
}
