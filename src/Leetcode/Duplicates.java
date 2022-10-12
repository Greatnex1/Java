package Leetcode;

import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {

    }

    public  static boolean containsDuplicate(int[] nums) {


        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[j] == nums[i])
                    return true;
            }
        }
        return false;
    }
    public boolean containsDuplicateUsingSort(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }


}
