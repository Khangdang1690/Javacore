package Testtostring;

class Pearson {
    String name;
    int age;

    Pearson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() { // ✅ Overriding toString()
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        Pearson p = new Pearson("Alice", 25);
        System.out.println(p); // Implicitly calls p.toString()
        System.out.println(p.toString()); // Explicit call
        System.out.println(p);
    }
}
