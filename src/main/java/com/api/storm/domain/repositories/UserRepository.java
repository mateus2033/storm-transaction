package com.api.storm.domain.repositories;

import java.util.UUID;
import com.api.storm.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, UUID> {
}
