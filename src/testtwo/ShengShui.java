package testtwo;

public class ShengShui {
    public static void main(String[] args) {
        int[] arr = {19,3, 1, 2, 5, 2, 4,9};
        //System.out.println(t1(arr));
        int[] ints = t2(arr);
        for (int i : ints) {
            System.out.println(i);
        }
    }

    static int t1(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int leftMax = -1, rightMax = -1;
        int sum = 0;

        while (left < right) {
            leftMax = Math.max(arr[left], leftMax);
            rightMax = Math.max(arr[right], rightMax);
            if (arr[left] < arr[right]) {
                sum += leftMax - arr[left];
                left++;
            } else {
                sum += rightMax - arr[right];
                right--;
            }
        }
        return sum;
    }


    static int[] t2(int[] arr) {
        int n = arr.length;
        int max = -1, secondMax = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else {
                if (arr[i] > secondMax) {
                    secondMax = arr[i];
                }
            }
        }
        return new int[]{max, secondMax};
    }
}
