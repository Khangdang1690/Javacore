public class CalculateExecution implements Calculate {
    @Override
    public String printName() {
        return "Tinh toan da hinh";
    }

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
