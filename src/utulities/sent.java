package utulities;

public class sent {
    public static void main(String[] args) {
        String sentence="i love mesutttt you";
       String[] words= sentence.split(" ");//["i","love","you"] if(res[0].length>res)

        int maxlength=0;
        int index=0;

        for (int i = 0; i <words.length ; i++) {

            if(words[i].length()>maxlength){
                maxlength=words[i].length();
                index=i;
            }
        }
        System.out.println(words[index]);

        //WRITE YOUR CODE BELOW

    }
}



           /* for (String re : res) {
                if(re.length()>max)
                   max=re.length();
               reM=re;
            }  System.out.println(reM);


*/

