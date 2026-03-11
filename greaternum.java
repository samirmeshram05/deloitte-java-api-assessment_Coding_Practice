import java.util.*;

public class greaternum{
  public static int great (int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }

    }

    public static void main(String[] args) {
        int a=5;
        int b=7;
        //great(a,b);
        System.out.println("greater number is:"+great(a, b));
    }
}