package com.nguyenhathanhdat.api.output;

import java.util.ArrayList;
import java.util.List;

import com.nguyenhathanhdat.dto.NewDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewOutput {
	private int page;
	private int totalPage;
	List<NewDTO> listResult = new ArrayList<>();
}
