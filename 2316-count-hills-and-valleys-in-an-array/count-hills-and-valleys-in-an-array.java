class Solution {
    public int countHillValley(int[] nums) {
        List<Integer> uniqueList = new ArrayList<>();
        uniqueList.add(nums[0]);

        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                uniqueList.add(nums[i]);
            }
        }

        int count = 0;
        for(int i=1;i<uniqueList.size()-1;i++){
            int prev = uniqueList.get(i-1);
            int curr = uniqueList.get(i);
            int next = uniqueList.get(i+1);

            if(curr > next && curr > prev || curr < next && curr < prev){
                count++;
            }
        }

        return count;
    }
}