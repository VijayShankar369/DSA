class Solution {
    public int longestOnes(int[] nums, int k) {
       int zeros = 0;
       int left = 0;
       int maxLength = 0;
       int n = nums.length;

       for(int right=0;right<n;right++){
            if(nums[right] == 0){
                zeros++;
            }

            while(zeros > k){
                if(nums[left] == 0){
                    zeros--;
                }
                left++;
            }

            maxLength = Math.max(maxLength,right-left+1);
       }

       return maxLength;
    }
}