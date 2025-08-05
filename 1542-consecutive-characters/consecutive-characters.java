class Solution {
    public int maxPower(String s) {
        int left = 0;
        int right = 0;
        int n = s.length();
        int maxCount = 0;

        while (right < n) {
            while (right < n && s.charAt(left) == s.charAt(right)) {
                right++;
            }
            maxCount = Math.max(maxCount, right-left);
            left = right;
        }

        return maxCount;
    }
}
