package com.api.storm.application.services.user;

import com.api.storm.application.intefaces.user.DeleteUserApplicationInterface;
import com.api.storm.domain.services.user.DeleteUserDomainService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DeleteUserApplicationService implements DeleteUserApplicationInterface {

    final DeleteUserDomainService deleteUserDomain;

    public DeleteUserApplicationService(DeleteUserDomainService deleteUserDomain) {
        this.deleteUserDomain = deleteUserDomain;
    }

    @Override
    public String execute(UUID id) {
        return null;
    }
}
