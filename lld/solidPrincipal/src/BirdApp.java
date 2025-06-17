public class BirdApp {
    public static void main(String[] args) {
        Bird crow = new Crow(new CrowSparrowFly());
        Bird pigeon = new Pigeon(new NormallyFly());
        Bird ostrich = new Ostrich(new NoFly());
        Bird penguin = new Penguin(new NoFly());

        crow.makeSound();
        crow.performFly();

        ostrich.makeSound();
        ostrich.performFly();

        penguin.makeSound();
        penguin.performFly();
    }
}
