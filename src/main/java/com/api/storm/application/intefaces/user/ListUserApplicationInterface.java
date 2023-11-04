package com.api.storm.application.intefaces.user;

import com.api.storm.domain.model.User;

import java.util.List;

public interface ListUserApplicationInterface {
    List<User> execute(int page, boolean paginate, int limit);
}
