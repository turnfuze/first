package onlyJava.lessons;

public class variable {
     private static void variable() {

        byte $byte = 127;
        System.out.println($byte);
        short $Short = 32685;
        System.out.println($Short);
        int $int = 1234567891;
        System.out.println($int);
        long $long = 123456789123456789L;
        System.out.println($long);
        float $float = 1254.123456789F;
        System.out.println($float);
        double $double = 1234567890123.1234567890123456;
        System.out.println($double);
        char $char = 'a';
        System.out.println($char);
        String $string = "Hello world";
        System.out.print($string);
        System.out.println($byte);

        byte toConvert = 125;
        System.out.println(toConvert);
        short toConvertShort = toConvert;
        System.out.println(toConvert + " - byte");
        System.out.println(toConvertShort + " - short");
        int toConvertInt = toConvertShort;
        System.out.println(toConvertShort + " - short");
        System.out.println(toConvertInt + " - int");
        long toConvertLong = toConvertInt;
        System.out.println(toConvertInt + " - int");
        System.out.println(toConvertLong + " - long");
        float toConvertFloat = toConvert;
        System.out.println(toConvertFloat + " - float");
        char toConvertChar = (char) toConvertFloat;
        System.out.println(toConvertFloat + 1.25 + " - float");
        System.out.println(toConvertChar + " - float = 125.0");
        toConvertFloat +=1.25;
        toConvertChar = (char) toConvertFloat;
        System.out.println(toConvertChar + " - float = 126.25");
        toConvertFloat += .25;
        toConvertChar = (char) toConvertFloat;
        System.out.println(toConvertChar + " - float = 126.5");
        double toConvertDouble = toConvertFloat + 0.21651;
        System.out.println(toConvertDouble + " - double");

        toConvertFloat= (float) toConvertDouble;
        System.out.println(toConvertFloat + " float = double");
        toConvertLong = (long) toConvertFloat;
        System.out.println(toConvertLong + " float = long");
        toConvertInt = (int)toConvertLong;
        System.out.println(toConvertInt + " int = long");
        toConvertShort = (short) toConvertChar;
        System.out.println(toConvertInt + " short = char");
        char char1 = 'G';
        char char2 = 'g';
        char char3 = '5';
        toConvertDouble = char1;
        toConvertShort = (short)char2;
        toConvertInt = char3;
        toConvertLong = char1;
        toConvert = (byte) char3;
        System.out.println(toConvertDouble + " - double = 'G' ");
        System.out.println(toConvertShort + " - short = 'g' ");
        System.out.println(toConvertInt + " - int = '5' ");
        System.out.println(toConvertLong + " - long = 'G' ");
        System.out.println(toConvert + " - byte = '5' ");



        int coin = 0;
        int number = 0;
        number += 1;
        System.out.println(number);
        ++number;
        System.out.println(number);
        coin =  number * 2;
        System.out.println(coin);
        coin ^= 5;
        System.out.println(coin);


        boolean q = number>=coin||coin>10&&number<10;
        System.out.println(q + "boolean");

        int i =105;
        i %=10;
        System.out.println(i+" i");
        i = 194 % 2;
        System.out.println(i);
        i = 154 % 10;
        System.out.println(i);
        i = 155 % 5;
        System.out.println(i);

    }
}
