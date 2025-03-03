class Solution {
    public int removeDuplicates(int[] nums) {
        int low=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[low]=nums[i];
                low++;
            }  
        }
        nums[low] = nums[nums.length - 1];
        low++;
        return low;
    }
}