package International;

public interface Doable{
    default void doit() {
        System.out.println("I do something");
    };
}
