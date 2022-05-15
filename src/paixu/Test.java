package paixu;

import java.util.*;

/**
 * @author Yanko
 * @create 2022-04-13 7:17 PM
 */
public class Test {
    List<List<Integer>> result=new LinkedList<>();
    LinkedList<Integer> path=new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("shuru");

        int number = scanner.nextInt();
        String s = scanner.nextLine();


        for(String c:s.split(" ")){

        };
        System.out.println(s);

        int[] a=new int[]{7,4,5,3,3};
        Arrays.sort(a);
        int sumMax=0;
        for(int i:a){
            sumMax+=i;
        }
        List<List<Integer>> result=new LinkedList<>();
        LinkedList<Integer> path=new LinkedList<>();
        Test test=new Test();
        sumMax=sumMax/2;
        test.backTracking(a,0,0,sumMax,result,path);

        System.out.println(result);
        for (int i=0;i<result.size();i++){
            for(int j=0;j<result.get(i).size();j++){
                System.out.print(result.get(i).get(j));
            }
        }
    }


    public void backTracking(int[] nums,int startIndex,int sum,int sumMax,List<List<Integer>> result,LinkedList<Integer> path){
        if(sum==sumMax){
            result.add(new ArrayList<>(path));
            return ;
        }
        //剪枝
        if(sum>sumMax){
            return ;
        }
        for(int i=startIndex;i<nums.length;i++){
            if(i>startIndex&&nums[i]==nums[i-1]){
                continue;
            }
            path.add(nums[i]);
            sum+=nums[i];
            backTracking(nums,i+1,sum,sumMax,result,path);
            sum-=nums[i];
            path.removeLast();
        }
    }

    @org.junit.Test
    public void test(){
        int i=1;
        i=i++;
        int j=i++;
        int k=i+ ++i*i++;
        System.out.println(i+","+j+","+k);
    }
}

