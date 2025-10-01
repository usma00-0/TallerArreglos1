package umanizales.edu.co.service;

import umanizales.edu.co.model.NumberProcessor;
import java.util.List;
import java.util.Scanner;

public class NumberService {
    private Scanner scanner;
    private NumberProcessor processor;

    public NumberService() {
        this.scanner = new Scanner(System.in);
    }

    public void processNumbers() {
        int[] numbers = new int[10];
        
        System.out.println("Por favor ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        this.processor = new NumberProcessor(numbers);
        List<Integer> positions = processor.findPositionsEndingWithFour();
        
        if (positions.isEmpty()) {
            System.out.println("No se encontraron números terminados en 4.");
        } else {
            System.out.print("Los números terminados en 4 se encuentran en las posiciones: ");
            for (int i = 0; i < positions.size(); i++) {
                System.out.print((positions.get(i) + 1)); // +1 para mostrar posiciones desde 1
                if (i < positions.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
