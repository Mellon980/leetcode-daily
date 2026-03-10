class Solution {
    public String longestCommonPrefix(String[] strs) {
       String s0=strs[0];
       for(int j=0;j<s0.length();j++){
        char c=s0.charAt(j);
        for(String s:strs){
                            if (j == s.length() || s.charAt(j) != c) { // 这一列有字母缺失或者不同
                    return s0.substring(0, j); // 0 到 j-1 是公共前缀
                }
        }
       } 
       return s0;
    }
}