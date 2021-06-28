package testone;

import java.util.*;

public class TestOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        diff(a,b);
    }
    static void diff(String a,String b){

        String[] arr1=a.split("\\,");
        String[] arr2=b.split("\\,");

        int i=0,j=0;
        List<String> res=new ArrayList<>();
        String ans="";
        while(i<arr1.length&&j<arr2.length){
            char m=arr1[i].charAt(0);
            char n=arr2[j].charAt(0);

            if(m<n){
                res.add("delete-"+m);
                i++;
            }else if(m>n){
                res.add("add-"+n);
                j++;
            }else {
                if(!arr1[i].equals(arr2[j])){
                    res.add("modify-"+m);
                }
                i++;
                j++;
            }
        }
        while(i<arr1.length){
            res.add("delete-"+arr1[i].charAt(0));
            i++;
        }
        while(j<arr2.length){
            res.add("add-"+arr2[j].charAt(0));
            j++;
        }
        Collections.sort(res);
        for(String str : res){
            ans=ans+str+',';
        }
        System.out.println(ans.substring(0,ans.length()-1));
    }
}
