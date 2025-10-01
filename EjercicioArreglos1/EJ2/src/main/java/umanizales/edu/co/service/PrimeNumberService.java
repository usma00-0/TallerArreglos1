package umanizales.edu.co.service;

import umanizales.edu.co.model.PrimeNumberFinder;

public class PrimeNumberService {
    private PrimeNumberFinder finder;

    public PrimeNumberService(PrimeNumberFinder finder) {
        this.finder = finder;
    }

    public String findLargestPrimePosition() {
        int position = finder.findLargestPrimePosition();
        if (position == -1) {
            return "No se encontraron números primos en el arreglo.";
        } else {
            return String.format("El número primo más grande está en la posición %d (índice %d) con el valor %d",
                    position + 1, position, finder.getNumbers()[position]);
        }
    }
}
