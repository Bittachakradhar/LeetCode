class Solution {
    public int maximumCount(int[] nums) {
        int res1 = countPositives(nums);
        int res2 = countNegatives(nums);
        return Math.max(res1, res2);
    }

    private int countPositives(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return nums.length - low;
    }

    private int countNegatives(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
