package umanizales.edu.co.service;

import org.springframework.stereotype.Service;
import umanizales.edu.co.model.NumberFactorial;

import java.util.ArrayList;
import java.util.List;

@Service
public class FactorialService {
    
    public List<NumberFactorial> calculateFactorials(int[] numbers) {
        List<NumberFactorial> results = new ArrayList<>();
        for (int num : numbers) {
            results.add(new NumberFactorial(num));
        }
        return results;
    }
    
    public String getFactorialsAsString(int[] numbers) {
        StringBuilder result = new StringBuilder();
        List<NumberFactorial> factorials = calculateFactorials(numbers);
        
        result.append("Números y sus factoriales:\n");
        for (NumberFactorial nf : factorials) {
            result.append(String.format("Número: %d - Factorial: %d%n", 
                nf.getNumber(), nf.getFactorial()));
        }
        
        return result.toString();
    }
}
