package leetcode;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

public class TwoSumSorted {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                if(complement == numbers[j]){
                    return new int[] {++i, ++j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public int[] twoSumHash(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complment = target - numbers[i];
            if(map.containsKey(complment)) {
                int firstIndex = map.get(complment) + 1;
                return new int[] { firstIndex , ++i};
            }
            map.put(numbers[i], i);
        }
        throw new IllegalArgumentException("not sub");
    }
    public int[] twoSumSmart(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while(left < right) {
            if(numbers[left] + numbers[right] == target)
                return new int[] {left + 1, right + 1};
            else if(numbers[left] + numbers[right] > target) right--;
            else left++;
        }
        return new int[] {};
    }
}


// [2,7,11,15], target = 9