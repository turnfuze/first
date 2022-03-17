public class test {
    public static void count(String str){
        int num =0;
        str="aaaabcdefgh";
        String str2 =null;
        for(int i=0;i<str.length();i++){
            char cha1 = str.charAt(i);
///			System.out.println(cha1);
            for(int j=0;j<=i;j++){
                char cha2 = str.charAt(j);
                if(cha1==cha2){
///					System.out.println(cha2);
                    num++;
                }
                if(j==i){
                    System.out.println (cha1 + "номер:" + num);
                }
            }

            num =0;

            String word = "aaabb";

            for (int k = 0; k < word.length(); k++) {
                char charPrevious = word.charAt(k);
                //System.out.println(charPrevious);
                for (int j = 0; j <= k; j++) {
                    char charNext = word.charAt(j);
                    if (charPrevious == charNext) {
                        //System.out.println(charNext);
                        num++;
                    }
                }
                System.out.println(num + charPrevious);
        }

    }
}}
