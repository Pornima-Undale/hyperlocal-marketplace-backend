package com.marketplace.service;

import com.marketplace.dto.UserResponseDto;
import com.marketplace.entity.User;
import com.marketplace.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserResponseDto saveUser(User user){

        User savedUser = userRepository.save(user);

        return convertToDto(savedUser);
    }

    public List<UserResponseDto> getAllUsers() {

        List<User> users = userRepository.findAll();

        List<UserResponseDto> userDtos = new ArrayList<>();

        for(User user : users) {
            userDtos.add(convertToDto(user));
        }

        return userDtos;
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public String deleteUser(Long id) {

        if(userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return "User deleted successfully";
        }

        return "User not found";
    }

    public User updateUser(Long id, User updatedUser) {

        User existingUser =
                userRepository.findById(id).orElse(null);

        if(existingUser != null) {

            existingUser.setName(updatedUser.getName());
            existingUser.setEmail(updatedUser.getEmail());
            existingUser.setPassword(updatedUser.getPassword());
            existingUser.setRole(updatedUser.getRole());

            return userRepository.save(existingUser);
        }

        return null;
    }

    private UserResponseDto convertToDto(User user) {

        UserResponseDto dto = new UserResponseDto();

        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        dto.setRole(user.getRole().name());

        return dto;
    }

}