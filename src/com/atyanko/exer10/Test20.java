package com.atyanko.exer10;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Yanko
 * @create 2022-04-17 12:28 PM
 */
public class Test20 {
    public static void main(String[] args) {
        int n=6;
        String str="{([])}()";
        isValid(str, n);
        System.out.println(isValid(str, n));


    }

    private static boolean isValid(String s,int n){
        if(n%2!=0){
            return false;
        }
        Stack<Character> stack=new Stack<>();
        HashMap<Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                stack.push(c);
            }else{
                if(map.get(stack.pop())!=c){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
}
