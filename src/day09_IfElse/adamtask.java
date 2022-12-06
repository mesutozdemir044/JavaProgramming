package day09_IfElse;

import java.util.Scanner;

public class adamtask {
    public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);
                System.out.println("***** Malatya Air Lines");
                System.out.println("uçmak istediğniz mesafeyi giriniz");
                int mesafe = scanner.nextInt();
                System.out.println("yaşınızı giriniz");
                int yas = scanner.nextInt();
                System.out.println("yolculuk tipini giriniz 1.gidiş 2. gidiş/dönüş");
                int yolutipi = scanner.nextInt();


                double birimfiyat = 0.1;
                double mesafefiyatı = birimfiyat * mesafe;
                double toplamfiyat = 0;


                if (yas>0 && mesafe > 0 && (yolutipi == 1 || yolutipi == 2)) {
                    System.out.println("girdiler doğru girilmiştir devam ediniz");
                    if (yas <= 12 && yolutipi == 1) {

                        toplamfiyat += 0.5 * mesafefiyatı;
                        System.out.println(toplamfiyat);

                    }else if (yas <= 12 && yolutipi == 2) {
                        toplamfiyat += 0.3 * mesafefiyatı;
                        System.out.println(toplamfiyat);

                    } else if (yas > 12 && yas <= 24 && yolutipi == 1) {

                        toplamfiyat += 0.9 * mesafefiyatı;
                        System.out.println(toplamfiyat);


                    } else if (yas > 12 && yas <= 24 && yolutipi == 2) {
                        toplamfiyat += 0.7 * mesafefiyatı;
                        System.out.println(toplamfiyat);


                    } else if (yas > 65 && yolutipi == 1) {

                        toplamfiyat += 0.9 * mesafefiyatı;
                        System.out.println(toplamfiyat);


                    } else if (yas > 65 && yolutipi == 2) {

                        toplamfiyat += 0.9 * mesafefiyatı;
                        System.out.println(toplamfiyat);

                    }else {
                        System.out.println("yanlis");
                    }

                }else {System.out.println("yanlış değer giridiniz");}



                } }






/*Ağaç ilk üç yıl tam olarak 1 cm, sonrasında ise her yıl 2 cm uzar. 10. yıla kadar her yıl ağacın büyümesini gösterin
year 6 - growth 2 cm
tree size: 9 cm
 */


        
/*
 Task 3: Count each name in sentence.
  
    input : 

  String names = "Adam Adam Barry Aysun Aysun";

    output: 

    Adam-2 Barry-1 Aysun-2  
- Task 2:  Write a programt that replaces every occurrence of "cat" in the message with "dog", using indexOf and substring.

  input:

  String message = "I love cats! I have a cat named Coco. My cat's very smart!";

  output:

 "I love dogs! I have a dog named Coco. My dog's very smart!";


- Task 1: Find the number taht given a hidden number between 1 and 100 randomly created.

 Hint:

        int hiddenNumber = random.nextInt(100) + 1;

 */