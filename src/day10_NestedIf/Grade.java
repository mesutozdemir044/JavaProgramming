package day10_NestedIf;

public class Grade {
    public static void main(String[] args) {

       char x='B';
      String result=(x=='A')?"excellent":(x=='B')?"great job":(x=='C')?"good":(x=='D')?"passed":(x=='F')?"failed":"invalid";
        System.out.println("result = " + result);






    }
}
/*
3. Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT


 */