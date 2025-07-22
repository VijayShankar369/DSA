class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        int currentSum = 0;
        int maxSum = 0;

        for (int right = 0; right < n; right++) {
            // Remove elements from the left until nums[right] becomes unique
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }
            // Add current element
            set.add(nums[right]);
            currentSum += nums[right];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
