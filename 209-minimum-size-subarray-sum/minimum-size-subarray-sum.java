class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int n = nums.length;
        int number = 0;

        for(int right = 0;right<n;right++){
            number += nums[right];

            while(number >= target){
                minLength = Math.min(minLength,right-left+1);
                number -= nums[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}