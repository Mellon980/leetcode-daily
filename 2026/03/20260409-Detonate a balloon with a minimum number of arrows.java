class Solution {
    public int findMinArrowShots(int[][] points) {
       Arrays.sort(points,Comparator.comparingInt(p->p[1]));
       long pre=Long.MIN_VALUE;
       int ans=0;
       for(int[] p:points){
        if(p[0]>pre){
          ans++;
          pre=p[1];
        }
       }
       return ans;

    }
}