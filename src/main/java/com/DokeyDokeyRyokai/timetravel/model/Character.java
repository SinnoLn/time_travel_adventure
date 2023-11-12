package com.DokeyDokeyRyokai.timetravel.model;
import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private  String name;

    @Column(length = 500)
    private String description;

    @Column
    private String role;  // 예: "주인공", "조연", "악당" 등
    // 추가적으로, 스토리 내에서의 중요한 특성이나 능력 등을 나타내는 필드를 추가

}
