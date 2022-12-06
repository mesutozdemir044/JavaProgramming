package day10_NestedIf;

public class AgeGroups {
    public static void main(String[] args) {

        int a=77;
        if (a>=0&&a<150) {
            if (a < 21) {
                System.out.println("teenager");

            } else if (a >= 21 && a < 55) {
                System.out.println("adult");
            } else {
                System.out.println("senior");
            }

        }else{
            System.out.println("invalid");
        }

        }

    }




/*
4. Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( >= 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */