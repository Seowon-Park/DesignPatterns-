package P4;

public class UserProfile {
    private String name;
    private Integer age;
    private String email;
    private String phone;
    private String address;

    private UserProfile(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public static class Builder {
        private String name;
        private Integer age;
        private String email;
        private String phone;
        private String address;

        public Builder(String name) {
            this.name = name;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder email(String email){
            this.email=email;
            return this;
        }

        public Builder phone(String phone){
            this.phone=phone;
            return this;
        }

        public Builder address(String address){
            this.address=address;
            return this;
        }

        public UserProfile build(){
            return new UserProfile(this);
        }
    }

    @Override
    public String toString(){
        return "UserProfile{"+
                "name="+name+
                ", age="+age+
                ", email='" + email +
                ", address='" + address +
                "}";
    }
}
