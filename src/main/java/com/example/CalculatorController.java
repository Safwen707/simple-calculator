package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String index() {
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam double num1, 
                          @RequestParam double num2, 
                          @RequestParam String operation, 
                          Model model) {
        double result = 0;
        String message = "";

        try {
            switch (operation) {
                case "add":
                    result = num1 + num2;
                    message = num1 + " + " + num2 + " = " + result;
                    break;
                case "subtract":
                    result = num1 - num2;
                    message = num1 + " - " + num2 + " = " + result;
                    break;
                case "multiply":
                    result = num1 * num2;
                    message = num1 + " × " + num2 + " = " + result;
                    break;
                case "divide":
                    if (num2 == 0) {
                        message = "Erreur : Division par zéro !";
                        result = 0;
                    } else {
                        result = num1 / num2;
                        message = num1 + " ÷ " + num2 + " = " + result;
                    }
                    break;
                default:
                    message = "Opération non reconnue";
            }
        } catch (Exception e) {
            message = "Erreur de calcul";
        }

        model.addAttribute("result", result);
        model.addAttribute("message", message);
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        
        return "calculator";
    }
}