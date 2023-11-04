package com.api.storm.domain.services.user;

import com.api.storm.domain.interfaces.user.ListUserDomainInterface;
import com.api.storm.domain.model.User;
import com.api.storm.domain.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListUserDomainService implements ListUserDomainInterface {
    final UserRepository userRepository;

    public ListUserDomainService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> execute(int page, boolean paginate, int limit) {
        return null;
    }
}
