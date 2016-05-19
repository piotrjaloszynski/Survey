package com.piotr.service;

import com.piotr.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by jalos on 30.04.2016.
 */
public interface UserService extends UserDetailsService {
    User findOne(Long id);

}
