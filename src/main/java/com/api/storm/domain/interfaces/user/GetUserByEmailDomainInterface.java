package com.api.storm.domain.interfaces.user;

import com.api.storm.domain.model.User;

public interface GetUserByEmailDomainInterface {
    User execute(String email) throws Exception;
}
