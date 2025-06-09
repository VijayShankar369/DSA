class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();

        int i=0,j=0,count = 0;

        int[] freq = new int[3];

        while(j<n){
            freq[s.charAt(j) - 'a']++;

            while(freq[0]>= 1 && freq[1] >= 1 && freq[2] >= 1){
                count += (n-j);
                freq[s.charAt(i) - 'a']--;
                i++;
            }
            j++;
        }

        return count;
    }
}