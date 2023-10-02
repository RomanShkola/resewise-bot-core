package com.telegram.resewise.repositories;

import com.telegram.resewise.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByTelegramId(String id);
}
