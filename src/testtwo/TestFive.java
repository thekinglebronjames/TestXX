package testtwo;

public class TestFive {
    public static void main(String[] args) {
        int[] arr={9999,99,89889898};
        //System.out.println(test(arr)[0]);
        //System.out.println(test(arr)[1]);
        t1(arr);

    }

    static int[] test(int[] arr) {
        int n = arr.length;
        int max = -1, secondMax = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }else {
                if (arr[i] >= secondMax) {
                    secondMax = arr[i];
                }
            }
        }
        return new int[]{max, secondMax};
    }

    //这是一个冒泡的排序方法
    static void t1(int[] arr) {
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            flag = true;
            for (int j = 0; j < arr.length - i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = false;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (flag) {
                break;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }

    }

    static void t2(int[] arr) {
        int n = arr.length;
        System.out.println(n);

    }

    static void t3(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(i);
        }

    }



}
