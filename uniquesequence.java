import java.util.HashSet;

public class uniquesequence{
    public static void printseq(String str , int idx, String res, HashSet<String>allSubseq){
        if(idx==str.length()){
            if(allSubseq.contains(res)){
                return;

            }
            allSubseq.add(res);
            System.out.println(res);
        }
        printseq(str, idx+1, res+str.charAt(idx), allSubseq);

        printseq(str,idx+1, res, allSubseq);



    }

    public static void main(String[] args) {
        
        String str1="abc";
        String str2="aaa";

        HashSet<String> allSubseq = new HashSet<>();
        printseq(str2, 0, " ",allSubseq);
    }

}
