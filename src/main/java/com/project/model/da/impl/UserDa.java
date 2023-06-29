package com.project.model.da.impl;

import com.project.model.entity.User;
import com.project.model.da.contract.UserContract;

import java.util.List;
import java.util.Set;

public class UserDa implements UserContract {

    ///////////////////////////////////show page
     //////////////////////////////////crud
    public User save(User user) {
        return null;
    }

    public User getOneById(int id) {
        return null;
    }

    public List<User> getAll() {
        return null;
    }

    public boolean deleteById(int id) {
        return false;
    }

    public User update(User user) {
        return null;
    }
    //////////////////////////////////operation
    public boolean checkExistById(){
        return  false;
    }

    public boolean checkExistUserByUserName(String userName){
        return  false;
    }

     //////////////////////////////////relations

    public Set<User> getAllOrderOfUser(int user_id){
        return null;
    }




}
