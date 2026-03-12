class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        int n = words.length;
        for (int i = 0; i < n; ) {
            int start = i; 
            int sumLen = words[i].length(); 
            for (i++; i < n && sumLen + words[i].length() + 1 <= maxWidth; i++) {
                sumLen += words[i].length() + 1; 
            }

            int extraSpaces = maxWidth - sumLen; 
            int gaps = i - start - 1;

           
            if (gaps == 0 || i == n) {
                String row = join(words, start, i, " ") + " ".repeat(extraSpaces); 
                ans.add(row);
                continue;
            }

           
            int avg = extraSpaces / gaps;
            int rem = extraSpaces % gaps;
            String spaces = " ".repeat(avg + 1); 
            String row = join(words, start, start + rem + 1, spaces + ' ') + 
                    spaces + join(words, start + rem + 1, i, spaces);
            ans.add(row);
        }
        return ans;
    }

    private String join(String[] words, int start, int end, String sep) {
        return String.join(sep, Arrays.copyOfRange(words, start, end));
    }
}