package com.nguyenhathanhdat.converter;

import org.springframework.stereotype.Component;

import com.nguyenhathanhdat.dto.NewDTO;
import com.nguyenhathanhdat.entity.NewEntity;

@Component
public class NewConverter {
	public NewEntity toEntity(NewDTO newDTO) {
		NewEntity newEntity = new NewEntity();
		newEntity.setContent(newDTO.getContent());
		newEntity.setTitle(newDTO.getTitle());
		newEntity.setShortDescription(newDTO.getShortDecription());
		newEntity.setThumbnail(newDTO.getThumbnail());
		return newEntity;
	}

	public NewDTO toDTO(NewEntity newEntity) {
		NewDTO newDTO = new NewDTO();
		if(newEntity.getId()!= null) {
			newDTO.setId(newEntity.getId());
		}
		newDTO.setContent(newEntity.getContent());
		newDTO.setTitle(newEntity.getTitle());
		newDTO.setShortDecription(newEntity.getShortDescription());
		newDTO.setThumbnail(newEntity.getThumbnail());
		newDTO.setCreatedDates(newEntity.getCreatedDates());
		newDTO.setCreatedBy(newEntity.getCreatedBy());
		newDTO.setModifiedDates(newEntity.getModifiedDates());
		newDTO.setModifieddBy(newEntity.getModifieddBy());
		return newDTO;
	}
	
	public NewEntity toEntity(NewDTO newDTO,NewEntity newEntity) {
		newEntity.setContent(newDTO.getContent());
		newEntity.setTitle(newDTO.getTitle());
		newEntity.setShortDescription(newDTO.getShortDecription());
		newEntity.setThumbnail(newDTO.getThumbnail());
		return newEntity;
	}
}
