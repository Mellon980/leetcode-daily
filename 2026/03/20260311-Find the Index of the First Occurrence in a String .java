class Solution {
    public int strStr(String haystack, String needle) {
     int haylen=haystack.length();
     int needlen=needle.length();
     if(needlen==0){
        return 0;
     }
     if(haylen<needlen){
        return -1;
     }
     for(int i=0;i<=haylen-needlen;i++){
        String windowSub=haystack.substring(i,i+needlen);
        if(windowSub.equals(needle)){
            return i;
        }
     }
     return -1;
    }
}