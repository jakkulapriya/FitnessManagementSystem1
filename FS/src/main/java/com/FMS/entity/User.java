package com.FMS.entity;


import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="User")
public class User
{
	@OneToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   private List<Workout> workouts;


	@Id
	@Column(length=30)
	private String userid;
	
	@Column(name="user_name")
	private String username;
	
	@Column(name="user_dateofbirth")
	private String dateofbirth;
	
	@Column(name="user_Email")
	private String Email;
	
	@Column(name="user_gender")
	private String gender;
	
	@Column(name="user_phonenumber")
	private String phonenumber;

	public List<Workout> getWorkouts() {
		return workouts;
	}

	public void setWorkouts(List<Workout> workouts) {
		this.workouts = workouts;
	}

	public String getUserid()
	{
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public User(List<Workout> workouts, String userid, String username, String dateofbirth, String email, String gender,
			String phonenumber) {
		super();
		this.workouts = workouts;
		this.userid = userid;
		this.username = username;
		this.dateofbirth = dateofbirth;
		Email = email;
		this.gender = gender;
		this.phonenumber = phonenumber;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userid, String username, String dateofbirth, String email, String gender, String phonenumber) {
		super();
		this.userid = userid;
		this.username = username;
		this.dateofbirth = dateofbirth;
		Email = email;
		this.gender = gender;
		this.phonenumber = phonenumber;
	}

	

	@Override
	public String toString() {
		return "User [workouts=" + workouts + ", userid=" + userid + ", username=" + username + ", dateofbirth="
				+ dateofbirth + ", Email=" + Email + ", gender=" + gender + ", phonenumber=" + phonenumber + "]";
	}

}


