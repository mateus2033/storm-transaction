package com.api.storm.application.intefaces.user;

import com.api.storm.application.dtos.user.CreateUserDTO;
import com.api.storm.domain.model.User;

import java.util.Optional;

public interface CreateUserApplicationInterface {
    Optional<User> execute(CreateUserDTO user);
}
