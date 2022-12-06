package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {
        int score=555;
        if(score>=0&&score<=100){
            if(90<=score&& score<=100){
                System.out.println("excellent");
            }
           else if(80<=score&& score<=89){
                System.out.println("great");
            }
          else  if(70<=score&& score<=79){
                System.out.println("good");
            }
          else  if(60<=score&& score<=69){
                System.out.println("passed");
            }else{
                System.out.println("failed");
            }

        }else{
            System.out.println("invalid score");
        }




    }



}
