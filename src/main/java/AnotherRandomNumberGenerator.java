import java.util.Random;

public class AnotherRandomNumberGenerator implements RandomGenerator {

    public int generate() {
        Random random = new Random();
        int[] randomNumber = random.ints(1, 9)
                .distinct()
                .limit(3)
                .toArray();
        return randomNumber[0] * 100 + randomNumber[1] * 10 + randomNumber[2];
    }
}
