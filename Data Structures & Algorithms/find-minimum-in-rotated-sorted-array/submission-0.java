class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int m = l + (r - l) / 2;

            // If middle element is greater than the rightmost element,
            // the minimum must be in the right half.
            if (nums[m] > nums[r]) {
                l = m + 1;
            } else {
                // Otherwise, the minimum is at mid or in the left half.
                r = m;
            }
        }
        // l == r -> that’s the minimum element.
        return nums[l];
    }
}
