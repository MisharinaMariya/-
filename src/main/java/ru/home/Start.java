package ru.home;

public class Start {
    public static void main(String[] params) {

    }

    public int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;

        }
        return result;
    }
}
