public class Main {
    public static void main(String[] args) {
        RandomGenerator randomNumberGenerator = new RandomNumberGenerator();
        RandomGenerator anotherRandomNumberGenerator = new AnotherRandomNumberGenerator();
        Game game = new Game(anotherRandomNumberGenerator);
        game.run();
    }
}
