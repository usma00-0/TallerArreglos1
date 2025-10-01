package umanizales.edu.co.controller;

import umanizales.edu.co.service.NumberArrayService;

public class NumberArrayController {
    private final NumberArrayService service;
    private static final int ARRAY_SIZE = 10;

    public NumberArrayController() {
        this.service = new NumberArrayService(ARRAY_SIZE);
    }

    public void run() {
        System.out.println("=== Encontrar la posición del mayor número en un arreglo ===\n");
        service.readNumbers();
        service.findAndDisplayMaxPosition();
    }
}
