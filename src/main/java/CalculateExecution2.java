public class CalculateExecution2 implements Calculate{
    @Override
    public String printName() {
        return "Tinh toan cach 2";
    }

    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
