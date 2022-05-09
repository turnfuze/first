package onlyJava.lessons.string;

import static onlyJava.lessons.scaner.input.*;

public class getInfo {
    public static char lastChar() {
        String phrase = enterString();
        int number = phrase.length();
        char symbol = phrase.charAt(number - 1);
        return symbol;
    }
    protected static char lastChar(String phrase) {
        int number = phrase.length();
        char symbol = phrase.charAt(number - 1);
        return symbol;
    }

    public static boolean endWith () {
        String phrase = enterString();
        boolean symbol = phrase.endsWith("!!!");
        return symbol;
    }

    private static boolean endWith (String phrase) {
        boolean symbol = phrase.endsWith("!!!");
        return symbol;
    }

    public static boolean endWith (String phrase, String end) {
        boolean symbol = phrase.endsWith(end);
        return symbol;
    }

     static boolean startWith () {
        String phrase = enterString();
        boolean symbol = phrase.startsWith("I like");
        return symbol;
    }

    public static boolean startWith (String phrase) {
        boolean symbol = phrase.startsWith("I like");
        return symbol;
    }

    public static void startWith (String phrase, String start) {
        boolean symbol = phrase.startsWith(start);
        if (symbol == false) {
            System.out.println("Фраза " + phrase + " не начинается на: " + start);
        }else {
            System.out.println("Фраза " + phrase + " начинается на: " + start);
        }
    }

    public static String replaceSymbols(String string, char find, char replace){
        return string = string.replace(find,replace);
    }

    public static String replaceSymbols(char find, char replace){
        String string = enterString();
        return string = string.replace(find,replace);
    }

    public static String bigSymbols(String str){
        return str = str.toUpperCase();
    }

    public static String lowSymbols(String str){
        return str.toLowerCase();
    }
    private static void substring(String str){
        System.out.println(str);
    }
}
