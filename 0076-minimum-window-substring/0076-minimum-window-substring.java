class Solution {

    boolean sahi(int have, int needed) {
        return have == needed;
    }

    public String minWindow(String s, String t) {

        int[] freq = new int[128];

        int needed = t.length();
        int have = 0;

        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i)]++;
        }

        int low = 0;

        int len = Integer.MAX_VALUE;
        int start = 0;

        for (int high = 0; high < s.length(); high++) {

            if (freq[s.charAt(high)] > 0) {
                have++;
            }

            freq[s.charAt(high)]--;

            while (sahi(have, needed)) {

                int currentlen = high - low + 1;

                if (currentlen < len) {
                    len = currentlen;
                    start = low;
                }

                freq[s.charAt(low)]++;

                if (freq[s.charAt(low)] > 0) {
                    have--;
                }

                low++;
            }
        }

        if (len == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + len);
    }
}