package com.api.storm.domain.services.user;

import com.api.storm.domain.interfaces.user.GetUserByCpfDomainInterface;
import com.api.storm.domain.model.User;
import com.api.storm.domain.repositories.UserRepository;
import com.api.storm.utils.message.user.UserMessage;
import org.springframework.stereotype.Service;

@Service
public class GetUserByCpfDomainService implements GetUserByCpfDomainInterface {
    final UserRepository userRepository;

    public GetUserByCpfDomainService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(String cpf) throws Exception {
        User user = this.userRepository.findUserByCpf(cpf);
        if(user == null) {
            throw new Exception(UserMessage.USER_NOT_FOUND);
        }
        return user;
    }
}
