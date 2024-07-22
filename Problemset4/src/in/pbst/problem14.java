package in.pbst;
import java.util.*;

public class problem14 {

    public static List<List<Integer>> findPairs(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>(); 

        for (int num : nums) {
            int complement = target - num;

            if (map.containsKey(complement) && map.get(complement) > 0) {
                List<Integer> pair = new ArrayList<>();
                pair.add(num);
                pair.add(complement);
                result.add(pair);
                map.put(complement, map.get(complement) - 1);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 4, 0, 9, 5, 1, 3, 8};
        int target = 9;

        List<List<Integer>> pairs = findPairs(nums, target);

        System.out.println("Pairs with sum " + target + ":");
        for (List<Integer> pair : pairs) {
            System.out.println(pair);
        }
    }
}

