package com.marketplace.repository;

import com.marketplace.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
                 extends JpaRepository<User, Long> {
}
