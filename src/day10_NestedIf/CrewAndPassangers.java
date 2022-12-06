package day10_NestedIf;

public class CrewAndPassangers {
    public static void main(String[] args) {
 int num=75;
        String tot=(num>=50&&num<=100)?(num==50)?"20 crew, 30 passengers":
                (num==75)?"25 crew, 50 passengers":(num==100)?"30 crew, 70 passengers":" Any other number of people on the ship is not valid":
                " Any other number of people on the ship is not valid";
        System.out.println("tot = " + tot);





    }




}
/*
2. Create a class called CrewAndPassangers, Given a number of people on the ship (int number), determine how many need to be
crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */