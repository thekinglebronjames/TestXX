package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) {

        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();

        int[] arr = {111, 1, 1, 1};
        Integer[] arr1 = {1, 1, 1, 1, 1, 1};




        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);

        list.forEach((item) -> System.out.println(item));

        list.forEach(item -> {
            if (1 == item) {
                System.out.println(true);
            }
        });

        list.forEach(item -> {
            if (item == 1) {
                System.out.println(true);
            }
        });

        list.forEach(item -> {
            if (item == 10) {
                System.out.println(false);
            }
        });

        System.out.println("xxx");


        if (true) {
            System.out.println("hhh");
        }
        System.out.println("111222");

    }


}
