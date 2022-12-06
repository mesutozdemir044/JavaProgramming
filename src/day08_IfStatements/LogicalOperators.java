package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        String name="Daniel";
        int age= 15;
        String citizen="North Korea";

        boolean isEligible=age<=18 && citizen=="North Korea"  && name=="Daniel";
        System.out.println(name + " is eligible to vote: " +isEligible);


        String name2="Joseph";
        int age2=44;
        int income=8000;

        boolean isEligible1=age2<=66 &&name2=="Joseph" && income>=3000;
        System.out.println(name2+" is eligible for loan: "+isEligible1);




        String name3="Shay";
        int age3=35;
        char gender='F';

        boolean isEligible3=name3=="Shay"&& age3>=23 && gender=='F'|| gender=='M';
        System.out.println("isEligible3 = " + isEligible3);

        String name4="Merve";
        String countryOfBirth="USA";
        boolean marriedToUsCitizen=false;

        boolean isEligible4=name4=="Merve"&& countryOfBirth=="USA"&& marriedToUsCitizen==true;
        System.out.println("isEligible4 = " + isEligible4);



        String Student="Ali";
        double gpa=2.5;
        int familyIncome=500;
        boolean isEligible5=Student=="Ali"&& gpa*familyIncome<=8000;
        System.out.println("isEligible5 = " + isEligible5);

        boolean resutl3=true;
        boolean resutl4=!true;




        int score=55;
        boolean passed=score>=55;
        boolean failed=score<=54;
        System.out.println("failed = " + failed);
        System.out.println("passed = " + passed);
















    }


}
