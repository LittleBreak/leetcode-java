package leetcode;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum

public class TwoSum {
    // Brute Force
    // time complexity O(n^2)
    // space complexity O(1)
    public int[] twoSumForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    // Two-pass Hash Table
    // time complexity O(n^2)
    // space complexity O(1)
    // 若存在相同的数据，会导致后边的key会覆盖
    public int[] twoSumTwoHash(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // 注意这里，key存的不是数组的索引，而是数值
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // 有匹配项，且匹配的不是当前index的数值
            // 4 -2 = 2
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    // BEST WAY
    // one-pass Hash Table
    // time complexity O(n^2)
    // space complexity O(1)
    public int[] twoSumOneHash(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
