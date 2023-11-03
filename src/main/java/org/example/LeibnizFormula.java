package org.example;

public class LeibnizFormula {
    private final int ROUNDS;

    public LeibnizFormula(int rounds) {
        ROUNDS = rounds;
    }

    public double calculatePI() {
        double pi = 1;
        double x = 1;

        for (int i = 2; i < ROUNDS + 2; i++) {
            x *= -1;
            pi += (x / (2 * i - 1));
        }

        pi *= 4;

        return pi;
    }
}
