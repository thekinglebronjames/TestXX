package testtwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HeBingQuJian {
    public static void main(String[] args) {
        int[][] a={{1,2},{2,3},{10,29},{33,333},{2,5},{5,6},{9,13}};
        for(int[] x : t1(a)){
            for(int i : x){
                System.out.println(i);
            }
        }
    }


    static int[][] t1(int[][] arr) {
        int n = arr.length;
        if (n == 0) {
            return null;
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        List<int[]> lists = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int l = arr[i][0], r = arr[i][1];
            if (lists.size() == 0 || lists.get(lists.size() - 1)[1] < l) {
                lists.add(new int[]{l, r});
            } else {
                lists.get(lists.size() - 1)[1] = Math.max(r, lists.get(lists.size()-1)[1]);
            }
        }
        return lists.toArray(new int[lists.size()][]);
    }
}
