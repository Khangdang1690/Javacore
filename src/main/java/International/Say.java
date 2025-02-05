package International;

@FunctionalInterface
interface Say extends Doable{
    void say(String message);

    int hashCode();
    String toString();
    boolean equals(Object object);
}
