package day20_Arrays;

public class charstask {
    public static void main(String[] args) {
        char[] alhabets = {'a', 'a', 'b', 'c', 'c'};
        for (int j = 0; j < alhabets.length; j++) {

            char ch = alhabets[j];
            int frequency = 0;
            for (int i = 0; i < alhabets.length; i++) {
                if (alhabets[i] == ch) {
                    frequency++;
                }
            }

           if(frequency==1){
               System.out.println(ch);
           }
            
        }




       

    }
}