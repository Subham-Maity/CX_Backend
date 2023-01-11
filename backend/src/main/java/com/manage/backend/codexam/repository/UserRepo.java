package com.manage.backend.codexam.repository;

import com.manage.backend.codexam.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {


}
