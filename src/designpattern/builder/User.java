package designpattern.builder;

public class User {
    private String name;
    private int age;

    private User(UserBuilder builder){
        this.name = builder.name;
        this.age = builder.age;
    }

    public static class UserBuilder{
        private String name;
        private int age;

        public UserBuilder(String name){
            this.name = name;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;
        }

    }

    public static void main(String[] args) {
        User user = new UserBuilder("Akash").age(30).build();
    }
}
