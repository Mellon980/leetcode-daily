class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map1=new HashMap<>();
        Map<Character,Character> map2=new HashMap<>();
        for(int i=0,j=0;i<s.length();i++,j++){
            char charS=s.charAt(i);
            char charT=t.charAt(j);
            if(!map1.containsKey(charS)){
                map1.put(charS,charT);
            }
            if(!map2.containsKey(charT)){
                map2.put(charT,charS);
            }
            if(map1.get(charS)!=charT||map2.get(charT)!=charS){
                return false;
            }
        }
        return true;
    }
}