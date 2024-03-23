package com.FMS.Daoimpl;

import com.FMS.Dao.WorkoutDao;
import com.FMS.entity.Workout;
import org.hibernate.Session;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.query.Query;
import java.util.List;
import com.FMS.util.Hibernateutil;

	public class WorkoutDaoimpl implements WorkoutDao {

	    @Override
	    public Workout createWorkout(Workout workout) {
	        try(Session session = Hibernateutil.getSession()) {
	            session.beginTransaction();
	            session.save(workout);
	            session.getTransaction().commit();
	            return workout;
	        } catch(HibernateException e) 
	        {
	            e.printStackTrace();
	        }
	        return null;
	    }

		@Override
		public Workout updateWorkout(Workout workout) {
			try(Session session = Hibernateutil.getSession()) {
	            session.beginTransaction();
	            session.update(workout);
	            session.getTransaction().commit();
	            return workout;
	        } catch(HibernateException e) {
	            e.printStackTrace();
	        }
			return null;
		}

		@Override
		public Workout retrieveWorkout(String workoutId) {
			try(Session session = Hibernateutil.getSession()) {
	            return session.get(Workout.class, workoutId);
	        } catch(HibernateException e) {
	            e.printStackTrace();
	        }
			return null;
		}

		@Override
		public void deleteWorkout(int workoutId) {
			try(Session session = Hibernateutil.getSession()) {
	            session.beginTransaction();
	            Workout workout = session.get(Workout.class, workoutId);
	            if (workout != null) {
	                session.delete(workout);
	            }
	            session.getTransaction().commit();
	        } catch(HibernateException e) {
	            e.printStackTrace();
	        }	
			
		}

		@Override
		public List<Workout> getAllWorkouts() {
			try(Session session = Hibernateutil.getSession()) {
	            Query<Workout> query = session.createQuery("FROM Workout", Workout.class);
	            return query.list();
	        } catch(HibernateException e) {
	            e.printStackTrace();
	        }
			return null;
		}

		@Override
		public List<Workout> getWorkoutsByUserId(String userId) {
			try(Session session = Hibernateutil.getSession()) {
	            Query<Workout> query = session.createQuery("FROM Workout WHERE userid = :userId", Workout.class);
	            query.setParameter("userId", userId);
	            return query.list();
	        } catch(HibernateException e) {
	            e.printStackTrace();
	        }
			return null;
		}

		@Override
	    public List<Workout> getWorkoutsByAgeRange(int minAge, int maxAge)
		{
			try(Session session = Hibernateutil.getSession()) {
	            return session.createQuery("FROM Workout WHERE age BETWEEN :minAge AND :maxAge", Workout.class)
	                    .setParameter("minAge", minAge)
	                    .setParameter("maxAge", maxAge)
	                    .list();
	        }
	    }

	    
	}



