package testone;

import java.util.Scanner;

public class TestTwo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        String ss=s+s;

        int min=getMin(ss,n);
        int max=getMax(ss,n);

        Integer s1Min=Integer.valueOf(ss.substring(min,n));
        String str1=Integer.toBinaryString(s1Min);
        Integer ss1=Integer.parseInt(str1);
        Integer s1Max=Integer.valueOf(ss.substring(max,n));
        String str2=Integer.toBinaryString(s1Max);
        Integer ss2=Integer.parseInt(str2);

        Double dMin=ss1%(Math.pow(10,9)+7);
        Double dMax=ss2%(Math.pow(10,9)+7);
        System.out.println(s1Max+s1Min);

        System.out.println(dMax+dMin);


    }

    static int getMin(String str,int n){
        int i=0,j=1;
        while(i<n&&j<n){
            int k=0;
            while(str.charAt(i+k)==str.charAt(j+k)&&k<n){
                k++;
            }
            if(k==n)
                return Math.min(i,j);
            if(str.charAt(i+k)>str.charAt(j+k))
                i= Math.max(i+k+1,j+1);
            else
                j=Math.max(j+k+1,i+1);
        }
        return Math.min(i,j);
    }
    static int getMax(String str,int n){
        int i=0,j=1;
        while(i<n&&j<n){
            int k=0;
            while(str.charAt(i+k)==str.charAt(j+k)&&k<n){
                k++;
            }
            if(k==n)
                return Math.max(i,j);
            if(str.charAt(i+k)<str.charAt(j+k))
                i=Math.max(i+k+1,j+1);
            else
                j=Math.max(j+k+1,i+1);

        }
        return Math.min(i,j);
    }

}
