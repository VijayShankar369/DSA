class Solution {
    public int countTriples(int n) {
        int count = 0;

        for(int i=1;i<n;i++){

            for(int j=i+1;j<n;j++){
                int sumSquares = i*i + j*j;
                int k = (int) Math.sqrt(sumSquares);

                if(k*k == sumSquares && k <= n){
                    count += 2;
                }
            }
        }
        return count;
    }
}