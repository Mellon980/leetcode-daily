class Solution {
    public int hIndex(int[] citations) {
     int n=citations.length;
     int left=1;
     int right=n;
     while(left<=right){
        int mid=(left+right)>>>1;
        if(citations[n-mid]>=mid){
            left=mid+1;
        }else{
            right=mid-1;
        }
     }
     return right;
    }
}