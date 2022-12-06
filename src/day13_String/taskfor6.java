package day13_String;

import java.util.Scanner;

public class taskfor6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String a="cat";
        String b="dog";
        String res="";
        int counter=0;
        int counter1=0;

        for (int i = 0; i <str.length() ; i++) {
            res+=str.charAt(i);
            if(res.contains(a)){
          counter++;
           res= res.replace(a,"");
            } else if (res.contains(b)) {
                counter1++;
                res=res.replace(b,"");
            }

        }if(counter==counter1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
