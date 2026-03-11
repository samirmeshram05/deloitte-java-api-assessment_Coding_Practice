import java.util.*;
public class NumberOfDigits{
    public static void main(String []args){
        int no=0, a=0;
        Scanner s = new Scanner(System.in);
        no=s.nextInt();
        if(no<0) no=no*-1;
        else if(no==0) no=1;
        while(no>0){
            no=no/10;
            a++;
        }
        System.out.println(a);
        s.close();
    }
}