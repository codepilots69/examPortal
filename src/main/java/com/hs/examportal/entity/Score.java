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
@Table(name = "scores")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Score {

    @Id
    private String id;

    @Column(name = "test_id", nullable = false)
    private String testId;

    @Column(name = "obtained_marks", nullable = false)
    private Integer obtainedMarks;

    @Column(name = "percentage", nullable = false)
    private Double percentage;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

}
