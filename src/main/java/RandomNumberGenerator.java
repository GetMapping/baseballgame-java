import java.util.Random;

public class RandomNumberGenerator {
    RandomNumberGenerator() {

    }

    public int generator() {
        Random random = new Random();
        int[] randomNumber = random.ints(1, 9)
                .distinct()
                .limit(3)
                .toArray();
        return randomNumber[0] * 100 + randomNumber[1] * 10 + randomNumber[2];
    }
}
