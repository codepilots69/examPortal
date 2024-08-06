package com.hs.examportal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "tests")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Test {

    @Id
    private String id;

    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(name = "total_marks", nullable = false)
    private Integer totalMarks;

    @Column(name = "passing_marks", nullable = false)
    private Integer passingMarks;

    @Column(name = "result_status", nullable = false)
    private Boolean resultStatus;

    @Column(name = "duration", nullable = false)
    private Double duration;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

}