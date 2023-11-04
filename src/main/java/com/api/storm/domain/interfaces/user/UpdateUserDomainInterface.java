package com.api.storm.domain.interfaces.user;

import com.api.storm.domain.model.User;

public interface UpdateUserDomainInterface {
    User execute(User user);
}
