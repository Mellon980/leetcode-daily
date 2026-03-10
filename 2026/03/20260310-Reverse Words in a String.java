class Solution {
    public String reverseWords(String s) {

        StringBuilder ans = new StringBuilder();
        int n = s.length() - 1;

        while (n >= 0 && s.charAt(n) == ' ') {
            n--;
        }
        int m = n; 

        while (n >= 0) {
            while (n >= 0 && s.charAt(n) != ' ') {
                n--;
            }
            ans.append(s.substring(n + 1, m + 1)).append(" ");

            while (n >= 0 && s.charAt(n) == ' ') {
                n--;
            }
            m = n;
        }

        if (ans.length() > 0) {
            return ans.substring(0, ans.length() - 1);
        }
        return "";
    }
}