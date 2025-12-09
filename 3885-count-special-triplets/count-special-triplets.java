class Solution{
    public int specialTriplets(int[] nums) {
        final int MOD = 1_000_000_007;
        int max = 0;

        // Find max element
        for (int x : nums) {
            if (x > max) {
                max = x;
            }
        }

        int maxVal = max * 2;
        int[] freqPrev = new int[maxVal + 1];
        int[] freqNext = new int[maxVal + 1];

        // Fill freqNext
        for (int x : nums) {
            freqNext[x]++;
        }

        long ans = 0;
        for (int x : nums) {
            freqNext[x]--;   // current element moves out of "right" side

            int t = x * 2;
            if (t <= maxVal) {
                ans = (ans + (long) freqPrev[t] * freqNext[t]) % MOD;
            }

            freqPrev[x]++;  // current element moves to "left" side
        }

        return (int) ans;
    }
}
