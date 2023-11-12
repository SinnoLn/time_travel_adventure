package com.DokeyDokeyRyokai.timetravel.repository;

import com.DokeyDokeyRyokai.timetravel.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CharacterRepository extends JpaRepository<Character, Long> {
    // 추가적인 쿼리 메소드 정의 (선택적)
}