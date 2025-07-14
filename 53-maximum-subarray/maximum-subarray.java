class Solution {
    public int maxSubArray(int[] nums) {
        int curMax = 0;

        int max = Integer.MIN_VALUE;

        for(int num : nums){
            curMax = Math.max(num,curMax+num);
            max = Math.max(max,curMax);
        }

        return max;
    }
}