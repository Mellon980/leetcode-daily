class Solution {
    public String simplifyPath(String path) {
      List<String> stk=new ArrayList<>();
      for(String s:path.split("/")){
        if(s.isEmpty()||s.equals(".")){
            continue;
        }
        if(!s.equals("..")){
            stk.add(s);
        }else if(!stk.isEmpty()){
            stk.removeLast();
        }
      }  
      return "/"+String.join("/",stk);
    }
}