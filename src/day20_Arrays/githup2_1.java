package day20_Arrays;

public class githup2_1 {
    public static void main(String[] args) {
        String[] classmates = {"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming", "Selenium Automation",
                "API Testing", "Database Testing", "Manual Testing"};
       String res="";

        for (int i = 0; i < classmates.length ; i++) {
            res=classmates[i];
            String res1="";


            for (int j = res.length()-1; j >=0 ; j--) {
                res1+=res.charAt(j);
            }System.out.println(res1);

        }

    }
}
