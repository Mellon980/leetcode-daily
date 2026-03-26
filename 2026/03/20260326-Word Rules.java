class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[]words=s.split(" ");
        char [] charP=pattern.toCharArray();
        if(words.length != charP.length) return false;
        Map<Character,String> map1=new HashMap<>();
        Map<String,Character> map2=new HashMap<>();
      for(int i=0;i<pattern.length();i++){
        if(!map1.containsKey(charP[i])){
            map1.put(charP[i],words[i]);
        }
        if(!map2.containsKey(words[i])){
            map2.put(words[i],charP[i]);
        }
        if(!map1.get(charP[i]).equals(words[i])||!map2.get(words[i]).equals(charP[i])){
            return false;
        }
      }
      return true;
    }
}