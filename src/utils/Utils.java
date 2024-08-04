package utils;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static <T> void print2DArray(List<? extends List<T>> matrix) {
        for (List<T> row: matrix) {
            for (T element: row) {
                System.out.print(STR."\{element} ");
            }
            System.out.println();
        }
    }

    public static <T> void printArray(ArrayList<T> list) {
        for (T each: list) {
            System.out.print(STR."\{each} ");
        }
    }
}
