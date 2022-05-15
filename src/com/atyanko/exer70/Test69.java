package com.atyanko.exer70;

import org.junit.Test;

import java.util.Stack;

/**
 * @author Yanko
 * @create 2022-03-01 2:10 PM
 */
public class Test69 {

    @Test
    public void test(){
        int x=2147395599;
        int i = mySqrt(x);
        System.out.println(i);
    }

    
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int left = 1;
        int right = x;
        int result = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            double stand = (double)x/mid;
            if (mid < stand) {
                left = mid + 1;
            } else if (mid>stand) {
                right = mid - 1;
                result = right;
            } else {
                result = mid;
                return result;
            }
        }
        return result;
    }
}
