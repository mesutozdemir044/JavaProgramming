package taskPhone;

public class nokia extends Phone {


    public nokia(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }

    public void defense(){
        System.out.println(brand+" is defense");

    }

}
