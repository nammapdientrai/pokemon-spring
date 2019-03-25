package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pallet_Town")
public class PalletTown {

	@Id
	@Column(name = "uid")
	private int uid;

	@Column(name = "name")
	private String name;

	@Column(name = "x")
	private int x;

	@Column(name = "y")
	private int y;

	@Column(name = "z")
	private int z;

	public PalletTown() {

	}

	public PalletTown(int uid, String name, int x, int y, int z) {
		super();
		this.uid = uid;
		this.name = name;
		this.x = x;
		this.y = y;
		this.z = z;
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

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

}
