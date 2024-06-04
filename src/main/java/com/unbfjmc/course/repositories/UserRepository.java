package com.unbfjmc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unbfjmc.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
