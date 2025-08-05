class Solution {
    public int countHomogenous(String s) {
        int n = s.length();
        int left = 0;
        int right = 0;
        long result = 0;
        int mod = (int)Math.pow(10,9)+7;
        
        while(right<n){
            if(s.charAt(left) == s.charAt(right)){
                right++;
            }
            else{
                long sum = right - left;

                sum=func(sum)%mod;
                System.out.println(sum);

                result += sum;
                result%=mod;

                left = right;
            }
            System.out.println(left+" "+right);
        }
        long sum = right - left;
        sum=func(sum)%mod;
        result += sum;
        result%=mod;


        return (int)result;
    }

    private long func(long sum){
        if(sum == 1){
            return 1L;
        }
        
        return sum + func(sum-1);
    }
}