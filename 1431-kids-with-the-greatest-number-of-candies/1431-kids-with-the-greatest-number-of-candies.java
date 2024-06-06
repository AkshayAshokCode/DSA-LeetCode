class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> getRich=new ArrayList();
        int rich=0;
        for(int i=0;i<candies.length;i++){
            if(rich<candies[i]){
                rich=candies[i];
            }
        }
        int i=0;
        while(i<candies.length){
            if(candies[i]+extraCandies<rich){
                getRich.add(false);
            }else{
                 getRich.add(true);
            }
            i++;
        }
        return getRich;
    }
}