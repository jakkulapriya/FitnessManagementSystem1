package com.FMS.Dao;
import com.FMS.entity.User;
import java.util.List;

public interface UserDao 
{
	    User createUser(User user);
	    User updateUser(User user);
	    User retrieveUser(String userId);
	    void deleteUser(String userId);
	    List<User> getAllUsers();
	    User getUserById(String userId);
	    List<User> getUsersByGender(String gender);
	}



