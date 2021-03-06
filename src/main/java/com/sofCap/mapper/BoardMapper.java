package com.sofCap.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sofCap.dto.BoardDto;
import com.sofCap.model.Pagination;
import com.sofCap.model.SemDate;

@Mapper
public interface BoardMapper {
	BoardDto findById(int id);

	BoardDto findOneClub(int id);

//	List<BoardDto> findBySem_m(SemDate sem_name);

	List<BoardDto> findBySem_m(SemDate semdate, Pagination pagination);
	int count_m();

	//동아리별 회의록
	List<BoardDto> findBySem_a(SemDate semdate, int club_id, Pagination pagination);
	int count_a(int club_id);
	
	//동아리별 홍보게시물
	List<BoardDto> findByClubId_p(int club_id, Pagination pagination);
	int count_cp(int club_id);
	
	//동아리별 모집게시물
	List<BoardDto> findByClubId_r(int club_id, Pagination pagination);
	int count_cr(int club_id);
	
	//동아리별 공지사항
	List<BoardDto> findByClubId_n(int club_id, Pagination pagination);
	int count_cn(int club_id);
	
	List<BoardDto> findAll_p();

	List<BoardDto> findAll_r();

	List<BoardDto> findAll_n(Pagination pagination);
	int count_n();

	List<BoardDto> findAll_m();

	BoardDto findOne(@Param("id") int id);

	List<BoardDto> listFive_p();

	List<BoardDto> listFive_r();

	List<BoardDto> listEight_p(@Param("id") int club_id);

	List<BoardDto> listEight_r(@Param("id") int club_id);

    List<BoardDto> findAll_r(Pagination pagination);
    int count_r();

    List<BoardDto> findAll_p(Pagination pagination);
    int count_p();

	void delete(int id);

	void insert(BoardDto board);

	void update(BoardDto board);
}