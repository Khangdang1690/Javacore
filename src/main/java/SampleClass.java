public class SampleClass extends SampleFinalMethod{
    public void foo() {
        System.out.println("Welcome to Me");
    }

    public void addPerson() {
        Person person = new Person();
        person.setFirstName("John");
        person.getFirstName();
        // person.id this cannot be called because id is private
        // protected - same folder
    }
}
