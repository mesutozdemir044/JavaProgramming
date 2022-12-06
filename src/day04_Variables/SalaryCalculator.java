package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        //hourlyRate,weeklyHours
        int hourlyRate=50;
        int weeklyHours=40;
        int numberOfWeeks=52;
        int salary=hourlyRate*weeklyHours*numberOfWeeks;

        System.out.println("hourlyRate =$" + hourlyRate);
        System.out.println("weeklyRate =" + weeklyHours);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary =$" + salary);


       // System.out.println(salary);

    }
}
