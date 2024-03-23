package com.FMS.Serviceimpl;

import java.util.List;

import com.FMS.Dao.UserDao;
import com.FMS.Daoimpl.UserDaoimpl;
import com.FMS.Service.UserService;
import com.FMS.entity.User;

  public class UserServiceimpl implements UserService{
	
	UserDao  UserDao= new UserDaoimpl();
	
	public User CreateUser(User User) { 
	return UserDao.createUser(User);
	}
	
	@Override
	public User updateUser(User user) {
	 return UserDao.updateUser(user);
		
	}
	@Override
	public User retrieveUser(String userId) {
	return UserDao.retrieveUser(userId);
		
	}
	@Override
	public void deleteUser(String userId) {
      UserDao.deleteUser(userId);
	}
	@Override
	public List<User> getAllUsers() {
    return UserDao.getAllUsers();
	}
	@Override
	public User getUserById(String userId) {
    return UserDao.getUserById(userId);
    
	}

	@Override
    public List<User> getUsersByGender(String gender) {
        return UserDao.getUsersByGender(gender);
    }

    

	
}
