package umanizales.edu.co.model;

public class PrimeNumberFinder {
    private int[] numbers;

    public PrimeNumberFinder(int[] numbers) {
        this.numbers = numbers;
    }

    public boolean isPrime(int num) {
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

    public int findLargestPrimePosition() {
        int maxPrime = Integer.MIN_VALUE;
        int position = -1;
        
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i]) && numbers[i] > maxPrime) {
                maxPrime = numbers[i];
                position = i;
            }
        }
        
        return position; // Returns -1 if no prime numbers found
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}
