package com.railse.hiring.workforcemgmt.dto;

import com.railse.hiring.workforcemgmt.model.enums.Priority;
import lombok.Data;

@Data
public class UpdatePriorityRequest {
    private Priority priority;
}