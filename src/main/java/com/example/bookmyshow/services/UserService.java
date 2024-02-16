package com.example.bookmyshow.services;

import com.example.bookmyshow.exceptions.InvalidCredentialsException;
import com.example.bookmyshow.exceptions.UserNotFoundException;
import com.example.bookmyshow.models.User;
import com.example.bookmyshow.repositories.UserRepository;
import lombok.NonNull;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(@NonNull UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User signUp(String email, String password) throws UserNotFoundException, InvalidCredentialsException {
        Optional<User> optionalUser = userRepository.findAllByEmail(email);
        if (optionalUser.isPresent()) {
            return signIn(email, password);
        }
        //Create and register the user.
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        User user = new User();
        user.setEmail(email);
        user.setPassword(bCryptPasswordEncoder.encode(password));
        User savedUser = userRepository.save(user);
        return savedUser;
    }


    public User signIn(String email, String password) throws UserNotFoundException, InvalidCredentialsException {
        Optional<User> optionalUser = userRepository.findAllByEmail(email);
        if (optionalUser.isEmpty()) {
           throw new UserNotFoundException("user not found");
        }
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = bCryptPasswordEncoder.encode(password);
        if(optionalUser.get().getPassword().equals(encodedPassword)) {
            return optionalUser.get();
        } else {
            throw new InvalidCredentialsException("invalid credentials");
        }
    }

}
