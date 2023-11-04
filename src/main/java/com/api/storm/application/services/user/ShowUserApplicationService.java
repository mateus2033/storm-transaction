package com.api.storm.application.services.user;

import com.api.storm.application.intefaces.user.ShowUserApplicationInterface;
import com.api.storm.domain.model.User;
import com.api.storm.domain.services.user.ShowUserDomainService;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class ShowUserApplicationService implements ShowUserApplicationInterface {

    final ShowUserDomainService showUserDomain;

    public ShowUserApplicationService(ShowUserDomainService showUserDomain) {
        this.showUserDomain = showUserDomain;
    }

    @Override
    public User execute(UUID id) {
        return null;
    }
}
