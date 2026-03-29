class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> idx=new HashMap<>();
      for(int j=0;;j++){
        int x=nums[j];
        if(idx.containsKey(target-x)){
            return new int []{idx.get(target-x),j};
        }
        idx.put(x,j);
      }
    }
}