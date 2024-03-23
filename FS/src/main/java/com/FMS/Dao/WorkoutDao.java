package com.FMS.Dao;
	import com.FMS.entity.Workout;
	import java.util.List;

	public interface WorkoutDao {
	    Workout createWorkout(Workout workout);
	    Workout updateWorkout(Workout workout);
	    void deleteWorkout(int workoutId);
	    List<Workout> getAllWorkouts();
	    List<Workout> getWorkoutsByUserId(String userId);
	    List<Workout> getWorkoutsByAgeRange(int minAge, int maxAge);
		Workout retrieveWorkout(String workoutId);
		
	}


