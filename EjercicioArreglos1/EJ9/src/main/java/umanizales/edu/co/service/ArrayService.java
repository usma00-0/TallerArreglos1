package umanizales.edu.co.service;

import umanizales.edu.co.model.NumberArray;

public class ArrayService {
    private NumberArray numberArray;

    public void initializeArray(int size) {
        numberArray = new NumberArray(size);
    }

    public void addNumber(int index, int value) {
        if (numberArray != null) {
            numberArray.setNumber(index, value);
        }
    }

    public String getNumbersInRange() {
        if (numberArray != null) {
            return numberArray.getNumbersInRange();
        }
        return "El arreglo no ha sido inicializado";
    }

    public NumberArray getNumberArray() {
        return numberArray;
    }
}
