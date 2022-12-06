package utulities;

public class fdfdbgf {public static String countLetters(String str){
    int num=0;
    String res="";
    for (int i = 0; i <str.length() ; i++) {
        res+=str.charAt(i);
        if(res.contains(""+str.charAt(i)))
            num++;
            res="";
        }return res;
    }
    }

