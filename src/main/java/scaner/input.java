package scaner;

import java.util.Scanner;

public class input {
    public static int getInt() {
        System.out.println("Enter your first nuber: ");
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
}
