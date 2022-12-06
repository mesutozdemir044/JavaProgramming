package day20_Arrays;

public class github2 {
    public static void main(String[] args) {
        String[] classmates = {"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming", "Selenium Automation",
                "API Testing", "Database Testing", "Manual Testing"};
        String res="";
        for (String classmate : classmates) {
            for (int i = classmate.length()-1; i >=0 ; i--) {
                res+=classmate.charAt(i);

            } System.out.print(res+"\n");
            res="";

        }


        /*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}
        		output:
        			avaJ
        			nohtyp
        			#c
 */
    }
}
