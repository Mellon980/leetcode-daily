class Solution {
    public int lengthOfLongestSubstring(String s) {
       char[] arr=s.toCharArray();
       int n=s.length();
       int ans=0;
       int left=0;
       int []cnt=new int [128];
       for(int right=0;right<n;right++){
        cnt[arr[right]]++;
        while(cnt[arr[right]]>1){
           cnt[arr[left]]--;
            left++;
        }
         ans=Math.max(ans,right-left+1);
       }
       return ans;
    }
}