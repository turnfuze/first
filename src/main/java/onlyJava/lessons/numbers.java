package onlyJava.lessons;

import java.util.Random;

public class numbers {
    public static int random(int max) {
        Random random = new Random();
        int x = random.nextInt(max);
        return x;
    }
}
