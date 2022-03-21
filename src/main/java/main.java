import static scaner.output.*;
import static scaner.input.*;
import static string.getInfo.*;
import static string.stringProcessing.*;

public class main {

    public static void main(String[] args) {
        //System.out.println(replaceSymbols('a', 'o'));
//        System.out.println(lowSymbols("Java"));
//        System.out.println(bigSymbols("Java"));
//        substring("I don't see different with sout method");

//          listOfStutence("123456789012345", 111, "1234567890");
//          listOfStutence("2153", 12, "165");

//        while (true) {
//            System.out.println("Введите Фамилию оценку и предмет в одной строке");
//            String[] data = inputStringArray();
//            listOfStutence(data);
//        }

        System.out.println("Слово с минимальным числом символов");
        System.out.println("Введите ряд слов");
        String[] words = inputStringToWordsArray();
        countSumChars(words);


    }
}