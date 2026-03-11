import java.util.*;

public class factorial{
    public static void facto(int n) {
        int fact=1;
        for(int i=n; i>=1; i--){
        fact=fact*i;
        }
        System.out.println(fact);
        return;

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        facto(n);

    }

}