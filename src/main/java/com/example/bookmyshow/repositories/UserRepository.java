package com.example.bookmyshow.repositories;


import com.example.bookmyshow.models.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    Optional<User> findById(Long userId);
    //select * users where user_id = userId;

    Optional<User> findAllByEmail(String email);

    @Override
    User save(User user);

}
