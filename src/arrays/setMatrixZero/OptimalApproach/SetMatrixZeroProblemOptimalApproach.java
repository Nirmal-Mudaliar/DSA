package arrays.setMatrixZero.OptimalApproach;

import java.util.ArrayList;

public class SetMatrixZeroProblemOptimalApproach {

    // TC: O(2(n * m)) + O(n) + O(m)
    // SC: O(1)
    public ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int col0 = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    matrix.get(i).set(0, 0); // mark row
                    if (j == 0) {
                        col0 = 0;
                    }
                    else {
                        matrix.getFirst().set(j, 0);
                    }
                }
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix.get(i).get(j) != 0) {
                    if (matrix.get(i).getFirst() == 0 || matrix.getFirst().get(j) == 0) {
                        matrix.get(i).set(j, 0);
                    }
                }
            }
        }

        if (matrix.getFirst().getFirst() == 0) {
            for (int j = 0; j < m; j++) {
                matrix.getFirst().set(j, 0);
            }
        }

        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix.get(i).set(0, 0);
            }
        }
        return matrix;
    }
}
