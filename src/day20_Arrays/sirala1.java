package day20_Arrays;

import java.util.Scanner;

public class sirala1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int itemSeq = 1;
        double totalCost = 0;
        String totalList ="";
        String result = "";

        do {

            System.out.println("Enter the name of item " + itemSeq);
            String itemName = scanner.next();

            System.out.println("Enter the price of the " + itemName);
            double itemPrice = scanner.nextDouble();

            System.out.println("How many " + itemName + " will you buy?");
            int itemNum = scanner.nextInt();

            totalCost += itemPrice * itemNum;
            totalList = totalList + itemName + " x " + itemNum + " - $" + (itemPrice * itemNum) + "\n";

            System.out.println("Do you want to add more items to the shopping list?");
            result = scanner.next();

            itemSeq++;

        } while(result.equalsIgnoreCase("yes"));

        System.out.println("SHOPPING LIST:");
        System.out.println(totalList);
        System.out.print("Total cost: $" + totalCost);

        System.exit(0);
    }
}
