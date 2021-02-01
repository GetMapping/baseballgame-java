public class StrikeBallCheck {

    public void printResult(int randomNumber, String inputNumber) {
        int strikeCount = strikeCount(randomNumber, inputNumber);
        int ballCount = ballCount(randomNumber, inputNumber);

        if (strikeCount != 0 || ballCount != 0) {
            System.out.print(strikeCount + "strike ");
            System.out.println(ballCount + "ball");
        } else {
            System.out.println("out!");
        }
    }

    public int strikeCount(int randomNumber, String inputNumber) {
        int strikeCount = 0;

        String[] inputArray = inputNumber.split("");
        String[] randomArray = (String.valueOf(randomNumber)).split("");

        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i].equals(inputArray[i])) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    public int ballCount(int randomNumber, String inputNumber) {
        int ballCount = 0;

        String[] inputArray = inputNumber.split("");
        String[] randomArray = (String.valueOf(randomNumber)).split("");

        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < inputArray.length; j++) {
                if (randomArray[i].equals(inputArray[j]) && i != j) {
                    ballCount++;
                }
            }
        }
        return ballCount;
    }
}
