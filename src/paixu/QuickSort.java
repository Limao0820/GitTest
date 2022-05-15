package paixu;

import org.junit.Test;


import java.util.*;

/**
 * @author Yanko
 * @create 2022-03-11 9:03 PM
 */
public class QuickSort {
    Stack<Integer> stack=new Stack<>();


    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 3, 5, 6, 7, 9, 13, 11};
        quickSort(nums);
        for (int i : nums) {
            System.out.print(i);
        }

    }

    public static void quickSort(int[] array) {
        int len = array.length;
        if (array == null || len == 0 || len == 1) {
            return;
        }
        sort(array, 0, len - 1);

    }

    public static void sort(int[] array, int left, int right) {
        if (left > right) {
            return;
        }
        int base = array[left];
        int i = left, j = right;
        while (i != j) {
            while (array[j] >= base && i < j) {
                j--;
            }
            while (array[i] <= base && i < j) {
                i++;
            }

            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        array[left] = array[i];
        array[i] = base;

        sort(array, left, i - 1);
        sort(array, i + 1, right);
    }

    LinkedList<String> path=new LinkedList<>();
    List<String> result=new ArrayList<>();

@Test
public void test(){
    String s = "25525511135";
    List<String> strings = restoreIpAddresses(s);
    for(String str:strings){
        System.out.println(str);
    }

}
    public List<String> restoreIpAddresses(String s) {
        backTracking(s,0);
        return result;

    }

    //回溯算法
    public void backTracking(String s,int startIndex){

        //剪枝
        if(path.size()>4){
            return ;
        }
        //终止条件
        if(startIndex>=s.length()&&path.size()==4){
            //拼接字符串 [255,23,12,3]
            StringBuilder str=new StringBuilder();
//            for(String st:path){
//                System.out.println(st);
//                str=st+".";
//            }
            for(int i=0;i<path.size();i++){
                str.append(path.get(i));
                str.append(".");
            }

            result.add(str.substring(0,str.length()-1));

            return ;
        }

        for(int i=startIndex;i<=startIndex+2;i++){
            if(s.substring(startIndex,i+1).compareTo("255")>0){
                return ;
            }else{
                path.add(s.substring(startIndex,i+1));
                backTracking(s,i+1);
                path.removeLast();
            }
        }

    }

@Test
    public void test1(){


}
    public int search(int[] nums,int target){
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int mid=left+(left-right)/2;
            if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }




   
   
}




