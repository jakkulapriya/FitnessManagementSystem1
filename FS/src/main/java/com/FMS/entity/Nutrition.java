package com.FMS.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Nutrition")
public class Nutrition {
	
	@Id
	
	@Column(name="Nutition_id",length=40)
	private String Nutritionid;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;
	
	@Column(name="Nutition_Mealtype",length=40)
	private String Mealtype;
	
	@Column(name="Nutition_Mealdescription",length=40)
	private String Mealdescription;
	
	@Column(name="Nutition_date",length=40)
	private String date;

	public String getNutritionid() {
		return Nutritionid;
	}

	public void setNutritionid(String nutritionid) {
		Nutritionid = nutritionid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getMealtype() {
		return Mealtype;
	}

	public void setMealtype(String mealtype) {
		Mealtype = mealtype;
	}

	public String getMealdescription() {
		return Mealdescription;
	}

	public void setMealdescription(String mealdescription) {
		Mealdescription = mealdescription;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}


	 // Default constructor
	public Nutrition(String nutritionid, String mealtype, String mealdescription, String date) {
		super();
		Nutritionid = nutritionid;
		Mealtype = mealtype;
		Mealdescription = mealdescription;
		this.date = date;
	}

	public Nutrition(String nutritionid, User user, String mealtype, String mealdescription, String date) {
		super();
		Nutritionid = nutritionid;
		this.user = user;
		Mealtype = mealtype;
		Mealdescription = mealdescription;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Nutrition [Nutritionid=" + Nutritionid + ", user=" + user + ", Mealtype=" + Mealtype
				+ ", Mealdescription=" + Mealdescription + ", date=" + date + "]";
	}
	
	
	

}
	
	