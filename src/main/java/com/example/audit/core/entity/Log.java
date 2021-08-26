package com.example.audit.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "logs")
public class Log extends AbstractEntity {
    @Column(name = "action")
    private String action;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "action_time")
    private Date actionTime;
}
