package com.nk.RESTWebServices.Service;

import com.nk.RESTWebServices.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);

    User updateUser(User user);

    void deleteUser(Long userId);
}
