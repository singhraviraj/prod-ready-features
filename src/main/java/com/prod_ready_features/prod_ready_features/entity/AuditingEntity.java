package com.prod_ready_features.prod_ready_features.entity;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class AuditingEntity {

    @CreatedDate
    private LocalDateTime creationTime;

    @LastModifiedDate
    private LocalDateTime updateTime;

    @CreatedBy
    private String createdBy;

    @LastModifiedBy
    private String modifiedBy;
}
