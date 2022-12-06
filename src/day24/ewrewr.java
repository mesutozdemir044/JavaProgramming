package day24;

import java.util.Scanner;

public class ewrewr {




            public static boolean simpleRoomBook ( boolean isAvailable, int month, int day, int year){
                // WRITE YOUR CODE BELOW:
                //7/1/2018(mm/dd/yy) - 7/8/2018(mm/dd/yy)
                isAvailable = true;
                boolean res = true;
                if (isAvailable == true) {
                    res = true;
                } else if (month < 8) {
                    res = true;
                } else if (day < 9) {
                    res = true;
                } else if (year == 2018) {
                    res = true;
                } else {
                    res = false;
                }
                return res;

            }



            public static void main (String[]args){
                Scanner in = new Scanner(System.in);
                System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));
                boolean isAvailable = in.nextBoolean();
                int month = in.nextInt();
                int day = in.nextInt();
                int year = in.nextInt();
                simpleRoomBook(isAvailable, month, day, year);
            }
        }