class Solution {
    public int countHomogenous(String s) {
        int n = s.length();
        int left = 0;
        int right = 0;
        long result = 0;
        int mod = (int)Math.pow(10,9)+7;
        
        while(right<n){
            long sum=0;
            while(right<n && s.charAt(left) == s.charAt(right)){
                right++;
                sum+=(right-left);
            }
                result += sum%mod;
                result%=mod;
                left = right;
            }
            return (int)result;
            // System.out.println(left+" "+right);
        }


        
}