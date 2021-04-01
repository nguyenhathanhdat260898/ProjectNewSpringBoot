package com.nguyenhathanhdat.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nguyenhathanhdat.converter.NewConverter;
import com.nguyenhathanhdat.dto.NewDTO;
import com.nguyenhathanhdat.entity.CategoryEntity;
import com.nguyenhathanhdat.entity.NewEntity;
import com.nguyenhathanhdat.repository.CategoryRepository;
import com.nguyenhathanhdat.repository.NewRepository;
import com.nguyenhathanhdat.service.INewService;

@Service
public class NewService implements INewService {

	@Autowired
	private NewRepository newRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private NewConverter newConverter;

	@Override
	public NewDTO save(NewDTO newDTO) {
		NewEntity newEntity = new NewEntity();
		if (newDTO.getId() != null) {
			NewEntity oldNewEntity = newRepository.findOne(newDTO.getId());
			newEntity = newConverter.toEntity(newDTO, oldNewEntity);
		} else {
			newEntity = newConverter.toEntity(newDTO);
		}
		CategoryEntity categoryEntity = categoryRepository.findOneByCode(newDTO.getCategoryCode());
		newEntity.setCategory(categoryEntity);
		newEntity = newRepository.save(newEntity);
		return newConverter.toDTO(newEntity);
	}

	@Override
	public void delete(long[] ids) {
		for (long item : ids) {
			newRepository.delete(item);
		}
	}

	@Override
	public List<NewDTO> fillAll(Pageable pageable) {
		List<NewDTO> results = new ArrayList<>();
		List<NewEntity> entities = newRepository.findAll(pageable).getContent();
		for (NewEntity item : entities) {
			NewDTO newDTO = newConverter.toDTO(item);
			results.add(newDTO);
		}
		return results;
	}
	

	@Override
	public List<NewDTO> fillAll() {	
		List<NewDTO> results = new ArrayList<>();
		List<NewEntity> entities=  newRepository.findAll();
		for(NewEntity item :entities) {
			NewDTO newDTO= newConverter.toDTO(item);
			results.add(newDTO);
		}
		return results;
	}
	@Override
	public int totalItem() {
		
		return (int) newRepository.count();
	}

//	@Override
//	public NewDTO update(NewDTO newDTO) {
//		NewEntity oldNewEntity= newRepository.findOne(newDTO.getId());
//		NewEntity newEnstity= newConverter.toEntity(newDTO, oldNewEntity);
//		CategoryEntity categoryEntity = categoryRepository.findOneByCode(newDTO.getCategoryCode());
//		newEntity.setCategory(categoryEntity);
//		newEntity= newRepository.save(newEntity);
//		return newConverter.toDTO(newEntity);
//	}

}
