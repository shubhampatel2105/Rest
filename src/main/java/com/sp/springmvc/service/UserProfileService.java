package com.sp.springmvc.service;
 
import java.util.List;
 
import com.sp.springmvc.model.UserProfile;
 
 
public interface UserProfileService {
 
    UserProfile findById(int id);
 
    UserProfile findByType(String type);
     
    List<UserProfile> findAll();
     
}