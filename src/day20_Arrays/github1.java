package day20_Arrays;

public class github1 {
    public static void main(String[] args) {
        String[] classmates = {"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming", "Selenium Automation",
                "API Testing", "Database Testing", "Manual Testing"};

        String res="";
        for (int i = 0,j=0; i < classmates.length; i++,j++) {
            res=classmates[i].charAt(0)+"."+classmates[i].charAt(classmates[i].indexOf(" ")+1);
            System.out.println(res);
        }


/*

1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines


        String[] classmates = {"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming", "Selenium Automation",
                "API Testing", "Database Testing", "Manual Testing"};

        for (String classmate : classmates) {

            System.out.println(classmate);
        }*/

    }
}
