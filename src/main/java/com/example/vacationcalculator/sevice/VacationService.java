package com.example.vacationcalculator.sevice;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class VacationService {
    private static final Double AVG_DAY_PER_MONTH = 29.3;

    public Double calculate(Double avgSalary, long dayCount) {
        return avgSalary / AVG_DAY_PER_MONTH * dayCount;
    }
}
