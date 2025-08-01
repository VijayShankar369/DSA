class Solution {
    public int minOperations(int[] nums, int x) {
        int maxLength = -1;
        int left = 0;
        int n = nums.length;
        int currentSum = 0;
        int sum = 0;

        for(int i=0; i<n;i++){
            sum += nums[i];
        }

        for(int right=0;right<n;right++){
            currentSum += nums[right];

            while(left<=right && currentSum > sum-x){
                currentSum -= nums[left];
                left++;
            }

            if(currentSum == sum-x){
                maxLength = Math.max(maxLength, right-left+1);
            }
        }

        return maxLength == -1 ? -1 : n-maxLength;
    }
}