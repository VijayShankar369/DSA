class Solution {
    public List<Integer> findAnagrams(String s, String p) {
         List<Integer> result = new ArrayList<>();
        int sLen = s.length();
        int pLen = p.length();

        if(sLen < pLen){
            return result;
        }

        int[] pCount = new int[26];
        int[] window = new int[26];

        for(int i=0;i<pLen;i++){
            pCount[p.charAt(i)-'a']++;
            window[s.charAt(i)-'a']++;
        }

        if(Arrays.equals(pCount,window)){
            result.add(0);
        }

        for(int i=pLen;i<sLen;i++){
            window[s.charAt(i-pLen) - 'a']--;
            window[s.charAt(i) - 'a']++;

            if(Arrays.equals(pCount,window)){
                result.add(i-pLen+1);
            }
        }
        return result;
    }
}