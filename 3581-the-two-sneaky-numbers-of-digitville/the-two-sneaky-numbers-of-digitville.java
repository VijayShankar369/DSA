class Solution {
    public int[] getSneakyNumbers(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        int[] ans = new int[2];
        int i = 0;

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() == 2){
                ans[i++] = e.getKey();
                if(i==2) break;
            }
        }

        return ans;
    }
}