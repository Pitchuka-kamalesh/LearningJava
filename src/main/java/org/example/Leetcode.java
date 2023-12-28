package org.example;




class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i=0;i<n;i++){
            for (int j = 1+i; j<n;j++){
                if ((nums[i]+nums[j]) == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};

    }
};
public class Leetcode {
    public static <Boolen> void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(10 == 10);
//        System.out.println(b);
        int[] nums ={1,2,3,4};
        int target = 7;
        int[] data = sol.twoSum(nums,target);

        System.out.println(data.length);
        for (int datum : data) {
            System.out.println(datum);
        }


        }

    }

