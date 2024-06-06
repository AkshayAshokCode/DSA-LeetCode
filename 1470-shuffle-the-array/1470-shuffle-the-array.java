class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] arr = new int[n*2];
        
        int i = 0, k = 0, l = n;
        while(i<2*n){
            arr[i] = nums[k++];
            arr[i+1] = nums[l++];
            i+=2;
        }
        return arr;
    }
}