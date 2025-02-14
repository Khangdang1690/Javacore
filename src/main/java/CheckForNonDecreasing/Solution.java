package CheckForNonDecreasing;

import java.util.* ;
import java.io.*;
public class Solution {
    public static boolean isPossible(int[] arr, int n) {
        int modifications = 0;
        for (int i = 1; i < n; i++) {
            // Check if the current pair is out-of-order.
            if (arr[i] < arr[i - 1]) {
                modifications++;
                if (modifications > 1) return false;

                // If we're at the beginning or modifying arr[i-1] doesn't break the previous order,
                // adjust arr[i-1] to arr[i].
                if (i == 1 || arr[i] >= arr[i - 2]) {
                    arr[i - 1] = arr[i];
                } else {
                    // Otherwise, adjust arr[i] to arr[i-1].
                    arr[i] = arr[i - 1];
                }
            }
        }
        return true;
    }
}
