package lessons.scaner;

import java.util.Scanner;

public class input {
    public static int getInt() {
        System.out.println("Enter your first number: ");
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            x = scanner.nextInt();
        }
        return x;
    }

    public static char getOperation(){
        System.out.println("Enter your operation: ");
        String x = null;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()){
            x = scanner.nextLine();
            System.out.println(x);
        }
        char retur = x.charAt(0);
        return retur;
    }

    public static int calc(int num1, int num2, char operation) {
        int equal = 0;
        switch (operation) {
            case '+':
                equal = num1 + num2;
                break;
            case '-':
                equal = num1 - num2;
                break;
            case '/':
                equal = num1 / num2;
                break;
            case '*':
                equal = num1 * num2;
                break;
            case 'x':
                equal = num1 * num2;
                break;
            }
        return equal;
    }

    public static String enterString() {
        Scanner scanner = new Scanner(System.in);
        String word = "";
        if (scanner.hasNextLine()){
            word = scanner.nextLine();
        }
        return word;
    }

    public static String[] inputStringToWordsArray() {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
//        data = data.concat(" ");
        String[] words = data.split(" ");
        return words;
    }

    public static int enterNumber(){
        Scanner scanner = new Scanner(System.in);
        int word = 0;
        if (scanner.hasNextInt()){
            word = scanner.nextInt();
        }
        return word;
    }
}
