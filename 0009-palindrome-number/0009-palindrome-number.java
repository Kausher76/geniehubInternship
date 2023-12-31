class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        int y = x;
        int rev = 0;
        int rem;
        while(y != 0) {
            rem = y % 10;
            rev =rev * 10 + rem;
            y = y / 10;
        }
        return rev == x;
    }
}