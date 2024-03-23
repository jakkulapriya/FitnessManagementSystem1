package com.FMS.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="workout")
public class Workout {
	
	@Id
	
	@Column(name="workout_id",length=30)
	private String Workoutid;
	
	@ManyToOne()
	@JoinColumn(name = "user_id")
	private User  user ;
	
	@Column(name="workout_type",length=40)
	private String WorkoutType;
	
	@Column(name="workout_duration")
	private String duration;
	
	@Column(name="workout_date")
	private String date;

	public String getWorkoutid() {
		return Workoutid;
	}

	public void setWorkoutid(String workoutid) {
		Workoutid = workoutid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getWorkoutType() {
		return WorkoutType;
	}

	public void setWorkoutType(String workoutType) {
		WorkoutType = workoutType;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Workout(String workoutid, User user, String workoutType, String duration, String date) {
		super();
		Workoutid = workoutid;
		this.user = user;
		WorkoutType = workoutType;
		this.duration = duration;
		this.date = date;
	}

	public Workout() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Workout(String workoutid, String workoutType, String duration, String date) {
		super();
		Workoutid = workoutid;
		WorkoutType = workoutType;
		this.duration = duration;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Workout [Workoutid=" + Workoutid + ", user=" + user + ", WorkoutType=" + WorkoutType + ", duration="
				+ duration + ", date=" + date + "]";
	}
	
	
	

}