package umanizales.edu.co;

import umanizales.edu.co.controller.ArrayController;

public class Main {
    public static void main(String[] args) {
        ArrayController controller = new ArrayController();
        System.out.println("=== Encontrar número con mayor suma de dígitos ===");
        controller.processNumbers();
    }
}
