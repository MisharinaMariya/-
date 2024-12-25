package ru.home;

public class Start {
    public static void main(String[] args) {
        Application application1 = new Application();
        application1.printTreeWorld();
        Start start1 = new Start();
        start1.chekSumSing();
        Start start2 = new Start();
                start2.printColor();
                Start start3 = new Start();
                start3.compareNambers();
                Start start4 = new Start();
                start4.chekSumSing1(10,5);
                Start start5 = new Start();
                start5.chekSing(2);
                Start start6= new Start();
                start6.chekS(6);
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




    public void compareNambers() {
        int inta = 2;
        int intb = 2;
if (inta >= intb){
    System.out.println("a>=b");
} else {
    System.out.println("a<b");
}
    }




    public void chekSumSing1(int int1, int int2) {
        int int3 = int1 + int2;
            System.out.println(int3 >=10 && int3 <=20);


    }

    public void chekSing(int int1) {

        if (int1 >= 0) {
            System.out.println("Число положительное");

        } else {
            System.out.println("Число отрицательное");
        }
    }

public void chekS(int int1) {
    System.out.println(int1 <=0);
}


}