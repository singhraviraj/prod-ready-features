package com.prod_ready_features.prod_ready_features.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {

    private Long id;

    private String title;

    private String description;

    private LocalDateTime creationTime;

    private LocalDateTime updateTime;

    private String createdBy;
    private String modifiedBy;
}
