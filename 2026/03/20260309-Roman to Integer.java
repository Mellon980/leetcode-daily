class Solution {
    private static final Map<Character,Integer> ROMAN=Map.of(
        'I', 1,
        'V', 5,
        'X', 10,
        'L', 50,
        'C', 100,
        'D', 500,
        'M', 1000
    );
    public int romanToInt(String S) {
        char [] s=S.toCharArray();
        int n=s.length;
        int ans=0;
        for(int i=0;i<n-1;i++){
            int x=ROMAN.get(s[i]);
            int y=ROMAN.get(s[i+1]);
            ans+=x<y?-x:x;
        }
        return ans+ROMAN.get(s[n-1]);
        
    }
}