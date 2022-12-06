package day22;

public class githup {
    public static void main(String[] args) {
        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};
        String[][]batch25Groups={batch25Group1,batch25Group2,batch25Group3};
        String[][][] batchgroup={batch25Groups,batch25Groups};
        for (String[][] strings : batchgroup) {
            for (String[] string : strings) {
                for (String s : string) {
                    System.out.print(s+" ");
                }
                System.out.println();
            }

        }
        //String[][]batch25Groups={{"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"},{"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"},{"Fady", "Break", "Clock", "Cihad", "Muhtar"}};
    }

}
