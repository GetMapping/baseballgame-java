import java.util.Scanner;

public class Game {
    private static final Scanner SCANNER = new Scanner(System.in);

    private final RandomGenerator generator;

    public Game(RandomGenerator generator) {
        this.generator = generator;
    }

    public void run() {
        InputNumberCheck inputNumberCheck = new InputNumberCheck();
        StrikeBallCheck strikeBallCheck = new StrikeBallCheck();

        int randomNumber = generator.generate();

        while (true) {
            String inputNumber = SCANNER.next();
            if (Integer.parseInt(inputNumber) == randomNumber) {
                System.out.println("You win!");
                break;
            }
            if (inputNumberCheck.numberCheck(inputNumber)) {
                strikeBallCheck.printResult(randomNumber, inputNumber);
            }
        }
    }
}
