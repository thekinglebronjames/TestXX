package testone;

public class TestThree {
    public static void main(String[] args) {

    }
    static int getMin(int[][] matrix){
        int rows=matrix.length;
        int columns=matrix[0].length;

        int[][] dp=new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(matrix[i][j]==0){
                    dp[i][j]=0;
                }
                //dp[i][j]=Math.min(dp[i][])
            }
        }
        return 0;
    }
}
