package day20_Arrays;

public class github7 {
    public static void main(String[] args) {
        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];
        String res="";
        for (int i = 0; i < names.length ; i++) {
            String name=names[i];
            int score=scores[i];
            char grade='A';

            if(score>=90){
              grade='A';
            }else if(score<90&&score>=80){
                grade='B';
            }else{
                grade='C';
            }

            res=name+"'s score is "+score+", and grade is "+ grade;
            System.out.println(res);
        }




        /*
        4. given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];
         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A
         */
    }
}
