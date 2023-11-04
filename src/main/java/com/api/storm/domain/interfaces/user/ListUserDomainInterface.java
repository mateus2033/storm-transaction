package com.api.storm.domain.interfaces.user;

import com.api.storm.domain.model.User;

import java.util.List;

public interface ListUserDomainInterface {
    List<User> execute(int page, boolean paginate, int limit);
}
