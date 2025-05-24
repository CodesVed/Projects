package com.example.Calculator_API.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double add(double a, double b){
        return a+b;
    }

    public double subtract(double a, double b) {
        return a-b;
    }

    public double multiply(double a, double b){
        return a*b;
    }

    public double divide(double a, double b){
        return a/b;
    }

    public double exponent(double base, double power) {
        // exponentiation by squaring
        if (power == 0){
            return 1;
        }
        if (power%2 == 0){
            return exponent(base*base, power/2);
        }
        return base * exponent(base*base, (power-1)/2);
    }

    public double percentOf(double a, double b) {
        return (a/100)*b;
    }

    public int simpInterest(int p, int r, int t) {
        return p*r*t;
    }

    public int compInterest(int p, int r, Integer n, int t) {
        if (n == null || n < 0){
            throw new IllegalArgumentException("Compounding frequency (n) must be not null and positive integer.");
        }

        return (int) (p + Math.pow((1+((double) r /n)),(n*t)));
    }
}
