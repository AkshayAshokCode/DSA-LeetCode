class Solution {
    public int maximumWealth(int[][] accounts) {
        int rich=0;
        for(int i=0;i<accounts.length;i++){
            int curRich=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                curRich+=accounts[i][j];
            }
            if(curRich>rich){
                rich=curRich;
            }
        }
        return rich;
    }
}