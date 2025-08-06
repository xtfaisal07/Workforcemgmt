package com.railse.hiring.workforcemgmt.model;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Comment {
    private String text;
    private Instant timestamp;
}