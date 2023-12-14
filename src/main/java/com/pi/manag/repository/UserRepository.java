
package com.pi.manag.repository;

import com.pi.manag.entitie.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
    User findByLogin(String login);
}
