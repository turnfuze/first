package string;

public class stringProcessing {
    public static void countSumChars(String[] data) {
        String theWord = "";
        String theWord2 = "";
        int score = 0;

        for (String word : data) {
            int scoreWord = 0;
            String oneWord = word;
            for (int i = 0; i <= word.length(); i++) {
                for (int j = i; j <= word.length(); j++) {
                    if (j < word.length() && i < word.length()) {
                        if (word.charAt(i) == word.charAt(j)) {
                            scoreWord++;
                            j = word.length() + 1;
                        }
                    }
                }
                if (scoreWord > score) {
                    theWord = oneWord;
                    score = scoreWord;
                }
            }
        }
            System.out.println("Слово " + theWord + " имеет больше всего повторяющихся символов в количестве: "+  score);
    }
}
