package com.project.model.da.contract;

import com.project.model.entity.User;
import com.project.model.da.dao.Dao;

public interface UserContract extends Dao<User> {
    public boolean checkExistUserByUserName(String userName);

}
