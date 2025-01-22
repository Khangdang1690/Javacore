package Array;

public class SingleDimensionalArray {
    public static void main(String[] args) {

        int arr[] = new int[3];// định nghĩa và tạo array

        arr[0] = 13; // gán phần từ vào mảng
        arr[1] = 49;
        arr[2] = 77;

        // Duyệt mảng
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Mảng string
        String arrS[] = {"A", "B", "C", "D"};
        for (String s : arrS) {
            System.out.println(s);
        }

        //declaration, instantiation and initialization
        int xArr[] = {1, 3, 7};

        // in mảng bằng foreach
        for (int i : xArr) {
            System.out.println(i);
        }
    }
}
