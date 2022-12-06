package day10_NestedIf;

public class CappucinoBuyer {
    public static void main(String[] args) {
String size="talddl";



     boolean result=size=="tall"||size=="grade"||size=="venti";
        if(result){
            switch (size){
            case "tall":
                System.out.println("price is $3.69"+"\n+  90 calories");
                break;
            case "grade":
                System.out.println("price is $3.99;\n" +
                        "\t\t\t\t\t\t\t\t120 calories");
            default:
                System.out.println("price is $4.29"+"\n+ 150 calories"); }

        }else{
            System.out.println("\"invalid\"");
        }




       /* switch(size){
            case "tall":
                System.out.println("price is $3.69"+"\n+  90 calories");;
                    break;
            case "grade":
                System.out.println("price is $3.99;\n" +
                        "\t\t\t\t\t\t\t\t120 calories");
                break;

           case "venti":
               System.out.println("price is $4.29"+"\n+ 150 calories");
               break;
            default:
                System.out.println("invalid");
        }
*/


       /* String size="tall";
        boolean a=size=="tall"||size=="grade"|| size=="venti";
        if (a) {
            if (size == "tall") {
                System.out.println("price is $3.69" +" \n "+ "90 calories");

            }
            else if (size == "grade") {
                System.out.println("price is $3.99" +" \n"+ "120 calories");

            }
            else  {
                System.out.println("price is $4.29" + " \n"+ "150 calories");

            }
        }else{
            System.out.println("invalid size");}*/





        /*
        1. Create a class called  CappuccinoBuyer. A variable named Size is given
        , write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:



						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
         */

    }
}
