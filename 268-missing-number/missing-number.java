class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
       int total=0;
       int arr=0;
       for(int i=0;i<=n;i++){
        total=total+i;
        }
        for(int i=0;i<=n-1;i++){
            arr=arr+nums[i];
        }
        return total-arr;
    }
}