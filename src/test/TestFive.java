package test;

import java.util.HashMap;

public class TestFive {
    public static void main(String[] args) {
        int[] arr = {1, 24, 4,3,2,1,1,3,12,1,121,21,};
        int[] ints = t1(arr, 25);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    static int[] t1(int[] arr,int target) {
        /*
        * k2=target-k1
        * containkeys(k2)
        * */

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int k2 = 0;
        for (int i = 0; i < arr.length; i++) {
            k2 = target - arr[i];
            if (hashMap.containsKey(k2)) {
                return new int[]{hashMap.get(k2), i};
            }
            hashMap.put(arr[i], i);
        }
        System.out.println("test");
        return null;
    }
}
