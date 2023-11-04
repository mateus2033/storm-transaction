package com.api.storm.domain.interfaces.user;

import com.api.storm.domain.model.User;

import java.util.UUID;

public interface ShowUserDomainInterface {
    User execute(UUID user);
}
