import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        InputNumberCheck inputNumberCheck = new InputNumberCheck();
        StrikeBallCheck strikeBallCheck = new StrikeBallCheck();

        int randomNumber = randomNumberGenerator.generator();

        while (true) {
            String inputNumber = scan.next();
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
