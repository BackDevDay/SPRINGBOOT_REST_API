package dev.devtoday.springbootrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.devtoday.springbootrestapi.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
