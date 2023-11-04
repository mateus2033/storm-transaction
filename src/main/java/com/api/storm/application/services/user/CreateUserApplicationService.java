package com.api.storm.application.services.user;

import com.api.storm.application.intefaces.user.CreateUserApplicationInterface;
import com.api.storm.domain.model.User;
import com.api.storm.domain.services.user.CreateUserDomainService;
import org.springframework.stereotype.Service;

@Service
public class CreateUserApplicationService implements CreateUserApplicationInterface {

    final CreateUserDomainService createUserDomain;

    public CreateUserApplicationService(CreateUserDomainService createUserDomain) {
        this.createUserDomain = createUserDomain;
    }

    @Override
    public User execute(User user) {
        return null;
    }
}
