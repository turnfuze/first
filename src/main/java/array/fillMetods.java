package array;

public class fillMetods {
    public static int[] createArray(int start, int end, int step, int parity) {
        int x = 0;
        for (int i = start; i <= end; i += step) {
            x += 1;
        }
        int[] list = new int[x];
        System.out.println();
        x = 0;
        switch (parity) {
            case (1):
                for (int i = start; i <= end; i++) {
                    if (i % 2 != 0) {
                        list[x] = i;
                        x++;
                    }
                }
                break;
            case (2):
                for (int i = start; i <= end; i++) {
                    if (step % 2 == 0) {
                        if (i % 2 == 0) {
                            list[x] = i;
                            x++;
                        }
                    }
                }
                break;
        }
        return list;
    }

    public static int lengthArray(int array[]) {
        int lengthar = 0;
        for (int i : array) {
            lengthar += 1;
        }
        return lengthar;
    }

    public static int getSummArray(int[] array){
        int x = 0;
        int j = 0;
        for (int i : array){
            x += array[j];
            j++;
        }
        return x;
    }
}

