class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) return 0;

        int left = 0;
        int right = 1;
        int maxLen = 1;

        while (right < nums.length) {
            if (nums[right - 1] < nums[right]) {
                maxLen = Math.max(maxLen, right - left + 1);
            } else {
                left = right;
            }
            right++;
        }

        return maxLen;
    }
}
