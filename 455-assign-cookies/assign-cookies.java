class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);  // Sort greed factors
        Arrays.sort(s);  // Sort cookie sizes
        
        int i = 0; // child index
        int j = 0; // cookie index
        int count = 0; // satisfied children count

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) { // if cookie satisfies the child
                count++;
                i++; // move to next child
            }
            j++; // move to next cookie
        }

        return count;
    }
}
