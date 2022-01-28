package net.application.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.application.springboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
