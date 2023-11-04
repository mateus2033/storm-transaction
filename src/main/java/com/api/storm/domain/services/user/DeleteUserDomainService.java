package com.api.storm.domain.services.user;

import com.api.storm.domain.interfaces.user.DeleteUserDomainInterface;
import com.api.storm.domain.model.User;
import com.api.storm.domain.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DeleteUserDomainService implements DeleteUserDomainInterface {

    final UserRepository userRepository;

    public DeleteUserDomainService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String execute(UUID user) {
        return null;
    }
}
