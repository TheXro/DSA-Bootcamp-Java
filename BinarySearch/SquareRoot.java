package BinarySearch;
class Solution  {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.mySqrt(4)); // 2
        System.out.println(s.mySqrt(8)); // 2
        System.out.println(s.mySqrt(9)); // 3
        System.out.println(s.mySqrt(10)); // 3
    }
    public int mySqrt(int x) {
        // Corner cases.
        if (x == 0 || x == 1) return x;

        // Find the number which square less than x.
        int y = x;
        while (true) {
            y = y / 2;
            if ((y * y) < 0 || (y * y) / y != y) continue; // handle int overflow
            if ((y * y) > 0 && (y * y) <= x) break;
        }

        // Result found.
        if (y * y == x) return y;

        // Search for result using difference of squares formula.
        int j = x - (y * y);
        while (true) {
            j = j - (y + y + 1);
            if (j >= 0) {
                y = y + 1;
            } else {
                break;
            }
        }

        return y;
    }
}