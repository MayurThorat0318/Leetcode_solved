class Solution {
    public boolean isPalindrome(String s) {
        String dup="";
        String temp = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        for(int i=temp.length()-1;i>=0;i--)
        {
            dup+=temp.charAt(i);
        }

        return temp.equals(dup);
    }
}