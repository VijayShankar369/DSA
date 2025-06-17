class Solution {
    public int hIndex(int[] citations) {
        int n =  citations.length;

        int left = 0;
        int right = n-1;
        int h = 0;

        while(left<=right){
            int middle = left+(right-left)/2;

            int papers = n-middle;

            if(citations[middle]>=papers){
                h = papers;
                right = middle-1;
            }
            else{
                left = middle+1;
            }
        }
        return h;
    }
}