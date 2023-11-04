package com.api.storm.domain.services.user;

import com.api.storm.domain.interfaces.user.UpdateUserDomainInterface;
import com.api.storm.domain.model.User;
import com.api.storm.domain.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UpdateUserDomainService implements UpdateUserDomainInterface {

    final UserRepository userRepository;

    public UpdateUserDomainService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User execute(User user) {
        return null;
    }
}
