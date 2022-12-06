package day20_Arrays;

public class github4 {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        int itmindx=0;
        for (int i = 0; i <items.length ; i++) {
            if(items[i].equals("Gloves")){
              itmindx=i;
            }
            if(items[i].equals("iPad"))
                System.out.println(true);

           String itemss=items[i];
           double pric=prices[i];
           int id=itemIDs[i];
            System.out.println(itemss+" - "+pric+" - "+ "#"+id);

            }







        /*
       3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
        1. find out the first index number of "Gloves"
        2. find out if "iPad" is contained in the item list
        3. Print the report of each shopping item
            name - price - #ID
 */
    }
}
