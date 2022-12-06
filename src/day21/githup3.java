package day21;

import java.util.Arrays;

public class githup3 {
    public static void main(String[] args) {
        String sentence = "java java python python java python";
       String []word= sentence.split(" ");
        System.out.println(Arrays.toString(word));
        int count=0;
        for (String each : word) {
            if(each.equals("java")||each.equals("python"))
                count++;
        }
        System.out.println(count);
    }
}
