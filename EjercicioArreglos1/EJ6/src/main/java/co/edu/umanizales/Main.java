package co.edu.umanizales;

import co.edu.umanizales.controller.ArrayController;

public class Main {
    public static void main(String[] args) {
        // Using the model directly (as per the exercise requirements)
        System.out.println("=== Using Model Directly ===");
        co.edu.umanizales.model.ArrayProcessor processor = new co.edu.umanizales.model.ArrayProcessor();
        
        // Example numbers (you can modify these or add user input)
        int[] exampleNumbers = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        for (int num : exampleNumbers) {
            processor.addNumber(num);
        }
        
        double average = processor.calculateAverage();
        boolean containsAverage = processor.containsAverage();
        
        System.out.println("Numbers in the array:");
        for (int num : processor.getNumbers()) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nAverage: " + average);
        System.out.println("Is the average (" + (int)average + ") in the array? " + containsAverage);
        
        // Using the controller for user interaction
        System.out.println("\n=== Using Controller for User Input ===");
        ArrayController controller = new ArrayController();
        controller.processArray();
    }
}
