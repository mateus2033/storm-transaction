package com.api.storm.application.intefaces.user;

import com.api.storm.domain.model.User;

public interface UpdateUserApplicationInterface {
    User execute(User user);
}
