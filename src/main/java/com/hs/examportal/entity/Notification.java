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
@Table(name = "notifications")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Notification {

    @Id
    private String id;

    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(name = "exam_initiate_mail")
    private boolean examInitiateMail;

    @Column(name = "exam_result_mail")
    private boolean examResultMail;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

}