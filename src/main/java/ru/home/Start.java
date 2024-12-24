package ru.home;

public class Start {
    public static void main(String[] args) {
        Application application1 = new Application();
        application1.printTreeWorld();
        Start start1 = new Start();
        start1.chekSumSing();
        Start start2 = new Start();
                start2.printColor();
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
        if (value <=0){
            System.out.println("Красный");
        } else if (value >0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value >100) {
            System.out.println("Зеленый");
        }

    }
}