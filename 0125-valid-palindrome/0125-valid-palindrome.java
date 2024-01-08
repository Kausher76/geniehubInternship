class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] charArray = s.toCharArray();

        int low = 0;
        int high = charArray.length - 1;

        while (low <= high) {
            if (charArray[low] == charArray[high]) {
                low++;
                high--;
            } else {
                return false;
            }
        }

        return true;
    }
}
