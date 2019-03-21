package com.leaveword.repository;

import com.leaveword.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findUserByUserId(Integer userId);
    User findByUserName(String userName);
}
