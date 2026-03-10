class Solution {
    public String convert(String s, int numRows) {
        int n=s.length();
        int r=numRows;
        if(r==1||r>=n){
            return s;
        }
        int t=2*r-2;
        int c = (n + t - 1) / t * (r - 1);
        char[][]mat=new char[r][c];
        for(int i=0,x=0,y=0;i<n;i++){
            mat[x][y]=s.charAt(i);
            if(i%t<r-1){
                ++x;
            }else{
                --x;
                ++y;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(char[]row:mat){
            for(char ch:row){
                if(ch!=0){
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}