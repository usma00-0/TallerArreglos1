package umanizales.edu.co.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import umanizales.edu.co.service.FactorialService;

@RestController
@RequestMapping("/factorial")
public class FactorialController {

    private final FactorialService factorialService;

    @Autowired
    public FactorialController(FactorialService factorialService) {
        this.factorialService = factorialService;
    }

    @PostMapping("/calculate")
    public String calculateFactorials(@RequestBody int[] numbers) {
        if (numbers.length != 10) {
            return "Por favor ingrese exactamente 10 números enteros.";
        }
        return factorialService.getFactorialsAsString(numbers);
    }
}
