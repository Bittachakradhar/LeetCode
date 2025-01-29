class Solution {
    public boolean isPerfectSquare(int num) {
        int low=0,high=num;
        while(low<=high){
            int mid=low+(high-low)/2;
            long sum= (long) mid*mid;
            if(sum==num){
                return true;
            }
            else if(sum<num){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}