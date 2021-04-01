package com.nguyenhathanhdat.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.nguyenhathanhdat.dto.NewDTO;

public interface INewService {
	NewDTO save(NewDTO newDTO);
//	NewDTO update(NewDTO newDTO);
	void delete(long[] ids);
	List<NewDTO> fillAll(Pageable pageable);
	List<NewDTO> fillAll();
	 int totalItem();
}
