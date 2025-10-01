package umanizales.edu.co.model;

public class NumberArray {
    private int[] numbers;
    private int size;

    public NumberArray(int size) {
        this.size = size;
        this.numbers = new int[size];
    }

    public void setNumber(int index, int value) {
        if (index >= 0 && index < size) {
            numbers[index] = value;
        }
    }

    public int getNumber(int index) {
        if (index >= 0 && index < size) {
            return numbers[index];
        }
        return -1; // Valor por defecto si el índice es inválido
    }

    public String getNumbersInRange() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int current = numbers[i];
            result.append("Números del 1 al ").append(current).append(":\n");
            for (int j = 1; j <= current; j++) {
                result.append(j);
                if (j < current) {
                    result.append(", ");
                }
            }
            result.append("\n\n");
        }
        return result.toString();
    }

    public int getSize() {
        return size;
    }
}
