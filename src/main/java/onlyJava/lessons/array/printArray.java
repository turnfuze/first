package onlyJava.lessons.array;

public class printArray {
    public static void line(int x[]) {
        for (int i : x) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void column(int x[]) {
        for (int i : x) {
            System.out.println(i);
        }

    }

    public static void endToStart(int array[], int lengthArray, String type) {
        switch (type) {
            case ("SPACE"):
                for (int i = lengthArray-1; i >= 0; i--) {
                    System.out.print(array[i]);
                    System.out.print(" ");
                }
                break;
            case ("ENTER"):
                for (int i = lengthArray-1; i >= 0; i--) {
                    System.out.print(array[i]);
                    System.out.println();
                }
        }
    }

    public static void comparison(int x,int y) {
        if(x>y){
            System.out.println("The first array is greater than the second");
        }else if (y>x){
            System.out.println("The second array is greater than the first");
        }else {
            System.out.println("The first and second array are equal");
        }

    }
}
