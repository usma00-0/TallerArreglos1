package umanizales.edu.co.service;

import umanizales.edu.co.model.NumberArray;

public class ArrayService {
    private NumberArray numberArray;

    public ArrayService() {
        this.numberArray = new NumberArray();
    }

    public void addNumber(int number) {
        numberArray.addNumber(number);
    }

    public int findPositionWithMaxDigitSum() {
        return numberArray.findPositionWithMaxDigitSum();
    }

    public int[] getNumbers() {
        return numberArray.getNumbers();
    }

    public int getArraySize() {
        return numberArray.getSize();
    }
}
