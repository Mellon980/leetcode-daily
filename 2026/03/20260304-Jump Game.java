class Solution {
    public boolean canJump(int[] nums) {
       int mx=0;
       for(int i=0;i<nums.length;i++){
        if(i>mc){
            return false;

        }
        mx=Math.max(mx,i+nums[i]);
       }
       return true;

    }
}