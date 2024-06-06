class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int total=0;
        int[] high=new int[gain.length];
        
        for(int i=0;i<gain.length;i++){
            total+=gain[i];
            high[i]=total;
             if(max<total){
                max=total;
            }
        }
      
        return max;
    }
}