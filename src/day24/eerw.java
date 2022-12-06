package day24;

import java.util.Scanner;

public class eerw {
    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
        // WRITE YOUR CODE BELOW:
        //7/1/2018(mm/dd/yy) - 7/8/2018(mm/dd/yy)

        if(month<8&&day<9&&year==2018){
            isAvailable =true;
    }else{
            isAvailable=false;
        }
return isAvailable;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));
     //   simpleRoomBook(isAvailable, month, day, year);
       int month=0;
      int  day=0;
      int year=2018;
      boolean isAvailable=true;

    }
}


