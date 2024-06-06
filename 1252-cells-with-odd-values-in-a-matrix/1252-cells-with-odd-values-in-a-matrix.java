class Solution {
    public int oddCells(int m, int n, int[][] indices) {
         //initialise empty arrays equal to row and column
        int[] row = new int[m];
        int[] col = new int[n];
        int count=0;
        
		//traverse indices matrix to increment corresponding row and col value
        for(int[] i : indices){
            row[i[0]]++;
            col[i[1]]++;
        }
        
		//traverse in m*n loops and check if sum of i & j value is odd
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if((row[i]+col[j])%2 == 1) count++;
            }
        }
        
        return count;
    }
}