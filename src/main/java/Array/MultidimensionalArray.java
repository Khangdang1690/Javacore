package Array;

public class MultidimensionalArray {
    public static void main(String[] args) {

        int[][] xArr = new int[3][3]; // 3 = row and 3 = column

        xArr[0][0] = 1;
        xArr[0][1] = 2;
        xArr[0][2] = 3;

        xArr[1][0] = 4;
        xArr[1][1] = 5;
        xArr[1][2] = 6;

        xArr[2][0] = 7;
        xArr[2][1] = 8;
        xArr[2][2] = 9;

        System.out.println("--- xArr ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(xArr[i][j]);
            }
            System.out.println();
        }

        int[][] yArr = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        System.out.println("--- yArr ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(yArr[i][j]);
            }
            System.out.println();
        }
    }
}
