public class SampleOverloading {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b;
    }

    public float add(float a, int b) {
        return a + b;
    }

    public float add(float a, float b, int c) {
        return a + b;
    }

    private String print() {
        return "Hello World";
    }
    private String print(String name) {
        return "Hello" + name;
    }
}
