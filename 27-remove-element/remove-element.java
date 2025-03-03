class Solution {
    public int removeElement(int[] nums, int val) {
        int low=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[low]=nums[i];
                low++;
            }
        }
        return low;
    }
}