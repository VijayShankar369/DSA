class Solution {
    public boolean repeatedSubstringPattern(String s) {
       String concatination = s+s;

       String result = concatination.substring(1,concatination.length()-1);

       return result.contains(s);
    }
}