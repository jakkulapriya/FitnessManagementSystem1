package com.FMS.Service;

import com.FMS.entity.User;
import java.util.List;
public interface UserService 
{
          User CreateUser(User User);
          User updateUser(User user);
          User retrieveUser(String userId);
          void deleteUser(String userId);
          List<User> getAllUsers();
          User getUserById(String userId);
          List<User> getUsersByGender(String gender);
          
      }


