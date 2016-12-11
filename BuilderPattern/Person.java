package BuilderPattern;

/**
 * Created by artur on 11.12.16.
 */
public class Person {

    private Person(Builder builder){
        this.firstName = builder.firstName;
        this.secondName = builder.secondName;
        this.age = builder.age;
    }

    private final String firstName;
    private final String secondName;
    private final int age;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public static class Builder{
        private String firstName;
        private String secondName;
        private int age;

        public Builder(String secondName){
            this.secondName = secondName;
        };

        public Builder firstname(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder secondname(String secondName){
            this.secondName = secondName;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Person build(){return new Person(this);}
    }

    @Override
    public String toString() {

        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}
