package co.edu.umanizales.service;

public class PrimosService {
    public int[] encontrarPrimos() {
        int[] primos = new int[10];
        int contador = 0;
        int numero = 101; // Empezamos desde el primer número mayor a 100
        
        while (contador < 10 && numero < 300) {
            if (esPrimo(numero)) {
                primos[contador] = numero;
                contador++;
            }
            numero++;
        }
        
        return primos;
    }
    
    private boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
