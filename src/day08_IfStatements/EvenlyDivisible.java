package day08_IfStatements;

public class EvenlyDivisible {
    public static void main(String[] args) {
        /*
         2. Create a class called EvenlyDivisible,and write a program that can check
          if a number is evenly divisible by 2, 3, 5
    		Ex:
				number = 65;

			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true

         */
        int number=65;
        boolean d1= number%2==0;
        boolean d2= number%3==0;
        boolean d3=number%5==0;
        System.out.println(number+" is divisible by 2: " + d1);
        System.out.println(number+" is divisible by 3: " + d2);
        System.out.println(number+" is divisible by 5: " + d3);


    }
}
