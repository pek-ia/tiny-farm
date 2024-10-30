public class Main {
    public static void main(String[] args) {
        Farm f = new Farm();
        f.add(new Dog("Bernie"));

        f.add(new Dog("Dmitri"));
        f.add(new Cat("Puddles"));
        f.add(new Dog("Max"));

        f.feedAnimals();
    }
}
