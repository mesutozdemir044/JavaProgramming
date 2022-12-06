package day25;

import java.util.Arrays;
import java.util.Scanner;

public class inhabitants {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO. Write you code below this line.

        boolean state = false;
        int day = 0;

        System.out.println("Day " + day + " "+Arrays.toString(inhabitants));

        do
        {
            day++;
            state=false;
            boolean istate = true;
            boolean isEmpt = true;
            for (int i = 0; i <inhabitants.length ; i++) {

                if(inhabitants[i]>0 &&((i<inhabitants.length-1 && inhabitants[i+1]==0) || (istate && i>0 && inhabitants[i-1]==0)))
                {
                    inhabitants[i]=inhabitants[i]/2;
                    istate = false;
                    isEmpt = false;
                }
                else istate=true;

                if(inhabitants[i] > 0){
                    state=true;
                }
            }

if(!isEmpt) {
    System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
}

        } while(state);

        System.out.println("---- EXTINCT ----");

    }
}
