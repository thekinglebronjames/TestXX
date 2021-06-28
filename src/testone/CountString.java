package testone;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        //countNum("34567yuw");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        countNum(s);
    }
    static void countNum(String s){
        char[] arr=s.toCharArray();
        int engCount=0,blankSpaceCount=0,numCount=0,others=0;
        for(char c : arr){
            //if(c)
            if(Character.isLowerCase(c)||Character.isUpperCase(c)){
                engCount++;
            }else if((int) c==32){
                blankSpaceCount++;
            }else if(Character.isDigit(c)){
                numCount++;
            }else
                others++;
        }
        System.out.println("英文字母："+engCount);
        System.out.println("空格："+blankSpaceCount);
        System.out.println("数字："+numCount);
        System.out.println("其他字符："+others);
    }
}
