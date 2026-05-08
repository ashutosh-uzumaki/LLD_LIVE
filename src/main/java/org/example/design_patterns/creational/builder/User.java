package org.example.design_patterns.creational.builder;

public class User {
    private final String name;
    private final String email;
    private final Integer age;
    private final String phone;

    private User(UserBuilder builder){
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.phone = builder.phone;
    }

    public static class UserBuilder{
        private String name;
        private String email;
        private Integer age;
        private String phone;

        UserBuilder(String name, String email){
            this.name = name;
            this.email = email;
        }

        public UserBuilder setAge(Integer age){
            this.age = age;
            return this;
        }

        public UserBuilder setPhone(String phone){
            this.phone = phone;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
