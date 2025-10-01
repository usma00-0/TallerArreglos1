package co.edu.umanizales.model;

import co.edu.umanizales.service.PrimosService;

public class PrimosApplication {
    public static void main(String[] args) {
        PrimosService service = new PrimosService();
        int[] primos = service.encontrarPrimos();
        
        System.out.println("Los 10 números primos entre 100 y 300 son:");
        for (int i = 0; i < primos.length; i++) {
            System.out.println((i + 1) + ". " + primos[i]);
        }
    }
}
