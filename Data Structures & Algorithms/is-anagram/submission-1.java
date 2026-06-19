class Solution {
    public boolean isAnagram(String s, String t) 
    {
        boolean ans = false;
        char[] arr1 = s.toCharArray();
        Arrays.sort(arr1);
        String s1 = new String(arr1);

        char[] arr2 = t.toCharArray();
        Arrays.sort(arr2);
        String t1 = new String(arr2);

        if(s1.equals(t1))
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
