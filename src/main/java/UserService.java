public class UserService implements SampleInterface, EmployeeInterface {
    @Override
    public void getName() {
        System.out.println(name);
    }

    @Override
    public void sayHello() {

    }
}
