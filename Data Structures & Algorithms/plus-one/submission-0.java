class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the last digit
        for (int i = n - 1; i >= 0; i--) {
            // If the digit is less than 9, just add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If the digit is 9, it becomes 0 and carry moves left
            digits[i] = 0;
        }

        // If we reach here, all digits were 9
        int[] result = new int[n + 1];
        result[0] = 1;

        return result;
    }
}