class Solution {
    public int hIndex(int[] citations) {
       int n =  citations.length;

       for(int i=0;i<n;i++){
        int papersRemaining = n-i;

        if(citations[i] >= papersRemaining){
            return papersRemaining;
        }
       }
       return 0;
    }
}