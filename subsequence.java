public class subsequence{
    public static void Subseq(String str, int idx, String NewStr) {
        if (idx==str.length()){
            System.out.println(NewStr);
            return;
        }

        char currchar = str.charAt(idx);
        Subseq(str, idx+1, NewStr+currchar);
        Subseq(str,idx+1, NewStr);

    }
    public static void main(String[] args) {
        String str="abcn";
        Subseq(str,0 ," "); 
    }

}