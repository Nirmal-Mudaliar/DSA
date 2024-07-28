package recursion.allSubsets;

import java.util.ArrayList;

public class AllSubSets {
    private void getAllSubsets(int index, ArrayList<Integer> arr, ArrayList<Integer> currList, ArrayList<ArrayList<Integer>> ans) {
        if (index == arr.size()) {
            ans.add(new ArrayList<>(currList));
            return;
        }
        currList.add(arr.get(index));
        getAllSubsets(index + 1, arr, currList, ans);
        currList.removeLast();
        getAllSubsets(index + 1, arr, currList, ans);
    }

    public ArrayList<ArrayList<Integer>> calculateAllSubsets(ArrayList<Integer> arr) {
        ArrayList<Integer> currentList = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        getAllSubsets(0, arr, currentList, ans);
        return ans;
    }
}
