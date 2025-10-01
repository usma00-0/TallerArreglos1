package umanizales.edu.co.model;

public class NumberArrayModel {
    private int[] numbers;

    public NumberArrayModel(int size) {
        this.numbers = new int[size];
    }

    public void setNumber(int index, int value) {
        if (index >= 0 && index < numbers.length) {
            numbers[index] = value;
        }
    }

    public int getNumber(int index) {
        if (index >= 0 && index < numbers.length) {
            return numbers[index];
        }
        throw new IndexOutOfBoundsException("Índice fuera de rango");
    }

    public int findMaxPosition() {
        if (numbers.length == 0) {
            return -1; // Retorna -1 si el arreglo está vacío
        }

        int maxIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public int getSize() {
        return numbers.length;
    }
}
