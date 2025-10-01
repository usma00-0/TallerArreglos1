package umanizales.edu.co.controller;

import org.springframework.web.bind.annotation.*;
import umanizales.edu.co.service.NumberArrayService;

@RestController
@RequestMapping("/api/numbers")
public class NumberArrayController {
    
    private final NumberArrayService numberArrayService;
    
    public NumberArrayController(NumberArrayService numberArrayService) {
        this.numberArrayService = numberArrayService;
    }
    
    @PostMapping("/count-max")
    public int countMaxRepeats(@RequestBody int[] numbers) {
        return numberArrayService.countMaxRepeats(numbers);
    }
}
