package BuilderPattern;

public class Dog {

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", age=" + age +
                '}';
    }

    private Dog(Builder builder){
        this.name = builder.name;
        this.owner = builder.owner;
        this.age = builder.age;
    };

    private String name;
    private String owner;
    private int age;

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getAge() {
        return age;
    }

    public static class Builder{
        private String name;
        private String owner;
        private int age;

        public Builder age(int age){
            this.age = age;
            return this;
        };

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder owner(String owner){
            this.owner = owner;
            return this;
        }

        public Builder(){};

        public Dog build(){
            return new Dog(this);
        }
    }
}
