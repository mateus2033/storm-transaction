package com.api.storm.domain.services.user;

import com.api.storm.domain.interfaces.user.CreateUserDomainInterface;
import com.api.storm.domain.model.User;
import com.api.storm.domain.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateUserDomainService implements CreateUserDomainInterface {

    final UserRepository userRepository;

    public CreateUserDomainService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User execute(User user) {
        return null;
    }
}
