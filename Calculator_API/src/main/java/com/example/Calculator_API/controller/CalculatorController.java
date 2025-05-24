package com.example.Calculator_API.controller;

import com.example.Calculator_API.dto.CalculatorRequest;
import com.example.Calculator_API.dto.CalculatorResponse;
import com.example.Calculator_API.dto.InterestRequest;
import com.example.Calculator_API.service.CalculatorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public ResponseEntity<CalculatorResponse> add(@RequestBody CalculatorRequest request){
        double result = service.add(request.getA(), request.getB());
        return new ResponseEntity<>(new CalculatorResponse(result), HttpStatus.OK);
    }

    @PostMapping("/subtract")
    public ResponseEntity<CalculatorResponse> subtract(@RequestBody CalculatorRequest request){
        double result = service.subtract(request.getA(), request.getB());
        return new ResponseEntity<>(new CalculatorResponse(result), HttpStatus.OK);
    }

    @PostMapping("/multiply")
    public ResponseEntity<CalculatorResponse> multiply(@RequestBody CalculatorRequest request){
        double result = service.multiply(request.getA(), request.getB());
        return new ResponseEntity<>(new CalculatorResponse(result), HttpStatus.OK);
    }

    @PostMapping("/divide")
    public ResponseEntity<CalculatorResponse> divide(@RequestBody CalculatorRequest request){
        double result = service.divide(request.getA(), request.getB());
        return new ResponseEntity<>(new CalculatorResponse(result), HttpStatus.OK);
    }

    @PostMapping("/exponent")
    public ResponseEntity<CalculatorResponse> exponent(@RequestBody CalculatorRequest request){
        double result = service.exponent(request.getA(), request.getB());
        return new ResponseEntity<>(new CalculatorResponse(result), HttpStatus.OK);
    }

    @PostMapping("/percentOf")
    public ResponseEntity<CalculatorResponse> percentOf(@RequestBody CalculatorRequest request){
        double result = service.percentOf(request.getA(), request.getB());
        return new ResponseEntity<>(new CalculatorResponse(result), HttpStatus.OK);
    }

    @PostMapping("/interest/simple")
    public ResponseEntity<CalculatorResponse> simpInterest(@RequestBody InterestRequest request){
        int result = service.simpInterest(request.getP(), request.getR(), request.getT());
        return new ResponseEntity<>(new CalculatorResponse(result), HttpStatus.OK);
    }

    @PostMapping("interest/compound")
    public ResponseEntity<CalculatorResponse> compInterest(@RequestBody InterestRequest request){
        int result = service.compInterest(request.getP(), request.getR(), request.getN(), request.getT());
        return new ResponseEntity<>(new CalculatorResponse(result), HttpStatus.OK);
    }
}
