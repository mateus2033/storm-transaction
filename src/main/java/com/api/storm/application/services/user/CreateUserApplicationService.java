package com.api.storm.application.services.user;

import com.api.storm.application.intefaces.user.CreateUserApplicationInterface;
import com.api.storm.application.validation.user.CreateUserValidation;
import com.api.storm.presentation.dtos.user.CreateUserDTO;
import com.api.storm.domain.model.User;
import com.api.storm.domain.services.user.CreateUserDomainService;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class CreateUserApplicationService implements CreateUserApplicationInterface {

    final CreateUserDomainService createUserDomain;
    final CreateUserValidation createUserValidation;

    public CreateUserApplicationService(CreateUserDomainService createUserDomain, CreateUserValidation createUserValidation) {
        this.createUserDomain = createUserDomain;
        this.createUserValidation = createUserValidation;
    }

    @Transactional
    public Optional<User> execute(CreateUserDTO user) {

        Optional<User> userValid = createUserValidation.execute(user);
        return null;
    }
}
