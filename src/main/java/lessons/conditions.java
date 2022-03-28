package lessons;

import java.util.Scanner;

public class conditions {
    private static Object DecimalFormat;

    public static void length(){
        Scanner scanner = new Scanner(System.in);
        boolean sm = false;
        boolean in = false;
        boolean f = true;
        while (f){
            System.out.println("Введите '1' если нужно перевести сантиметры в дюймы");
            System.out.println("Введите '2' если нужно перевести дюймы в сантиметры");
            if (scanner.hasNextInt()){
                int typeOfLength = scanner.nextInt();
                if (typeOfLength == 1){
                    sm=true;
                    f=false;
                }else if(typeOfLength == 2) {
                    in = true;
                    f=false;
                }
                break;
            }
        }
        while (true)   {
            System.out.println("Введите число которое нужно перевести");
            if (scanner.hasNextFloat()){
                float value = scanner.nextInt();
                if (sm){
                    System.out.println(value/2.54);
                    break;
                }else if(in) {
                    System.out.println(value * 2.54);
                    break;
                }else{
                    System.out.println("Это не должно было случиться))");
                    System.out.println("Сообщите мне о баге:)");
                }
            }
        }
        scanner.close();
    }

    private static void vasya(){
        float vasyaMoney = 0;
        float parantsMoney = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько заработал Вася: ");
        if (scanner.hasNextFloat()){
            vasyaMoney = scanner.nextInt()/28;
            System.out.println();
            System.out.printf("У Васи %.2f", vasyaMoney, "€");
        }
        System.out.println();
        System.out.println("Введите сколько дали родители: ");
        if (scanner.hasNextFloat()){
            parantsMoney = scanner.nextInt()/28;
            System.out.println();
            System.out.printf("Родители дали %.2f", parantsMoney, "€");
        }
        float all =parantsMoney+vasyaMoney;
        System.out.println();
        System.out.printf("Всего у Васи: %.2f", all, "€");
        scanner.close();
    }

    public static void conversely() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input > 9 && input < 100){
            int a = input % 10;
            input /=10;
            int b = input %=10;
            System.out.println(a + " " + b);
        }
        scanner.close();
    }

    public static void sum() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input > 9 && input < 100){
            int a = input % 10;
            input /=10;
            int b = input *=10;
            System.out.println(b + "+" + a);
        }
        scanner.close();
    }

    public static void weight() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input > 9 && input < 100){
            int a = input % 10;
            input /=10;
            int b = input %=10;
            System.out.println(a + b);
        }
        scanner.close();
    }

    public static void moreOrSmaller() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == 0){
            System.out.println(" Your entered number is '0'");
        }else if(input > 0){
            System.out.println("Ваше число положительное");
        }else {
            System.out.println("Ваше число отрицательное");
        }
        scanner.close();
    }

    public static void decreaseBy1() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input > 99){
            input--;
            System.out.println(input);
        }
    }

    public static void derivative() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите двух значное число");
        int input = scanner.nextInt();
        int derivative = 0;
        if (input > 9 && input < 100) {
            int a = input % 10;
            int c = input/10;
            int b = c% 10;
            derivative = a * b;
        }
        if (input > derivative){
            System.out.println(input);
        }else if (derivative > input){
            System.out.println(derivative);
        } else if (input > 100 || input < 9){
            System.out.println("Ваше число не двухзначное!");
        }
    }

    public static void parityDegree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите  число");
        if(scanner.hasNextInt()) {
            int input = scanner.nextInt();
            int count = input;
            int i = 0;
            int calc = input;
            while (count>0){
                calc = count % 10;
                count /=10;
                if (calc%2==0){
                    i++;
                }
            }
        System.out.println("Степень четности числа: " + input + " равна " + i);
        }
    }
}
