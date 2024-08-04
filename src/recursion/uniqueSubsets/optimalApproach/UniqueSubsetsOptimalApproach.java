package recursion.uniqueSubsets.optimalApproach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueSubsetsOptimalApproach {
    void findUniqueSubsets(int index, int[] nums, List<List<Integer>> ans, List<Integer> ds) {
        ans.add(new ArrayList<>(ds));
        for (int i = index; i < nums.length; i++) {
            if (i != index && nums[i] == nums[i-1]) continue;
            ds.add(nums[i]);
            findUniqueSubsets(i + 1, nums, ans, ds);
            ds.removeLast();
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        findUniqueSubsets(0, nums, ans, new ArrayList<>());
        return ans;
    }
}
