package com.project.model.service.contract;

import com.project.model.entity.User;

public interface UserLogicContract {
    User inserttUser(User user);
    boolean checkExistUsername(String username);
}
