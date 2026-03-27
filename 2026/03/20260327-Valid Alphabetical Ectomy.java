class Solution {
    public boolean isAnagram(String s, String t) {
       int []cntS=new int [26];
       for(char c:s.toCharArray()){
        cntS[c-'a']++;
       } 
       int []cntT=new int [26];
       for(char c:t.toCharArray()){
        cntT[c-'a']++;
       }
       return Arrays.equals(cntS,cntT);
    }
}