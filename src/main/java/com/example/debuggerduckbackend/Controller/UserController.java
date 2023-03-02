package com.example.debuggerduckbackend.Controller;

import com.example.debuggerduckbackend.Models.UserModel;
import com.example.debuggerduckbackend.Services.UserModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/registration")
public class UserController {


    @Autowired
    UserModelService userModelService;

    @RequestMapping("/getallusers")
    public List<UserModel> getAllUsers(){
        System.out.println("Here's Your List!");
        return userModelService.getUserList();
    }


    @PostMapping("/createnewuser")
    public UserModel createNewUser(@RequestBody UserModel userModel){

        UserModel newUser = new UserModel();
        newUser.setId(userModel.getId());
        newUser.setFirstName(userModel.getFirstName());
        newUser.setLastName(userModel.getLastName());
        newUser.setEmail(userModel.getEmail());
        newUser.setUserRole(userModel.getUserRole());
        newUser.setPassword(userModel.getPassword());
        System.out.println("Saved User");

        userModelService.saveNewUser(newUser);
        return userModel;

    }

}
