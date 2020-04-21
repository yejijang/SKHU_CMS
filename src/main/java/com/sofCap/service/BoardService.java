package com.sofCap.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sofCap.dto.BoardDto;

public interface BoardService {
	BoardDto findById(int id);
	List<BoardDto> findByClubId_p(@Param("id") int club_id);
	List<BoardDto> findAll_p();
	List<BoardDto> findAll_r();
	List<BoardDto> findAll_n();
	List<BoardDto> findAll_m();
	BoardDto findOne(@Param("id") int id);
	List<BoardDto> listFive_p();
	List<BoardDto> listFive_r();
	void delete(int id);

}