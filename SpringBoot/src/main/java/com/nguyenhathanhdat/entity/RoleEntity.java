package com.nguyenhathanhdat.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "role")
public class RoleEntity extends BaseEntity {

	@Column
	private String code;
	@Column
	private String name;

	@ManyToMany(mappedBy = "roles")
	List<UserEntity> users= new ArrayList<UserEntity>();
}
