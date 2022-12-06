package day07_Operators;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate=65,
             weeklyHours=40;
        double stateTaxRate=0,
                fedaralTaxRate=26.2;

        int salaryBeforeTax=hourlyRate*weeklyHours*52;
        double stateTax=salaryBeforeTax*stateTaxRate/100;
        double federalTax=salaryBeforeTax*fedaralTaxRate/100;
        double totalTax=stateTax+federalTax;
        double salaryAfterTax=salaryBeforeTax-totalTax;

        System.out.println("Gross pay is: $"+salaryBeforeTax);
        System.out.println("State tax : $"+stateTax);
        System.out.println("Fedaral tax: $"+federalTax);






    }


}
