public class Pigeon extends Bird {
    protected String species;

    public Pigeon() {
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }



    @Override
    public String toString() {
        return "Pigeon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", featherColor='" + featherColor + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}
