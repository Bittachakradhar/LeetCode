class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int count2=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) count++;
            else{
                count=1;}
            if(count<3){
                nums[count2]=nums[i];
                count2++;
            }
        }
        return count2;
    }
}