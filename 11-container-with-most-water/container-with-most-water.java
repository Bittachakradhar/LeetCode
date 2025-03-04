class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int res=0;
        while(i<j){
            if(height[i]>=height[j]){
                int cres=height[j]*(j-i);
                if(cres>res){
                    res=cres;
                }
                j--;
            }
            else{
               int cres=height[i]*(j-i);
               if(res<cres){
                res=cres;
               }
               i++;
            }
        }
        return res; 
    }
}