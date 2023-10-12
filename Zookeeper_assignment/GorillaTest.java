public class GorillaTest {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla(500);
        gorilla.throwSomething();
        gorilla.displayEnergy();
        gorilla.throwSomething();
        gorilla.displayEnergy();
        gorilla.throwSomething();
        gorilla.displayEnergy();

        gorilla.eatBananas();
        gorilla.displayEnergy();
        gorilla.eatBananas();
        gorilla.displayEnergy();

        gorilla.climb();
        gorilla.displayEnergy();
    }
}
