package Exception;
import java.util.ArrayList;
import java.util.List;

public class Side {
    public static void main(String[] args) {
        Side m = new Side();
        List<User> userList = m.getUser();

        userList.stream().filter(user ->
            user.getGender().equals(Gender.male)
        ).forEach(System.out::println);

        List<String> address =  userList.stream().filter(user -> user.getGender().equals(Gender.female)).map(User::getAddress).distinct().toList();
        System.out.println(address);

        String s = " abc.  ";
        System.out.println(s);
        System.out.println(s.stripLeading());
        System.out.println(s.stripTrailing());
//        for (User user: userList) {
//            if (user.gender.equals(Gender.male)) {
//                System.out.println(user.username);
//            }
//        }
    }

    List<User> getUser(){
        return List.of(new User(1l, "username-1", "password", Gender.male, "Hanoi"),
                new User(2l, "username-2", "password", Gender.female, "Hue"),
                new User(3l, "username-3", "password", Gender.female, "Danang"));
    }
    class User {
        Long id;
        String username;
        String password;
        Gender gender;
        String address;

        public User() {
        }

        public User(Long id, String username, String password, Gender gender, String address) {
            this.id = id;
            this.username = username;
            this.password = password;
            this.gender = gender;
            this.address = address;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Gender getGender() {
            return gender;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "User{" +
                    "username='" + username + '\'' +
                    '}';
        }
    }
    enum Gender {
        male, female, other
    }
}
