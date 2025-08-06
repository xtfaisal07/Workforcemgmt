package com.railse.hiring.workforcemgmt.model;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ActivityLog {
    private String event;
    private Instant timestamp;
}