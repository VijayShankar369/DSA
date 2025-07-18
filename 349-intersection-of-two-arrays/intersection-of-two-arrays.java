class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> set1 = new HashSet<>();
       for(int num : nums1){
            set1.add(num);
       }

       Set<Integer> set2 = new HashSet<>();
       for(int num : nums2){
            set2.add(num);
       }

       List<Integer> numList = new ArrayList<>();

       for(int num : set1){
            if(set2.contains(num)){
                numList.add(num);
            }
       }

       int[] result = new int[numList.size()];

       for(int i = 0;i<numList.size();i++){
            result[i] = numList.get(i);
       }

       return result;
    }
}