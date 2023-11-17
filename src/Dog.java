public class Dog extends Mammal {
    public Dog() {
    }

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Dog(String name) {
        super(name, 0, 0);
    }



    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}