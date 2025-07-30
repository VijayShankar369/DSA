class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        for(int val:nums){
            max=Math.max(val,max);
        }
        int result=0;
        int count=0;
        for(int val:nums){
            if(val==max){
                count++;
            }
            else{
                result=Math.max(result,count);
                count=0;
            }
        }
        return Math.max(result,count);
    }
}