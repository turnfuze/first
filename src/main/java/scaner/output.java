package scaner;

public class output {
    public static void listOfStutence(String name, int ocenka, String predmet) {
        String sout = "Студент                                                  ";
        String x = String.valueOf(ocenka);
        StringBuffer str = new StringBuffer(sout);
        str.setLength(52);

        str.replace(8,23,name);
        str.replace(24,32, " получил ");
        str.replace(33, 35, x);
        str.replace(36,40, " по ");
        str.replace(41,51,predmet);


        System.out.println(str);

    }

    public static void listOfStutence(String[] data) {
        String sout = "Студент ";
        StringBuffer str = new StringBuffer(sout);
        str.setLength(55);

        int x = data.length;
        if(x<3){
            System.out.println("Вы ввели не все данные");
        }else {
            str.replace(8,23,data[0]);
            str.replace(24,32, " получил ");
            str.replace(33, 35, data[1]);
            str.replace(36,40, " по ");
            str.replace(41,51,data[2]);

            System.out.println(str);
        }
    }
}
