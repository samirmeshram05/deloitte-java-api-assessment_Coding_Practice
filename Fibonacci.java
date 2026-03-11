//import java.util.*;

public class Fibonacci{
    public static int f(int n){
        int n1=0;
        int n2=1;

        System.out.println("Fibonacci series of\t " +n +"\tterm:");
        for (int i=0; i<n ;i++){
            System.out.println(n1+ " ");

        
        int nextNum=n1+n2;
        n1=n2;
        n2=nextNum;
        }
        return n2;
    }

    public static void main(String[] args) {
       // Scanner s= new Scanner(System.in);
        //System.out.println("Enter the Number:");

        int n=12;
        f(n);
            
            
    }
    
    

}