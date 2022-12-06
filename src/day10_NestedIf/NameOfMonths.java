package day10_NestedIf;

public class NameOfMonths {
    public static void main(String[] args) {
        int num=5;

        String day=(num>0&&num<8)?(num==1)?"pazartesi" : (num==2)?"sali": (num==3)?"carsamba": (num==4)?"persembe":
                (num==5)?"cuma":(num==6)?"cumartesi":"pazar" :"invalid number";
        System.out.println("day = " + day);





    }

   /* public static void main(String[] args) {
        int num=55;
        String result="";

        if(num>0&&num<=12){
            if(num==1){
                result="january";
            }
            else if(num==2){
                result="February";
            }
           else if(num==3){
                result="march";
            }
           else if(num==4){
                result="april";
            }
           else if(num==5){
                result="may";
            }
           else if(num==6){
                result="june";
            }
            else if(num==7){
                result="july";
            }
            else if(num==8){
                result="august";}
            else if(num==9){
                result="september";
            }
           else if(num==10){
                result="october";
            }
           else if(num==11){
                result="november";}
           else{
                result="december";
            }


        }else{
            result="invalid";

        }
        System.out.println(result);
    }*/

}



