class Solution {
    public int diagonalSum(int[][] mat) {
        int size=mat.length-1;
        
        int common=0;
       if(size%2==0){
           common=mat[size/2][size/2];
       }
        int sum=0;
        for(int i=0;i<=size;i++){
            for(int j=0;j<=size;j++){
                if(i==j){
                    sum+=mat[i][j]+mat[i][size-j];
                }
                
            }
        }
        
        return sum-common;
    }
}