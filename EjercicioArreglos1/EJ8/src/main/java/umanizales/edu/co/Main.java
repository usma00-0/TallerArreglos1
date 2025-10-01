package umanizales.edu.co;

import umanizales.edu.co.service.FactorialService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        
        System.out.println("Ingrese 10 números enteros:");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        FactorialService service = new FactorialService();
        String result = service.getFactorialsAsString(numbers);
        
        System.out.println("\nResultados:");
        System.out.println(result);
        
        scanner.close();
    }
}
