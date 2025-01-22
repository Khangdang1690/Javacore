package Array;

public class CloneTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] originalArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Clone mảng
        int[][] clonedArray = originalArray.clone();

        // In mảng gốc
        System.out.println("Mảng gốc: ");
        for (int[] row : originalArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Thay đổi giá trị trong mảng gốc
        originalArray[0][0] = 100;

        System.out.println("\nSau khi thay đổi mảng gốc:");
        System.out.println("Mảng gốc: ");
        for (int[] row : originalArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("Mảng clone: ");
        for (int[] row : clonedArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
