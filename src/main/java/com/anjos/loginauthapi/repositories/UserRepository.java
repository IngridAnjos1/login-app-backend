package com.anjos.loginauthapi.repositories;

import com.anjos.loginauthapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
