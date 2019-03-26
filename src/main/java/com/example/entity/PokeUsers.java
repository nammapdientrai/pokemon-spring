package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "poke_users")
public class PokeUsers {

	@Id
	@Column(name = "uid")
	private int uid;

	@Column(name = "name")
	private String name;

	@Column(name = "last_location_x")
	private int last_location_x;

	@Column(name = "last_location_y")
	private int last_location_y;

	@Column(name = "last_location_z")
	private int last_location_z;
	
	@Column(name = "last_location_map")
	private String last_location_map;

	public PokeUsers() {

	}

	public PokeUsers(int uid, String name, int last_location_x, int last_location_y, int last_location_z,
			String last_location_map) {
		super();
		this.uid = uid;
		this.name = name;
		this.last_location_x = last_location_x;
		this.last_location_y = last_location_y;
		this.last_location_z = last_location_z;
		this.last_location_map = last_location_map;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLast_location_x() {
		return last_location_x;
	}

	public void setLast_location_x(int last_location_x) {
		this.last_location_x = last_location_x;
	}

	public int getLast_location_y() {
		return last_location_y;
	}

	public void setLast_location_y(int last_location_y) {
		this.last_location_y = last_location_y;
	}

	public int getLast_location_z() {
		return last_location_z;
	}

	public void setLast_location_z(int last_location_z) {
		this.last_location_z = last_location_z;
	}

	public String getLast_location_map() {
		return last_location_map;
	}

	public void setLast_location_map(String last_location_map) {
		this.last_location_map = last_location_map;
	}
	
	
}
