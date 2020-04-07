package com.mattaldrete.outdoorportal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "activity")
public class Activity {
	
	@Id
	@Column( name = "id")
	private Integer id;
	
	@Column (name = "activity")
	private String activity;
	
	@Column (name = "location")
	private String location;
	
	@Column ( name = "difficulty_level")
	private Integer difficultyLevel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getDifficultyLevel() {
		return difficultyLevel;
	}

	public void setDifficultyLevel(Integer difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}

	@Override
	public String toString() {
		return "Activity [id=" + id + ", activity=" + activity + ", location=" + location + ", difficultyLevel="
				+ difficultyLevel + "]";
	}

	public Activity(Integer id, String activity, String location, Integer difficultyLevel) {
		super();
		this.id = id;
		this.activity = activity;
		this.location = location;
		this.difficultyLevel = difficultyLevel;
	}
	
	
	public Activity() {
		
	}
	

}
