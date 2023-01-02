package com.company.striver_sheet.array.week1;

import java.util.ArrayList;
import java.util.Arrays;

public class sort_colors {
    public static void main(String[] args) {
        int []nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while (mid<=end){
            if(nums[mid]==0){
                int temp=nums[start];
                nums[start]=nums[mid];
                nums[mid]=temp;
                start++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                int temp=nums[end];
                nums[end]=nums[mid];
                nums[mid]=temp;
                end--;
            }
        }
    }
//    public void sortColors(int[] nums) {
//        ArrayList<Integer>zeros=new ArrayList<>();
//        ArrayList<Integer>ones=new ArrayList<>();
//        ArrayList<Integer>twos=new ArrayList<>();
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==0){
//                zeros.add(0);
//            }
//            else if(nums[i]==1){
//                ones.add(1);
//            }
//            else{
//                twos.add(2);
//            }
//        }
//        int k=0;
//        int t=zeros.size();
//        for(int i=t-1;i>=0;i--){
//            nums[k]=zeros.remove(i);
//            k++;
//        }
//        t=ones.size();
//        for(int i=t-1;i>=0;i--){
//            nums[k]=ones.remove(i);
//            k++;
//        }
//        t=twos.size();
//        for(int i=t-1;i>=0;i--){
//            nums[k]=twos.remove(i);
//            k++;
//        }
//    }
}
