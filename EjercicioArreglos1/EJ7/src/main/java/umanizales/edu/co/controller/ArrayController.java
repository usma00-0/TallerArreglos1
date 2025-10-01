package umanizales.edu.co.controller;

import umanizales.edu.co.service.ArrayService;
import java.util.Scanner;

public class ArrayController {
    private final ArrayService arrayService;

    public ArrayController() {
        this.arrayService = new ArrayService();
    }

    public void processNumbers() {
        System.out.println("Ingrese 10 números enteros:");
        
        // Leer 10 números del usuario
        for (int i = 0; i < 10; i++) {
            try (Scanner input = new Scanner(System.in)) {
                while (true) {
                    try {
                        System.out.print("Número " + (i + 1) + ": ");
                        String line = input.nextLine();
                        try {
                            int number = Integer.parseInt(line);
                            arrayService.addNumber(number);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Por favor ingrese un número entero válido.");
                        }
                    } catch (Exception e) {
                        System.out.println("Error al leer la entrada. Por favor intente nuevamente.");
                    }
                }
            }
        }
        
        // Encontrar la posición del número con la mayor suma de dígitos
        int position = arrayService.findPositionWithMaxDigitSum();
        
        // Mostrar resultados
        System.out.println("\nNúmeros ingresados:");
        int[] numbers = arrayService.getNumbers();
        for (int i = 0; i < arrayService.getArraySize(); i++) {
            System.out.printf("Posición %d: %d%n", i, numbers[i]);
        }
        
        if (position != -1) {
            System.out.printf("\nEl número con la mayor suma de dígitos es %d en la posición %d%n", 
                            numbers[position], position);
        } else {
            System.out.println("No se encontraron números en el arreglo.");
        }
    }
}
