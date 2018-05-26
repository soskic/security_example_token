package com.iktpreobuka.security_example_token.entities;

import java.util.ArrayList;
import java.util.List;

import net.minidev.json.annotate.JsonIgnore;

public class RoleEntity {

	private Integer id;
	private String name;
	@JsonIgnore
	private List<UserEntity> users = new ArrayList<>();
	//get, set methods, constructors
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
	public List<UserEntity> getUsers() {
		return users;
	}
	public void setUsers(List<UserEntity> users) {
		this.users = users;
	}

}
