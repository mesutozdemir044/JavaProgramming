package taskPhone;

public class PhoneObjects {
    public static void main(String[] args) {
        iphone ip1=new iphone("apple","4s","2b",200,"white");
        nokia nk1=new nokia("noki","11e","51f",11,"black");
        samsung s1=new samsung("sams","SSS1","23s",444,"orange");
        s1.model=s1.model.toLowerCase();
        System.out.println(ip1+""+nk1);
        System.out.println(nk1);
        System.out.println(s1);
        System.out.println(s1);
        System.out.println(nk1);
        System.out.println(s1);

    }



}
