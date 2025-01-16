package Lesson_6;

import exceptions.MyArrayDataException;
import exceptions.MyArraySizeException;

public class Start {
    public static void main(String[] args) {
        String[][] table=new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                    table[i][j] = "s";

            }
        }

        Array array1 = new Array();

        try {
            System.out.println( array1.twoArray(table));
        }
        catch (MyArrayDataException e){
            System.out.println(e.getMessage());
        }
        catch (MyArraySizeException e){
            System.out.println("Не верный размер массива");
        }


    }
}
