import java.util.Map;
import java.util.HashMap;

public class Solution4{
  public boolean containsDuplicate(int[] nums){
    int n = nums.length;

    Map<Integer, Integer> map = new HashMap<>();

    for (int num : nums){
      if (map.containsKey(num) && map.get(num) >= 1){
        return true;
      }

      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    return false;
  }
}
