class Solution {
    public int commonFactors(int a, int b) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        int min = (a > b) ? b : a;
        for(int i = 1; i < (min + 1); i++) {
            if((a % i) == 0 && (b % i) == 0 ) {
                arrlist.add(i);
            }
        }
        return arrlist.size();
    }
}