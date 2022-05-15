package com.atyanko.exer60;

import org.junit.Test;

/**
 * @author Yanko
 * @create 2022-03-04 10:56 AM
 */
public class Test53 {

    @Test
    public void test(){
        int[] nums={5,7,7,8,8,10};
        int target=8;
        int search = search(nums, target);
        System.out.println(search);

    }

    public int search(int[] nums, int target) {

        int left=0;
        int right=nums.length-1;
        int result=-1;
        int rightId=-1,leftId=-1;
        boolean isFlag=true;
        while(left<=right&&isFlag){
            int mid=left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                result=mid;
                isFlag=false;
            }
        }
        if(result==-1){
            return 0;
        }

        int leftid=result;
        int rightid=result;
        while(leftid>=0&&nums[leftid]==target){
            leftid--;
        }
        while(rightid<=nums.length-1&&nums[rightid]==target){
            rightid++;
        }
        int number=rightid-leftid-1;
        return number;

    }

    @Test
    //该方法报错！！！！
    public void test2(){
        int[] nums={5,7,7,8,8,10};
        int target=8;

        int leftId = findLeftId(nums, target);
        int rightId = findRightId(nums, target);
        System.out.println(leftId);
        System.out.println(rightId);
//        if(leftId==-1||rightId==-1) {
//            System.out.println(0);
//        }else{
//            System.out.println(rightId-leftId+1);
//        }
    }


    public int findLeftId(int[] nums,int target){
        int left=0;
        int right=nums.length;
        int leftId=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]==target){
                leftId=mid-1;
            }else{
                right=mid-1;
                leftId=right;
            }
        }
        return leftId+1;
    }

    public int findRightId(int[] nums,int target){
        int left=0;
        int right=nums.length;
        int rightId=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
                rightId=left;
            }else if(nums[mid]==target){
                rightId=mid+1;
            }else{
                right=mid-1;
            }
        }
        return rightId-1;
    }
}

