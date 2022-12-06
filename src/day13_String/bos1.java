package day13_String;

import java.util.Scanner;

public class bos1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*String word = scan.next();
        String str = "";
        scan.close();
       if((word.charAt(0)=='x' || word.charAt(0)=='X')
               && (word.charAt(word.length()-1)=='x' || word.charAt(word.length()-1)=='X'))
       {
           System.out.println(word.substring(1, word.length()-1 ));
       }
       else if(word.charAt(0)=='x' || word.charAt(0)=='X'){
            System.out.println(word.substring(1, word.length()));
        }
        else if(word.charAt(word.length()-1)=='x' || word.charAt(word.length()-1)=='X'){
           System.out.println(word.substring(0, word.length()-1)) ;}
        else {
            System.out.println(word);
        }

*/
        double price=0;
        String zipCode1="";

        System.out.println("Welcome to the Cydeo car insurance!");
        System.out.println("Enter your full name");
        scan=new Scanner(System.in);
        String answer=scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String answer1=scan.nextLine();
        if(answer1.equals("yes")){
            System.out.println("Enter your zip code");
            zipCode1=scan.nextLine();
            if(zipCode1.equals("20910")||zipCode1.equals("20740")){
                price+=60;
            }else if(zipCode1.equals("22102")||zipCode1.equals("22103")){
                price+=30;
            }else{
                price+=50;
            }
        }else if(answer1.equals("no")){
            System.out.println("You must have a license to get insurance!");
            System.exit(0);
        }

        System.out.println("Is this vehicle owned, financed, or leased?");
        String answer2=scan.nextLine();
        if(answer2.equals("owned")){
            price+=10;
        }else if(answer2.equals("financed")){
            price+=15;
        }else if(answer2.equals("leased")){
            price+=20;
        }

        System.out.println("How is this vehicle primarily used?");
        String answer3=scan.nextLine();

        if(answer3.equals("business")){
            price+=50;
        }else if(answer3.equals("pleasure")){
            price+=10;
        }else {
            System.out.println("How many days do you commute?");
            int answer4=scan.nextInt();
            price+=(answer4*5)+20;
        }

        System.out.println("How old are you?");
        int answer5=scan.nextInt();
        if(answer5<16){
            System.out.println("You can't be driving`");
            System.exit(0);
        }else if(answer5>=16&&answer5<20){
            price*=10;
        }else if(answer5>=20&&answer5<25){
            price*=6;
        }else {
            price*=2;
        }

        System.out.println("Have you had any accidents in the last 5 years?");
        String answer6=scan.next();
        if(answer6.equals("yes")||answer6.equals("YES")){
            System.out.println("How many?");

            int answer7=scan.nextInt();
            price+=(answer7*10);

        }else{
            price+=0;
        }

        String answer8="";
        System.out.println("What is the highest level of education you have completed?");
        if (scan.hasNext()){
            answer8=scan.nextLine();

            if(answer8.equals("Bachelors") || answer8.equals("Masters"))    {
                price-=(price/20);
            }else if(answer8.equals("PHD")){
                price-=(price/10);
            }else if (answer8.equals("High School")) {
                price+=(price/20);
            }
        }


        String a=answer.substring(0,answer.indexOf(' '));
        String a1=a.substring(0,1).toUpperCase()+a.substring(1).toLowerCase();
        String b1=answer.substring(answer.indexOf(' ')+1,answer.length());
        String b2=b1.substring(0,1).toUpperCase()+b1.substring(1).toLowerCase();
        System.out.println(a1+" "+b2+", here's your quote!");
        System.out.println("This is your start premium cost: $"+price);

        System.out.println("This is your reference number: "+answer.substring(0,3).toUpperCase()+""+answer5+answer.substring(answer.length()-3,answer.length()).toUpperCase()+zipCode1+answer8.replace(" ","").toUpperCase());



    }
}


