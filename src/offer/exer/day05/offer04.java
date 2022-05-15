package offer.exer.day05;

/**
 * @author Yanko
 * @create 2022-03-04 2:37 PM
 */

import org.junit.Test;

import javax.swing.tree.TreeNode;
import java.util.*;

/**
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * <p>
 * 示例:
 * 现有矩阵 matrix 如下：
 * [1,   4,  7, 11, 15],
 * [2,   5,  8, 12, 19],
 * [3,   6,  9, 16, 22],
 * [10, 13, 14, 17, 24],
 * [18, 21, 23, 26, 30]
 */
public class offer04 {
    @Test
    public void test() {
        int[][] nums = {{1, 4, 7, 11, 15},
                        {2, 5, 8, 12, 19},
                        {3, 6, 9, 16, 22},
                        {10, 13, 14, 17, 24},
                        {18, 21, 23, 26, 30}};
        int target = 5;
        boolean result = findTarget(nums, target);
        System.out.println(result);

    }

    public boolean findTarget(int[][] nums, int target){
        for(int i=0;i<nums.length;i++){
            int left=0;
            int right=nums[i].length-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(nums[i][mid]<target){
                    left=mid+1;
                }else if(nums[i][mid]>target){
                    right=mid-1;
                }else{
                    return true;
                }
            }
        }
        return false;
    }
    
}
