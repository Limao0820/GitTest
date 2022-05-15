package com.atyanko.exer210;

import org.junit.Test;

/**
 * @author Yanko
 * @create 2022-03-03 7:20 PM
 */
public class Test209 {

    @Test
    public void test(){
        int target=15;
        int[] nums={1,2,3,4,5,6,7,8};
        int result = minSubArrayLen(target, nums);
        System.out.println(result);
    }

    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        for(int i=1;i<=n;i++){
            int sum=0;
            for(int j=0;j<(n-i+1);j++){
                sum=0;
                for(int k=0,m=j;k<i;k++){
                    sum+=nums[m];
                    m++;
                }

                if(sum>=target){
                    return i;
                }
            }
        }
        return 0;
    }
}
