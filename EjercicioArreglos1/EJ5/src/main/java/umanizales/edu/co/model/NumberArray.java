package umanizales.edu.co.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Arrays;

@Data
@AllArgsConstructor
public class NumberArray {
    private int[] numbers;
    
    public int findMaxRepeatedCount() {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        
        int max = Arrays.stream(numbers).max().orElse(0);
        return (int) Arrays.stream(numbers).filter(n -> n == max).count();
    }
}
