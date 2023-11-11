package com.api.storm.domain.interfaces.user;

import com.api.storm.domain.model.User;

import java.util.Optional;

public interface GetUserByEmailDomainInterface {
    Optional<User> execute(String email) throws Exception;
}
