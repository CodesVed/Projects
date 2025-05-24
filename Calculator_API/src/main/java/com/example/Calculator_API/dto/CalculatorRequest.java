package com.example.Calculator_API.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalculatorRequest {
    private double a;
    private double b;
    private double c;
    private double d;
}
