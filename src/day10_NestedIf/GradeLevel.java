package day10_NestedIf;

public class GradeLevel {
    public static void main(String[] args) {
        byte num=55;
        if(1<=num&& num<=18){
           if(1<=num&&num<=5) {
               System.out.println("Elementery school");
           }
            else if(5<=num&&num<=8) {
                System.out.println("middle school");
            }
            else if(8<=num&&num<=12) {
                System.out.println("High school");
            }
            else if(12<=num&&num<=16) {
                System.out.println("Collage");
            }
            else  {
                System.out.println("grad school");
            }

    }else{
            System.out.println("invalid");
        }






    }}
/*
 Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */