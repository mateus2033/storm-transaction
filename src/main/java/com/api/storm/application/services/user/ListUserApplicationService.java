package com.api.storm.application.services.user;

import com.api.storm.application.intefaces.user.ListUserApplicationInterface;
import com.api.storm.domain.model.User;
import com.api.storm.domain.services.user.ListUserDomainService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListUserApplicationService implements ListUserApplicationInterface {

    final ListUserDomainService listUserDomain;

    public ListUserApplicationService(ListUserDomainService listUserDomain) {
        this.listUserDomain = listUserDomain;
    }

    @Override
    public List<User> execute(int page, boolean paginate, int limit) {
        return null;
    }
}
