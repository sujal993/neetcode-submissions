class Solution {
    public boolean isAnagram(String s, String t) 
    {
        boolean ans = false;
        char[] arr1 = s.toCharArray();  // Convert to char array
        Arrays.sort(arr1);              // Sort the characters
        String s1 = new String(arr1); // Convert back to String

         char[] arr2 = t.toCharArray();  // Convert to char array
        Arrays.sort(arr2);              // Sort the characters
        String s2 = new String(arr2); // Convert back to String

        if(s1.equals(s2))
        {
            ans = true; 
        }
        else
        {
            ans = false;
        }
        return ans;

    }
}
