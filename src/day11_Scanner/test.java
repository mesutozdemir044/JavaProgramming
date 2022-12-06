package day11_Scanner;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int house = s.nextInt();
        int player = s.nextInt();

        //WRITE YOUR CODE BELOW
        if(player>21){
            System.out.println("player bust");
        }
         else if(player==house){
            System.out.println("its a tie");
        }else if(player<house){
            System.out.println("player lose");
        }else {
            System.out.println("player win");

        }

    }






}
