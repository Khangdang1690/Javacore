package Array;

public class CloneOneDimensionalArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        // Clone mảng
        int[] clonedArray = originalArray.clone();

        // In cả hai mảng
        System.out.println("Mảng gốc: ");
        for (int i : originalArray) {
            System.out.print(i + " ");
        }

        System.out.println("\nMảng clone: ");
        for (int i : clonedArray) {
            System.out.print(i + " ");
        }

        // Thay đổi giá trị trong mảng gốc và kiểm tra mảng clone
        originalArray[0] = 100;

        System.out.println("\n\nSau khi thay đổi mảng gốc:");
        System.out.println("Mảng gốc: ");
        for (int i : originalArray) {
            System.out.print(i + " ");
        }

        System.out.println("\nMảng clone: ");
        for (int i : clonedArray) {
            System.out.print(i + " ");
        }
    }
}
