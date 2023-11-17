public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];

        animals[0] = new Dog("Riley", 4, 15.5);
        animals[1] = new Blowfish("Nemo", 1, 0.2);
        animals[2] = new Pigeon("Pingo", 2, 0.5, "Gray", " Pigeon");
        animals[3] = new Dog("Max");

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.eat();
            System.out.println("Voice: " + animal.getVoice());
            System.out.println();
        }
    }
}