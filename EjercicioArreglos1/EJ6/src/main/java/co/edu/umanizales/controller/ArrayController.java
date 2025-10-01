package co.edu.umanizales.controller;

import co.edu.umanizales.service.ArrayService;

import java.util.Scanner;

public class ArrayController {
    private final ArrayService arrayService;
    private final Scanner scanner;

    public ArrayController() {
        this.arrayService = new ArrayService();
        this.scanner = new Scanner(System.in);
    }

    public void processArray() {
        System.out.println("Enter 10 integers:");
        int[] numbers = new int[10];
        
        // Read 10 numbers from user with validation
        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    System.out.print("Number " + (i + 1) + ": ");
                    if (scanner.hasNextInt()) {
                        numbers[i] = scanner.nextInt();
                        break;
                    } else {
                        System.out.println("Please enter a valid integer!");
                        scanner.next(); // Clear the invalid input
                    }
                } catch (Exception e) {
                    System.out.println("An error occurred. Please try again.");
                    scanner.nextLine(); // Clear the buffer
                }
            }
        }
        
        // Calculate average
        double average = arrayService.calculateAverage(numbers);
        int intAverage = (int) average;
        
        // Check if average is in the array
        boolean containsAverage = arrayService.containsValue(numbers, intAverage);
        
        // Display results
        System.out.println("\nEntered numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        System.out.println("\n\nAverage: " + average);
        System.out.println("Integer part of average: " + intAverage);
        System.out.println("Is the integer average in the array? " + 
            (containsAverage ? "Yes" : "No"));
    }
}
