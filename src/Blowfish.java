public class Blowfish extends Fish {
    public Blowfish() {
    }

    public Blowfish(String name, int age, double weight) {
        super(name, age, weight);
    }



    @Override
    public String toString() {
        return "Blowfish{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}