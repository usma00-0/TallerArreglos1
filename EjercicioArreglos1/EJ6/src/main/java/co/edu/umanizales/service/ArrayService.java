package co.edu.umanizales.service;

public class ArrayService {
    public int calculateSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public double calculateAverage(int[] numbers) {
        if (numbers.length == 0) return 0;
        return (double) calculateSum(numbers) / numbers.length;
    }

    public boolean containsValue(int[] numbers, int value) {
        for (int num : numbers) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
}
