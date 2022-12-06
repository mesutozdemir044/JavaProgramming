package taskPhone;

public class Phone {
    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;
    public static boolean hasBattery=true;

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }
    public void call(long phonenumber){
        System.out.println(brand+" is calling long" );
    }
    public void text(long textnumber){
        System.out.println(brand+" is long text");
    }
    public String toString() {
        return "phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                ", color='" + color + '\'' +
                ", has battery" + true +
                '}';
    }

    /*
    1. Phone Task:
1.1 Create a class named Phone:
Variables:
brand, model, size, price,
color
Methods:
setInfo()
call(long phoneNumber)
text(long phoneNumber)
toString()
1.2 Create a sub class of Phone named IPhone:
Variables:
brand, model, size, price,
color
Methods:
setInfo()
call(long phoneNumber)
text(long phoneNumber)
faceTime(long phoneNumber)
faceTime(String email)
toString()
1.3 Create a sub class of Phone named Samsung:
Variables:
brand, model, size, price,
color
Methods:
setInfo()
call(long phoneNumber)
text(long phoneNumber)
freeze()
toString()
1.4 Create a sub class of Phone named Nokia:
Variables:
brand, model, size, price,
color
Methods:
setInfo()
call(long phoneNumber)
text(long phoneNumber)
selfDefense()
toString()
1.5 Create a class named Phone Objects and test of the
sub class' objects
     */


}
