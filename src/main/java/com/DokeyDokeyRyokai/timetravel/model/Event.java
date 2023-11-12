package com.DokeyDokeyRyokai.timetravel.model;
import jakarta.persistence.*;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Event {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column (length = 1000)
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    private Date eventTime; //사건 발생 시간

    @Column
    private String location; // 사건 발생 장소

    // 사건과 관련된 인물이나 다른 요소를 나타내는 필드 추가 가능

}
