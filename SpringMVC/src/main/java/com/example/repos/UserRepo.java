package com.example.repos;


import com.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(isolation = Isolation.DEFAULT)
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}