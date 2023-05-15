package com.example.vacationcalculator.controller;

import com.example.vacationcalculator.sevice.VacationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@Controller
@AllArgsConstructor
public class VacationController {

    VacationService vacationService;

    //http://localhost:8080/calculate?avgSalary=51666&dayCount=12
    @GetMapping("/calculate")
    public String calculateVacationPay(Model model, @RequestParam(name = "avgSalary", required = false) Double avgSalary, @RequestParam(name = "dayCount", required = false) Long dayCount) {
        System.out.println(avgSalary);
        System.out.println(dayCount);
        Double vacationPay = vacationService.calculate(avgSalary, dayCount);
        model.addAttribute("vacationPay", vacationPay);
        return "calculated";
    }
}
