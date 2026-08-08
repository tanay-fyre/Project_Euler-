// Project Euler - Problem 1: Multiples of 3 or 5
// If we list all the natural numbers below 1000 that are multiples of 3 or 5,
// find the sum of all these multiples.
//
// Approach: instead of looping through every number below 1000, use the
// closed-form sum of an arithmetic series for multiples of n, then apply
// inclusion-exclusion for 3 and 5 (subtracting multiples of 15, which get
// counted twice).
public class Problem001 {

    // Sum of all multiples of n that are strictly less than the limit
    static long sumOfMultiplesBelow(int n, int limit) {
        int p = (limit - 1) / n; // how many multiples of n fit below the limit
        return (long) n * p * (p + 1) / 2;
    }

    public static void main(String[] args) {
        int limit = 1000;

        long answer = sumOfMultiplesBelow(3, limit)
                + sumOfMultiplesBelow(5, limit)
                - sumOfMultiplesBelow(15, limit);

        System.out.println("Answer: " + answer);
    }
}