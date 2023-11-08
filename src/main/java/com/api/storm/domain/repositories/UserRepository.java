package com.api.storm.domain.repositories;

import java.util.Optional;
import java.util.UUID;
import com.api.storm.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    User findUserByCpf(String cpf);
    User findUserByEmail(String email);
}
