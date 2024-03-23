package com.FMS.Service;

	import com.FMS.entity.Workout;
	import java.util.List;

	public interface WorkoutService {
	    Workout createWorkout(Workout workout);
	    Workout updateWorkout(Workout workout);
	    void deleteWorkout(int workoutId);
	    Workout retrieveWorkout(String workoutId);
	    List<Workout> getAllWorkouts();
	    List<Workout> getWorkoutsByUserId(String userId);
	    List<Workout> getWorkoutsByAgeRange(int minAge, int maxAge);
		
	}



