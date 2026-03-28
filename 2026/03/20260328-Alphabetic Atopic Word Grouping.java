class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,List<String>> m=new HashMap<>();
        for(String s:strs){
            char[]sortedS=s.toCharArray();
            Arrays.sort(sortedS);
            m.computeIfAbsent(new String(sortedS),_ ->new ArrayList<>()).add(s);
        }
        
        return new ArrayList<>(m.values());
    }
}