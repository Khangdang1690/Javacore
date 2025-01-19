public abstract class SampleAbstractClass implements SampleInterface {

    public SampleAbstractClass() {

    }

    public abstract void sayHello();

    public int calculate(int a, int b) {
        return a + b;
    }

    public static void sayGoodBye() {
        System.out.println("Bye!");
    }

    public final void noChangeBody() {
        System.out.println("...");
    }
}
