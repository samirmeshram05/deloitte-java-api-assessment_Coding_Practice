import java.util.*;

public class function{
    public static int sum(int a, int b){
        int sum =a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();

        int sum=sum(a,b);
        System.out.println(sum);
        
    }
}