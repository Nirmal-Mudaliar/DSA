package recursion.sumOfAllSubSets.optimalApproach;

import java.util.ArrayList;
import java.util.Collections;

public class SumOfAllSubSetsSol1 {

    // TC: 2^nLog(2^n)
    // SC: 2^n
    private void calculateSubsetSums(int index, int sum, ArrayList<Integer> arr, int n, ArrayList<Integer> subSetSum) {
        if (index == n) {
            subSetSum.add(sum);
            return;
        }
        calculateSubsetSums(index + 1, sum + arr.get(index), arr, n, subSetSum);
        calculateSubsetSums(index + 1, sum, arr, n, subSetSum);
    }
    public ArrayList <Integer> subsetSums(ArrayList<Integer> arr, int N) {
        ArrayList<Integer> subSetSum = new ArrayList<>();
        calculateSubsetSums(0, 0, arr, N, subSetSum);
        Collections.sort(subSetSum);
        return subSetSum;
    }
}
