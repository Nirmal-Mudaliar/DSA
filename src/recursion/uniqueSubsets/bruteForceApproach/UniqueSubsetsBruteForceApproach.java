package recursion.uniqueSubsets.bruteForceApproach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UniqueSubsetsBruteForceApproach {
    private void getUniqueSubsets(int index, ArrayList<Integer> arr, ArrayList<Integer> currArr, ArrayList<ArrayList<Integer>> ans) {
        if (index == arr.size()) {
            ArrayList<Integer> tempList = new ArrayList<>(currArr);
            Collections.sort(tempList);
            ans.add(tempList);
            return;
        }
        currArr.add(arr.get(index));
        getUniqueSubsets(index + 1, arr, currArr, ans);
        currArr.removeLast();
        getUniqueSubsets(index + 1, arr, currArr, ans);
    }
    public ArrayList<ArrayList<Integer>> calculateUniqueSubsets(ArrayList<Integer> arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        getUniqueSubsets(0, arr, new ArrayList<>(), ans);
        Set<ArrayList<Integer>> uniqueSubsets = new HashSet<>(ans);

        // Convert the HashSet back to an ArrayList
        return new ArrayList<>(uniqueSubsets);
    }
}
