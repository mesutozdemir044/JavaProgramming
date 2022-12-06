package day24;

import java.util.Scanner;

public class mmmmm {
    public static int getDup(String[] arr) {
        int count=0;

        for (int i = 0; i <arr.length ; i++) {
            boolean state=false;
            if(!arr[i].isEmpty()){
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i].equals(arr[j])){
                    count++;
                    arr[j]="";
                    state=true;
                     }
                 }if(state){
                count+=1;}
            }
        }
return count;
    }

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));
    }
}