class Solution {
    public int lengthAfterTransformations(String s, int t) {
        long mod = 1000000007;
        long[] freq = new long[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t; i++) {
            long[] newFreq = new long[26];
            for (int j = 0; j < 26; j++) {
                if (j == 25) {
                    newFreq[0] = (newFreq[0] + freq[j]) % mod;
                    newFreq[1] = (newFreq[1] + freq[j]) % mod;
                } else {
                    newFreq[j + 1] = (newFreq[j + 1] + freq[j]) % mod;
                }
            }
            freq = newFreq;
        }
        long ans = 0;
        for (int i = 0; i < 26; i++) {
            ans = (ans + freq[i]) % mod;
        }
        return (int) ans;
    }
}
