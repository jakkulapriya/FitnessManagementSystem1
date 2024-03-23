package com.FMS.Daoimpl;

import java.util.List;
import java.util.Scanner;

import org.hibernate.query.Query;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import com.FMS.Dao.UserDao;
import com.FMS.entity.User;
import com.FMS.util.Hibernateutil;

public class UserDaoimpl implements UserDao{

	@Override
	public User createUser(User User) {
	
	try(Session session=Hibernateutil.getSession()){
		session.beginTransaction();
		session.save(User);
		session.getTransaction().commit();
		return User;
		}
        catch(HibernateException e)
        {
        	System.out.println(e);
        }
       catch(Exception e)
	{
    	   System.out.println(e);
	}
	return null;
	}

	
	@Override
    public User updateUser(User user) {
        try(Session session = Hibernateutil.getSession()) {
            session.beginTransaction();
            session.update(user);
            session.getTransaction().commit();
            return user;
        } catch(HibernateException e)
        {
            e.printStackTrace();
        }
        return null;
    }
	

	@Override
    public User retrieveUser(String userId) {
        try(Session session = Hibernateutil.getSession()) {
            return session.get(User.class, userId);
        } catch(HibernateException e) 
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteUser(String userId) {
        try (Session session = Hibernateutil.getSession()) {
            session.beginTransaction();
            User user = session.get(User.class, userId);
            if (user != null) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Are you sure you want to delete this user? (yes/no)");
                String confirmation = scanner.nextLine().trim().toLowerCase();

                if (confirmation.equals("yes")) {
                    session.delete(user);
                    System.out.println("User deleted successfully.");
                } else {
                    System.out.println("Deletion canceled.");
                }
            } else {
                System.out.println("User not found.");
            }
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<User> getAllUsers() {
        try(Session session = Hibernateutil.getSession()) {
            Query<User> query = session.createQuery("FROM User", User.class);
            return query.list();
        } catch(HibernateException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User getUserById(String userId) {
        try(Session session = Hibernateutil.getSession()) {
            return session.get(User.class, userId);
        } catch(HibernateException e) 
        {
            e.printStackTrace();
        }
        return null;
    }
    
    
    @Override
    public List<User> getUsersByGender(String gender) {
        try (Session session = Hibernateutil.getSession()) {
            Query<User> query = session.createQuery("FROM User WHERE gender = :gender", User.class);
            query.setParameter("gender", gender);
            return query.list();
        } catch (HibernateException e) {
            e.printStackTrace();
            return null;
        }
    }

}

	
	
	
	

