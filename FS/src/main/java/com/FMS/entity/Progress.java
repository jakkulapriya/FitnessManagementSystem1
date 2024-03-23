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
@Table(name="progress")
public class Progress
{
	@Id
	@Column(name="progressid_id",length=40)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int progressid;
	
	 @ManyToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "user_id")
	private User user;
	
	@Column(name="progress_weight")
	private double weight;
	
	@Column(name="progress_bodyfatpercentage")
	private double bodyfatpercentage;
	
	@Column(name="progressid_date")
	private String date;

	public int getProgressid() {
		return progressid;
	}

	public void setProgressid(int progressid) {
		this.progressid = progressid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBodyfatpercentage() {
		return bodyfatpercentage;
	}

	public void setBodyfatpercentage(double bodyfatpercentage) {
		this.bodyfatpercentage = bodyfatpercentage;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Progress(int progressid,  User user, double weight, double bodyfatpercentage, String date) {
		super();
		this.progressid = progressid;
		this.user = user;
		this.weight = weight;
		this.bodyfatpercentage = bodyfatpercentage;
		this.date = date;
	}

	public Progress() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Progress [progressid=" + progressid + ", user=" + user + ", weight=" + weight + ", bodyfatpercentage="
				+ bodyfatpercentage + ", date=" + date + "]";
	}

	
	
}