package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "100000x100000")
public class Map {

	@Id
	@Column(name = "map_id")
	private int uid;

	@Column(name = "map_name")
	private String name;

	@Column(name = "x1")
	private int x1;

	@Column(name = "y1")
	private int y1;

	@Column(name = "z")
	private int z;
	
	@Column(name = "x2")
	private int x2;

	@Column(name = "y2")
	private int y2;

	public Map() {

	}

	public Map(int uid, String name, int x1, int y1, int z, int x2, int y2) {
		super();
		this.uid = uid;
		this.name = name;
		this.x1 = x1;
		this.y1 = y1;
		this.z = z;
		this.x2 = x2;
		this.y2 = y2;
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

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

}
