package onlyJava.lessons.string;

import java.util.Scanner;

public class stringMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        indexOf(str);
        strCharAt(str);
        codePointAt(str);
        contains(str);
    }

    public static void strCharAt(String str) {
        char chap = str.charAt(0);
        System.out.println("CharAt");
        System.out.println(chap);
        System.out.println(str.charAt(0)); //получаю символ по индексу
    }

    public static void codePointAt(String str) {
       int st = str.codePointAt(0);
       char ts = (char) st;
        System.out.println("Code point At");
        System.out.println(st + " - int");
        System.out.println(ts + "  - char"); // возвращает символ но индексу
    }

    public static void indexOf(String str) {
        System.out.println("Index Of");
        System.out.println(str.indexOf('f') +" indexOf"); // ищет значение в строке и возвращает индекс
        System.out.println(str.indexOf("fa")+" indexOf"); // ищет значение в строке и возвращает индекс
    }

    public static void contains(String str) {
        System.out.println("Contains");
        System.out.println(str.contains("sdf"));
        boolean a = str.contains(" ");                     // Ищет указаную строку в строке и возвращает булево значение
        System.out.println(a);
    }

    public static void delete(String str) {
        StringBuffer strb = new StringBuffer();
        int x = 0;
        int y = 0;
        strb.delete(x,y);
    }
}

