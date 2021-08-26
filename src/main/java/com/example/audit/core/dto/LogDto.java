package com.example.audit.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LogDto {
    private String username;
    private String message;
    private String action;
    private Date actionTime;
}
