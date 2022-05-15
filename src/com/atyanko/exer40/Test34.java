package com.atyanko.exer40;

import org.junit.Test;

/**
 * @author Yanko
 * @create 2022-03-01 10:17 AM
 */
public class Test34 {

    @Test
    public void test(){
//        int [] nums={5,7,7,8,8,8,9,10};
//        int target=10;
//        int[] nums ={5,7,7,8,8,10};
//        int target = 6;
//        int[] nums={};
//        int target=0;
        int [] nums={1};
        int target=1;


        int[] a = searchRange(nums,target);

        System.out.println("["+a[0]+","+a[1]+"]");

    }

    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int finalLeft=-1;
        int finalRight=-1;
        int[] a={-1,-1};
        boolean isFlag=false;
        if(nums.length==0){
            return a;
        }
        while(left<=right&&!(isFlag)){
            int mid=left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                finalLeft=mid;
                finalRight=mid;
                isFlag=true;
            }
        }

        if(finalLeft!=-1&&finalRight!=-1){
            while((finalLeft>=0)&&(nums[finalLeft]==target)){
                finalLeft--;
            }
            while((finalRight<=nums.length-1)&&(nums[finalRight]==target)){
                finalRight++;
            }
            finalLeft++;
            finalRight--;
        }
        a[0]=finalLeft;
        a[1]=finalRight;
        System.out.println(finalLeft+","+finalRight);
        return a;
    }

}
