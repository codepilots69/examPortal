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
@Table(name = "questions_bank")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuestionBank {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "test_id", nullable = false)
    private String test_id;

    @Column(name = "question", nullable = false)
    private String question;

    @Column(name = "answer", nullable = false)
    private String answer;

    @Column(name = "option1", nullable = false)
    private String option1;

    @Column(name = "option2", nullable = false)
    private String option2;

    @Column(name = "option3", nullable = false)
    private String option3;

    @Column(name = "option4", nullable = false)
    private String option4;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

}
