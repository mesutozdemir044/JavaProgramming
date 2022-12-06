package day20_Arrays;

public class taskunique {
    public static void main(String[] args) {
        String [] words={"ali","ayse","ali","ayse","mesut"};

        for (int j = 0; j < words.length ; j++) {
            String element=words[j];
            int frequency=0;

            for (int i = 0; i < words.length ; i++) {
                if(words[i].equals(element)){
                    frequency++;

        }}if(frequency==1) {
                    System.out.println(element);
                }


            }
        }
    }

