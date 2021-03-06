package io.wzw.backend.data.model;

import java.io.Serializable;
import java.util.Date;

public class Meetup implements Serializable {
	private Integer id;
	private String name;
	private String description;
	private Date since;
	private Date meetup_date;
	private Integer open;
	private Float latitude;
	private Float longitude;
	private User user;

	public Meetup() {
	}

	public Meetup(Integer id, String name, String description, Date since, Date meetup_date, Integer open,
			Float latitude, Float languitude, User user) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.since = since;
		this.meetup_date = meetup_date;
		this.open = open;
		this.latitude = latitude;
		this.longitude = languitude;
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getSince() {
		return since;
	}

	public void setSince(Date since) {
		this.since = since;
	}

	public Date getMeetup_date() {
		return meetup_date;
	}

	public void setMeetup_date(Date meetup_date) {
		this.meetup_date = meetup_date;
	}

	public Integer getOpen() {
		return open;
	}

	public void setOpen(Integer open) {
		this.open = open;
	}

	public Float getLatitude() {
		return latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	public Float getLongitude() {
		return longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
