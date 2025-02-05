package International;

public class TestSay3 implements Say{
    @Override
    public void say(String message) {
        System.out.println(message);
    }

    @Override
    public void doit() {
        System.out.println("Do nothing");
    }
}
