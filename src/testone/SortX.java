package testone;

import java.util.Scanner;

public class SortX {
    public static void main(String[] args) {
        //sortX("234irtuy");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sortX(s);
    }
    static void sortX(String s){
        char[] arr=s.toCharArray();
        int n=arr.length;
        for(int i=0;i<n;i++){
            boolean flag=true;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if(flag)
                break;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
