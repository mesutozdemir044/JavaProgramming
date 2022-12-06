package day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {

     /*
     score:
    90 ~ 100 ==> Excellent
    80 ~ 89 ==> Great
    70 ~ 79 ==> Good
    60 ~ 69 ==> Passed
    0 ~ 59 ==> Failed

      */
        int score=90;
        boolean isExcellent=score>=90 && score<=100;
        boolean isGreat=score<90 && score>=80;
        boolean isGood=score<80&& score>=70;
        boolean isPassed=score>=60&&!isGood&&!isGreat&&!isExcellent;
        boolean isFailed=score>=0&& score<60;

        if (isExcellent){

            System.out.println("excellent");}

        if (isGreat){
            System.out.println("great");
        }

        if(isGood){
            System.out.println("good");
        }
        if(isPassed){
            System.out.println("passed");
        }

        if(isFailed){
            System.out.println("failed");
        }





    }




}
