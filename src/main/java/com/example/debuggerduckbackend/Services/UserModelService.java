package com.example.debuggerduckbackend.Services;

import com.example.debuggerduckbackend.Models.UserModel;
import com.example.debuggerduckbackend.Repo.UserModelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserModelService {



    @Autowired
    public UserModelRepo userModelRepo;


    public UserModel saveNewUser(UserModel userModel){
        userModelRepo.save(userModel);
        System.out.println("Saved User");
        return  userModel;

    }

    public List<UserModel> getUserList(){
        List userList = userModelRepo.findAll();
        System.out.println("Returning All Users");
        return userList;
    }

    public void deleteUser(UserModel user){
        userModelRepo.delete(user);
        System.out.println("User Was Removed");
    }

}
