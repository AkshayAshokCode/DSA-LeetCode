class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] transpose=new int[matrix[0].length][matrix.length];
        for(int  i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[i].length;j++){
                if(i!=j){
                    transpose[i][j]=matrix[j][i];
                }else{
                     transpose[i][j]=matrix[i][j];
                }
            }
        }
        return transpose;
    }
}