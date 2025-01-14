package ru.home;

public class Start {
    public static void main(String[] args) {
        Start start1 = new Start();
        start1.printTreeWorld();
        start1.chekSumSing();
        start1.printColor();
        start1.compareNambers();
        System.out.println(start1.chekSumSing1(10, 5));
        start1.chekSing(2);
        System.out.println(start1.chekS(6));
        start1.stringCount("hi", 4);
        System.out.println(start1.liapYear(1300));
        start1.array();
        start1.array1();
        start1.array2();
        start1.array3();
        start1.ar(3, 3);
    }


    public void printTreeWorld () {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }


    public void chekSumSing() {
        int int1 = 1;
        int int2 = -2;
        int int3 = int1 + int2;
        if (int3 >= 0) {
            System.out.println("Сумма положительная");

        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public void printColor() {
        int value = -1;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }

    }


    public void compareNambers() {
        int inta = 2;
        int intb = 2;
        if (inta >= intb) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }


    public boolean chekSumSing1(int int1, int int2) {
        int int3 = int1 + int2;
        return int3 >= 10 && int3 <= 20;


    }

    public void chekSing(int int1) {

        if (int1 >= 0) {
            System.out.println("Число положительное");

        } else {
            System.out.println("Число отрицательное");
        }
    }

    public boolean chekS(int int1) {
        return int1 <= 0;
    }

    public void stringCount(String str, int cunt) {

        for (int i = 0; i < cunt; i++) {
            System.out.println(str);
        }
    }

    public boolean liapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);

    }

    public void array() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    public void array1() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    public void array2() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = i * 2;
            }
        }
    }

    public void array3() {
        int[][] table = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (i == j) {
                    table[i][j] = 1;
                }
            }
        }

    }

    public int[] ar(int len, int initialValue) {
        int[] t = new int[len];
        for (int i = 0; i < len; i++) {
            t[i] = initialValue;
        }
        return t;
    }

}
