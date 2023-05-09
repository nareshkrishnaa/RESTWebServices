package com.nk.RESTWebServices.Service.Impl;

import com.nk.RESTWebServices.Service.UserService;
import com.nk.RESTWebServices.entity.User;
import com.nk.RESTWebServices.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }


    @Override
    public User getUserById(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.get();
    }


    @Override
    public User updateUser(User user) {
        User existingUser = userRepository.findById(user.getId()).get();
        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());
        User updatedUser = userRepository.save(existingUser);
        return updatedUser;
    }


    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }


}
