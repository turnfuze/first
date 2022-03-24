package lessons;

import java.util.Scanner;

public class cycle {
    public static void cycle3() {
        for(int i = 1000; i < 10000; i +=3){
            System.out.println(i);
        }

    }

    public static void cycle4() {
        for(int i = 10; i > 0; i -=4){
            System.out.println(i);
        }
    }

    public static void factorial() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите факториал");
        if(scaner.hasNextInt()){
            int fact = scaner.nextInt();
            int start = 1;
            for(int i = 1; i <= fact; i++){
                start *= i;
            }
            System.out.println(start);
        }
    }
}
