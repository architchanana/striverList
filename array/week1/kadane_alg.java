package com.company.striver_sheet.array.week1;

public class kadane_alg {
    public static void main(String[] args) {

    }
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxi=nums[0];
        for(int i=0;i<nums.length;i++){
            sum=Math.max(sum+nums[i],nums[i]);
            maxi=Math.max(sum,maxi);
        }
        return maxi;
    }
}
