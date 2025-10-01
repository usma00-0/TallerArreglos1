package umanizales.edu.co.model;

import java.util.Random;

public class NumberArray {
    private int[] numbers;
    private int size;
    private static final int MAX_SIZE = 10;

    public NumberArray() {
        this.numbers = new int[MAX_SIZE];
        this.size = 0;
    }

    public void addNumber(int number) {
        if (size < MAX_SIZE) {
            numbers[size] = number;
            size++;
        }
    }

    public int findPositionWithMaxDigitSum() {
        if (size == 0) {
            return -1; // Array vacío
        }

        int maxSum = -1;
        int position = -1;

        for (int i = 0; i < size; i++) {
            int currentSum = calculateDigitSum(numbers[i]);
            if (currentSum > maxSum) {
                maxSum = currentSum;
                position = i;
            }
        }

        return position;
    }

    private int calculateDigitSum(int number) {
        int sum = 0;
        int num = Math.abs(number); // Para manejar números negativos
        
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        
        return sum;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int getSize() {
        return size;
    }
}
