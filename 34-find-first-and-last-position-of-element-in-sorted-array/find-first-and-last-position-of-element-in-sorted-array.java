class Solution {
    public int[] searchRange(int[] nums, int target){
        int []res=new int[2];
        res[0]=first(nums,target);
        res[1]=last(nums,target);
        return res;
    }
    public int first(int[] nums,int target){
        int start=-1,end=-1,pot=-1;
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                high=mid-1;
                pot=mid;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return pot;
    }
    public int last(int[] nums,int target){
        int start=-1,end=-1,pot=-1;
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                low=mid+1;
                pot=mid;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return pot;
    }
}