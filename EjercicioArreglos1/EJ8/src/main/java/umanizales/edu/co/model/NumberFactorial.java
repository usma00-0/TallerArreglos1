package umanizales.edu.co.model;

public class NumberFactorial {
    private int number;
    private long factorial;

    public NumberFactorial(int number) {
        this.number = number;
        this.factorial = calculateFactorial(number);
    }

    private long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Getters
    public int getNumber() {
        return number;
    }

    public long getFactorial() {
        return factorial;
    }
}
