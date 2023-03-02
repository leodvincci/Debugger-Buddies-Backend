package com.example.debuggerduckbackend.Repo;

import com.example.debuggerduckbackend.Models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserModelRepo extends JpaRepository <UserModel,Long> {


}
