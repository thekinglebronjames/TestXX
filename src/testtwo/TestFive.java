package testtwo;

public class TestFive {
    public static void main(String[] args) {
        int[] arr={9999,99,89889898};
        System.out.println(test(arr)[0]);
        System.out.println(test(arr)[1]);

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



}
