class Solution {
    public boolean isPalindrome(String s) {

        String cleaned = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                cleaned += Character.toLowerCase(ch);
            }
        }

        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }
}
    