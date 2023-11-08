package com.api.storm.application.services.user;

import com.api.storm.application.intefaces.user.CreateUserApplicationInterface;
import com.api.storm.application.dtos.user.CreateUserDTO;
import com.api.storm.domain.model.User;
import com.api.storm.domain.services.user.CreateUserDomainService;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class CreateUserApplicationService implements CreateUserApplicationInterface {

    final CreateUserDomainService createUserDomain;

    public CreateUserApplicationService(CreateUserDomainService createUserDomain) {
        this.createUserDomain = createUserDomain;
    }

    @Transactional
    public Optional<User> execute(CreateUserDTO user) {
        return null;
    }
}
