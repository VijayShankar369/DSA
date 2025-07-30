class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0,sum = 0;
        int left = 0;
        Set<Integer> set = new HashSet<>();
        int n = nums.length;

        for(int right = 0; right < n;right++){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            set.add(nums[right]);
            sum += nums[right];

            if(right - left + 1 == k){
                maxSum = Math.max(maxSum,sum);
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        } 
        return maxSum;  
    }
}