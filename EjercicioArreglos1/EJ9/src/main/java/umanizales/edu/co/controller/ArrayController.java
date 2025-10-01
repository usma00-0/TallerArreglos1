package umanizales.edu.co.controller;

import umanizales.edu.co.service.ArrayService;
import java.util.Scanner;

public class ArrayController {
    private ArrayService arrayService;
    private Scanner scanner;

    public ArrayController() {
        arrayService = new ArrayService();
        scanner = new Scanner(System.in);
    }

    public void processNumbers() {
        System.out.println("Bienvenido al programa de números en rango");
        System.out.println("Usando números de ejemplo: 5, 3, 7, 2, 8, 1, 4, 6, 9, 2\n");
        
        int[] sampleNumbers = {5, 3, 7, 2, 8, 1, 4, 6, 9, 2};
        arrayService.initializeArray(10);
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Número " + (i + 1) + ": " + sampleNumbers[i]);
            arrayService.addNumber(i, sampleNumbers[i]);
        }
        
        System.out.println("\nResultados:");
        System.out.println(arrayService.getNumbersInRange());
    }
}
