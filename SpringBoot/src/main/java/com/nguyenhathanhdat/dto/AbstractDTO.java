package com.nguyenhathanhdat.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AbstractDTO<T> {

	private Long id;
	private String createdBy;
	private Date createdDates;
	private String modifieddBy;
	private Date modifiedDates;
	private List<T> listResult= new ArrayList<>();

}
