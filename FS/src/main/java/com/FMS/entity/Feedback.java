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
@Table(name="Feedback")
public class Feedback 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Feedback_id")
	private int feedbackid;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Feedback_userid")
	private User user;
	
	@Column(name="Feedback_date")
	private String date;
	
	@Column(name="Feedback_message")
	private String feedbackmessage;

	public int getFeedbackid() {
		return feedbackid;
	}

	public void setFeedbackid(int feedbackid) {
		this.feedbackid = feedbackid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFeedbackmessage() {
		return feedbackmessage;
	}

	public void setFeedbackmessage(String feedbackmessage) {
		this.feedbackmessage = feedbackmessage;
	}

	public Feedback(int feedbackid, User user, String date, String feedbackmessage) {
		super();
		this.feedbackid = feedbackid;
		this.user = user;
		this.date = date;
		this.feedbackmessage = feedbackmessage;
	}

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Feedback [feedbackid=" + feedbackid + ", user=" + user + ", date=" + date + ", feedbackmessage="
				+ feedbackmessage + "]";
	}

	
	
}