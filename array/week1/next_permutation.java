package com.company.striver_sheet.array.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class next_permutation {
    public static void main(String[] args) {
        int []arr={7,2,5,3,1};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void nextPermutation(int[] nums) {
        int issue_point = 0;
        int n=nums.length-1;
        for(int i=n;i>=0;i--){
            if(i==0){
                Arrays.sort(nums);
                return;
            }
            if(nums[i]>nums[i-1]){
                issue_point=i;
                break;
            }
        }
        int op=(int)Math.pow(10,9);
        int index=0;
        for(int i=issue_point;i< nums.length;i++){
            if(nums[i]>nums[issue_point-1]){
                if(op>nums[i]){
                    index=i;
                    op=nums[i];
                }
            }
        }
        int temp=nums[issue_point-1];
        nums[issue_point-1]=nums[index];
        nums[index]=temp;
        reverse(issue_point,nums);
    }
    public static void reverse(int i,int[]nums){
        int j=nums.length-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}
