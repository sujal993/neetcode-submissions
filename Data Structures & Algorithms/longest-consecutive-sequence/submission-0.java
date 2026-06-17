class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Remove duplicates
        int j = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        // Number of unique elements = j + 1

        // Step 3: Find the longest consecutive sequence
        int current = 1;
        int max = 1;

        for (int i = 0; i < j; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                current++;
            } else {
                max = Math.max(max, current);
                current = 1;
            }
        }

        // Step 4: Final update
        max = Math.max(max, current);

        return max;
    }
}