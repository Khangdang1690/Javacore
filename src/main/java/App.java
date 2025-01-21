import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
//        Person person1 = new Person();
//        person1.setFirstName("John");
//        person1.setLastName("Doe");
//        List<Person.Address> addresses = new ArrayList<Person.Address>();
//
//        Person.Address address1 = new Person.Address();
//        address1.setCity("Ha Noi");
//        address1.setState("Hanoi");
//        address1.setStreet("Pham Van Dong");
//        addresses.add(address1);
//
//        Person.Address address2 = new Person.Address();
//        address2.setCity("Sai Gon");
//        address2.setState("Sai Gon");
//        address2.setStreet("Vo Nguyen Giap");
//        addresses.add(address2);
//
//        person1.setAddress(addresses);
//        System.out.println(person1.getAddress().toString());
//        Person person2 = new Person(1l, "Tay", "Java");
//
//        System.out.println(person1);
//        System.out.println("================");
//        System.out.println(person2);

//        Employee employee = new Employee();
//        employee.setId(10l);
//        employee.setFirstName("Nhan vien A");
//
//        System.out.println(employee.toString());

//        SampleClass sampleClass = new SampleClass();
//        sampleClass.foo();
//        String name = sampleClass.name;
//        System.out.println(name);
        Product product = new Product();
        System.out.println(product);

    }
    private static class Product {
        private int id;
        private String name;
        private BigDecimal price;
        private float quantity;
        private float weight;
        private double amount;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public float getQuantity() {
            return quantity;
        }

        public void setQuantity(float quantity) {
            this.quantity = quantity;
        }

        public float getWeight() {
            return weight;
        }

        public void setWeight(float weight) {
            this.weight = weight;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", quantity=" + quantity +
                    ", weight=" + weight +
                    ", amount=" + amount +
                    '}';
        }
    }
}
