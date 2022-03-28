package lessons;
import lessons.array.fillMetods;
import lessons.array.printArray;

public class arraes {
    public static void listShow() {
        int[] x = fillMetods.createArray(2, 20, 2, 2);
        printArray.line(x);
        printArray.column(x);

    }


    public static void addNumbers() {
        int[] x = fillMetods.createArray(1, 99, 2, 1);
        int length = fillMetods.lengthArray(x);
        printArray.line(x);
        printArray.endToStart(x, length, "SPACE");
    }

    public static void twoArraes() {

        int numberFirst = numbers.random(5);
        int numberSecond = numbers.random(5);

        int[] arrayFirst = fillMetods.createArray(1,numberFirst,1,1);
        int[] arraySecond = fillMetods.createArray(1,numberSecond,1,1);

        printArray.line(arrayFirst);
        printArray.line(arraySecond);

        int firstArray = fillMetods.lengthArray(arrayFirst);
        int secondArray = fillMetods.lengthArray(arraySecond);

        System.out.println("Summ numbers in first array = " + fillMetods.getSummArray(arrayFirst));
        System.out.println("Summ numbers in second array = " + fillMetods.getSummArray(arraySecond));

        printArray.comparison(firstArray,secondArray);

    }
}
