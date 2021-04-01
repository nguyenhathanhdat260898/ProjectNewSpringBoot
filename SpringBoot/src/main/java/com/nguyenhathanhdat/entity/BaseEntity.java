package com.nguyenhathanhdat.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "createdBy")
	@CreatedBy
	private String createdBy;
	
	@CreatedDate
	@Column(name = "createdDates")
	private Date createdDates;
	
	@LastModifiedBy
	@Column(name = "modifieddBy")
	private String modifieddBy;
	
	@LastModifiedDate
	@Column(name = "modifiedDates")
	private Date modifiedDates;
	
}
