package day21;

public class githab1 {
    public static void main(String[] args) {
      String[] names=  {"anna", "level", "Java"};

      int count=0;
        for (String name : names) {
            String res="";
            for (int i = name.length()-1; i >=0; i--) {
                res+=name.charAt(i);
                if(res.equals(name)){
                    count++;}


            }

        }System.out.println(count);



        /*
         write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};
            output:
                2
         */
    }
}
