package day13_String;

import java.util.Scanner;

public class carInsurance {


    public class Main {
        public void main(String[] args) {

            //DO NOT TOUCH FOLLOWING LINE/LINES
            System.out.println("Welcome to the Cydeo car insurance!");

            //WRITE YOUR CODE BELOW
            double premiumCost = 0;//5
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your full name");//7
            String fullName = scan.nextLine();

            System.out.println("Do you have a US driver license?");//9
            String driverLicence = scan.next();

            if (driverLicence.equalsIgnoreCase("no")) {
                System.out.println("You must have a license to get insurance!");
                System.exit(0);
            }

            System.out.println("Enter your zip code");//12
            int zipCode = scan.nextInt();

            if (zipCode == 20910 || zipCode == 20740) {
                premiumCost += 60;
            } else if (zipCode == 22102 || zipCode == 22103) {
                premiumCost += 30;

            } else {
                premiumCost += 50;
            }
            System.out.println("Is this vehicle owned, financed, or leased?");//17
            String vehicle = scan.next();

            if (vehicle.equalsIgnoreCase("owned")) {
                premiumCost += 10;
            } else if (vehicle.equalsIgnoreCase("financed")) {
                premiumCost += 15;

            } else if (vehicle.equalsIgnoreCase("leased")) {
                premiumCost += 20;
            }
            System.out.println("How is this vehicle primarily used?");//22
            String usageVehicle = scan.next();

            if (usageVehicle.equalsIgnoreCase("business")) {
                premiumCost += 50;
            } else if (usageVehicle.equalsIgnoreCase("pleasure")) {
                premiumCost += 10;

            } else if (usageVehicle.equalsIgnoreCase("commuting")) {
                premiumCost += 20;
                System.out.println("How many days do you commute?");
                int commuteDays = scan.nextInt();
                premiumCost += commuteDays * 5;
            }


            System.out.println("How old are you?");//27
            int age = scan.nextInt();

            if (age < 16) {
                System.out.println("You can't be driving");
                System.exit(0);
            } else if (age >= 16 && age < 20) {
                premiumCost = 10;
            } else if (age >= 20 && age < 25) {
                premiumCost = 6;
            } else {
                premiumCost *= 2;
            }
            System.out.println("Have you had any accidents in the last 5 years?");//33
            String hasAnAccident = scan.next();

            if (hasAnAccident.equalsIgnoreCase("Yes")) {
                System.out.println("How many?");
                int numberOfAccident = scan.nextInt();
                premiumCost += numberOfAccident * 10;
            }
            scan.nextLine();
            System.out.println("What is the highest level of education you have completed?");
            String levelOfEducation = scan.nextLine();

            if (levelOfEducation.equalsIgnoreCase("Bachelors") || levelOfEducation.equalsIgnoreCase("Masters")) {
                premiumCost = premiumCost * 0.95;
            } else if (levelOfEducation.equalsIgnoreCase("PHD")) {
                premiumCost = premiumCost * 0.90;

            } else if (levelOfEducation.equalsIgnoreCase("High School")) {
                premiumCost = premiumCost * 0.95;

            }
            String lastFullName = fullName.substring(0, 1).toUpperCase() +
                    fullName.substring(1, fullName.indexOf(" ")).toLowerCase() + " " +
                    fullName.substring(fullName.indexOf(" ") + 1, fullName.indexOf(" ") + 2).toUpperCase() +
                    fullName.substring(fullName.indexOf(" ") + 2);
            System.out.println(lastFullName + ", here's your quote!");
            System.out.println("This is your start premium cost: $" + premiumCost);
            String referenceNumber = fullName.toUpperCase().substring(0, 2).toUpperCase() +
                    "" + age + lastFullName.substring(fullName.length() - 3).toUpperCase()
                    + zipCode
                    + levelOfEducation.replace(" ", "").toUpperCase();

            System.out.println("This is your reference number: " + referenceNumber);
        }
    }
}
/*
 //DO NOT TOUCH FOLLOWING LINE/LINES
    double price=0;
    String zipCode1="";
    Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to the Cydeo car insurance!");
    System.out.println("Enter your full name");
    String answer=scan.nextLine();


    System.out.println("Do you have a US driver license?");
        String answer1=scan.nextLine();

        if(answer1.equalsIgnoreCase("no")){
          System.out.println("You must have a license to get insurance!");
            System.exit(0);}


         System.out.println("Enter your zip code");
            zipCode1=scan.next();
            if(zipCode1.equals("20910")||zipCode1.equals("20740")){
                price+=60;
             if(zipCode1.equals("22102")||zipCode1.equals("22103")){
                price+=30;
            }else{
                price+=50;
            }
        }else if(answer1.equalsIgnoreCase("no")){

        }

        System.out.println("Is this vehicle owned, financed, or leased?");
        String answer2=scan.next();

        if(answer2.equalsIgnoreCase("owned")){
            price+=10;
        }else if(answer2.equalsIgnoreCase("financed")){
            price+=15;
        }else if(answer2.equalsIgnoreCase("leased")){
            price+=20;
        }

        System.out.println("How is this vehicle primarily used?");
        String answer3=scan.next();

        if(answer3.equalsIgnoreCase("business")){
            price+=50;
        }else if(answer3.equalsIgnoreCase("pleasure")){
            price+=10;
        }else if(answer3.equalsIgnoreCase("commuting")){

          price+=20;
          System.out.println("How many days do you commute?");
            int answer4=scan.nextInt();
            price+=(answer4*5);
        }

        System.out.println("How old are you?");
        int answer5=scan.nextInt();
        if(answer5<16){
            System.out.println("You can't be driving`");
            System.exit(0);
        }else if(answer5>=16&&answer5<20){
            price=10;
        }else if(answer5>=20&&answer5<25){
            price=6;
        }else {
            price*=2;
        }

        System.out.println("Have you had any accidents in the last 5 years?");
        String answer6=scan.next();
        if(answer6.equalsIgnoreCase("yes")){
            System.out.println("How many?");

            int answer7=scan.nextInt();
            price+=(answer7*10);
        }

        scan.nextLine();

        System.out.println("What is the highest level of education you have completed?");
        String answer8=scan.nextLine();
        if(answer8.equalsIgnoreCase("Bachelors")||answer8.equalsIgnoreCase("Masters"))    {
            price=(price*0.95);
        }else if(answer8.equalsIgnoreCase("PHD")){
           price=(price*0.0);
        }else if (answer8.equalsIgnoreCase("High School")) {
           price=(price*0.95);
        }

        String a=answer.substring(0,answer.indexOf(' '));
        String a1=a.substring(0,1).toUpperCase()+a.substring(1).toLowerCase();
        String b1=answer.substring(answer.indexOf(' ')+1,answer.length());
        String b2=b1.substring(0,1).toUpperCase()+b1.substring(1).toLowerCase();
        System.out.println(a1+" "+b2+", here's your quote!");
        System.out.println("This is your start premium cost: $"+price);

        System.out.println("This is your reference number: "+answer.substring(0,2).toUpperCase()+""+answer5+answer.substring(answer.length()-3,answer.length()).toUpperCase()+zipCode1+answer8.replace(" ","").toUpperCase());

/*
To build a reference number do the following: concatenate the first 2 letters of customer's first name, their age, the last 3 letters of the customer's last name, their zip code, and their level of education all without spaces. Finally the reference number should be in all uppercase
    */


