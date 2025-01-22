package Array;

public class JaggedArray {
    public static void main(String[] args) {
        // Mảng 2 chiều
        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[5];
        arr[2] = new int[2];

        // Tạo mảng răng cưa
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = count++;

        // in ra mảng
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();//new line
        }
    }
}
