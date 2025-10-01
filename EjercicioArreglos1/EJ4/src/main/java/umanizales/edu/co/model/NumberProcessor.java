package umanizales.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class NumberProcessor {
    private int[] numbers;

    public NumberProcessor(int[] numbers) {
        this.numbers = numbers;
    }

    public List<Integer> findPositionsEndingWithFour() {
        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (Math.abs(numbers[i] % 10) == 4) { // Handle negative numbers
                positions.add(i);
            }
        }
        return positions;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
