package com.webcorestone.DMS.model;

import java.sql.Date;
import java.sql.Time;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class post {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int postid;
	private int postLike;
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	private String comment;
	private Date postDate;
	private Time postTime;
	private String image;
	private String vedio;
	public int getPostid() {
		return postid;
	}
	public void setPostid(int postid) {
		this.postid = postid;
	}
	public int getPostLike() {
		return postLike;
	}
	public void setPostLike(int postLike) {
		this.postLike = postLike;
	}
	
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public Time getPostTime() {
		return postTime;
	}
	public void setPostTime(Time postTime) {
		this.postTime = postTime;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getVedio() {
		return vedio;
	}
	public void setVedio(String vedio) {
		this.vedio = vedio;
	}
	
	
	
}
