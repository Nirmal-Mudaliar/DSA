package recursion.combinationSum1.optimalApproach;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum1Solution {
  void calculateCombinationSum(
    int index,
    int target,
    int[] candidates,
    ArrayList<Integer> ds,
    List<List<Integer>> ans
  ) {
    if (index == candidates.length) {
      if (target == 0) {
        ans.add(new ArrayList<>(ds));
      }
      return;
    }
    if (candidates[index] <= target) {
      ds.add(candidates[index]);
      calculateCombinationSum(index, target - candidates[index], candidates, ds, ans);
      ds.removeLast();
    }
    calculateCombinationSum(index + 1, target, candidates, ds, ans);
  }

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> ans = new ArrayList<>();
    calculateCombinationSum(0, target, candidates, new ArrayList<>(), ans);
    return ans;
  }
}
