package utils;

import java.util.ArrayList;

public class Utils {
    public static <T> void print2DArray(ArrayList<ArrayList<T>> matrix) {
        for (ArrayList<T> row: matrix) {
            for (T element: row) {
                System.out.print(STR."\{element} ");
            }
            System.out.println();
        }
    }
}
