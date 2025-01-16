package Lesson_6;

import exceptions.MyArrayDataException;
import exceptions.MyArraySizeException;

public class Array {

    public int twoArray(String[][] table)  {
        if (table.length != 4) {
            throw new MyArraySizeException();
        } else {
            if (table[0].length !=4){
                throw new MyArraySizeException();
            }
        }
        int summ = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {

                try {
                    int num = Integer.parseInt(table[i][j]);
                    summ= summ+num;
                }
                catch (NumberFormatException e){
                    throw new MyArrayDataException("Ошибка в ячейке [" + i + "][" + j + "]");
                }

            }

        }
        return summ;
    }


}