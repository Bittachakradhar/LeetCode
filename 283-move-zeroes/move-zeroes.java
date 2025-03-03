class Solution {
    public void moveZeroes(int[] nums) {
        int arr[]=new int[nums.length];
        int low=0;
        Arrays.fill(arr,0);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr[low]=nums[i];
                low++;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
    }
}