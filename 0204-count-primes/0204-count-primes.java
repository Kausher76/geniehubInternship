class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] isComposite = new boolean[n];
        isComposite[0] = true;
        isComposite[1] = true;

        for (int i = 2; i * i < n; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j < n; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        int count = 0;
        for (boolean isComp : isComposite) {
            if (!isComp) {
                count++;
            }
        }

        return count;
    }
}

