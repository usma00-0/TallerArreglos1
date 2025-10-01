package umanizales.edu.co.service;

import umanizales.edu.co.model.NumberArrayModel;
import java.util.Scanner;

public class NumberArrayService {
    private final NumberArrayModel model;
    private final Scanner scanner;

    public NumberArrayService(int size) {
        this.model = new NumberArrayModel(size);
        this.scanner = new Scanner(System.in);
    }

    public void readNumbers() {
        System.out.println("Ingrese " + model.getSize() + " números enteros:");
        for (int i = 0; i < model.getSize(); i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int number = scanner.nextInt();
            model.setNumber(i, number);
        }
    }

    public void findAndDisplayMaxPosition() {
        int maxPosition = model.findMaxPosition();
        if (maxPosition != -1) {
            System.out.println("\nEl mayor número es: " + model.getNumber(maxPosition));
            System.out.println("Se encuentra en la posición: " + (maxPosition + 1));
        } else {
            System.out.println("El arreglo está vacío.");
        }
    }
}
