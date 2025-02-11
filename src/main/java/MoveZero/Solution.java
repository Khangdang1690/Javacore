package MoveZero;

/*
    Time complexity: O(N)
    Space complexity: O(1)

    Where 'N' is the input array 'A'.
*/
public class Solution {
    public static int[] moveZeros(int n, int []a) {
        int j = 0;
        // Move all the nonzero elements advance.
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[j++] = a[i];
            }
        }

        // Setting up the rest elements as a zero.
        for (; j < a.length; j++) {
            a[j] = 0;
        }
        return a;
    }
}
