package com.api.storm.domain.services.user;

import com.api.storm.domain.interfaces.user.ShowUserDomainInterface;
import com.api.storm.domain.model.User;
import com.api.storm.domain.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ShowUserDomainService implements ShowUserDomainInterface {

    final UserRepository userRepository;

    public ShowUserDomainService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User execute(UUID user) {
        return null;
    }
}
