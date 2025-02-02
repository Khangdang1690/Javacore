package Exception;

public class Main {
    public static void main(String[] args) {
        Integer a = null;
        Integer b = 2;
        try {
            Integer ketqua = a * b;
            System.out.println(ketqua);
        } catch (NullPointerException e) {
            System.out.println("To null and not run");
        }
        System.out.println("run to e?");
    }

    static void print() {
        System.out.println("Aaaaaa");
        System.out.println("bbbbb");
    }
}
