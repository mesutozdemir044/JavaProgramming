package day11_Scanner;
import java.util.*;
public class ScannerTasks {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Select screen size:");
        String input = scan.next();


        double screenSize = 0.0;
        double totalPrice =0;
        String cpuType = "";


        if (screenSize == 13.3) {
            totalPrice += 200;
        } else if (screenSize == 15.0) {
            totalPrice += 300;
        } else if ((screenSize == 17.3)) {
            totalPrice += 400;
        }
        System.out.println("Select CPU type:");
        String input1 = scan.next();
        if (cpuType == "i3") {
            totalPrice += 150;
        } else if (cpuType == "i5") {
            totalPrice += 250;
        } else if (cpuType == "i7") {
            totalPrice += 350;
        }
        /*System.out.println("Select RAM size:");
        int ram = scan.nextInt();
        if (ram % 4 == 0) {
            totalPrice += ((ram / 4) * 50);
        }
        System.out.println("Select storage type:");
        String storageType = scan.next();

        System.out.println("Select storage size:");
        int storageAmount = scan.nextInt();
        if (storageType == "HDD" && storageAmount % 500 == 0) {
            totalPrice += (50 + (storageAmount / 500) * 50);
        } else if (storageType == "SSD" && storageAmount % 500 == 0) {
            totalPrice += 100 + (storageAmount / 500) * 100;
        }
        System.out.println("Select screen resolution:");
        String screenResolution = scan.next();
        if (screenResolution == "FULLHD") {
            totalPrice += 100;
        } else if (screenResolution == "4K") {
            totalPrice += 200;
        }*/
        System.out.println("Final price is: $" + totalPrice);

    }
}
