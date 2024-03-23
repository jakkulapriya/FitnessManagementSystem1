
package com.FMS.Serviceimpl;

import com.FMS.Dao.WorkoutDao;
import com.FMS.Daoimpl.WorkoutDaoimpl;
import com.FMS.Service.WorkoutService;
import com.FMS.entity.Workout;
import java.util.List;

public class WorkoutServiceimpl implements WorkoutService {
    WorkoutDao workoutDao = new WorkoutDaoimpl();

	@Override
	public Workout createWorkout(Workout workout) {
		return workoutDao.createWorkout(workout);
	}

	@Override
	public Workout updateWorkout(Workout workout) {
		 return workoutDao.updateWorkout(workout);
	}

	@Override
	public Workout retrieveWorkout(String workoutId) {
		return workoutDao.retrieveWorkout(workoutId);
	}

	@Override
	public void deleteWorkout(int workoutId) {
		workoutDao.deleteWorkout(workoutId);
	}

	@Override
	public List<Workout> getAllWorkouts() {
		return workoutDao.getAllWorkouts();
	}

	@Override
	public List<Workout> getWorkoutsByUserId(String userId) {
		 return workoutDao.getWorkoutsByUserId(userId);
    }
	
	 @Override
	    public List<Workout> getWorkoutsByAgeRange(int minAge, int maxAge) {
	        return workoutDao.getWorkoutsByAgeRange(minAge, maxAge);
	    }
}

