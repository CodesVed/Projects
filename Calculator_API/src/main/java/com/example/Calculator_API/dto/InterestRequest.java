package com.example.Calculator_API.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InterestRequest {
    private int p;
    private int r;
    private Integer n;
    private int t;
}
