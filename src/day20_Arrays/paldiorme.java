package day20_Arrays;

public class paldiorme {
    public static void main(String[] args) {

       String[] words={"anna", "level", "Java"};
        int frq=0;

        for (String each:words ) {
            String res="";

            for (int i = each.length()-1; i >=0 ; i--) {
                res+=each.charAt(i);
                if(res.equals(each))
                    frq+=1;



            } System.out.println(res);

        }System.out.println(frq);


        /*
        4. write a program that can count how many palindromes in an array of
string
Ex:
{"anna", "level", "Java"};
output:
2
         */
    }
}
