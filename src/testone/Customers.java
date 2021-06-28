package testone;

import java.util.Scanner;

public class Customers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int total=sc.nextInt();
        int[][] arr=new int[total][2];
        int i=0;
        while(i<total){
            String s=sc.next();
            String[] tmp=s.split("\\,");
            arr[i][0]=Integer.parseInt(tmp[0]);
            arr[i][1]=Integer.parseInt(tmp[1]);
            i++;
        }
        customers(arr);

    }
    static void customers(int[][] matrix){
        int res=0;
        int rows=matrix.length;
        int[] wait=new int[rows];
        wait[0]=1;

        for(int i=1;i<rows;i++){
            wait[i]=wait[i-1]+matrix[i-1][1];
        }

        for(int i=0;i<rows;i++){
            if(wait[i]<=matrix[i][0]){
                res+=matrix[i][1];
            }else{
                res+=wait[i]-matrix[i][0]+matrix[i][1];
            }
        }

        System.out.println(res);

    }
}
