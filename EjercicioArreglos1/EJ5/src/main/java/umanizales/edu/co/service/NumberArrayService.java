package umanizales.edu.co.service;

import umanizales.edu.co.model.NumberArray;
import org.springframework.stereotype.Service;

@Service
public class NumberArrayService {
    
    public int countMaxRepeats(int[] numbers) {
        NumberArray numberArray = new NumberArray(numbers);
        return numberArray.findMaxRepeatedCount();
    }
}
