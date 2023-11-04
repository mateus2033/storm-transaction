package com.api.storm.application.services.user;

import com.api.storm.application.intefaces.user.UpdateUserApplicationInterface;
import com.api.storm.domain.model.User;
import com.api.storm.domain.services.user.ShowUserDomainService;
import com.api.storm.domain.services.user.UpdateUserDomainService;
import org.springframework.stereotype.Service;

@Service
public class UpdateUserApplicationService implements UpdateUserApplicationInterface {

    final UpdateUserDomainService updateUserDomain;

    public UpdateUserApplicationService(UpdateUserDomainService updateUserDomain) {
        this.updateUserDomain = updateUserDomain;
    }

    @Override
    public User execute(User user) {
        return null;
    }
}
