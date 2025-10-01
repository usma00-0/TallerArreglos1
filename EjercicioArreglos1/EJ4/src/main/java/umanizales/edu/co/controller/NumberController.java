package umanizales.edu.co.controller;

import umanizales.edu.co.service.NumberService;

public class NumberController {
    private NumberService numberService;

    public NumberController() {
        this.numberService = new NumberService();
    }

    public void process() {
        System.out.println("=== Procesador de Números ===");
        System.out.println("Este programa encuentra números terminados en 4 en un arreglo de 10 números.\n");
        
        numberService.processNumbers();
        
        System.out.println("\n¡Gracias por usar el programa!");
    }
}
