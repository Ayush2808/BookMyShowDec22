package com.scaler.bookmyshow.repositories;

import com.scaler.bookmyshow.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Override
    Optional<User> findById(Long aLong);
    Optional<User> findByEmail(String email);

    @Override
    User save(User user);
}
