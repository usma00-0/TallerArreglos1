package co.edu.umanizales.model;

public class ArrayProcessor {
    private int[] numbers;
    private int size;
    private static final int CAPACITY = 10;

    public ArrayProcessor() {
        numbers = new int[CAPACITY];
        size = 0;
    }

    public void addNumber(int number) {
        if (size < CAPACITY) {
            numbers[size] = number;
            size++;
        }
    }

    public double calculateAverage() {
        if (size == 0) return 0;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }
        return (double) sum / size;
    }

    public boolean containsAverage() {
        if (size == 0) return false;
        int average = (int) calculateAverage();
        for (int i = 0; i < size; i++) {
            if (numbers[i] == average) {
                return true;
            }
        }
        return false;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public static void main(String[] args) {
        ArrayProcessor processor = new ArrayProcessor();
        
        // Add 10 numbers (example values, you can modify these or add user input)
        int[] exampleNumbers = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        for (int num : exampleNumbers) {
            processor.addNumber(num);
        }

        // Calculate and check if average exists in the array
        double average = processor.calculateAverage();
        boolean containsAverage = processor.containsAverage();
        
        System.out.println("Numbers in the array:");
        for (int num : processor.getNumbers()) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nAverage: " + average);
        System.out.println("Is the average (" + (int)average + ") in the array? " + containsAverage);
    }
}
