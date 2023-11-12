package com.DokeyDokeyRyokai.timetravel.repository;
import com.DokeyDokeyRyokai.timetravel.model.Story;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.awt.print.Pageable;
import java.util.List;


public interface StoryRepository extends JpaRepository<Story, Long> {

    //특정 조건에 맞는 데이터 검색
    List<Story> findByTitleContaining(String title);
    //정렬 및 페이징 처리(데이터 특정 기준 정렬, 페이지 단위 결과 제공)
    Page<Story> findByGenreOrderByTitleAsc(String genre, Pageable pageable);
    //특정 조건을 만족하는 story를 검색하는 JPQL쿼리 작성
    @Query("SELECT s FROM Story s WHERE s.description LIKE %:keyword%")
    List<Story> searchByKeyword(@Param("keyword") String keyword);
}