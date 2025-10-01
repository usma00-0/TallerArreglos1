package co.edu.umanizales.controller;

import co.edu.umanizales.service.PrimosService;

public class PrimosController {
    private PrimosService primosService;

    public PrimosController() {
        this.primosService = new PrimosService();
    }

    public void mostrarPrimos() {
        int[] primos = primosService.encontrarPrimos();
        System.out.println("Los 10 números primos entre 100 y 300 son:");
        for (int i = 0; i < primos.length; i++) {
            System.out.println((i + 1) + ". " + primos[i]);
        }
    }
}
