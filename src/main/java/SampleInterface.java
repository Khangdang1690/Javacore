import java.time.LocalDate;

//functional interface -> sam
public interface SampleInterface {
    // declare constant fields
    String name = "Tay Java";

    // declare method that abstract
    void getName();

    void getBirthday();

    // default method
    default void printName() {
        System.out.println(name);
    }

    // static method
    static String getCurrentTime(){
        return String.valueOf(LocalDate.now());
    }
}
