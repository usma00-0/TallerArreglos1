package umanizales.edu.co.controller;

import umanizales.edu.co.model.PrimeNumberFinder;
import umanizales.edu.co.service.PrimeNumberService;

import java.util.Scanner;

public class PrimeNumberController {
    private PrimeNumberService service;
    private Scanner scanner;

    public PrimeNumberController() {
        this.scanner = new Scanner(System.in);
    }

    public void processNumbers() {
        int[] numbers = new int[10];
        
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Número %d: ", i + 1);
            numbers[i] = scanner.nextInt();
        }
        
        PrimeNumberFinder finder = new PrimeNumberFinder(numbers);
        this.service = new PrimeNumberService(finder);
        
        String result = service.findLargestPrimePosition();
        System.out.println("\nResultado:");
        System.out.println(result);
        
        scanner.close();
    }
}
