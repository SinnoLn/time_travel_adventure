package com.DokeyDokeyRyokai.timetravel.repository;
import com.DokeyDokeyRyokai.timetravel.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
    // 추가적인 쿼리 메소드 정의 (선택적)
}
