class Solution {
    public boolean isAnagram(String s, String t) {
       int []cntS=new int [26];
       for(char c:s.toCharArray()){
        cntS[c-97]++;
       } 
       int []cntT=new int [26];
       for(char c:t.toCharArray()){
        cntT[c-97]++;
       }
       return Arrays.equals(cntS,cntT);
    }
}