package com.example.LibrarryManagement.service;

import com.example.LibrarryManagement.model.User;

/**
 * @author charusingla
 *
 */
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
