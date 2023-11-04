package com.api.storm.application.intefaces.user;

import com.api.storm.domain.model.User;

public interface CreateUserApplicationInterface {
    User execute(User user);
}
